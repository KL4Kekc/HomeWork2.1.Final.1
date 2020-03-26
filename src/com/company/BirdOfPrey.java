package com.company;

public class BirdOfPrey extends Animal {
    private int fligthAltitude;

    public BirdOfPrey(Habitat habitat, String eagleType, int fligthAltitude) {
        super(habitat, eagleType);
        this.fligthAltitude = fligthAltitude;
    }

    int getFligthAltitude() {
        return fligthAltitude;
    }

    final void makeTrick(String trick) {
        System.out.println(trick);
    }

    void makeTrick(int num) {
        for (int i = 0; i < num; i++) {
        }
    }

}
