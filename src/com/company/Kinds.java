package com.company;


public enum Kinds {
    Audi("Audi"),
    Bentley ("Bentley"),
    BMW ("BMW"),
    Citroen ("Citroen"),
    Dodge ("Dodge"),
    Fiat ("Fiat"),
    Ford ("Ford"),
    Geely ("Geely"),
    Honda ("Honda"),
    Volkswagen ("Volkswagen"),
    Volvo ("Volvo");

    private String kinds;

    Kinds(String kinds){
        this.kinds= kinds;
    }
    public String getString(String kinds){
        return kinds;
    }
}
