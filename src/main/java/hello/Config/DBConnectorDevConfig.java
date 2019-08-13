/**
 * @(#)DBConnectorDevConfig.java, 2019/8/13.
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
 * 生产数据库
 */
@Component
@Profile("devDB")
public class DBConnectorDevConfig implements DBConnector {
    @Override
    public String configure() {
        System.out.println("已开发服务器");
        return "已开发服务器";
    }
}