public class Factorial {
  public static int  Factorial(int n){
    if (n==1){
      return 1 ;
    }
    int fnm=Factorial(n-1);
    int F= n+Factorial(n-1);
    return F;
    
   
  }
  public static void main(String[] args) {
    int n=2;
 System.out.println(Factorial(n));
    
  }

  
}