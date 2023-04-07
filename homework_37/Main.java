import java.util.Random;

/*
Задача 2 (*). Создать абстрактный класс Transport, поля и метды разработать самостоятельно.
Расширить его классами Auto и Boat.
Создать метод, который обеспечивает выдачу VIN для автомобилей и яхт.

class Adress extends Employee{
    public Adress(String name, String email, int ID_num) {
        super(name, email, ID_num);
    }
    public String name_of_street;
    public String number_of_house;
    public String number_of_room;
    public int number_of_floor;
    public String getName_of_street(String name_of_street){
        return name_of_street;
    }
    public String getNumber_of_house(String number_of_house){
        return  number_of_house;
    }
    public String getNumber_of_room(String number_of_room){
        return number_of_room;
    }
    public int getNumber_of_floor(int number_of_floor){
        return number_of_floor;
    }
}
*/
class Auto extends Transport {
    public Auto(String name_of_model, String price, int capacity){
        super(name_of_model, price, capacity);
    }
    String VIN;
    static String RandGeneratedStr(int l) {
        String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder s = new StringBuilder(l);
        for (int  i=0; i<l; i++) {
            int ch = (int)(AlphaNumericStr.length() * Math.random());
            s.append(AlphaNumericStr.charAt(ch));
        }
        return s.toString();
    }
}
class Boat extends Transport{
    public Boat(String name_of_model, String price, int capacity) {
        super(name_of_model, price, capacity);
    }
    String VIN;
    static String RandGeneratedStr(int l) {
        String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder s = new StringBuilder(l);
        for (int  i=0; i<l; i++) {
            int ch = (int)(AlphaNumericStr.length() * Math.random());
            s.append(AlphaNumericStr.charAt(ch));
        }
        return s.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        /*
        Adress Employee_1 = new Adress("Sasha Arakhov", "sashaarakhov@gmail.com", 675);
        Adress Employee_2 = new Adress("Vasia Jarov", "vasiajarov@gmail.com", 876);
        Employee_1.name_of_street = "Harikoba";
        Employee_1.number_of_house = "24B";
        Employee_1.number_of_floor = 3;
        Employee_1.number_of_room = "29B";
        Employee_2.name_of_street = "Harikobad";
        Employee_2.number_of_house = "22B";
        Employee_2.number_of_floor = 25;
        Employee_2.number_of_room = "13B";
        System.out.println(Employee_1);
        System.out.println("His adress is: " + Employee_1.name_of_street + " " + Employee_1.number_of_house + ". The floor is: " + Employee_1.number_of_floor + ". The room number is: " + Employee_1.number_of_floor);
        System.out.println(Employee_2);
        System.out.println("His adress is: " + Employee_2.name_of_street + " " + Employee_2.number_of_house + ". The floor is: " + Employee_2.number_of_floor + ". The room number is: " + Employee_2.number_of_floor);
        */
        Auto mersedec = new Auto("N765", "900 Euro", 4);
        System.out.println(mersedec);
        mersedec.VIN = mersedec.RandGeneratedStr(10);
        System.out.println("Its VIN is: " + mersedec.VIN);
        Boat yacht = new Boat("H981", "1200 Euro", 10);
        System.out.println(yacht);
        yacht.VIN = yacht.RandGeneratedStr(10);
        System.out.println("Its VIN is: " + yacht.VIN);
    }
}