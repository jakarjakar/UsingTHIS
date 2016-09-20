package pkg4ernovik;

public class Point {
    public int x = 0;
    public int y = 0;
    
    //constructor
    public Point(int a, int b) {
        x = a;
        y = b;
    }
    public static void main(String[] args) {
        Point p = new Point(1, 1);
        PointThis pThis = new PointThis(1, 1);
        PointThis pThis1 = new PointThis();
        System.out.println(p.x);
        System.out.println(pThis.x);
        System.out.println(pThis1.x);
}
}
