class Climate{
float temp;
int humidity;
String type;
String location;
String description;

Climate()
{
	System.out.println("location with no arguments");
}
Climate(float tmp)
{
	System.out.println(tmp);
	temp=tmp;
}
Climate(int hum)
{
	System.out.println("location with cons int ");
	System.out.println(hum);
	humidity=hum;
}
Climate(String typ)
{
	System.out.println("location with cons String :"+typ);
	type=typ;
}
Climate(String loc,String des )
{
	System.out.println("invoked location const string and string");
	location=loc;
	description=des;
}
Climate(float tem,int hum)
{
	System.out.println(tem);
  System.out.println(hum);
}
Climate(int hum,String typ)
{
	System.out.println("invoked location const int and string");
	humidity=hum;
	type=typ;
}
Climate(float tem,String des)
{
	temp=tem;
	description=des;
}
Climate(int hum,float tem)
{
	System.out.println(hum);
  System.out.println(tem);
  humidity=hum;
  temp=tem;
}
Climate(float tem,int hum,String typ)
{
	temp=tem;
	humidity=hum;
	type=typ;
}

}