class WrapperStarter
{
public static void main(String[] values)
{
   //byte wrapper class
   
Byte num1=new Byte((byte)10);      
System.out.println(num1);

Byte num2=new Byte("5");
System.out.println(num2);

     //short wrapper class
	 
Short digit1=new Short((short)500);      
System.out.println(digit1);

Short digit2=new Short("5000");
System.out.println(digit2);

     //integer wrapper class
	 
Integer val1=new Integer(3000);
System.out.println(val1);

Integer val2=new Integer("50000");
System.out.println(val2);

     //long wrapper class
	
Long dig1=new Long(4000);
System.out.println(dig1);

Long dig2=new Long("80000");
System.out.println(dig2);

     //float wrapper class
	 
Float flo1=new Float(56.89f);
System.out.println(flo1);

Float flo2=new Float("12.333");
System.out.println(flo2);

Float flo3=new Float(45.000d);
System.out.println(flo3);

     //double wrapper class
	 
Double dou1=new Double(345678999.78d);
System.out.println(dou1);

Double dou2=new Double("111123.6667");
System.out.println(dou2);

     //boolean wrapper class
	 
Boolean bool1=new Boolean(false);
System.out.println(bool1);

Boolean bool2=new Boolean("true");
System.out.println(bool2);

     //character wrapper class
	 
Character char1=new Character('a');
System.out.println(char1);

//parse method
	
       byte num3=Byte.parseByte("10");
       System.out.println(num3);
       short digit3=Short.parseShort("50");
       System.out.println(digit3);
       int val3=Integer.parseInt("100");
       System.out.println(val3);
       long dig3=Long.parseLong("10000");
       System.out.println(dig3);
       float flo4=Float.parseFloat("12.78f");
	   System.out.println(flo4);
	   Double dou3=Double.parseDouble("1344.98d");
	   System.out.println(dou3);
	   boolean bool3=Boolean.parseBoolean("true");
	   System.out.println(bool3);
	   boolean bool4=Boolean.parseBoolean("abc");
	   System.out.println(bool4);
	   String ch="A";
	   char char2=ch.charAt(0);
	   System.out.println(char2);
	   
//compareTo method
       
	   Byte byt1=new Byte((byte)2);
	   Byte byt2=new Byte("4");
	   Byte byt3=new Byte((byte)4);
	   System.out.println("Comparing bytes 1 & 2: "+byt1.compareTo(byt2));
	   System.out.println("Comparing bytes 2 & 3: "+byt2.compareTo(byt3));
	   
	   Short sho1=new Short((short)28);
	   Short sho2=new Short("28");
	   System.out.println("Comparing short's 1 & 2: "+sho1.compareTo(sho2));
	   
	   Integer int1=new Integer(1000);
	   Integer int2=new Integer("100");
	   System.out.println("Comparing int's 1 & 2: "+int1.compareTo(int2));
	   
	   Long lon1=new Long(123456);
	   Long lon2=new Long("123456");
	   System.out.println("Comparing long's 1 & 2: "+lon1.compareTo(lon2));
	   
	   Float fl1=new Float(2893457.787f);
	   Float fl2=new Float("2856.68f");
	   System.out.println("Comparing float's 1 & 2: "+fl1.compareTo(fl2));
	   
	   Double do1=new Double(34567699.78d);
	   Double do2=new Double("34567699.78d");
	   System.out.println("Comparing double's 1 & 2: "+do1.compareTo(do2));
	   
	   Boolean boo1=new Boolean(false);
       Boolean boo2=new Boolean("false");
	   System.out.println("Comparing boolean's 1 & 2: "+boo1.compareTo(boo2));
	   
	   Character ch1=new Character('M');
	   Character ch2=new Character('m');
	   System.out.println("Comparing char's 1 & 2: "+ch1.compareTo(ch2));
	   
//equals() method
	   
	   System.out.println("comparing using equals bytes 2 & 3: "+byt2.equals(byt3));
	   System.out.println("Comparing using equals short's 1 & 2: "+sho1.equals(sho2));
	   System.out.println("Comparing using equals int's 1 & 2: "+int1.equals(int2));
	   System.out.println("Comparing using equals long's 1 & 2: "+lon1.equals(lon2));
	   System.out.println("Comparing using equals float's 1 & 2: "+fl1.equals(fl2));
	   System.out.println("Comparing using equals double's 1 & 2: "+do1.equals(do2));
	   System.out.println("Comparing using equals boolean's 1 & 2: "+boo1.equals(boo2));
	   System.out.println("Comparing using equals char's 1 & 2: "+ch1.equals(ch2));
	   
//abs() method
       
       int a=10;
       Integer i1=Math.abs(a);
	   System.out.println(i1);
	   System.out.println(Math.abs(Integer.MIN_VALUE));
	   double b=1234656.68d;
	   double b1=0.0d;
	   Double d1=Math.abs(b);
	   System.out.println(Math.abs(b/b1));
	   System.out.println(Math.abs(Double.MIN_VALUE));
	   System.out.println(d1);
	   float c=-14356.78f;
	   Float f1=Math.abs(c);
	   System.out.println(f1);
	   System.out.println(Math.abs(Float.MIN_VALUE));
	   long d=1345678L;
	   Long l1=Math.abs(d);
	   System.out.println(l1);
	   System.out.println(Math.abs(Long.MIN_VALUE));

//typeValue() method
       
	   System.out.println(num2.byteValue());
	   System.out.println(digit2.shortValue());
	   System.out.println(int2.intValue());
	   System.out.println(lon2.longValue());
	   System.out.println(fl2.floatValue());
	   System.out.println(do2.doubleValue());
	   System.out.println(boo2.booleanValue());
	   
//ceil() and floor() method	   
       
	   System.out.println(Math.ceil(b));
	   System.out.println(Math.ceil(b/b1));
	   
	       System.out.println(Math.floor(b));
	   
//round() method
        
	   System.out.println(Math.round(c));
	   System.out.println(Math.round(b));
	   
//valueOf() method

       byte num4=Byte.valueOf("10");
       System.out.println(num4);
       short digit4=Short.valueOf("50");
       System.out.println(digit4);
       int val4=Integer.valueOf("100");
       System.out.println(val4);
       long dig4=Long.valueOf("10000");
       System.out.println(dig4);
       float flo5=Float.valueOf("12.78f");
	   System.out.println(flo5);
	   Double dou4=Double.valueOf("1344.98d");
	   System.out.println(dou4);
	   boolean bool5=Boolean.valueOf("true");
	   System.out.println(bool5);
	   boolean bool6=Boolean.valueOf("abc");
	   System.out.println(bool6);
	   
//min() method
       
	   int x=3465;
	   int y=4687;
	   Integer z=Integer.min(x,y);
	   System.out.println(z);
	   double d2=45678.67889d;
	   double d3=346798.7789d;
	   Double d4=Double.min(d2,d3);
	   System.out.println(d4);
	   float c1=3578964.56f;
	   Float c2=Float.min(c,c1);
	   System.out.println(c2);
	   long l2=35456678L;
	   Long l=Long.min(d,l2);
	   System.out.println(l);

//max() method
       
	   Integer z1=Integer.max(x,y);
	   System.out.println(z1);
	   Double d5=Double.max(d2,d3);
	   System.out.println(d5);
	   Float c3=Float.max(c,c1);
	   System.out.println(c3);
	   Long l4=Long.max(d,l2);
	   System.out.println(l4);

//exp() method
       
       double q=2.0;
       System.out.println(Math.exp(q));
       double g=25.0;
	   System.out.println(Math.exp(g));
	   double u=-7.0;
	   System.out.println(Math.exp(u));

//pow() method
	   
	   double m=5;
	   double n=45;
	   System.out.println(Math.pow(m,n));
	   System.out.println(Math.pow(m,u));
	   
//random() method
       
	   System.out.println("1st random: "+Math.random());
	   System.out.println("2nd random: "+Math.random());

//toDegrees() method 
	   
	   double f=Math.PI;
	   System.out.println(Math.toDegrees(f));
	  
//toRadians() method 
	   
	   double f9=180.0;
	   System.out.println(Math.toRadians(f9));
	    
//sin(),cos(),tan(),asin() method 
	   
	   double f2=60.0;
	   double f3=90.0;
	   
	   System.out.println(Math.sin(f9));
	     System.out.println(Math.sin(f2));
		   System.out.println(Math.sin(f3));
		     System.out.println(Math.asin(u));
	   
}


}