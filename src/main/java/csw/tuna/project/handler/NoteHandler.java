package csw.tuna.project.handler;

import java.sql.Timestamp;
import java.util.Scanner;
import csw.tuna.project.domain.Note;

public class NoteHandler {
  
  final static int SIZE = 10000;
  public static Scanner scan;
  static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
  
  
  int Ncount = 0;
  Note[] Infl = new Note[SIZE];
  
  
  public static void listNote(NoteHandler noteHandler) {
    for(int i = 0; i < noteHandler.Ncount; i ++) 
    {
      Note Infl3 = noteHandler.Infl[i];
      System.out.printf("%d,%s,%s,%s,%s \n", Infl3.number,Infl3.name,Infl3.dailyCheck,Infl3.login,
          timestamp);
    }
  }


  public static void addNote(NoteHandler noteHandler) {

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
    noteHandler.Infl[noteHandler.Ncount++] = Infl2;
  }

  public static void detailNote(NoteHandler noteHandler) {
    
    System.out.print("게시물 번호? ");
    int no = scan.nextInt();
    scan.nextLine();

    Note Infl2 = null;
    for(int i = 0; i < noteHandler.Ncount; i ++) {
      if(noteHandler.Infl[i].number == no) {
        Infl2 = noteHandler.Infl[i];
        break;
      }
      }if(Infl2 == null) {
        System.out.println("유효하지 않은 계시물 번호");
        return;
      }
      System.out.printf("%d,%s,%s,%s,%s \n", Infl2.number,Infl2.name,Infl2.dailyCheck,Infl2.login,
          timestamp);
    }
  }

