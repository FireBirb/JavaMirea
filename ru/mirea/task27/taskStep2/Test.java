package ru.mirea.task27.taskStep2;

public class Test {
    public static void main(String[] args)
    {
        Map map = new Map();
        map.Add("Archibald","Ford");
        map.Add("Mikolaj","Fox");
        map.Add("Kaylee","Duran");
        map.Add("Nieve","Duran");
        map.Add("Benjamin","Pham");
        map.Add("Archibald","Duran");
        map.Add("Xander","Fry");
        map.Add("Colin","Hawkins");
        map.Add("Ollie","Gilmore");
        map.Add("Ollie","Guerrero");
        System.out.println(map.getSameFirstNameCount());
        System.out.println(map.getSameLastNameCount());
        map.CreateMap();
    }
}
