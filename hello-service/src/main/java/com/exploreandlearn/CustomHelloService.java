package com.exploreandlearn;

public class CustomHelloService implements HelloService{

    private String prefix;

    private String suffix;

    public CustomHelloService(){
        this(null,null);
    }

    public CustomHelloService(String prefix, String suffix){
        this.prefix = prefix;
        this.suffix = suffix;
    }
    @Override
    public void hello(String s) {
        String message = String.format("%s %s %s", this.prefix, s, this.suffix);
        System.out.println(message);
    }
}
