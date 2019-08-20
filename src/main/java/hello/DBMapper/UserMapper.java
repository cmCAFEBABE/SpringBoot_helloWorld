/**
 * @(#)UserMapper.java, 2019/8/19.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hello.DBMapper;

import hello.Dao.UserBean;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
@Repository
@Mapper
public interface UserMapper {
        @Select("select * from user ")
        @Results(id = "UserMap", value = {
                @Result(property = "id",column = "id", javaType = Integer.class),
                @Result(property = "name", column = "name", javaType = String.class),
                @Result(property = "birthday", column = "birthday", javaType = String.class)
        })
        List<UserBean> getMyBatiesUserNameList();

        /**
         * @Parm id=sdalkfj
         */
        @Select("select * from user WHERE id = ${id}")
        @Results(id = "UserMap1", value = {
                @Result(property = "id",column = "id", javaType = Integer.class),
                @Result(property = "name", column = "name", javaType = String.class),
                @Result(property = "birthday", column = "birthday", javaType = String.class)
        })
        UserBean getUserById(@Param("id") int id);

        @SelectProvider(type = LearnSqlBuilder.class, method = "getUser")
        List<UserBean> getUser(@Param("id") int id);

        class LearnSqlBuilder {
                public String getUser(@Param("id") final Integer id) {
                        StringBuffer sql =new StringBuffer();
                        sql.append("select * from user where 1=1");
                        if(id!=1){
                                sql.append(" and id=1");
                        }
                        System.out.println("查询sql=="+sql.toString());
                        return sql.toString();
                }
        }
}