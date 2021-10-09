class HandBagStarter{
	public static void main(String[] vals)
	{
  System.out.println("invoked main");
  int cost=700;
  String type="puma";
  HandBag bag=new HandBag(cost,type);
  HandBag hand=new HandBag("blue","medium");
  System.out.println(hand.color);
  System.out.println(hand.size);
  HandBag var=new HandBag("cotton",900);
 new HandBag();
 new HandBag(7.6f,"synthetic");
 HandBag res=new HandBag("grey");
 System.out.println(res.color);
 new HandBag(1000);
 HandBag fit=new HandBag(9.8f);
 System.out.println(fit.capacity);
 new HandBag(15.2f,1500);
 HandBag location=new HandBag("violet","polyster",2000);
 location.brand="Saphari";
 location.size="big";
 location.capacity=8.7f;
 System.out.println(location.color);
  System.out.println(location.price);
  System.out.println(location.brand);
  System.out.println(location.size);
  System.out.println(location.material);
  System.out.println(location.capacity);
	}
}