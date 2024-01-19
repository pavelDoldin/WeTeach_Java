package algorithms.enumDay;

public enum Day {

    Понедельник(true, 8), Вторник(true,8),
    Среда(true, 8), Четверг(true, 8),
    Пятница(true, 8),
    Суббота(false, 0), Воскресене(false, 0);

    private boolean isWorkingDay;
    private int isWorkingCloc;

    Day(boolean isWorkingDay, int isWorkingCloc) {
        this.isWorkingDay = isWorkingDay;
        this.isWorkingCloc = isWorkingCloc;
    }

    public static void isDay() {

        int n = 0;
        for (Day day : Day.values()) {
            System.out.println(day + " " + day.isWorkingDay + " Рабочие часы: " + day.isWorkingCloc);
            n = n + day.isWorkingCloc;

        }
        System.out.println("Отработанных часов за неделю: " + n);


    }

}
