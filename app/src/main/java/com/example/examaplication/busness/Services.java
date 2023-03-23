package com.example.examaplication.busness;

import com.example.examaplication.beans.User;

public interface Services {
    User addUser(User u);
    User getUser(String email);
}
