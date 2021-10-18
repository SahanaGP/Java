class Camera1Starter
{
public static void main(String[] values)
{
new Camera1();
  
Camera1 camera1=new Camera1("Nikon","D3500",12.0,20.0,true);
String brand=camera1.getBrand();
String model=camera1.getModel();
double pixel=camera1.getPixel();
double price=camera1.getPrice();
boolean is4k=camera1.getIs4k();
if(brand!=null)
{
  System.out.println(brand);
}
if(model!=null)
{
  System.out.println(model);
}
if(pixel>0)
{
  System.out.println(pixel);
}
if(price>0)
{
  System.out.println(price);
}
if(is4k!=false)
{
  System.out.println(is4k);
}
camera1.setBrand("Sony");
camera1.setModel("ZV-1");
camera1.setPixel(20.0);
camera1.setPrice(50.0);
camera1.setIs4k(true);
System.out.println(camera1.getBrand());
System.out.println(camera1.getModel());
System.out.println(camera1.getPixel());
System.out.println(camera1.getPrice());
System.out.println(camera1.getIs4k());
}
}