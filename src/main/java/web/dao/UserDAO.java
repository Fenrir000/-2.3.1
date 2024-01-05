package web.dao;

import web.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO {
    void save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();

    void updateUser(User user);
    void deleteById(Long id);
}
