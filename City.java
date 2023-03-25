package Lesson9_tasks;

import java.util.*;

public class City {
    private String name;
    private ArrayList<Location> locations;

    public City(String name) {
        this.name = name;
        this.locations = new ArrayList<>();
    }

    public void addLocation(String name, String type) {
        Location location = new Location(name, type);
        locations.add(location);
    }

    public void printLocations() {
        System.out.println("Locations in " + name + ":");
        for (Location location : locations) {
            System.out.println("- " + location.getName() + " (" + location.getType() + ")");
        }
    }

    public class Location {
        private String name;
        private String type;

        public Location(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }
    }
}
