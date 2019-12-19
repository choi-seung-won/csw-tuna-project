package csw.tuna.project;


import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
//import com.bccsw.MyProjectCL.AppFailed;
import java.util.concurrent.TimeUnit;

public class App1 {


  final static int SIZE = 10000;


  
  public static void main(String[] args) {
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    Scanner ArrayScan = new Scanner(System.in);    
    SimpleDateFormat SDF = new SimpleDateFormat("HH:mm:ss",Locale.KOREA); 
    int count = 0;
    int i = 0;
    
    class Data{
      
      String Placement;
      //   int sum[] = new int[SIZE];
      Date CheckTime;
      Date CheckOT;
      //    Scanner keyboard = new Scanner(System.in);
      //    Scanner ok = new Scanner(System.in);
    }

    
    Data[] dataRef = new Data[SIZE];
    

    for(i = 0; i < SIZE; i ++) {
      Data RefAdd = new Data();
      count ++;
      System.out.println("장소");
      
      RefAdd.Placement = ArrayScan.next();
      
      ArrayScan.nextLine();

      System.out.println("체크시간");
      
      RefAdd.CheckTime = Date.valueOf(ArrayScan.next());

      System.out.println("체크아웃시간");
      RefAdd.CheckOT = Date.valueOf(ArrayScan.next());
      //    System.out.println("Overall Retain Time");
      //    String RetainT = keyboard.nextLine();
      //    System.out.println("평균 일일 체재기간");
      //    String PerDaily = keyboard.nextLine();
      //    int Cck = Integer.parseInt(Check);
      //    int Cckout = Integer.parseInt(CheckOut);
      //    int sum = Cckout - Cck;
//      sum[i] = CheckOT[i] - CheckTime[i];
      // sumCalc.close();
      
      dataRef[i] = RefAdd;
      
      System.out.println("추가 출력을 원하십니까 : (Y/N)");
      
      String response = ArrayScan.next();
      
      if(!response.equalsIgnoreCase("Y") ) {
        break;
      }
      System.out.println();
    }
      
      for(i = 0; i < count; i ++) {
        
      Data RefAdd = dataRef[i];
      
      System.out.printf("장소: %s \n",RefAdd.Placement);
      System.out.printf("체크시간(24HR,정시기준): %s\n",RefAdd.CheckTime);
      System.out.printf("체크아웃시간(24HR,정시기준): %s\n",RefAdd.CheckOT);
      System.out.printf("발행시간: %s \n", timestamp); // **매 입력의 currenttime 기록해야함
      }
      
      System.out.println();
    

    //    System.out.printf("머무른시간: %s \n", (Check + CheckOut)); //정수열값으로 변환하여야함
    
   // System.out.printf("머무른 시간: %s HR \n", +Math.abs(sum)); **추후수정
    
    //    System.out.printf("평균 일일 체재시간: %s\n", Cck + Cckout );

    ArrayScan.close();

  }
  /*
  public static void Input(String arg[]) throws Exception{

    //Scanner scan = new Scanner(System.in);

    String Check =scan.next();
  }
   */
  /*
  public static void Stringtodate() {
    
    int millis = 0;
    String.format("%d Hour, %d min",
    TimeUnit.MILLISECONDS.toHours(millis),
    TimeUnit.MILLISECONDS.toMinutes(millis) - 
    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
    
//    Date date1 = new SimpleDateFormat().parse(CheckTime[i]);
    System.out.println();
    
  }
  */
}
