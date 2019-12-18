package csw.tuna.project;

import java.util.Scanner;

public class Test01 {
//수열 적용
   public static int num1,num2,num3,sum = 0;
 
  
  public static void main(String[] args) {
    
    Scanner inputscan = new Scanner(System.in);
    System.out.println("입력 ?");
    
    
    num1 = inputscan.nextInt();
    
    inputscan.nextLine();
    
    num2 = inputscan.nextInt();
    
   for (int i = num1; i <= num2; i ++) {
     num3 += i;
     
   }
   
   System.out.printf("%d 에서 %d 까지의 합은 %d 입니다.",num1,num2,num3);

    
    
  }
}
