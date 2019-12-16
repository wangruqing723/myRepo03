package com.wy.service;

import com.wy.beans.UserInfo;

import java.io.IOException;

/**
 * @author WY
 * @date 2019/8/28
 */
public interface IUserInfoService {

    /**
     *功能描述: 查找用户
     * @author: WY
     * @date: 2019/8/28
     * @param
     * @return: com.wy.beans.UserInfo
     */
    UserInfo findByName(String username) throws IOException;

}
