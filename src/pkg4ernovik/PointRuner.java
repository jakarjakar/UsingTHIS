package pkg4ernovik;

public class PointRuner {
   
    public static void main(String[] args) {
        Point0 p0 = new Point0(88, 88);
        Point1This p1 = new Point1This(88, 88);
        Point2WithOutThis p2 = new Point2WithOutThis(88, 88);
        
        System.out.println(p0.x); 
        System.out.println(p1.x); 
        System.out.println(p2.x); 
    } 
}

//run:
//88
//88
//0 (by default int variable value is 0)
//BUILD SUCCESSDUL 
