class StringStarter
{
public static void main(String[] values)
{   
    String name="Sahana";
	System.out.println(name);
	System.out.println("String length is:"+name.length());
	
	String message=new String("Hello!!!");
    System.out.println(message);
	
	char[] city={'M','A','N','D','Y','A'};  
	String cityName=new String(city);
	System.out.println(cityName);
	
	byte[] val=new byte[]{65,66,67,68,69};    //String(byte[] bytes,Charset charset)
	System.out.println(new String(val));
	
	String statement="Example to char array";
	char[] chars=statement.toCharArray();
	for (char ch : chars)
	{
	System.out.println(ch);
	}
	String stri=new String(chars,2,8);
	System.out.println(stri);
	
	byte[] val1=new byte[]{98,99,100};      //String(byte[] bytes,int offset,int length,Charset charset)
	System.out.println(new String(val1,1,2));
	
	StringBuffer buff=new StringBuffer("xworkz");
	System.out.println(buff);
	
	byte[] bytes="Java".getBytes();                    
	String character=new String(bytes,1,3);
	System.out.println(character);
	
	int[] codePoints={72,73,74,75,76};
	String code=new String(codePoints,1,4);
	System.out.println(code);
	
	String name1=new String("Sahana");
	if(name==name1)
	{
	System.out.println("Strings are pointing to same memory");
    }
	else
	{
	System.out.println(" Strings are not pointing to same memory");
	}
    
	//methods
	String earPhone="Boat";                //concat
	String television="OnePlus";
	String concatEx=earPhone.concat(television);
	System.out.println(concatEx);
	
	char ch=message.charAt(4);             //charAt
	System.out.println(ch);

    String flower=new String("Lotus").intern();     //intern()
	String plant=new String("Lotus").intern();
	System.out.println(flower==plant);
	
	int result=name.codePointAt(2);         //codePointAt
	System.out.println(result);
	
	int uniCode=name1.codePointBefore(4);   //codePointBefore
	System.out.println(uniCode);
	
	int num=message.codePointCount(1,3);    //codePointCount
	System.out.println(num);
	
	int comparing=earPhone.compareTo(television);   //compareTo
	System.out.println(comparing);
	
	boolean contain=name.contains("ha");       //contains
	System.out.println(contain);
	
	boolean equals=name.contentEquals(buff);   //contentEquals
	System.out.println(equals);
	
    String copy=String.copyValueOf(city,1,3); //copyValueOf
	System.out.println(copy);
	
	int index=name1.indexOf("a");           //indexOf
	System.out.println(index);
	
	String change=television.replace('o','t'); //replace
	System.out.println(change);
	
	String str="This is an split example";   //split
	String[] splits=str.split("\\s"); 
    for(String splits2: splits)
	{	
	  System.out.println(splits2);
	}
	
	String upper=earPhone.toUpperCase();    //toUpperCase
	System.out.println(upper);
	 
	String lower=cityName.toLowerCase();      //toLowerCase
	System.out.println(lower);
	 

	}
} 