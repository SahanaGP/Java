class BiCycleStarter
{
public static void main(String[] values)
{
new BiCycle();

BiCycle cycle=new BiCycle("Pink",5000.00f,"Avon Sherry",BiCycleTypes.GEAR);
System.out.println(cycle.colour);
System.out.println(cycle.price);
System.out.println(cycle.brand);
System.out.println(cycle.type);
cycle.brake();
cycle.move();
cycle.displayDetails();

}

}