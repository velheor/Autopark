package com.company;

public enum Type {
    Gas("Gas"),
    Electric ("Electric");

    private String type;

    Type(String type){
        this.type= type;
    }
    public String getString(String type){
        return type;
    }
}