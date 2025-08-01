import java.util.Scanner;
class Marks{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter maths marks :" );
int maths=sc.nextInt();
System.out.println("enter physics marks :" );
int physics=sc.nextInt();
System.out.println("enter chemistry marks :" );
int chemistry=sc.nextInt();
System.out.println("Total marks:"+(maths+physics+chemistry));
}
}


