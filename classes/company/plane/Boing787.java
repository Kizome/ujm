package classes.company.plane;

/**
*@Author: Rafa Amo.
*/
import java.util.ArrayList;
import java.util.Calendar;

import classes.company.seat.Seat;


public class Boing787 extends Plane{

    private final static int COST=280000000;
    private final static int AUTONOMY=8000;
    private final static int PASSENGERSCAPACITY=300;
    private final static int OILCONSUME=160;//l/km
    private final static int NROWS=50;
    private final static char[] COLUMS={'A','B','C','D','E','F'};
    private final static int NVIP=60;
    private String[] planeCars= new String[4];
    private static int number=0;//Si crean 10000 aviones de un tipo de avion (cosa poco probable) no cumplir con el formato especifico
    private final static String ACRONYM="IBB";



    public Boing787(Calendar purchaseDate){
        super(Boing787.ACRONYM,Boing787.number++,purchaseDate,Boing787.OILCONSUME);
    }



    public void generateSeats(){
        int nvip=this.NVIP;

        for(int i=0;i<this.NROWS;i++){
            this.planesSeats.add(new ArrayList<Seat>());
            for(int z=0;z<this.COLUMS.length;z++){
                if(nvip>0){
                    this.planesSeats.get(i).add(new Seat(this.COLUMS[z],i,true));
                    nvip--;
                }else{
                    this.planesSeats.get(i).add(new Seat(this.COLUMS[z],i,false));
                }
            }
        }
    }
}
