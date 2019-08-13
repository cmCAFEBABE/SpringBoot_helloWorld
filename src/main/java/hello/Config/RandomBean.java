/**
 * @(#)RandomBean.java, 2019/8/12.
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
//@ConfigurationProperties(prefix = "random")
//@PropertySource("classpath:random.properties")
@Configuration
@Component
@Data
public class RandomBean {
    private String secret;
    private String number;
    private String bignumber;
    private String uuid;
    private String number_less_than_ten;
    private String number_in_range;
}