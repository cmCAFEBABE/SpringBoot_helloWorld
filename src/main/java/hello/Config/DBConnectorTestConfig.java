/**
 * @(#)DBConnectorTestConfig.java, 2019/8/13.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hello.Config;

import hello.DB.DBConnector;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */

/**
 * 测试数据库
 */
@Component
@Profile("testDB")
public class DBConnectorTestConfig implements DBConnector {
    @Override
    public String configure() {
        System.out.println("已启用测试数据库");
        return "已启用测试数据库";
    }
}