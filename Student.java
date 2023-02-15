package Lesson5_tasks;

public class Student extends Human{

    protected int id;
    protected String name;
    protected String surname;
    protected String faculty;
    protected int year;
    protected double rating;

    public Student(int id, String name, String surname, int year, String faculty, double rating, int age, int height, int weight) {
        super(age, height, weight);
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.faculty = faculty;
        this.rating = rating;
    }

    public String getSurname(){
        return surname;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", id: " + id + ", name: " + name + ", surname: " + surname +  ", faculty: " + faculty + ", rating: " + rating + ", year: " + year;
    }

    @Override
    public String toString() {
        return "Student " + super.getInfo() + ", rating - " + rating;
    }

}

