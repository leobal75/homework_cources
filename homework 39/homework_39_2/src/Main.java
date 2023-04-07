/*
Задача 2 (*). Реализовать классы Airplane и Pilot, назначить пилота на рейс на конкртеном самолете.
*/
class Pilot{
    public String name;
    private String age;
    private String gender;
    private int height;
}
class Airplane extends Pilot{
    public String destination;
    public String departure_time;
    private String model;
    private int capacity;
    public Airplane(String destination, String departure_time){
        this.destination = destination;
        this.departure_time = departure_time;
    }
    public void Set_Pilot(String name_of_pilot){
        name = name_of_pilot;
    }
    public String toString(){
        return destination + " " + departure_time + " " + name;
    }
}
public class Main {
    public static void main(String[] args) {
        Pilot pilot_1 = new Pilot();
        Pilot pilot_2 = new Pilot();
        Airplane plane_1 = new Airplane("Monako", "18:00");
        Airplane plane_2 = new Airplane("London", "01:00");
        pilot_1.name = "Anastasia Arakhova";
        plane_1.Set_Pilot(pilot_1.name);
        pilot_2.name = "Vasilii Kerman";
        plane_2.Set_Pilot(pilot_2.name);
        System.out.println(plane_1);
        System.out.println(plane_2);
    }
}