/**
 * @(#)ConfigBean.java, 2019/8/12.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hello.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */

//由于项目目录结构的问题 可能会报错：
// Not registered via @EnableConfigurationProperties or marked as Spring component
//此时需要加上EnableConfigurationProperties注解来定向指明配置类是哪个

@Component
@ConfigurationProperties(prefix = "cm")
@Data
public class ConfigBean {
    private String name;
    private String birthday;
    private String total;
    //省略get和set
}