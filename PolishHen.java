package Lesson6_tasks;

public class PolishHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " My country of origin is Poland. I lay " + getCountOfEggsPerMonth() + " eggs per month.";
    }
}
