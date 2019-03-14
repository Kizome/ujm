package classes.company.plane;

/**
*@Author: Rafa Amo.
*/
import java.util.ArrayList;
import java.util.Calendar;

import classes.company.seat.Seat;

public class AirBusA320 extends Plane{

    private final static int COST=80000000;
    private final static int AUTONOMY=4000;
    private final static int PASSENGERSCAPACITY=80;
    private final static int OILCONSUME=140;//l/km
    private final static int NROWS=20;
    private final static char[] NCOLUMS={'A','B','C','D'};
    private final static int NPILOT=2;
    private final static int NTRIPULATION=2;
    private final static int NVIP=20;
    private static int number=0000;
    private final static String ACRONYM="IBA";



    public AirBusA320(Calendar purchaseDate){
        super(AirBusA320.ACRONYM,AirBusA320.number++,purchaseDate,AirBusA320.OILCONSUME);
    }



    /*
    *Aunque el avion es de dimension regular ArrayList nos daria la ventaja de alterar esa regularidad
    */
   public void generateSeats(){//hago uso de variables static ya que el metodo es llamado desde el constructor
       int nvip=this.NVIP;
        for(int i=0;i<this.NROWS;i++){
            this.planesSeats.add(new ArrayList<Seat>());
            for(int z=0;z<this.NCOLUMS.length;z++){
                if(nvip>0){
                    this.planesSeats.get(i).add(new Seat(this.NCOLUMS[z],i,true));
                    nvip--;
                }else{
                    this.planesSeats.get(i).add(new Seat(this.NCOLUMS[z],i,false));
                }
            }
        }
    }
}
