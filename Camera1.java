class Camera1 
{
String brand;
String model;
double pixel;
double price;
boolean is4k=true;

Camera1()
{
   System.out.println("Invoking Camera");
}

Camera1(String brand,String model,double pixel,double price,boolean is4k)
{  
   this.brand=brand;
   this.model=model;
   this.pixel=pixel;
   this.price=price;
   this.is4k=is4k;
   System.out.println("Invoking all");
}

String getBrand()
{
   return this.brand;
}

String getModel()
{
   return this.model;
}

double getPixel()
{
   return this.pixel;
}

double getPrice()
{
   return this.price;
}

boolean getIs4k()
{
	return this.is4k;
}

void setBrand(String brand)
{
   this.brand=brand;
}

void setModel(String model)
{
   this.model=model;
}

void setPixel(double pixel)
{
   this.pixel=pixel;
}

void setPrice(double price)
{
   this.price=price;
}

void setIs4k(boolean is4k)
{
   this.is4k=is4k;
}


}