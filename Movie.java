class Movie{
public static void entertain(int ticketPrice,int movieLength,String movieName,float rating,String[] actors)
{
System.out.println("invoking all entertain");
System.out.println("ticketPrice : "+ticketPrice);
System.out.println("movieLength : "+movieLength);
System.out.println("movieName : "+movieName);
System.out.println("rating : "+rating);
for(int actorsindex=0;actorsindex<actors.length;)
{
String actor=actors[actorsindex];
System.out.println(actor);
actorsindex++;
}
}
}