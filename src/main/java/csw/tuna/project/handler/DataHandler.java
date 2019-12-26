package csw.tuna.project.handler;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import csw.tuna.project.domain.Data;

public class DataHandler {
  
  
  int Datacount = 0;
  static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
  static SimpleDateFormat SDF = new SimpleDateFormat("HH:mm:ss",Locale.KOREA); 
  
  
  public static Scanner ArrayScan;    
  static int SIZE = 10000;
  Data[] dataRef = new Data[SIZE];

  public static void addData(DataHandler dataHandler) {
    
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
    
    dataHandler.dataRef[dataHandler.Datacount++] = dataRefe;
    
    System.out.print("saved");
  }
  
  public static void listData(DataHandler dataHandler) {
    
    for(int i = 0; i < dataHandler.Datacount; i ++) 
    {
      Data dataRefe = dataHandler.dataRef[i];
      System.out.printf("%s,%s,%s,%s \n", dataRefe.Placement,dataRefe.CheckTime, dataRefe.CheckOT,timestamp,
          timestamp);
    }
    
    }
  

  public static void detailData(DataHandler dataHandler) {
    Data dataRefe = null;
    System.out.println("게시물 키워드 ? ");
    String no = ArrayScan.next();
    ArrayScan.nextLine();
    
    for(int i = 0; i < dataHandler.Datacount; i ++)
    {
      if(dataHandler.dataRef[i].Placement == no) 
      {
        dataRefe = dataHandler.dataRef[i];
      break;
      }
  }
  if(dataRefe == null) 
      {
        System.out.println("유효하지 않음 ");
        return;
      }
      System.out.printf("장소: %s \n",dataRefe.Placement);
      System.out.printf("체크시간(24HR,정시기준): %s\n",dataRefe.CheckTime);
      System.out.printf("체크아웃시간(24HR,정시기준): %s\n",dataRefe.CheckOT);
      System.out.printf("발행시간: %s \n", timestamp); // **매 입력의 currenttime 기록해야함
    
  }

}
