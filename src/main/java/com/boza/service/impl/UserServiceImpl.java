package com.boza.service.impl;

import com.boza.model.UserModel;
import com.boza.repository.UserRepository;
import com.boza.service.UserService;
import com.boza.swaggergen.model.User;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(final User user) {
        UserModel userModel = modelMapper.map(user, UserModel.class);
        userModel = userRepository.save(userModel);
        return modelMapper.map(userModel, User.class);
    }

    @Override
    public User getUser(final String userId) {
        UserModel userModel = userRepository.findOne(new Long(userId));
        return modelMapper.map(userModel, User.class);
    }

    @Override
    public List<User> getUsers() {
        Iterable<UserModel> userModels = userRepository.findAll();
        List<User> users = null;
        if (userModels != null) {
            users = Lists.newArrayList(userModels).stream()
            .map(u -> modelMapper.map(u, User.class)).collect(Collectors.toList());
        }

        return users;
    }
}
