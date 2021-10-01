class Speaker2
{
public static void volume(int level)
{
if(level<=0)
{
System.out.println("On it first");
}
else if(level<=3)
{
System.out.println("Ok");
}
else if(level>3&&level<=5)
{
System.out.println("Loud");
}
else if(level>5&&level<=9)
{
System.out.println("Too Loud");
}
else
{
System.out.println("Call Police");
}
}
public static boolean turnOn()
{
System.out.println("invoked TurnOn");
return true;
}
public static boolean turnOff()
{
System.out.println("invoked TurnOff");
return false;
}
}