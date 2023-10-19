package com.jammin2shirts;

public class BenApi implements GenApi {

    @Override
    public String getName() {
       return "Ben";
    }

    @Override
    public String getYourName(String name) {
        return String.format(name + "%s", "!");
    }
    
}
