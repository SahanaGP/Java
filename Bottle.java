class Bottle{
public static void storing(int price,String colour,int height,String quality,String[] brands)
{
System.out.println("invoking all storing");
System.out.println("price : "+price);
System.out.println("colour : "+colour);
System.out.println("height : "+height);
System.out.println("quality : "+quality);
for(int brandsindex=0;brandsindex<brands.length;)
{
String brand=brands[brandsindex];
System.out.println(brand);
brandsindex++;
}
}
}