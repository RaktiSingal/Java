import java.util.*;
public class days
{
public static void main(String args[])
{
int month;
Scanner sc=new Scanner(System.in);
printf("Enter month to find number of days in it:");
month=sc.nextInt();
if(month==4 || month==6 || month==9 || month==11)
  printf("\n Number of days are:30");
else if(month==2 && month%4==0)
  printf("\n Number of days are :29");
 else if(month==2 && month%4!=0)
   printf("\n Number of days are :28");
 else
 printf("\n Number of days are :31");
 }
 }
