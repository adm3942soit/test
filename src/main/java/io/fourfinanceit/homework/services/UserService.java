package io.fourfinanceit.homework.services;

import io.fourfinanceit.homework.domain.User;

public interface UserService {
    Iterable<User> listAllUsers();

    User getUserById(Integer id);

    User saveUser(User user);
}
