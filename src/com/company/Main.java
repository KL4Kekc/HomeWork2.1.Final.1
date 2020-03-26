package com.company;

public class Main {

    public static void main(String[] args) {
        BirdOfPrey birdOfPrey = new BirdOfPrey(Habitat.MOUNTAIN, "Berkut", 8);
        Eagle eagle = new Eagle(Habitat.PRAIRIE, "Eagle", 5, "Axwell", 10, 70);
        Eagle eagle1 = new Eagle(Habitat.FOREST, "Desert eagle", 8, "Maxwell", 12, 50);
        System.out.println(birdOfPrey.getInfo());
        System.out.println(eagle.getInfo());
        System.out.println(eagle1.getInfo());

        eagle.makeTrick("Eagle make loop!!!");
        eagle.makeTrick(5);

    }
}
