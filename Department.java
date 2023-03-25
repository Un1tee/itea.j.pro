package Lesson9_tasks;

import java.util.*;

public class Department {
    private String name;
    private List<Employee> employees;
    private List<Position> positions;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
        positions = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addPosition(String name) {
        positions.add(new Position(name));
    }

    public List<Employee> getEmployeesByPosition(String positionName) {
        Position position = getPositionByName(positionName);
        return position.employees;
    }

    public List<String> getAllPositions() {
        List<String> positionNames = new ArrayList<>();
        for (Position position : positions) {
            positionNames.add(position.name);
        }
        return positionNames;
    }

    public void addEmployeeToPosition(Employee employee, String positionName) {
        Position position = getPositionByName(positionName);
        position.addEmployee(employee);
    }

    private Position getPositionByName(String name) {
        for (Position position : positions) {
            if (position.name.equals(name)) {
                return position;
            }
        }
        return null;
    }

    public class Position {
        private String name;
        private List<Employee> employees;

        public Position(String name) {
            this.name = name;
            employees = new ArrayList<>();
        }

        public void addEmployee(Employee employee) {
            employees.add(employee);
        }
    }

    public class Employee {
        private String name;
        private List<String> positions;

        public Employee(String name) {
            this.name = name;
            positions = new ArrayList<>();
        }

        public void addPosition(String positionName) {
            positions.add(positionName);
            addEmployeeToPosition(this, positionName);
        }

        public String getName() {
            return name;
        }

        public List<String> getPositions() {
            return positions;
        }
    }
}
