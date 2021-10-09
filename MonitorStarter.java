class MonitorStarter{
	public static void main(String[] args)
	{
new Monitor();

Monitor monitor=new Monitor(10000.00f,"Dell",20.00f);
System.out.println(monitor);
System.out.println(monitor.price);
System.out.println(monitor.brand);
System.out.println(monitor.weight);

Monitor monitor1=new Monitor("Black",1600,50,"input");
System.out.println(monitor1.colour);
System.out.println(monitor1.resolution);
System.out.println(monitor1.frequency);
System.out.println(monitor1.use);

Monitor monitor2=new Monitor(32.4f,"Computer",230);						
System.out.println(monitor2.inches);
System.out.println(monitor2.device);
System.out.println(monitor2.supplyVolt);

Monitor monitor3=new Monitor("Online Shopping",5);
System.out.println(monitor3.purchaseMode);
System.out.println(monitor3.warranty);

Monitor monitor4=new Monitor("New","flat",17.00f);
System.out.println(monitor4.model);
System.out.println(monitor4.shape);
System.out.println(monitor4.bandWidth);
System.out.println(monitor4.colour);
	}
	
}