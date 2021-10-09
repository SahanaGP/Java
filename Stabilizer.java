class Stabilizer 
{
String brand="V-Guard";
float price=5000.00f;
String colour;
int voltage;
int supplyVolt;
float powerRating;
float ratings;
int amperes;
String appliances;
String purchaseMode;
float powerFactor;
int warranty;
float size;
float efficiency;
float weight;

Stabilizer()
{
	System.out.println("location with no arguments");
}

Stabilizer(float cost)
{
    System.out.println(cost);
	price=cost;
}

Stabilizer(String colour,int voltage,float powerRating,float ratings)
{
    System.out.println(this.colour);
	System.out.println(this.voltage);
	System.out.println(this.powerRating);
	System.out.println(this.ratings);
	 this.colour=colour;
	 this.voltage=voltage;
	 this.powerRating=powerRating;
	 this.ratings=ratings;
}

Stabilizer(int supplyVolt,int amperes,float efficiency,float weight,float powerFactor)
{
    System.out.println(this.supplyVolt);
	System.out.println(this.amperes);
	System.out.println(this.efficiency);
	System.out.println(this.weight);
	System.out.println(this.powerFactor);
	 this.supplyVolt=supplyVolt;
	 this.amperes=amperes;
	 this.efficiency=efficiency;
	 this.weight=weight;
	 this.powerFactor=powerFactor;
}

Stabilizer(String appliances,String purchaseMode,int warranty)
{
    System.out.println(this.appliances);
	System.out.println(this.purchaseMode);
	System.out.println(this.warranty);
	 this.appliances=appliances;
	 this.purchaseMode=purchaseMode;
	 this.warranty=warranty;
}

Stabilizer(float size,String brand,float price)
{
	System.out.println("End of constructor");
	System.out.println(this.size);
	System.out.println(this.brand);
	System.out.println(this.price);
	this.size=size;
	this.brand=brand;
	this.price=price;
}
}