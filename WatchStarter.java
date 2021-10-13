class WatchStarter
{
public static void main(String[] values)
{
new Watch();

Watch wat=new Watch("India",WatchTypes.QUARTZ);
String country=wat.countryMade;
System.out.println(country);
WatchTypes tp=wat.type;
System.out.println(tp);
wat.displayDetails();

wat.countryMade="China";
System.out.println(wat.countryMade);
}

}