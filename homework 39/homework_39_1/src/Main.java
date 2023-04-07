/*
Задача 1. Реализовать методы square в трапеции и прямоугольнике.
 */
class Triangle extends Shape{
    int h, a;
    public Triangle(String name, int h, int a) {
        super(name);
        this.h = h;
        this.a = a;
    }
    public double square(int h, int a){
        return (a * h) / 2;
    }
}
class Trapezia extends Shape{
    int a1, a2, h;
    public Trapezia(String name, int a1, int a2, int h) {
        super(name);
        this.a1 = a1;
        this.a2 = a2;
        this.h= h;
    }
    public double square(int a1, int a2, int h){
        return (a1 + a2) *  h / 2;
    }
}
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Triangle", 6, 10);
        double square = triangle.square(triangle.h, triangle.a);
        System.out.println(square);
        Trapezia trapezia = new Trapezia("Trapezia", 5, 10, 8);
        double square_1 = trapezia.square(trapezia.a1, trapezia.a2, trapezia.h);
        System.out.println(square_1);
    }
}