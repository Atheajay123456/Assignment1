import java.util.Scanner;
class Clock{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter total seconds :");
int totalSeconds=sc.nextInt();
int hours=0;
int minutes=0;
int seconds=0;
  if(totalSeconds>=0){
   hours=totalSeconds/3600;
   seconds=totalSeconds%3600;
  }
 while(seconds>60){
  minutes=seconds/60;
  seconds-=minutes*60;
  }
System.out.println("Hours :"+hours +";"+"Minutes :"+minutes +";"+"Seconds :"+seconds);
 }
}



