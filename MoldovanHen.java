package Lesson6_tasks;

public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " My country of origin is Moldova. I lay " + getCountOfEggsPerMonth() + " eggs per month.";
    }
}
