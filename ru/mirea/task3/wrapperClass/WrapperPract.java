package ru.mirea.task3.wrapperClass;

//1. Создайте объекты класса Double, используя методы valueOf().
//2. Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
//3. Преобразовать объект класса Double ко всем примитивным типам.
//4. Вывести значение объекта Double на консоль.
//5. Преобразовать литерал типа double к строке: String d = Double.toString(3.14);

public class WrapperPract {
    public static void main(String[] args) {
        Double d1_obj = Double.valueOf(10), d2_obj = Double.valueOf(5), d3_obj = Double.valueOf(31.3);

        double d1 = Double.parseDouble("11");

        byte b1 = (byte) d1_obj.doubleValue();
        short sh1 = (short) d1_obj.doubleValue();
        int i1 = (int) d1_obj.doubleValue();
        long l1 = (long) d1_obj.doubleValue();
        float f1 = (float) d1_obj.doubleValue();
        boolean boo1 = d1_obj !=0;
        char ch1 = (char) d1_obj.doubleValue();

        System.out.print(d2_obj);

        String s = Double.toString(d3_obj);
    }
}
