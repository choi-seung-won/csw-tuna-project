package csw.tuna.project;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int i;
    int SIZE = 10000;
    class Note{

      int number;
      String name;
      String dailyCheck;
      String login;

    }//class Note end

    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    Note[] Infl = new Note[SIZE];
    int count = 0;
    for(i = 0; i < SIZE; i++) {
      count ++;

      Note Infl2 = new Note();

      System.out.print("번호 ? :");
      Infl2.number = scan.nextInt();
      scan.nextLine();

      System.out.print("성함 ? :");
      Infl2.name = scan.nextLine();

      if(Infl2.number > 1) {
        Infl2.dailyCheck = "thanks for visiting";     
      }//boolean check
      else
      {
        Infl2.dailyCheck = "NONE";
      }


      System.out.println("처음 로그인인가(Y/n) :");
      
      String repo = scan.nextLine();
      if(!repo.equalsIgnoreCase("Y")) {
        Infl2.login = "Need Sign in";
      }else {
        Infl2.login = "Cerified access";
      }
      
      Infl[i] = Infl2;

      System.out.print("추가 입력(Y/n) :");
      String response = scan.nextLine();

      if(!response.equalsIgnoreCase("Y")) 
      {
        break;
      }

    }//for1end

    for(i = 0; i < count; i ++) 
    {
      Note Infl2 = Infl[i];
      System.out.printf("%d,%s,%s,%s,%s \n", Infl2.number,Infl2.name,Infl2.dailyCheck,Infl2.login,
          timestamp);
    }
    System.out.println();
  }//main end
}
