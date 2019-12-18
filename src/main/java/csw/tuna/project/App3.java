package csw.tuna.project;

import java.sql.Timestamp;
import java.util.Scanner;

public class App3 {


  final static int size = 100;

  public static ReferrenceBoard[] board = new ReferrenceBoard[size];

  public static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

  static int count = 0; // 로컬변수,메소드에 사용목적

  static Scanner ok = new Scanner(System.in);

  public static void main(String[] args) {


    inputs();

    System.out.println();

    result();

  }

  static void inputs() 
  {

    for(int i = 0; i < size; i++ ) {
      
      count ++;
      
      ReferrenceBoard brd = new ReferrenceBoard();

      System.out.print("번호: \n");

      brd.number[i] = ok.nextInt();

      ok.nextLine();

      System.out.print("내용: \n");

      brd.description[i] = ok.nextLine();

      count++;

      board[i] = brd; //?

      System.out.println();

      System.out.print("재실행 Y/N");

      String response = ok.next();
      ok.nextLine();

      if (!response.equalsIgnoreCase("y")) {

        break;        
      }
    }
  }

  static void result() {
    

    for(int i = 0; i < count; i ++)
    {

      ReferrenceBoard brd = board[i]; 

      System.out.printf("%d, %s",brd.number[i],brd.description[i]);

    }
    System.out.println(timestamp);
  }
}

//for문 시행중 count값이 계속 증가함 , 실행서순 문제로 count값이 result for문에 반영되지않음