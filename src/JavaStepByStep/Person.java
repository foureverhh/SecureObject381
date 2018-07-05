package JavaStepByStep;

import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private int year;
    public Person partner;

    public Person(String f,String e, int y){
        setFirstName(f);
        setLastName(e);
        setYear(y);
    }

    public Person(){

    }

    public void setFirstName(String fn){
        if(fn != null)
            firstName = fn;
        else
            throw new NullPointerException();
    }

    public void setLastName(String ln){
        if(ln != null)
            lastName = ln;
        else
            throw new NullPointerException();
    }

    public void setYear(int y){
        if(y>1880 && y<=Calendar.getInstance().get(Calendar.YEAR))
            year = y;
        else
            throw new IllegalArgumentException("Wrong year");
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getYear(){
        return year;
    }

    public String toString(){
        return "Name is: "+firstName+" "+lastName;
    }
}
