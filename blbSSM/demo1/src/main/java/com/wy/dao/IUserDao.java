package com.wy.dao;

import com.wy.beans.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll();

}
