package Lesson6_tasks;

public class HenFactory{
    public static Hen getHen(String country) {
        switch (country) {
            case "Ukraine":
                return new UkrainianHen();
            case "Poland":
                return new PolishHen();
            case "Moldova":
                return new MoldovanHen();
            case "Great Britain":
                return new GreatBritainHen();
            default:
                return null;
        }
    }
}
