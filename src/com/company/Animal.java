package com.company;

public class Animal {
    private Habitat habitat;
    private String eagleType;

    public Animal(Habitat habitat) {
        this.habitat = habitat;
    }

    public Animal(Habitat habitat, String eagleType) {
        this.habitat = habitat;
        this.eagleType = eagleType;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public String getEagleType() {
        return eagleType;
    }

    public String getInfo() {
        return "Habitat: " + getHabitat() + "," + " Eagle type: " + getEagleType() + ",";
    }

}
