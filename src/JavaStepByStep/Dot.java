package JavaStepByStep;

public class Dot {
    private double x;
    private double y;

    public Dot(double xx,double yy){
       x = xx;
       y = yy;
    }

    public Dot(){

    }

    public Dot(Dot d){
        x = d.x;
        y = d.y;
    }

    public String toString(){
        return "("+x+")"+" , ("+y+")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
