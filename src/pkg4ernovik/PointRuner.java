package pkg4ernovik;

public class PointRuner {
    public int x = 0;
    public int y = 0;
    
    //constructor
    public PointRuner(int a, int b) {
        x = a;
        y = b;
    }
    public static void main(String[] args) {
        Point0 p0 = new Point0(88, 88);
        Point1This p1 = new Point1This(88, 88);
        Point2WithOutThis p2 = new Point2WithOutThis(88, 88);
        
        System.out.println(p0.x); //Показывает значение x переданное конструктору БЕЗ THIS при создании объекта
        System.out.println(p1.x); //Показывает значение x переданное конструктору с использованием THIS при создании объекта
        System.out.println(p2.x); //Показывает значение x после создания с помощью конструктора без переменных. Значение берется из локальной переменной
}
}
