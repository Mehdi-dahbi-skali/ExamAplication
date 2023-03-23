package com.example.examaplication.dao;

import com.example.examaplication.beans.User;

import java.util.List;

public interface UserDao {

    User get(String email);
    User save(User u);
    List<User> getAll();


}
