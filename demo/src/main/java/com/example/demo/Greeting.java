package com.example.demo;

public class Greeting {

    private final String hello;
    private final String world;

    public Greeting(String h, String w){
        this.hello = h;
        this.world = w;
    }

    public String getHello(){
        return hello;
    }

    public String getWorld(){
        return world;
    }

}
