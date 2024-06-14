package example.lesson_2_2_8;

public class DayOfWeek {
    public static boolean isWeekend(String day) {
        return day.equals("Sunday") || day.equals("Saturday");
    }

    public static int weekendCount(String[] days) {
        int [] result = countArr(days);
        return result[0];
    }

    public static int weekdayCount(String[] days) {
        int [] result = countArr(days);
        return result[1];
    }

    public static int[] countArr(String[] days) {
        int[] count = {0, 0};

        for (String day : days) {
            if (isWeekend(day)) {
                count[0]++;
            } else {
                count[1]++;
            }
        }
        return count;
    }
}
