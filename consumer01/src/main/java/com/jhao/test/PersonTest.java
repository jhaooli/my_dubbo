package com.jhao.test;

import com.jhao.pojo.Person;
import com.jhao.service.QueryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

/**
 * Created by Administrator on 2018/12/14.
 */
public class PersonTest {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        System.out.println("consumer start");
        Person person = context.getBean(QueryService.class).getOnePerson("徐");
        System.out.println("这个人的名字是 "+person.getName());
        System.out.println("person - " + person.toString());

    }

}
