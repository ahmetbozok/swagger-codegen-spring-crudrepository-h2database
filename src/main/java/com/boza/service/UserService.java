package com.boza.service;

import com.boza.swaggergen.model.User;
import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUser(String userId);
    List<User> getUsers();
}
