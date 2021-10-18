class RefrigeratorStarter
{
public static void main(String[] values)
{
new Refrigerator();
  
Refrigerator refrigerator=new Refrigerator("India","WhirlPool",265.0,true);
String company=refrigerator.getCompany();
String model=refrigerator.getModel();
double capacityInLitres=refrigerator.getCapacityInLitres();
boolean doubleDoor=refrigerator.getDoubleDoor();
if(company!=null)
{
  System.out.println(company);
}
if(model!=null)
{
  System.out.println(model);
}
if(capacityInLitres>0)
{
  System.out.println(capacityInLitres);
}
if(doubleDoor!=false)
{
  System.out.println(doubleDoor);
}
refrigerator.setCompany("China");
refrigerator.setModel("LG");
refrigerator.setCapacityInLitres(570);
refrigerator.setDoubleDoor(true);
System.out.println(refrigerator.getCompany());
System.out.println(refrigerator.getModel());
System.out.println(refrigerator.getCapacityInLitres());
System.out.println(refrigerator.getDoubleDoor());
}
}