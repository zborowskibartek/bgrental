package com.boardgamesworld.bgrental.repositories;

import com.boardgamesworld.bgrental.model.*;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepositoryInMemory implements UserRepository {

    private final Map<Long, User> users = new HashMap<>();

    @Override
    public List<User> getAllUser() {
        return new ArrayList<>(users.values());
    }

    @Override
    public User getUser(long userId) {
        return users.get(userId);
    }

    @Override
    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    @Override
    public void updateUser(long userId, User updatedUser) {
        users.put(userId, updatedUser);
    }

    @Override
    public void deleteUser(long userId) {
        users.remove(userId);
    }

}