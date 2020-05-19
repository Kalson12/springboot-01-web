package com.gm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Administrator
 * @Date 2020/5/19 10:06
 *
 *
 * @SpringBootApplication : 代表当前标注一个主程序类，代表是springboot程序
 **/

@SpringBootApplication
public class HelloWorldApplication {

    //springboot的启动程序
    public static void main(String[] args) {

        SpringApplication.run(HelloWorldApplication.class,args);

    }



}
