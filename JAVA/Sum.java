class Sum
{
public static void main(String ar[])
{
 int a=70;
 int b=0;

try
{
System.out.println("main function");
b=a/0;
}
  catch(Exception e)
{
System.out.println("try catch");
}
System.out.println(b);
}
}
