package classes.company.people;

import java.util.Calendar;

public class Tripulation extends Employee{

  private final static int SALARY_DEF=40000;

    
  public Tripulation(String name, String secondname,String dni,Calendar b, String nationality, String languages, int nflights)throws Exception{
        super(dni, name, secondname, b, nationality, languages, nflights,SALARY_DEF);
  }


}
