package com.company;


public class action implements Actor {
    @Override
     public void Sing(int money) {
                System.out.println("唱歌！");
           }

             @Override
     public void show(int money) {
              System.out.println("跳舞！");
           }

 }