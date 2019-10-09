package com.kavito.mybatisgenerator.test;
import java.util.Date;

import com.kavito.mybatisgenerator.pojo.User;

/**
 * @Description:
 * @Author: kavito
 * @Date: 2019/10/8 2:46 下午
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1111);
        user.setUsername("liuBei");
        user.setBirthday(new Date());
        user.setSex("1");
        user.setAddress("深圳南山区");

    }
}
