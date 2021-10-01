class ConversionOfString{
public static void main(String[] values)
{
     //examples- string into byte
	 
     //1
String birthDayDate="2";
byte convertedBirthDayDate=Byte.parseByte(birthDayDate);
System.out.println(convertedBirthDayDate);
     //2
String birthDayMonth="11";
byte convertedBirthDayMonth=Byte.parseByte(birthDayMonth);
System.out.println(convertedBirthDayMonth);
     //3
String age="21";
byte convertedAge=Byte.parseByte(age);
System.out.println(convertedAge);
	 //4
String numberOfRainbowColours="7";
byte convertedNumberOfRainbowColours=Byte.parseByte(numberOfRainbowColours);
System.out.println(convertedNumberOfRainbowColours);
     //5
String monthsInAYear="12";
byte convertedMonthsInAYear=Byte.parseByte(monthsInAYear);
System.out.println(convertedMonthsInAYear);
System.out.println("--------------------------------------------------------");


     //examples- string into short
	 
	 //1
String upsPrice="22000";
short convertedUpsPrice=Short.parseShort(upsPrice);
System.out.println(convertedUpsPrice);
     //2
String birthDayYear="1999";
short convertedBirthDayYear=Short.parseShort(birthDayYear);
System.out.println(convertedBirthDayYear);
     //3
String bikeNumber="6754";
short convertedBikeNumber=Short.parseShort(bikeNumber);
System.out.println(convertedBikeNumber);
     //4
String numberOfDaysInAYear="365";
short convertedNumberOfDaysInAYear=Short.parseShort(numberOfDaysInAYear);
System.out.println(convertedNumberOfDaysInAYear);
     //5
String passCode="5555";
short convertedPassCode=Short.parseShort(passCode);
System.out.println(convertedPassCode);
System.out.println("--------------------------------------------------------");
  
  
     //examples- string into int
	 
	 //1
String alphabets="26";
int convertedAlphabets=Integer.parseInt(alphabets);
System.out.println(convertedAlphabets);
     //2
String carPrice="20000000";
int convertedCarPrice=Integer.parseInt(carPrice);
System.out.println(convertedCarPrice);
     //3
String numbers="12345";
int convertedNumbers=Integer.parseInt(numbers);
System.out.println(convertedNumbers);
     //4
String consonants="21";
int convertedConsonants=Integer.parseInt(consonants);
System.out.println(convertedConsonants);
     //5
String vowels="5";
int convertedVowels=Integer.parseInt(vowels);
System.out.println(convertedVowels);
System.out.println("--------------------------------------------------------");


     //examples- string into long
	 
	 //1
String adharNumber="577076154352";
long convertedAdharNumber=Long.parseLong(adharNumber);
System.out.println(convertedAdharNumber);	
     //2 
String population="1366400000";
long convertedPopulation=Long.parseLong(population);
System.out.println(convertedPopulation);
     //3 
String pinCode="571422";
long convertedPinCode=Long.parseLong(pinCode);
System.out.println(convertedPinCode);
     //4
String refrigeratorPrice="20000";
long convertedRefrigeratorPrice=Long.parseLong(refrigeratorPrice);
System.out.println(refrigeratorPrice);	
     //5 
String busNumber="2345";
long convertedBusNumber=Long.parseLong(busNumber);
System.out.println(convertedBusNumber);	
System.out.println("--------------------------------------------------------");


     //examples- string into float
	 
	 //1
String height="5.1";
float convertedHeight=Float.parseFloat(height);
System.out.println(convertedHeight);	 
     //2 
String weight="47.50";
float convertedWeight=Float.parseFloat(weight);
System.out.println(convertedWeight);	
     //3
String percentage="85.45";
float convertedPercentage=Float.parseFloat(percentage);
System.out.println(convertedPercentage);	
     //4
String cgpa="8.7";
float convertedCgpa=Float.parseFloat(cgpa);
System.out.println(convertedCgpa);	
     //5
String time="22.19";
float convertedTime=Float.parseFloat(time);
System.out.println(convertedTime);	
System.out.println("--------------------------------------------------------");


     //examples- string into double
	 
	 //1 
String piValue="3.14515";
double convertedPiValue=Double.parseDouble(piValue);
System.out.println(convertedPiValue);
     //2 
String rootThreeValue="1.7320508076";
double convertedRootThreeValue=Double.parseDouble(rootThreeValue);
System.out.println(convertedRootThreeValue);
     //3 
String value="0.14515778535";
double convertedValue=Double.parseDouble(value);
System.out.println(convertedValue);
     //4 
String decimalNumber="1.2345678900000";
double convertedDecimalNumber=Double.parseDouble(decimalNumber);
System.out.println(convertedDecimalNumber);
     //5 
String laptopPrice="40000.0000000";
double convertedLaptopPrice=Double.parseDouble(laptopPrice);
System.out.println(convertedLaptopPrice);
System.out.println("--------------------------------------------------------");


     //examples- string into char
	 
	 //1 
String letter="A";
char convertedLetter=letter.charAt(0);
System.out.println(convertedLetter);
     //2 
String specialChar="i";
char convertedSymbol=specialChar.charAt(0);
System.out.println(convertedSymbol);
     //3 
String number="100";
char convertedNumber=(char)Integer.parseInt(number);
System.out.println(convertedNumber);
     //4 
String selectLetter="s";
char convertedSelectLetter=selectLetter.charAt(0);
System.out.println(convertedSelectLetter);
     //5 
String choose="C";
char convertedChoose=choose.charAt(0);
System.out.println(convertedChoose);  	 
System.out.println("--------------------------------------------------------");


     //examples- string into boolean
	 
	 //1 
String morning="false";
boolean convertedMorning=Boolean.parseBoolean(morning);
System.out.println(convertedMorning);
     //2 
String sunday="false";
boolean convertedSunday=Boolean.parseBoolean(sunday);
System.out.println(convertedSunday);	 
	 //3
String powerOn="true";
boolean convertedPower=Boolean.parseBoolean(powerOn);
System.out.println(convertedPower);
     //4
String wednesday="true";
boolean convertedWednesday=Boolean.parseBoolean(wednesday);
System.out.println(convertedWednesday);
     //5 
String holiday="false";
boolean convertedHoliday=Boolean.parseBoolean(holiday);
System.out.println(convertedHoliday);
System.out.println("--------------------------------------------------------");

}
}