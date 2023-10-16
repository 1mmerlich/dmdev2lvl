package com.dmdev.lvl2.dz5;

public class Dz5 {

}


    interface SpaceObject {
        double getMass();
        double getDiameter();
    }

    class Planet implements SpaceObject {
        private String name;
        private double mass;
        private double diameter;

        public Planet(String name, double mass, double diameter) {
            this.name = name;
            this.mass = mass;
            this.diameter = diameter;
        }

        @Override
        public double getMass() {
            return mass;
        }

        @Override
        public double getDiameter() {
            return diameter;
        }

        @Override
        public String toString() {
            return "Planet: " + name;
        }
    }
    class Satellite implements SpaceObject {
        private String name;
        private double mass;
        private double diameter;

        public Satellite(String name, double mass, double diameter) {
            this.name = name;
            this.mass = mass;
            this.diameter = diameter;
        }

        @Override
        public double getMass() {
            return mass;
        }

        @Override
        public double getDiameter() {
            return diameter;
        }

        @Override
        public String toString() {
            return "Satellite: " + name;
        }
    }

    class Star implements SpaceObject {
        private String name;
        private double mass;
        private double diameter;

        public Star(String name, double mass, double diameter) {
            this.name = name;
            this.mass = mass;
            this.diameter = diameter;
        }

        @Override
        public double getMass() {
            return mass;
        }

        @Override
        public double getDiameter() {
            return diameter;
        }

        @Override
        public String toString() {
            return "Star: " + name;
        }
    }

    class Asteroid implements SpaceObject {
        private String name;
        private double mass;
        private double diameter;

        public Asteroid(String name, double mass, double diameter) {
            this.name = name;
            this.mass = mass;
            this.diameter = diameter;
        }

        @Override
        public double getMass() {
            return mass;
        }

        @Override
        public double getDiameter() {
            return diameter;
        }

        @Override
        public String toString() {
            return "Asteroid: " + name;
        }
    }

    final class SpaceUtils {
        private SpaceUtils() {
        }

        public static double calculateDiameter(SpaceObject spaceObject) {
            return spaceObject.getDiameter();
        }

        public static boolean compareMass(SpaceObject spaceObject1, SpaceObject spaceObject2) {
            return spaceObject1.getMass() == spaceObject2.getMass();
        }

        public static double calculateGravityForce(SpaceObject spaceObject1, SpaceObject spaceObject2) {
            return 0.0;
        }
    }
}

