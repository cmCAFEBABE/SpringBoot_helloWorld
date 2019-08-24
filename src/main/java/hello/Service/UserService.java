/**
 * @(#)UserService.java, 2019/8/19.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hello.Service;

import hello.Dao.UserBean;

import java.util.List;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public interface UserService {
    List<UserBean> getMyBatiesUserNameList();

    Integer insertUser(UserBean user);

    UserBean getUserById(int id);
    List<UserBean> getUser(int id);
}