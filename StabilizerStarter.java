class StabilizerStarter{
	public static void main(String[] args)
	{
new Stabilizer();

new Stabilizer(5000.00f);

Stabilizer stabilizer0=new Stabilizer("White",410,55.00f,9.0f);
System.out.println(stabilizer0.colour);
System.out.println(stabilizer0.voltage);
System.out.println(stabilizer0.powerRating);
System.out.println(stabilizer0.ratings);

Stabilizer stabilizer=new Stabilizer(230,3,85.00f,4.5f,8.5f);
System.out.println(stabilizer);
System.out.println(stabilizer.supplyVolt);
System.out.println(stabilizer.amperes);
System.out.println(stabilizer.efficiency);
System.out.println(stabilizer.weight);
System.out.println(stabilizer.powerFactor);

Stabilizer stabilizer1=new Stabilizer("Refrigerator","Online",5);						
System.out.println(stabilizer1.appliances);
System.out.println(stabilizer1.purchaseMode);
System.out.println(stabilizer1.warranty);

Stabilizer stabilizer2=new Stabilizer(15.67f,"Sony",3500f);
System.out.println(stabilizer2.size);
System.out.println(stabilizer2.brand);
System.out.println(stabilizer2.price);

	}
	
}