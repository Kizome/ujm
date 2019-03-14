package classes.company.people;

import classes.company.ticket.Ticket;
import classes.company.flight.Flight;

import java.util.ArrayList;
import java.util.Calendar;

public class Client extends People{
    
    public ArrayList<Ticket> myTickets = new ArrayList<Ticket>();
	
	
	public Client(String name,String surname,String dni, Calendar birthday, String nationality)throws Exception{
		super(name,surname,dni,birthday,nationality);
	}
    
    public void addTicket(Ticket t){
        this.myTickets.add(t);
    }
    
    
 
    
    
    /*NO CONTROLO LAS HORAS
    correggir
    correggir
    correggir
    correggir
    correggir
    correggir
    */
    public boolean removeTicket(String idTicket){
        boolean deleted=false;
        
        for(int i=0;i<this.myTickets.size()&&!deleted;i++){
           if(this.myTickets.get(i).getId().equals(idTicket)){
               this.myTickets.remove(i);
               deleted=true;
           }
        }
        
        return deleted;
    }
    
    public Ticket searchTicket(String idTicket)throws Exception{
        Ticket myTicket=null;
        boolean match=false;
        
        for(int i=0;i<this.myTickets.size()&&!match;i++){
            if(this.myTickets.get(i).getId().equals(idTicket)){
                myTicket=this.myTickets.get(i);
                match=true;
            }
        }
        return myTicket;
    }
    
    public boolean haveTicketOfThisFlight(Flight f){
        boolean match=false;
        
        for(int i=0;i<this.myTickets.size()&&!match;i++){
            if(this.myTickets.get(i).getFlight()==f){
                this.myTickets.remove(i);
                match=true;
            }
        }
        return match;
    }
}
