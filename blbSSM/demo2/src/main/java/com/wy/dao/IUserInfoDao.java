package com.wy.dao;

import com.wy.beans.UserInfo;

import java.util.List;

public interface IUserInfoDao {

    UserInfo findByName(String username);

}
