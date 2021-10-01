class Ornament
{
public static String items(String[] things)
{
System.out.println("List of ornamentitems are....");
int size=things.length;
System.out.println(things.length);
for(int index=0;index<size;index++)
{
System.out.println(things[index]);
}
System.out.println("Invoking last item.....");
return things[size-1];
}
}