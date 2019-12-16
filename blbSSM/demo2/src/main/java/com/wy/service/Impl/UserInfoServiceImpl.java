package com.wy.service.Impl;

import com.wy.beans.UserInfo;
import com.wy.dao.IUserInfoDao;
import com.wy.service.IUserInfoService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author WY
 * @date 2019/8/28
 */
public class UserInfoServiceImpl implements IUserInfoService {
    private InputStream in;
    private SqlSession sqlSession;
    private IUserInfoDao userInfoDao;

    public void init() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //3.打开连接
        sqlSession = sqlSessionFactory.openSession();
        //4.获取dao
        userInfoDao = sqlSession.getMapper(IUserInfoDao.class);

    }

    @Override
    public UserInfo findByName(String username) throws IOException {
        init();
        UserInfo userInfo = userInfoDao.findByName(username);
        return userInfo;
    }


    public void destroy() throws IOException {
        //6.释放资源
        in.close();
        sqlSession.commit();
        sqlSession.close();
    }
}
