class Lighter
{
public static boolean onMethod()
{
System.out.println("Turn on");
return true;
}
public static boolean offMethod()
{
System.out.println("Turn off");
return false;
}
public static boolean light(int width)
{
if(width>0)
{
System.out.println("Greater width");
return true;
}
else
{
System.out.println("Lower width");
return false;
}