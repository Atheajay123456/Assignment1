import java.util.Scanner;
class averageMarks{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter maths marks :" );
float maths=sc.nextFloat();
System.out.println("enter physics marks :" );
float physics=sc.nextFloat();
System.out.println("enter chemistry marks :" );
float chemistry=sc.nextFloat();
System.out.println("average marks:"+(maths+physics+chemistry)/3);
}
}
