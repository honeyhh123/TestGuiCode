package com.honeyhh.guitest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MyTest {
    @Test
    public void searchTest(){
        MySelenium mySelenium = new MySelenium();
        try {
            String s = mySelenium.searchKeys("电脑");
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void searchDateTest(){
        ArrayList<String> data = new ArrayList<>();
        data.add("空调");
        data.add("电脑");
        data.add(" ");
        data.add("dfjg");
        data.add("123456");
        data.add("%&");
        MySelenium mySelenium = new MySelenium();
        for (String val:data) {
            try {
                String s = mySelenium.searchKeys(val);
                System.out.println(val+"测试结果"+s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
