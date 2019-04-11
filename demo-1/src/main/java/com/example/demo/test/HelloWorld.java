package com.example.demo.test;

public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld world = new HelloWorld();

        world.getpath();
    }

    void getpath(){
        System.out.println("asdfasf");
        System.out.println(this.getClass().getClassLoader().getResource("").getPath());
    }
}
