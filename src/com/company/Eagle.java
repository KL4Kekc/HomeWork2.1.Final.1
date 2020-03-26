package com.company;

public final class Eagle extends BirdOfPrey {
    private String name;
    private int age;
    private int flightSpeed;

    public Eagle(Habitat habitat, String eagleType, int fligthAltitude, String name, int age, int flightSpeed) {
        super(habitat, eagleType, fligthAltitude);
        this.name = name;
        this.age = age;
        this.flightSpeed = flightSpeed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getFlightSpeed() {
        return flightSpeed;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Name: " + getName() + "," + " Age: " + getAge() + "," + " Flight speed: " + getFlightSpeed();
    }

}
