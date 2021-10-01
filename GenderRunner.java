class GenderRunner{
public static void main(String[] values)
{
String person="Man X Woman";
String parent="Father X Mother";
String child="Son X Daughter";
String actor="Actor X Actress";
String sibling="Brother X Sister";
String spouse="Husband X Wife";
String server="Waiter X Waitress";
String host="Host X Hostess";
String[] gender={person,parent,child,actor,sibling,spouse,server,host};
int size=gender.length;
System.out.println("Total Gender = "+size);
System.out.println("Index 0:"+gender[0]+"\n"+"Index 1:"+gender[1]+"\n"+"Index 2:"+gender[2]+"\n"+
                   "Index 3:"+gender[3]+"\n"+"Index 4:"+gender[4]+"\n"+"Index 5:"+gender[5]+"\n"+
				   "Index 6:"+gender[6]+"\n"+"Index 7:"+gender[7]);
}
}