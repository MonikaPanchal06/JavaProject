import java.util.*;
public class Hello1
{
public static void main(String []args){
Scanner sr=new Scanner(System.in);
int n ,sum=0;
System.out.println("Enter any number=");
n=sr.nextInt();
for(int i=1;i<=n;i++)
{
sum=sum+i;
System.out.println(sum);
}
}
}