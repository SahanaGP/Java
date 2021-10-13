class Watch
{
String countryMade;
WatchTypes type=WatchTypes.ANALOG;
Watch()
{
     System.out.println("Invoking no argument Constructor");
}

Watch(String countryMade,WatchTypes type)
{
	System.out.println("invoking all arguments");
	this.countryMade=countryMade;
	this.type=type;
}

void displayDetails()
{
	System.out.println("Display all details"); 
	System.out.println("countrymade:"+countryMade);
	System.out.println("type:"+type);
}	
}