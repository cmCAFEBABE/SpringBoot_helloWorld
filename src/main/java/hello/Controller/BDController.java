/**
 * @(#)BDController.java, 2019/8/18.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hello.Controller;


import hello.Dao.UserBean;
import hello.JdbcInterface.RowMapper;
import hello.Service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
@RestController
public class BDController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserName")
    public String gitUserNameList() {
        String sql = "SELECT name FROM user ";
        List<String> userList = jdbcTemplate.queryForList(sql, String.class);
        for (String name : userList) {
            System.out.println(name);
        }
        return userList.get(0);
    }
    @RequestMapping("/getMyBatiesUserNameList")
    public String getMyBatiesUserNameList() {
        return userService.getMyBatiesUserNameList().toString();
    }

    @RequestMapping("/getUserById")
    public String getUserById(@Param("id") Integer id) {
        return userService.getUserById(id).toString();
    }

    @RequestMapping("/getUser")
    public String getUser(@Param("id") Integer id) {
        return userService.getUser(id).toString();
    }

//    @RequestMapping("/getUserList")
//    public String gitUserList() {
//        String sql = "SELECT name FROM user ";
//        List<UserBean> userList=jdbcTemplate.query(sql,new RowMapper()
//        {
//            @Override
//            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//                UserBean userBean = new UserBean();
//                userBean.setId(rs.getInt("id"));
//                userBean.setName(rs.getString("name"));
//                userBean.setBirthday(rs.getString("birthday"));
//                return userBean;
//            }
//        });
//        for (UserBean user : userList) {
//            System.out.println(user);
//        }
//        return userList.get(0).toString();
//    }
}