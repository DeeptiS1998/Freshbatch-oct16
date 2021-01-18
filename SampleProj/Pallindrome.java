import java.util.*;
class Pallindrome
{
public static void main(String []args)
{
Scanner dj=new Scanner(System.in);
 int c=0,a,temp;
 System.out.println("Enter the number");
 int n =dj.nextInt();
 temp=n;
 while(n>0)
 {
 a=n%10;
 n=n/10;
 c=(c*10)+a;
 }
 if(temp==c)
 {
 System.out.println("Number is pallindrome");
 }
 else
 {
 System.out.println("Number is not a pallindrome");
 }
 }
 }