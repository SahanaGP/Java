class Headset{
	String brand;
	float price=1499.99f;
	String type;
	int noiseCancellation;
	String mic;
	
	Headset()
	{
		System.out.println("not pointing to any memory location");
	}
	Headset(String brnd)
	{
		System.out.println(brnd);
		brand=brnd;
	}
	Headset(float pric)
	{
		System.out.println(pric);
		price=pric;
	}
	Headset(int noise)
	{
		System.out.println(noise);
		noiseCancellation=noise;
	}
	Headset(String brd,String typ)
	{
		System.out.println(brd);
		System.out.println(typ);
		brand=brd;
		type=typ;
	}
	Headset(float cost,int noise)
	{
		price=cost;
		noiseCancellation=noise;
	}
	Headset(String micc,int noise)
	{
		System.out.println(micc);
		System.out.println(noise);
		mic=micc;
		noiseCancellation=noise;
	}
	Headset(int noise,String brd)
	{
		System.out.println("invoked two locations");
		noiseCancellation=noise;
		brand=brd;
	}
	Headset(float cost,String typ,String micc)
	{
		price=cost;
		type=typ;
		mic=micc;
	}
	Headset(String brd,float cost,String micc)
	{
		
		brand=brd;
		price=cost;
		mic=micc;
	}
}