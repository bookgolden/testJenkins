package com.java.cn.bean;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@SpringBootTest
@ExtendWith(SpringExtension.class)
public class UserBeanTest {

    UserBean userBean = null;

    @BeforeEach
    public void setUp() throws Exception {
        userBean = new UserBean();
        userBean.setUserName("bob");
        userBean.setAge(10);
    }

    @Test
    public void getUserName() {
        System.out.println(userBean.getUserName());
    }

    @Test
    public void getAge() {
        System.out.println(userBean.getAge());
    }

    @Test
    public void setUserName() {
        System.out.println(userBean.getUserName());
    }

    @Test
    public void setAge() {
        System.out.println(userBean.getAge());
    }
}