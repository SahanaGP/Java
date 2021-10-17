class Computer
{
String brand;
String modelNo;
double price;
int quantity;
ComputerTypes type=ComputerTypes.DESKTOP;
static double totalOfAll;

Computer()
{
     System.out.println("Invoking Computer Constructor");
}
	
void displayDetails()
{
	System.out.println("invoked display details");
	System.out.println(this.brand);
	System.out.println(this.modelNo);
	System.out.println(this.price);
	System.out.println(this.quantity);
	System.out.println(this.type);
}

void displayTotalPrice()
{
	System.out.println("invoked displayTotalPrice");
	double totalPrice=this.price*this.quantity;
	System.out.println(totalPrice);
	Computer.totalOfAll=Computer.totalOfAll+totalPrice;
}

void displayTotalOfAll()
{
	System.out.println("invoked display total of all");
	System.out.println(Computer.totalOfAll);
}	
}