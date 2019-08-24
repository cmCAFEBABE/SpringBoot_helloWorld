package hello.helloSpring; /**
 * @(#)Controller.java, 2019/8/12.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import hello.Config.ConfigBean;
import hello.Config.MyConfigBean;
import hello.Config.RandomBean;
import hello.DB.DBConnector;
import hello.Dao.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
@RestController
public class UserController {

    @Value(value = "${cm.name}")
    private String name;
    @Value(value = "${cm.birthday}")
    private String birthday;

    @Value(value="${random.secret}")
    private String secret;
    @Value(value="${random.number}")
    private String number;
    @Value(value="${random.bignumber}")
    private String bignumber;
    @Value(value="${random.uuid}")
    private String uuid;
    @Value(value="${random.number.less.than.ten}")
    private String ten;
    @Value(value="${random.number.in.range}")
    private String range;

    @Autowired
    private ConfigBean configBean;
    @Autowired
    private MyConfigBean myConfigBean;
    @Autowired
    private DBConnector dbConnector;
//    @Autowired
//    private RandomBean random;

    @RequestMapping("/hello")
    public String hello() {
        return "name11111:" + name + "," + "birthday" + birthday+"陈敏打扫ifUS奥普佛牌";
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
        return myConfigBean.getTotal()+myConfigBean.getName()+myConfigBean.getBirthday();
    }
    @RequestMapping("/hello5")
    public String hello5(){
            return "secret"+secret+"+"+"number"+number+"bignumber"+bignumber+"uuid"+uuid+"ten"+ten+"range"+range;
    }
//        return random.getSecret()+random.getNumber_less_than_ten()+random.getNumber_in_range();
    @RequestMapping("/DB")
    public String DB(){
        return dbConnector.configure();
    }


}