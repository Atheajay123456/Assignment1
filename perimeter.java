import java.util.Scanner;
class perimeterRectangle{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter length of rectangle");
int length=sc.nextInt();
System.out.println("enter breadth of rectangle");
int breadth=sc.nextInt();
System.out.println("perimeter of rectangle is :"+2*(length+breadth));
 }
}