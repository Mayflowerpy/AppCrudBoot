package ru.shilov.appcrudboot.dao;

import ru.shilov.appcrudboot.models.User;
import java.util.List;

public interface UserDao {
    User getById(long id);
    void addUser(User newUser);
    void deleteUser(Long id);
    void updateUser(long id, User userForUpdate);
    List<User> getUsersList();
}
