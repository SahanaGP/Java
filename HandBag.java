class HandBag{
	String color="brown";
	int price;
	String brand;
	String size;
	String material;
	float capacity;
	
	HandBag(int cost,String type)
	{
		System.out.println("invoked location");
		System.out.println("price :"+cost);
		System.out.println("brand :"+type);
		price=cost;
		brand=type;
	}
	HandBag(String col,String siz)
	{
		System.out.println("invoked location const string and string");
		color=col;
		size=siz;
	}
	HandBag(String mat,int cost)
	{
		System.out.println("invoked location const string and int");
		System.out.println("material :"+mat);
        System.out.println("price :"+cost);
		material=mat;
		price=cost;
	}
	HandBag()
	{
		System.out.println("invoked location with no arguments");
	}
	HandBag(float cap,String type)
	{
		System.out.println("capacity :"+cap);
  System.out.println("material :"+type);
  capacity=cap;
  material=type;
	}
	HandBag(String colr)
	{
		System.out.println("Invoked location string");
  color=colr;
	}
	HandBag(int cost)
	{
		System.out.println("cost :"+cost);
		price=cost;
	}
	HandBag(float say)
	{
		System.out.println("invoked location const float");
		capacity=say;
	}
	HandBag(float cap,int cost)
	{
		System.out.println(cap);
  System.out.println(cost);
  capacity=cap;
  price=cost;
	}
	HandBag(String col,String mat,int pri)
	{
		System.out.println(col);
  System.out.println(mat);
  System.out.println(pri);
  color=col;
  material=mat;
  price=pri;
	}
}