class MonthsRunner{
public static void main(String[] values)
{
String first="January";
String second="February";
String third="March";
String fourth="April";
String fifth="May";
String sixth="June";
String seventh="July";
String eighth="August";
String ninth="September";
String tenth="October";
String eleventh="November";
String twelveth="December";
String[] months={first,second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelveth};
int size=months.length;
System.out.println("Total Months = "+size);
System.out.println("Index 0:"+months[0]+"\n"+"Index 1:"+months[1]+"\n"+"Index 2:"+months[2]+"\n"+
                   "Index 3:"+months[3]+"\n"+"Index 4:"+months[4]+"\n"+"Index 5:"+months[5]+"\n"+
				   "Index 6:"+months[6]+"\n"+"Index 7:"+months[7]+"\n"+"Index 8:"+months[8]+"\n"+
				   "Index 9:"+months[9]+"\n"+"Index 10:"+months[10]+"\n"+"Index 11:"+months[11]);
}
}