package Lesson6_tasks;

public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " My country of origin is Ukraine. I lay " + getCountOfEggsPerMonth() + " eggs per month.";
    }
}
