/**
 * @(#)UserServiceImpl.java, 2019/8/19.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hello.Service.ServiceImpl;

import hello.Dao.UserBean;
import hello.DBMapper.UserMapper;
import hello.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserBean> getMyBatiesUserNameList() {
        return userMapper.getMyBatiesUserNameList();
    }

    @Override
    public UserBean getUserById(int id) {
        return userMapper.getUserById(id);
    }
    @Override
    public List<UserBean> getUser(int id) {
        return userMapper.getUser(id);
    }
}