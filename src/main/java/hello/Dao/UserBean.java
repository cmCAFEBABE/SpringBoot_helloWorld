/**
 * @(#)UserBean.java, 2019/8/18.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hello.Dao;

import lombok.Builder;
import lombok.Data;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
@Data
@Builder
public class UserBean {
    private Integer id;
    private String name;
    private String birthday;
}