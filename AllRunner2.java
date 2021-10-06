class AllRunner2
{
public static void main(String[] values)
{
Internet internet=new Internet();
String pro=internet.provider;
System.out.println(pro);
System.out.println("---------------------------------------");
Deodrant deodrant=new Deodrant();
String name=deodrant.brand;
System.out.println(name);
int money=deodrant.price;
System.out.println(money);
int quant=deodrant.quantity;
System.out.println(quant);
String col=deodrant.colour;
System.out.println(col);
System.out.println("---------------------------------------");
PowerBank2 powerBank2=new PowerBank2();
int capa=powerBank2.capacity;
System.out.println(capa);
int cost=powerBank2.price;
System.out.println(cost);
String name2=powerBank2.company;
System.out.println(name2);
System.out.println("---------------------------------------");
Wallet wallet=new Wallet();
String col2=wallet.colour;
System.out.println(col2);
int money2=wallet.price;
System.out.println(money2);
String country=wallet.countryMade;
System.out.println(country);
}
}