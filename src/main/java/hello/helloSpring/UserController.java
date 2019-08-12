package hello.helloSpring; /**
 * @(#)Controller.java, 2019/8/12.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import hello.Config.ConfigBean;
import hello.Config.MyConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
@RestController
public class UserController {

    @Value(value = "${cm.name}")
    private String name;
    @Value(value = "${cm.birthday}")
    private String birthday;

    @Autowired
    private ConfigBean configBean;
    @Autowired
    private MyConfigBean myConfigBean;

    @RequestMapping("/hello")
    public String hello() {
        return "name:" + name + "," + "birthday" + birthday;
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return "name:" + configBean.getName() + "," + "birthday" + configBean.getName();
    }

    @RequestMapping("/hello3")
    public String hello3(){
        return configBean.getTotal();
    }
    @RequestMapping("/hello4")
    public String hello4(){
        return myConfigBean.getTotal();
    }
}