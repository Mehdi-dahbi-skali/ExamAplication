package com.example.examaplication.dao;

import com.example.examaplication.beans.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoMemory implements  UserDao{
    List<User> users ;
    int lastIndex=0;
    public UserDaoMemory() {
        users = new ArrayList<User>();
    }

    @Override
    public User get(String email) {
        for (User u: users) {
            if (u.getEmail().equals(email)){
                return u;
            }
        }
        return null;
    }

    @Override
    public User save(User u) {
        lastIndex++;
        u.setId(lastIndex+"");
        users.add(u);
        return u;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
