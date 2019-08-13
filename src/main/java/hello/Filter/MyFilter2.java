/**
 * @(#)MyFilter2.java, 2019/8/13.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hello.Filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
@Order(1)
@WebFilter(urlPatterns = "/*",filterName = "myFilter2")
public class MyFilter2 implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start=System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Filter2 Execute cost="+(System.currentTimeMillis()-start)+"mills");
    }

    @Override
    public void destroy() {

    }
}