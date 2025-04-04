package ru.krykov.springcourse.Project1Boot.dao;



import ru.krykov.springcourse.Project1Boot.model.User;

import java.util.List;

public interface UserDao {

    void save(User user);
    User findById(Long id);
    List<User> findAll();
    void update(Long id,User user);
    void delete(Long id);
}
