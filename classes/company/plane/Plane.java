package classes.company.plane;

/**
*@Author: Rafa Amo.
*/

import classes.company.seat.Seat;
import classes.myCalendar;
import classes.company.flight.Flight;

import java.util.Calendar;
import java.util.ArrayList;

public abstract class Plane{
    
    public String enrollment;
    public Calendar purchaseDate;
    public int cost;
    public int autonomy;
    public int capacity;
    public int oilConsume;
    public ArrayList<ArrayList<Seat>> planesSeats = new ArrayList<ArrayList<Seat>>();
    public Flight myFlight;
    
    
    
    protected Plane(String acronym,int number,Calendar purchaseDate,int oilConsume){
        this.enrollment=setEnrollment(number,acronym);
        this.purchaseDate=purchaseDate;
        this.generateSeats();
        this.oilConsume=oilConsume;
    }
    
    
    
    public abstract void generateSeats(); 
    
    
    public void setFlight(Flight f)throws Exception{
        if(this.myFlight==null){
            this.myFlight=f;
        }else{
            throw new Exception("Error: El avion "+this.enrollment+" esta actualmente designado en el vuelo "+this.myFlight.id);
        }
    }
    

    
    public String setEnrollment(int number, String acronym){
        String enrollment=Integer.toString(number);
        
        switch(enrollment.length()){
            case 1:
                enrollment=acronym+"000"+enrollment;break;
            case 2:
                enrollment=acronym+"0000"+enrollment;break;
            case 3:
                //Lanzaria una exception("Perdida de control sobre formato de avion")
        }
        return enrollment;
    }

    
    
    @Override
    public String toString(){
        return "Matricula "+this.enrollment+" Fecha de compra "+myCalendar.format(this.purchaseDate);
    }
}