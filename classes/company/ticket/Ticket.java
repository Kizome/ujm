package classes.company.ticket;

import classes.company.flight.Flight;
import classes.myCalendar;
import classes.company.seat.Seat;
import classes.company.people.Client;
import java.util.Calendar;

/**
*@Author: Jesus Torralbo
*/

public class Ticket{

	//Atributos
	public Flight myFlight;
	public Seat mySeat;
	private String dni;
	public String id;
	private Calendar date;
	private int price;
	private int heur, min, seg;

	//Constructor
	public Ticket(Flight myFlight,Seat myseat, String dni){
		this.myFlight=myFlight;
		this.mySeat=myseat;
		this.setDate();
        this.id=myFlight.id+myseat.id+myCalendar.format(date);//mas hora
        this.price=myseat.price;
	}
    
    
    //PORQUE NO LE PUEDO PASAR NUUUUUUUULLLLLLLLLLLLLÇ'''''?????????
    public Ticket(Flight myFlight,Seat myseat){
		this.myFlight=myFlight;
		this.mySeat=myseat;
        this.setDate();
        this.id=myseat.id;//mas hora
        this.price=myFlight.priceSeat;
	}
    
    public String getId(){
        return this.myFlight.id+"-"+this.mySeat.id+"-"+myCalendar.format(date);
    }
    

	//GETTER
	public Flight getFlight(){
		return this.myFlight;
	}
	public Seat getSeat(){
		return this.mySeat;
	}
    public Calendar getDate(){
		return this.date;
	}
    
    public int getPrice(){
		return this.price;
	}

	public void setDate(){
		this.date=this.myFlight.flightDate;
	}
    
    
    

    
    @Override
    public String toString(){
        return this.getId();
    }
}
