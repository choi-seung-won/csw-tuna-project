package csw.tuna.project;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class DataHandler {
  
  static Scanner ArrayScan;    

  final static int SIZE = 10000;

  static class Data{
    String Placement;
    Date CheckTime;
    Date CheckOT;
  }
  static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
  static SimpleDateFormat SDF = new SimpleDateFormat("HH:mm:ss",Locale.KOREA); 
  static int Datacount = 0;
  static int i = 0;
  
  static Data[] dataRef = new Data[SIZE];

  public static void addData() {
    Data dataRefe = new Data();

    System.out.print("장소");

    dataRefe.Placement = ArrayScan.next();

    ArrayScan.nextLine();

    System.out.print("체크시간");

    dataRefe.CheckTime = Date.valueOf(ArrayScan.next());

    ArrayScan.nextLine();
    System.out.print("체크아웃시간");
    dataRefe.CheckOT = Date.valueOf(ArrayScan.next());
    
    ArrayScan.nextLine();
    
    dataRef[Datacount++] = dataRefe;
    
    System.out.print("saved");
  }
  public static void listData() {
    for(i = 0; i < Datacount; i ++) {

      Data RefAdd = dataRef[i];

      System.out.printf("장소: %s \n",RefAdd.Placement);
      System.out.printf("체크시간(24HR,정시기준): %s\n",RefAdd.CheckTime);
      System.out.printf("체크아웃시간(24HR,정시기준): %s\n",RefAdd.CheckOT);
      System.out.printf("발행시간: %s \n", timestamp); // **매 입력의 currenttime 기록해야함
    }
  }

}
