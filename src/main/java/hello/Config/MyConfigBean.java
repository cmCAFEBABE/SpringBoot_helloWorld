/**
 * @(#)MyConfigBean.java, 2019/8/12.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hello.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
@Configuration
@Component
@ConfigurationProperties(prefix = "chenmin")
@PropertySource("classpath:myConfig.properties")
@Data
public class MyConfigBean {
    private String name;
    private String bitthday;
    private String total;


}