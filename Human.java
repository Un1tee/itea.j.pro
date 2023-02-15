package Lesson5_tasks;

public class Human {

    private int age;
    private int height;
    private int weight;

    public Human(int age, int height, int weight){
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    public String getInfo(){
        return "Age: " + age + ", Height: " + height + ", Weight: " + weight;
    }
}
