# swagger-codegen-spring-crudrepository-h2database

This project just an example to understand how to use swagger-codegen for a rest api definition and also spring data CRUD repository with h2 embedded database. Before review this project you should know basic terms of swagger-codegen and also spring-boot and spring-data.

You can visit swagger-codegen specifications from this address. http://swagger.io/specification/
You can write your APIs definitions 2 different format in swagger. JSON format or Yaml format. I used JSON format in this example. You can find auto complete pluggin for your IDE to write sagger api definitions.

Also i want to mentioned something about CrudRepository. I used JpaRepository instead of CrudRepository. But you can prefer one of them acording to your need. I explained differences with JpaRepository and CrudRepository below.

JpaRepository extends PagingAndSortingRepository which in turn extends CrudRepository.
Their main functions are:
CrudRepository mainly provides CRUD functions.
PagingAndSortingRepository provide methods to do pagination and sorting records.
JpaRepository provides some JPA related method such as flushing the persistence context and delete record in a batch.
Because of the inheritance mentioned above,  JpaRepository will have all the functions of CrudRepository and PagingAndSortingRepository. So if you don't need the repository to have the functions provided by JpaRepository and PagingAndSortingRepository , use CrudRepository.
