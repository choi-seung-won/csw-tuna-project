package csw.tuna.project;

import java.util.Scanner;

//과제 1 : 가위,바위,보 게임 애플리케이션을 작성하라.
//- 실행1
//가위,바위,보? 보
//컴퓨터: 가위  (랜덤 값이 출력된다. 힌트: Math.random())
//=> 졌습니다.
//
//- 실행2
//가위,바위,보? 바위
//컴퓨터: 가위
//=> 이겼습니다.
//

public class assignmenttest02 {

  
  public static void main(String[] args)
  {

    double RV = Math.random();
    double RV2 = Math.random();
    int intRV2 = (int)(RV * 3) + 1;
    int intRV1 = (int)(RV2 * 3) + 1;
    
    
    

    
    Scanner calc = new Scanner(System.in);

    Scanner calc2 = new Scanner(System.in);

    
    System.out.println("가위/바위/보 중 하나를 입력하시오 :\n");
    
    String num1 = calc.nextLine();
    
    
    // intRV2 = 사용자값
    // intRV1 = 컴퓨터난수값(정수)
    if(num1.equals("가위"))
    {

      
      if(intRV1 > intRV2) {
        System.out.println("패배");
        
        System.exit(0);//JVM종료

      }
      if(intRV1 == intRV2) {
        System.out.println("무승부");
        System.exit(0);//JVM종료

        
      }if(intRV1 < intRV2) {
        System.out.println("승리");
        System.exit(0);//JVM종료

      }
      
      
      
    }
    if(num1.equals("바위"))
    {

      
      if(intRV1 > intRV2) {
        System.out.println("패배");
        System.exit(0);//JVM종료

      }
      if(intRV1 == intRV2) {
        System.out.println("무승부");
        System.exit(0);//JVM종료

        
      }if(intRV1 < intRV2) {
        System.out.println("승리");
        System.exit(0);//JVM종료

      }
      
      
    }
    if(num1.equals("보"))
    {

      
      if(intRV1 > intRV2) {
        System.out.println("패배");
        System.exit(0);//JVM종료

      }
      if(intRV1 == intRV2) {
        System.out.println("무승부");
        System.exit(0);//JVM종료

      }if(intRV1 < intRV2) {
        System.out.println("승리");
        System.exit(0);//JVM종료

      }
      
      
    }
    
//    int num2;
//    int calcd = (int)(Math.random()*3)+1;
    
    
    calc.close();
    calc2.close();
  
    
  }
}
