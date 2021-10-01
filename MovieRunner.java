class MovieRunner{
public static void main(String[] args)
{
int ticketPrice=200;
int movieLength=3;
String movieName="Bangalore Days";
float rating=8.7f;
String[] actors={"Dulquer Salmaan","Fahadh Faasil","Nazriya Nazim","Nithya Menen","Nivin Pauly"};
Movie.entertain(ticketPrice,movieLength,movieName,rating,actors);
}
}