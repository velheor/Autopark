package com.company;

public enum Type {
    Electric("Electric"),
    Gas("Gas");

    private String type;

    Type(String type){
        this.type= type;
    }
    public String getString(String type){
        return type;
    }
}
