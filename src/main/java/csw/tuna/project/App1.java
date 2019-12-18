package csw.tuna.project;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Scanner;
//import com.bccsw.MyProjectCL.AppFailed;

public class App1 {
  


  public static void main(String[] args) {
    

    
    Scanner keyboard = new Scanner(System.in);
//    Scanner sumCalc = new Scanner(System.in);
    Scanner ok = new Scanner(System.in);

    
    System.out.println("장소");
    String Place = keyboard.nextLine();


    System.out.println("체크시간");
    String Check = keyboard.nextLine();

      
     
        
  
  
    System.out.println("체크아웃시간");
    String CheckOut = keyboard.nextLine();
    
    
//    System.out.println("Overall Retain Time");
//    String RetainT = keyboard.nextLine();
//    System.out.println("평균 일일 체재기간");
//    String PerDaily = keyboard.nextLine();
    int Cck = Integer.parseInt(Check);
    int Cckout = Integer.parseInt(CheckOut);
    
    
  /*  
    System.out.println("체크시간(PM,정시기준): \n");
    while (!sumCalc.hasNextInt()) sumCalc.next();
    
    int Cck = sumCalc.nextInt();
    int Cckout;
    //int Cckout = sumCalc.nextInt(); 
    System.out.println("체크아웃시간(PM,정시기준): \n");
    do 
    {
      while (!sumCalc.hasNextInt()) sumCalc.next();
      Cckout = sumCalc.nextInt();
      
    }
    while(Cck < 12 && Cckout < 12);
    
    */
    int sum = Cckout - Cck;


    keyboard.close();
     

    
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

   // sumCalc.close();

    System.out.println("장소: \n" + Place);
    keyboard.close();
    

    System.out.println("체크시간(24HR,정시기준): \n" + Check);
    System.out.println("체크아웃시간(24HR,정시기준): \n" + CheckOut);

//    System.out.printf("머무른시간: %s \n", (Check + CheckOut)); //정수열값으로 변환하여야함
    System.out.printf("머무른 시간: %s HR \n", +Math.abs(sum));
//    System.out.printf("평균 일일 체재시간: %s\n", Cck + Cckout );
    
    System.out.printf("발행시간: %s \n", timestamp);

  }
  /*
  public static void Input(String arg[]) throws Exception{
    
    //Scanner scan = new Scanner(System.in);
    
    String Check =scan.next();
  }
*/
}
