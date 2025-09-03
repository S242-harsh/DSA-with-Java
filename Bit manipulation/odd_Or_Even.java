

public class odd_Or_Even {
  public static boolean checkOddAndEven(int num){
    while (num%4==0) {
      num=num/4;
      
    }
    return num== 1;



  }
  public static void main(String[] args) {
   
    System.out.println(checkOddAndEven(8 ));




    
  }
  
}
