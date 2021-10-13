class BiCycle
{
String colour;
float price;
String brand;
BiCycleTypes type=BiCycleTypes.BMX;

BiCycle()
{
     System.out.println("Invoking no argument Constructor");
}

BiCycle(String colour,float price,String brand,BiCycleTypes type)
{
     System.out.println("Invoking all arguments");
	 this.colour=colour;
	 this.price=price;
	 this.brand=brand;
	 this.type=type;
}

void brake()
{
     System.out.println("Invoking brake-instance method");
}

void move()
{
     System.out.println("Invoking move-instance method");
}

void displayDetails()
{
     System.out.println("Display Details invoked");
	 System.out.println("colour:"+colour);
	 System.out.println("price:"+price);
	 System.out.println("brand:"+brand);
	 System.out.println("BiCycle type:"+type);
}
}