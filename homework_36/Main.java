
/*
Задача 1. Создать свой класс с не менее чем тремя полями Пройти весь сценарий, как с классом Phone
 */
class Airplane{
    String model;
    String destination;
    int capacity;
    String departure_time;
    int number_of_track;
    String gate;
    public String toString(){
        return model + " " + destination + " " + capacity + " " + departure_time + " " + number_of_track + " " + gate;
    }
    public Airplane(String model, String destination, int capacity, String departure_time, int number_of_track, String gate){
        this.model = model;
        this.destination = destination;
        this.capacity = capacity;
        this.departure_time = departure_time;
        this.number_of_track = number_of_track;
        this.gate = gate;
    }
    public String getModel(String model){
        return model;
    }
    public String getDestination(String destination){
        return destination;
    }
    public int getCapacity(int capacity){
        return capacity;
    }
    public String getDeparture_time(String departure_time){
        return departure_time;
    }
    public int getNumber_of_track(int number_of_track){
        return number_of_track;
    }
    public String getGate(String gate){
        return gate;
    }
}
public class Main {
    public static void main(String[] args) {
        Airplane airplane_1 = new Airplane("D908", "Rome", 80, "19:00", 9, "F19");
        System.out.println(airplane_1);
    }
}