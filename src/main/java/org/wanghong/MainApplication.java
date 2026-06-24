package org.wanghong;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: 王鸿
 * @Description:
 * @Date Created in 2026-06-24 10:53
 * @Modified By:
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    @SpringBootApplication//复合注解
public class MainApplication {
    public static void main(String[] args) {
       SpringApplication.run(MainApplication.class,args);
    }
}