package com.nt.example.demo.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
    @Autowired
    private LocalDateTime dateTime;
    @Autowired
    private LocalDate date;

    public WishMessageGenerator() {
        System.out.println("WishMessageGenerator.WishMessageGenerator()");
    }

    public String showWishMessage(String user){
        System.out.println("business method");
        int hour = dateTime.getHour();
        if(hour<12)
            return "Good Morning "+user;
        else if(hour<16)
            return "Good Afternoon "+user;
        else if(hour<20)
            return "Good Evening "+user;
        else
            return "Good Night "+user;
    }
    public String showMonth(){
        System.out.println("showMonth() method");
        int month = date.getMonthValue();
        if(month< 2){
            return "Winter is going on";
        }
        else if(month<6){
            return "Summer is going on";
        }
        else if(month<9){
            return "Rainy is going on";
        }
        else{
            return "Winter is going on";
        }
    }
    public String showWeekDay(){
        System.out.println("showWeekDay() method");
        int day = date.getDayOfWeek().getValue();
        if(day >=1 && day<= 5){
            return "weekdays";
        }else{
            return "weekend";
        }
    }
}
