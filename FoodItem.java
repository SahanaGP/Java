class FoodItem
{
public static String menu(String[] items)
{
System.out.println("List of fooditems are....");
int size=items.length;
System.out.println(items.length);
for(int index=0;index<size;index++)
{
System.out.println(items[index]);
}
System.out.println("Invoking first item.....");
return items[size=0];
}
}