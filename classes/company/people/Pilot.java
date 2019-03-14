package classes.company.people;

import java.util.Calendar;

public class Pilot extends Employee{

    private int flyingHour=0;
    public static final int SALARY_DEF=100000;
    public static final int SALARYSINCREMENT=5000;

    
    
        
    public Pilot(String name, String surname, String dni, Calendar b, String nationality, String lang, int nflights, int fly)throws Exception{
        super(name, surname, dni, b, nationality, lang, nflights,SALARY_DEF);
        this.flyingHour=fly;
    }

    
    /*Metodo util aunque no del todo correcto ya que se deberian de sumar una vez producido el vuelo*/
    public void addHours(int hours){
        this.flyingHour=this.flyingHour+hours;
        this.numberOfFlight++;
        this.salarysIncrement();
    }
    
    //Este metodo debe ser llamado desde el constructor de flight 
    public void salarysIncrement(){
        this.salary=this.salary+Pilot.SALARYSINCREMENT;
    }
}
