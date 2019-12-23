package csw.tuna.project;

import java.sql.Timestamp;
import java.util.Scanner;

public class MemoHandler {
  
  static Scanner ok;
  final static int Msize = 100;

//  public static ReferrenceBoard[] board = new ReferrenceBoard[size];

  public static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

  static int Mcount = 0; // 로컬변수,메소드에 사용목적

  static class Memo {
    
    int number;
    String description;
    
  }
  
  
  static Memo[] Mb = new Memo[Msize];
  
  static void addMemo() 
  {
    
    Memo mp = new Memo();
      
      
      System.out.print("번호: \n");

      mp.number = ok.nextInt();

      ok.nextLine();

      System.out.print("내용: \n");

      mp.description = ok.nextLine();

//      count++;

      Mb[Mcount++] = mp; //?

    
  }
  
  
static void listMemo() {
    

    for(int i = 0; i < Mcount; i ++)
    {

      Memo mp = Mb[i]; 

      System.out.printf("%d, %s,%s\n",mp.number,mp.description,timestamp);

    }
      System.out.println();
  }

}
