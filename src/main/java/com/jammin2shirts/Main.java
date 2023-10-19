package com.jammin2shirts;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello world! %s", args[0]);
        GenApi api = new BenApi();
        System.out.println(api.getName());
        System.out.println(api.getYourName("Your"));

    }
}

