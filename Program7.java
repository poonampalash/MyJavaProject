import java.util.*;

public class Program7{

public static void main(String args[]){
int a;
Scanner sc= new Scanner(System.in);
System.out.println("please enter a number");
a=sc.nextInt();
System.out.println("Output is below");
for(int n=1;n<11;n++)
System.out.println( a +"X"+n+"="+(a*n));
}

}