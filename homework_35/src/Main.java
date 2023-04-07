import java.util.ArrayList;

/*

Задача 1. Создайте класс Wine, который содержит переменные name, sort и year.
Создайте три экземпляра этого класса. Выведите на консоль значения их переменных методом toString.
Добавить в класс Wine метод: onStock, имеет один параметр – количество бутылок.
Выводит на консоль сообщение "На складе имеется количество бутылок". Задайте метод getYear – возвращает год производства вина.
Вызвать этот метод для каждого из объектов.


class Wein{
    public String name;
    public String sort;
    public int year;
    public int amount;
    Wein(String name, String sort, int year, int amount){
        this.name = name;
        this.sort = sort;
        this.year = year;
        this.amount = amount;
    }
    public String toString(){
        return name + " " + sort + " " + year + " " + amount;
    }
    public void OnStock(int amount){
        System.out.println(amount + " bottles are available ");
    }
    public void getYear(int year){
        System.out.println("It was produced in " + year);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Wein> stock = new ArrayList<>();
        Wein Wein_1 = new Wein("red", "sweet", 1786, 3);
        Wein Wein_2 = new Wein("white", "sweet", 1887, 4);
        Wein Wein_3 = new Wein("pink", "sweet", 1665, 7);
        System.out.println(Wein_1);
        Wein_1.OnStock(Wein_1.amount);
        Wein_1.getYear(Wein_1.year);
        System.out.println(Wein_2);
        Wein_2.OnStock(Wein_2.amount);
        Wein_2.getYear(Wein_2.year);
        System.out.println(Wein_3);
        Wein_3.OnStock(Wein_3.amount);
        Wein_3.getYear(Wein_3.year);
    }
}

*/
/*
Задача 2. Предложить набор полей для классов:
Студент
Читатель библиотеки
Напиток
class Student{
    int year; String Name; int semester; String faculty;
}
class Reader{
    String Name; int number_of_borrowed_books; String name_of_a_borrowed_book; int time;
}
class Drink{
    String name; boolean alcoholic_or_not; String ingridients; int price;
}
*/
/*
Задача 3 (*) Создать класс Bus (автобус) - с полями номер маршрута, вместимость, скорость на маршруте, длина маршрута.
Реализовать для него методы go, stop, speedUp, speedDouwn
*/
class Bus{
    public int number_of_route; public int capacity; public int speed; public int length_of_route;
    public void go(){
        speed += 1;
    }
    public void speedUp(){
        speed += 10;
    }
    public void speedDown(){
        speed -= 10;
    }
    public void stop() {
        while (speed > 0){
            speed -= 1;
        }
    }
}