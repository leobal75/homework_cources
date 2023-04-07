/*
Задача 1. Класс Car с полями возраст и применение. Дочерние классы Bus, Track, Auto.
В классах создаем поля brand и поле, отображающее "загрузку": Bus -> seats, Track -> load_weight, Auto -> capacity.
Создаем методы во всех классах:
        стоять stop
        ехать go
        ехать быстрее + 10 км/ч speed_up
        ехать медленнее - 10 км/ч speed_down Цель: убедится, что однин и тот же по названию метод работает с разными классами.
*/
class Car{
    public String name;
    public String getName(){
        return name;
    }
    public int age;
    public int getAge(){
        return age;
    }
    public String usage;
    public String getUsage(){
        return usage;
    }
    public int speed;
    public void stop(){
        while (speed > 0){
            speed -= 1;
            System.out.println(speed);
        }
    }
    public void speed_up(){
        speed += 10;
        System.out.println(speed);
    }
    public void speed_down(){
        speed -= 10;
        System.out.println(speed);
    }
    public void go(){
        speed += 1;
        System.out.println(speed);
    }
    public String brand;
    public String getBrand(){
        return brand;
    }
}
class Bus extends Car{
    public int seats;
    public int getSeats(){
        return seats;
    }
}
class Track extends Car{
    public int load_weight;
    public int getLoad_weight(){
        return load_weight;
    }
}
class Auto extends Car{
    public int capacity;
    public int getCapacity(){
        return capacity;
    }
}
public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Track track = new Track();
        Auto auto = new Auto();
        System.out.println("Bus is moving");
        bus.speed = 0;
        bus.go();
        bus.speed_up();
        bus.speed_up();
        bus.speed_down();
        bus.stop();
        System.out.println("Track is moving");
        track.speed = 13;
        System.out.println(track.speed);
        track.speed_down();
        track.stop();
    }
}