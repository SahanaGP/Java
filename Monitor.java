class Monitor 
{
String brand;
float price;
String colour="White";
float inches;
int supplyVolt;
String device;
String purchaseMode;
int warranty;
String shape;
float bandWidth;
String model;
int resolution;
int frequency;
String use;
float weight;

Monitor()
{
	System.out.println("location with no arguments");
}

Monitor(float price,String brand,float weight)
{
    System.out.println("invoking constructor location float,string,float");
	this.price=price;
	this.brand=brand;
	this.weight=weight;
}

Monitor(String colour,int resolution,int frequency,String use)
{
    System.out.println("invoking constructor location string,int,int,string");
	 this.colour=colour;
	 this.resolution=resolution;
	 this.frequency=frequency;
	 this.use=use;
}

Monitor(float inches,String device,int supplyVolt)
{
    System.out.println("invoking constructor location float,string,int");
	 this.inches=inches;
	 this.device=device;
	 this.supplyVolt=supplyVolt;
}

Monitor(String purchaseMode,int warranty)
{
    System.out.println("invoking constructor location string,int");
	 this.purchaseMode=purchaseMode;
	 this.warranty=warranty;
}

Monitor(String model,String shape,float bandWidth)
{
	System.out.println("invoking constructor location string,string,float");
	this.model=model;
	this.shape=shape;
	this.bandWidth=bandWidth;
	System.out.println("End of constructor");
}
}