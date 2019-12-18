package csw.tuna.project;

import java.util.Scanner;

public class Test02 {
  
  
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("5개 숫자 입력 ?");
    int size = 5;
    int[] num = new int[size];
    //5개의 배열을 할당받음 0~4
    int min_num = num[0];
    int max_num = num[0];
    //max/min_num 값 배열의 1번값으로 초기화
    
    for(int i = 0; i < num.length; i ++) //for문 구동 num.length=size인 5번까지 반복
  {
    num[i] = scan.nextInt();//int 입력 값 스캔
    
//    num[size] = scan.nextInt();
    
    scan.nextLine();
    
    if(i == 0) // i = 0인경우 최소값을 배열내부의 값으로 지정해야함
    {
      min_num = num[i]; 
    }
    if(num[i] < min_num)//num[i]가 min_num보다 작을 경우 num[i]값을 받아옴
    {
      min_num = num[i];
    }
    if(num[i] > max_num) //num[i]가 max_num보다 클 경우 num[i] 값을 받아옴
    {
      max_num = num[i];
    }
   
  }
            
    System.out.printf("최소값 : %d\n",min_num);
    
    System.out.printf("최대값 : %d",max_num);
    
    
    scan.close();
  }

}
