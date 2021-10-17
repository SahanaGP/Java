class ProductStarter
{
public static void main(String[] values)
{

Product product=new Product();
product.displayDetails();
product.name="Wallet";
product.price=500.0;
product.quality=true;
product.quantity=3;
product.isiMark=true;
product.displayDetails();

Product product1=new Product();
product1.displayDetails();
product1.name="Refrigerator";
product1.price=30.0;
product1.quality=true;
product1.quantity=4;
product1.isiMark=true;
product1.displayDetails();

Product product2=new Product();
product2.displayDetails();
product2.name="Laptop";
product2.price=45.0;
product2.quality=true;
product2.quantity=6;
product2.isiMark=true;
product2.displayDetails();

Product product3=new Product();
product3.displayDetails();
product3.name="Watch";
product3.price=3500.0;
product3.quality=true;
product3.quantity=7;
product3.isiMark=true;
product3.displayDetails();

Product product4=new Product();
product4.displayDetails();
product4.name="Ring";
product4.price=50.0;
product4.quality=true;
product4.quantity=6;
product4.isiMark=true;
product4.displayDetails();

product.displayTotalPrice();
product1.displayTotalPrice();
product2.displayTotalPrice();
product3.displayTotalPrice();
product4.displayTotalPrice();

}


}
	

