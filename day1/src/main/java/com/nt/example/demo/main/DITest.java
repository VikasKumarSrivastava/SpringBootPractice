package com.nt.example.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.example.demo.beans.WishMessageGenerator;
import com.nt.example.demo.config.AppConfig;

public class DITest {

    public static void main(String[] args) {
        System.out.println("DITest.main() start");
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
        WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
        String result =generator.showWishMessage("Vikas");
        System.out.println(result);
        String msg = generator.showMonth();
        System.out.println(msg);
        String week = generator.showWeekDay();
        System.out.println(week);
        ctx.close();
        System.out.println("DITest.main() end");
    }
}
