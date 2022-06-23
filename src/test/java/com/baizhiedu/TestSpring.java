package com.baizhiedu;

import com.baizhiedu.basic.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 用于测试：用于测试Spring的第一个程序
     */

    @Test
    public void test3(){
        //1 获得spring的工厂
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //2 通过工厂类 获得 对象
        Person person = (Person)ctx.getBean("person");
        System.out.println("Person" + person);
    }

    /**
     * 用于测试：用于测试Spring工厂提供的其他方法
     */
    @Test
    public void test4(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        /*Person person = ctx.getBean("person", Person.class);*/

        //当前Spring的配置文件中，只能有一个<bean class是Person类型，否则会报错
        /*Person person = ctx.getBean(Person.class);*/

        //获取的是Spring工厂配置文件中所有bean标签的id值，person person1
      /*  String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitioNames:beanDefinitionNames) {
            System.out.println("beanDefinitionNames =" + beanDefinitioNames);
        }*/


    }
    /*
    *  用于测试：用于测试name属性
    * */
    @Test
    public void test6(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person p = (Person) ctx.getBean("p");
        System.out.println("p = " + p);
    }
    
}
