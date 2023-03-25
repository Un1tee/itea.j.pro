package Lesson9_tasks;

import java.util.*;

public class Mobile {
    private String brand;
    private int year;
    private List<Model> models;

    public Mobile(String brand, int year) {
        this.brand = brand;
        this.year = year;
        models = new ArrayList<>();
    }

    public void addModel(String name, String display, int batteryCapacity, int storageCapacity) {
        Model model = new Model(name, display, batteryCapacity, storageCapacity);
        models.add(model);
    }

    public void printModels() {
        System.out.println("Models for " + brand + " (" + year + "):");
        for (Model model : models) {
            System.out.println("- " + model.getName());
        }
    }

    private class Model {
        private String name;
        private String display;
        private int batteryCapacity;
        private int storageCapacity;

        public Model(String name, String display, int batteryCapacity, int storageCapacity) {
            this.name = name;
            this.display = display;
            this.batteryCapacity = batteryCapacity;
            this.storageCapacity = storageCapacity;
        }

        public String getName() {
            return name;
        }

        public String getDisplay() {
            return display;
        }

        public int getBatteryCapacity() {
            return batteryCapacity;
        }

        public int getStorageCapacity() {
            return storageCapacity;
        }
    }
}
