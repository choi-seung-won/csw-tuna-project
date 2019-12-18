package csw.tuna.project;

import java.sql.Timestamp;
import java.util.Scanner;

public class App3 {
  
  
  final static int size = 100;
  
  public static ReferrenceBoard[] board = new ReferrenceBoard[size];
  
  
  public static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
  
  static int count = 0; // 로컬변수,메소드에 사용목적
  
  
    public static void main(String[] args) {
    

      inputs();
      
      System.out.println();
      
      result();
      
      
    
    }
    
static void inputs() 
{
      Scanner ok = new Scanner(System.in);
      
      
    for(int i = 0; i < size; i++ ) {
      ReferrenceBoard brd = new ReferrenceBoard();
      
      System.out.print("번호: \n");
      
      
      brd.number = ok.nextInt();
      
      ok.nextLine();
      
      System.out.print("내용: \n");
      
      brd.description = ok.nextLine();

      count++;
      board[i] = brd;
      System.out.println();
      
      System.out.print("재실행 Y/N");
      
      String response = ok.nextLine();
      
      if (!response.equalsIgnoreCase("y")) {
        
        break;        
      }
    }
}

   static void result() {
     System.out.println();
     
    for(int i = 0; i < count; i ++)
    {
      
      ReferrenceBoard brd = board[i]; 
      
      System.out.printf("%d, %s, %s",brd.number,brd.description,timestamp);
    
    
    }

  }
}
