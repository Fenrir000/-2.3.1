package web.service;

import org.springframework.stereotype.Service;
import web.entity.User;

import java.util.List;
import java.util.Optional;



public interface UserService {
    void save(User user);

    List<User> findAll();

    Optional<User> findById(Long id);

    void updateUser(User user);

    void deleteById(Long id);
}