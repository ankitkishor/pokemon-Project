package com.pokemon.services;

import com.pokemon.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUserById(Long id);
    public User createUser(User user);
    public User updateUser(Long id, User user);
    public void deleteUser(Long id);
}
