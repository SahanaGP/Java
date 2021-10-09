class HeadsetStarter{
	public static void main(String[] args)
	{
new Headset();
new Headset("boat");
new Headset(5499.99f);
new Headset(30);
new Headset("Lumiford","wireless");
Headset set=new Headset(2500.0f,35);
System.out.println(set.price);
System.out.println(set.noiseCancellation);
new Headset("Single-ear",35);
Headset check=new Headset(40,"Sennheiser");
System.out.println(check.noiseCancellation);
System.out.println(check.brand);
new Headset(2700.0f,"bluetooth","dual-ear");
Headset out=new Headset("Sony",3500.00f,"ribbon microphone");
System.out.println(out.brand);
System.out.println(out.price);
System.out.println(out.type);
System.out.println(out.noiseCancellation);
System.out.println(out.mic);
	}
}