class FinalRunner
{
public static void main(String[] values)
{
System.out.println("MAIN INVOKING");
Fish fish=new Fish();
System.out.println(fish.fishName);
System.out.println(fish.weight);
System.out.println(fish.colour);
System.out.println(fish.shape);
System.out.println(fish.length);

fish.fishName="Gold Fish";//ref variable initialization
fish.weight=3;
fish.colour="Gold";
fish.length=10;
System.out.println(fish.fishName);
System.out.println(fish.weight);
System.out.println(fish.colour);
System.out.println(fish.shape);
System.out.println(fish.length);

System.out.println("---------------------------------------");

Train train=new Train();
System.out.println(train.name);
System.out.println(train.mass);
System.out.println(train.frequency);
System.out.println(train.length);
System.out.println(train.colour);

train.name="Bangalore Express";
train.mass=120000;
train.length=1000;
train.colour="Blue";

System.out.println(train.name);
System.out.println(train.mass);
System.out.println(train.frequency);
System.out.println(train.length);
System.out.println(train.colour);

System.out.println("---------------------------------------");

Charger charge=new Charger();
System.out.println(charge.name);
System.out.println(charge.current);
System.out.println(charge.voltage);
System.out.println(charge.colour);
System.out.println(charge.capacity);

charge.name="Lithium ion";
charge.colour="Black";
charge.capacity=5000;

System.out.println(charge.name);
System.out.println(charge.current);
System.out.println(charge.voltage);
System.out.println(charge.colour);
System.out.println(charge.capacity);
}
}