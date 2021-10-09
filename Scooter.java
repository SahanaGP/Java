class Scooter
{
String brand;
float price;
String colour="Black";
float length;
double weight;
float mileage;
String type;
String seatColour;
String model;
float fuelTank;
boolean insurance;
float speed;
String stateBoard;
int plateNumber;
String tyre;

Scooter()
{
	System.out.println("location with no arguments");
}

Scooter(float price,String brand)
{
    System.out.println("invoking");
	this.price=price;
	this.brand=brand;
}

Scooter(String colour,String seatColour)
{
    System.out.println("invoking colours");
	 this.colour=colour;
	 this.seatColour=seatColour;
}

Scooter(double weight,float mileage,String type)
{
    System.out.println("invoke all");
	 this.weight=weight;
	 this.mileage=mileage;
	 this.type=type;
}

Scooter(String model,float fuelTank,boolean insurance)
{
    System.out.println("invoke all");
	 this.model=model;
	 this.fuelTank=fuelTank;
	 this.insurance=insurance;
}

Scooter(float length,float speed,String stateBoard,int plateNumber,String tyre)
{
	System.out.println("End of constructor");
	System.out.println("invoking data");
	this.length=length;
	this.speed=speed;
	this.stateBoard=stateBoard;
	this.plateNumber=plateNumber;
	this.tyre=tyre;
}
}