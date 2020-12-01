import java.util.*;
public class pyramids
{
public static void main(String args[])
{
int i,j;
  for(i=1;i<=5;i++)
  {                                                               //output will be :              1
  for(j=1;j<=i;j++)                                             //                                1 2
  System.out.println("%d ",j);                                               //                   1 2 3
  System.out.println("\n");                                                 //                    1 2 3 4
  }                                                              //                               1 2 3 4 5
  
  for(i=5;i>=1;i--)                                              // output will be:                5 5 5 5 5
  {                                                              //                                4 4 4 4
  for(j=1;j<=i;j++)                                              //                                3 3 3
  System.out.println("%d ",i);                                               //                    2 2
  System.out.println("\n");                                                  //                    1
  }
  }
