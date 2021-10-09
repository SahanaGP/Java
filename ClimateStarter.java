class ClimateStarter{
public static void main(String[] args)
{
	new Climate();
	new Climate(26.7f);
	new Climate(26);
	new Climate("rainy");
	String desc="cold and cloudy";
	Climate cli=new Climate("Virajpet",desc);
	System.out.println(cli.location);
	System.out.println(cli.description);
	new Climate(25.7f,28);
	Climate weather=new Climate(24.2f,"summer");
	System.out.println(weather.humidity);
  System.out.println(weather.type);
  Climate stat=new Climate(23.0f,"warm and humid");
  System.out.println(stat.temp);
  System.out.println(stat.description);
  new Climate(22,29.5f);
   Climate clim=new Climate(23.72f,26,"Summer");
   clim.location="Gujarat";
   clim.description="hot and dry";
   System.out.println(clim.temp);
  System.out.println(clim.humidity);
  System.out.println(clim.type);
  System.out.println(clim.location);
  System.out.println(clim.description);

  
}
}