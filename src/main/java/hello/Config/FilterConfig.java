/**
 * @(#)FilterConfig.java, 2019/8/13.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hello.Config;

import hello.Filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean myFilterBean(){
        FilterRegistrationBean filter=new FilterRegistrationBean();
        filter.setFilter(new MyFilter());
        filter.addUrlPatterns("/*");
        filter.setName("MyFilter");
        filter.setOrder(2);
        return filter;
    }


}