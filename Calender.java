class Calender
{
public static int getBirthMonth(String personName)
{
if(personName=="Sahana")
return 11;
else if(personName=="Sangeetha")
return 9;
else if(personName=="Sudeep")
return 10;
else if(personName=="Nisarga")
return 1;
else if(personName=="Pooja")
return 5;
else 
return 0;
}
public static String getBirthDay(String personName)
{
if(personName=="Sahana")
return "Tuesday";
else if(personName=="Sangeetha")
return "Monday";
else if(personName=="Sudeep")
return "Friday";
else if(personName=="Nisarga")
return "Saturday";
else if(personName=="Pooja")
return "Wednesday";
else 
return "None";
}
}

