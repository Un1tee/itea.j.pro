package Lesson6_tasks;

public class GreatBritainHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 35;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " My country of origin is GB. I lay " + getCountOfEggsPerMonth() + " eggs per month.";
    }
}
