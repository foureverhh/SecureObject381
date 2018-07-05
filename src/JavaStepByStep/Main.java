package JavaStepByStep;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
       /* Person p1 = new Person("Mike","Jackson",1987);
        System.out.println(p1.toString());
        Person p2 = new Person();

        Dot d1 = new Dot(1.5,4.0);
        System.out.println(d1.toString());
        System.out.println(d1.getX()+" "+d1.getY()+" "+d1.getClass());

        Dot d2 = new Dot(new Dot(2.0,2.0));
        System.out.println(d2.toString());
        System.out.println(d2.getX()+" "+d2.getY()+" "+d2.getClass());*/

        System.out.println("Input coordinates for the first circle:");
        Scanner scanner = new Scanner(System.in);
        double x1=0,y1=0;
        while(scanner.hasNextDouble()){
             x1 = scanner.nextDouble();
             y1 = scanner.nextDouble();
            System.out.println("Invoke");
        }
        System.out.println("x1 is "+x1+" x2 is "+y1);
        System.out.println("It runs here");
        Dot a = new Dot(x1,y1);
        double x2=0,y2=0;
        System.out.println("Input coordinates for the second circle:");
        scanner = new Scanner(System.in);
        while(scanner.hasNextDouble()){
             x2 = scanner.nextDouble();
             y2 = scanner.nextDouble();
        }
        Dot b = new Dot(x2,y2);
        double distance= distance(a,b);
        Dot newDot = middlePoint(a,b);
        System.out.printf("Distance is: %.2f",distance);
        System.out.println();
        System.out.println(newDot.toString());
    }

    static double distance(Dot d1,Dot d2){
        return Math.sqrt((d1.getX()-d2.getX())*(d1.getX()-d2.getX())+(d2.getY()-d2.getY())*(d2.getY()-d2.getY()));
    }

    static Dot middlePoint(Dot d1,Dot d2){
        return new Dot((d1.getX()+d2.getX())/2,(d1.getY()+d2.getY())/2);
    }
}
