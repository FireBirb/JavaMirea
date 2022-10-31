package ru.mirea.task4.taskStep1;

/*DONE 1) Создать переменную, содержащую ваше любимое время года и
распечатать всю информацию о нем.
DONE 2) Создать метод, который принимает на вход переменную созданного
вами enum типа. Если значение равно Лето, выводим на консоль “Я
люблю лето” и так далее. Используем оператор switch.
DONE 3) Перечисление должно содержать переменную, содержащую среднюю
температуру в каждом времени года.
DONE 4) Добавить конструктор, принимающий на вход среднюю температуру.
DONE 5) Создать метод getDescription, возвращающий строку “Холодное время
года”. Переопределить метод getDescription - для константы Лето
метод должен возвращать “Теплое время года”.
DONE 6) В цикле распечатать все времена года, среднюю температуру и
описание времени года*/

public enum Seasons {
    SUMMER(18) {
        @Override
        public String getDescription() {return "Warm time of year";}
    },
    FALL(5),
    WINTER(-6),
    SPRING(6);

    private final double avTemp;

    private Seasons(double avTemp) {this.avTemp = avTemp;}

    public void ILove() {
        switch (this) {
            case SUMMER: System.out.println("I love summer"); break;
            case FALL: System.out.println("I love fall"); break;
            case WINTER: System.out.println("I love winter"); break;
            case SPRING: System.out.println("I love spring"); break;
        }
    }

    public double getAvTemp() {
        return avTemp;
    }

    public String getDescription() {return "Cold time of year";}

    public static void main(String[] args) {
        Seasons s = SUMMER;
        System.out.println("Favorite time of year: " + s + " " + s.getAvTemp() + " " + s.getDescription());
        for (Seasons season : Seasons.values()) {
            System.out.println(season + " " + season.getAvTemp() + " " + season.getDescription());
        }
    }


}
