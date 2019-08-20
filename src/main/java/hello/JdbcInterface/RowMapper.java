/**
 * @(#)RowMapper.java, 2019/8/18.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hello.JdbcInterface;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public interface RowMapper {
    Object mapRow(ResultSet rs, int rowNum) throws SQLException;
}