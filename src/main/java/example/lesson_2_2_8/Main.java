package example.lesson_2_2_8;

public class Main {
    public static void main(String[] args) {
        String day = "Sunday";
        String[] days = {"Sunday", "Wednesday", "Friday", "Tuesday", "Sunday", "Monday"};

        System.out.println("Проверка на boolean: " + DayOfWeek.isWeekend(day));
        System.out.printf("\nКоличество будних дней: %s\nКоличество выходных дней: %s",
                DayOfWeek.weekdayCount(days), DayOfWeek.weekendCount(days));
    }
}
