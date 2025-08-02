import java.util.Scanner;
class Change{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter amount :");
int amount=sc.nextInt();
int thousands=0;
int fiveHundreds=0;
int remaining=0;
  if(amount>1000){
    thousands=amount/1000;
    amount=amount%1000;
  }
 if(amount>500){
   fiveHundreds=amount/500;
   remaining=amount%500;
  }
 System.out.println("1000s :"+thousands+";"+"500s :"+fiveHundreds+";"+"Remaining :"+remaining);
}
}