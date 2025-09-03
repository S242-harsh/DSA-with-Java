public class printDicrementNum {
  public static void  printNum (int num) {

    if (num==1){
      System.out.print(num+" ");
      return ;
    }
    printNum(num-1);
    System.out.print(num+" ");

    

  }
  public static void main(String[] args) {
    int num=10;
    printNum(num);
  }
  
}
