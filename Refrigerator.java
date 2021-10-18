class Refrigerator
{
String company;
String model;
double capacityInLitres;
boolean doubleDoor;

Refrigerator()
{
   System.out.println("Invoking Refrigerator");
}

Refrigerator(String company,String model,double capacityInLitres,boolean doubleDoor)
{
   this.company=company;
   this.model=model;
   this.capacityInLitres=capacityInLitres;
   this.doubleDoor=doubleDoor;
}

String getCompany()
{
   return this.company;
}

String getModel()
{
   return this.model;
}

double getCapacityInLitres()
{
   return this.capacityInLitres;
}

boolean getDoubleDoor()
{
   return this.doubleDoor;
}

void setCompany(String company)
{
   this.company=company;
}

void setModel(String model)
{
   this.model=model;
}

void setCapacityInLitres(double capacityInLitres)
{
   this.capacityInLitres=capacityInLitres;
}

void setDoubleDoor(boolean doubleDoor)
{
   this.doubleDoor=doubleDoor;
}
}