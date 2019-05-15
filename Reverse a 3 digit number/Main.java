import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
int n=in.nextInt();
    int n1=n/100;
    int n2=n%100;
    int n3=n2/10;
    int n4=n%10;
    int n5=n4*100;
    int n6=n3*10;
    int n7=n1;
    int sum=n5+n6+n7;
    
      
      System.out.println(sum);
  

  }
}