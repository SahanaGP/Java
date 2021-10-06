class InverterRunner{
public static void main(String[] values)
{
Inverter inv=new Inverter();
System.out.println(inv.make);
System.out.println(inv.price);
System.out.println(inv.capacity);
System.out.println(inv.colour);
System.out.println(inv.weight);

inv.make="MicroTek";
inv.price=10000;
inv.colour="White";

System.out.println(inv.make);
System.out.println(inv.price);
System.out.println(inv.capacity);
System.out.println(inv.colour);
System.out.println(inv.weight);
}
}