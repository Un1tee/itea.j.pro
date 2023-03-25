package Lesson9_tasks;
import java.util.*;

public class BlueRayDisc {
    private String title;
    private ArrayList<Catalog> catalogs;

    public BlueRayDisc(String title) {
        this.title = title;
        this.catalogs = new ArrayList<>();
    }

    public void addCatalog(String name) {
        Catalog catalog = new Catalog(name);
        catalogs.add(catalog);
    }

    public void printCatalogs() {
        System.out.println("Catalogs in " + title + ":");
        for (Catalog catalog : catalogs) {
            System.out.println("- " + catalog.getName());
            catalog.printSubCatalogs();
        }
    }

    public class Catalog {
        private String name;
        private ArrayList<Catalog> subCatalogs;
        private ArrayList<String> records;

        public Catalog(String name) {
            this.name = name;
            this.subCatalogs = new ArrayList<>();
            this.records = new ArrayList<>();
        }

        public void addSubCatalog(String name) {
            Catalog subCatalog = new Catalog(name);
            subCatalogs.add(subCatalog);
        }

        public void addRecord(String name) {
            records.add(name);
        }

        public void printSubCatalogs() {
            for (Catalog subCatalog : subCatalogs) {
                System.out.println("  - " + subCatalog.getName());
                subCatalog.printSubCatalogs();
            }
            for (String record : records) {
                System.out.println("    - " + record);
            }
        }

        public String getName() {
            return name;
        }
    }
}
