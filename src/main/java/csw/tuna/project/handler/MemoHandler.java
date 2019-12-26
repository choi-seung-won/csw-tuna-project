package csw.tuna.project.handler;

import java.sql.Timestamp;
import java.util.Scanner;
import csw.tuna.project.domain.Memo;

public class MemoHandler {

  public static Scanner ok;
  final static int Msize = 100;

  //  public static ReferrenceBoard[] board = new ReferrenceBoard[size];

  public static Timestamp timestamp = new Timestamp(System.currentTimeMillis());



  int Mcount = 0; // 로컬변수,메소드에 사용목적
  Memo[] Mb = new Memo[Msize];

  public static void addMemo(MemoHandler memoHandler) 
  {

    Memo mp = new Memo();


    System.out.print("번호: \n");

    mp.number = ok.nextInt();

    ok.nextLine();

    System.out.print("내용: \n");

    mp.description = ok.nextLine();

    //      count++;

    memoHandler.Mb[memoHandler.Mcount++] = mp; //?


  }


  public static void listMemo(MemoHandler memoHandler) {


    for(int i = 0; i < memoHandler.Mcount; i ++)
    {

      Memo mp = memoHandler.Mb[i]; 

      System.out.printf("%d, %s,%s\n",mp.number,mp.description,timestamp);

    }
    System.out.println();
  }

  public static void detailMemo(MemoHandler memoHandler) {
    Memo mp = null;
    System.out.println("게시물 번호 ?");
    int no = ok.nextInt();
    ok.nextLine();
    
    for(int i =0; i < memoHandler.Mcount; i ++)
    {
      
      if(memoHandler.Mb[i].number == no)
      {
        mp = memoHandler.Mb[i];
        break;
      }
    }
      if(mp == null) 
      {
        System.out.println("유효하지 않은 번호 ");
        return;
      }
      
      System.out.printf("번호 : %d \n",mp.number);
      System.out.printf("내용 : %s \n",mp.description);
      System.out.printf("시각 : %s \n",timestamp);
    }
    

  }




