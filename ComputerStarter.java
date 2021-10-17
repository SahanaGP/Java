class ComputerStarter
{
public static void main(String[] values)
{
	Computer computer=new Computer();
	computer.brand="HP";
	computer.modelNo="CN123A";
	computer.price=50.0;
	computer.quantity=3;
	computer.type=ComputerTypes.MICRO;
	computer.displayDetails();
	computer.displayTotalPrice();
	computer.displayTotalOfAll();
	
    Computer computer1=new Computer();
	computer.brand="Dell";
	computer1.modelNo="D630";
	computer1.price=60.0;
	computer1.quantity=5;
	computer1.type=ComputerTypes.ANALOG;
	computer1.displayDetails();
	computer1.displayTotalPrice();
	computer1.displayTotalOfAll();
 	
	Computer computer2=new Computer();
	computer2.brand="HP";
	computer2.modelNo="CNU2389BGJ";
	computer2.price=70.7;
	computer2.quantity=4;
	computer2.type=ComputerTypes.DESKTOP;
	computer2.displayDetails();
	computer2.displayTotalPrice();
	computer2.displayTotalOfAll();
		
	Computer computer3=new Computer();
	computer3.brand="LENOVO";
	computer3.modelNo="80SA";
	computer3.price=40.0;
	computer3.quantity=2;
	computer3.type=ComputerTypes.MINI;
	computer3.displayDetails();
	computer3.displayTotalPrice();
	computer3.displayTotalOfAll();
		
	Computer computer4=new Computer();
	computer4.brand="HP";
	computer4.modelNo="G61-429WM";
	computer4.price=50.0;
	computer4.type=ComputerTypes.DIGITAL;
	computer4.quantity=4;
	computer4.displayDetails();
	computer4.displayTotalPrice();
	computer4.displayTotalOfAll();		

}
}