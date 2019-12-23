package csw.tuna.project;

import java.sql.Timestamp;
import java.util.Scanner;

public class NoteHandler {
  final static int SIZE = 10000;

  static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
  static Scanner scan;
  static int Ncount = 0;

  static class Note{

    int number;
    String name;
    String dailyCheck;
    String login;

  }//class Note end

  static Note[] Infl = new Note[SIZE];

  public static void addNote() {

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
      Infl2.dailyCheck = "NONE--";
    }

    System.out.println("처음 로그인인가(Y/n) :");

    String repo = scan.nextLine();
    if(!repo.equalsIgnoreCase("Y")) {
      Infl2.login = "Need Sign in";
    }else {
      Infl2.login = "Cerified access";
    }
    Infl[Ncount++] = Infl2;
  }

  public static void listNote() {
    for(int i = 0; i < Ncount; i ++) 
    {
      Note Infl2 = Infl[i];
      System.out.printf("%d,%s,%s,%s,%s \n", Infl2.number,Infl2.name,Infl2.dailyCheck,Infl2.login,
          timestamp);
    }
  }
}
