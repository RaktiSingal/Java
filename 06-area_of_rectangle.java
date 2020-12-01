import java.util.*;
public class area1
{
public static void main()
{
float length,breath,area;   
Scanner sc=new Scanner(System.in);
System.out.println("Enter length for rectangle");   
length=sc.nextInt();                     
System.out.println("Enter breath for rectangle");
breath=sc.nextInt();
area= length * breath;                  
System.out.println("Area of rectangle is"+ area);    
}
}
