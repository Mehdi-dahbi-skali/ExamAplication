package com.example.examaplication.busness;

import com.example.examaplication.beans.User;
import com.example.examaplication.dao.UserDao;
import com.example.examaplication.dao.UserDaoMemory;

public class DefaultServices implements Services {

    private static DefaultServices instance = null;
    public static DefaultServices getInstance() {
        if(instance==null)
            instance=new DefaultServices(new UserDaoMemory());
        return instance;
    }

    private UserDao userDao;
    private DefaultServices(UserDao userDao) {
        this.userDao=userDao;
    }

    @Override
    public User addUser(User u) {

        return userDao.save(u);
    }

    @Override
    public User getUser(String email) {
        return userDao.get(email);
    }
}
