package Classes_And_Objects;

public class Planet {
    String Planet_Name;
    Float Distance_From_Sun;
    float Average_Temperature;
    float Orbit;
    float Days_of_Earth;
    float No_Of_Moons;
    String Discovery;

    Planet(String Planet_Name,Float Distance_from_sun,float Average_Temperature,float Orbit,float Days_of_Earth,float No_of_Moons,String Discovery){
     this.Planet_Name=Planet_Name;
     this.Distance_From_Sun=Distance_from_sun;
     this.Average_Temperature=Average_Temperature;
     this.Orbit=Orbit;
     this.Days_of_Earth=Days_of_Earth;
     this.No_Of_Moons=No_of_Moons;
     this.Discovery=Discovery;
    }
    public void DisplayDetails(){
        System.out.println("________________________________________________________________________________________");
        System.out.println("Name of Planet                  -->  "+this.Planet_Name);
        System.out.println("Distance from Sun               -->  "+this.Distance_From_Sun+"AU (Astronomical Units)");
        System.out.println("Average Temperature of Planet   -->  "+Average_Temperature+"°C");
        System.out.println("One Year of "+this.Planet_Name+"             -->  "+this.Orbit+" Earth Days");
        System.out.println("Days in a Year                  -->  "+this.Days_of_Earth);
        System.out.println("Number of Moons                 -->  "+this.No_Of_Moons);
        System.out.println("Discovery of Planet             -->  "+Discovery);
        System.out.println("________________________________________________________________________________________");
    }
}
class Action2{
    public static void main(String [] args) {
        Planet Mercury = new Planet("Mercury", 0.50f, 450, 88, 58.6f, 0, "Known to the ancient Greeks and Visible to the naked Eyes");
        Planet Venus = new Planet("Venus", 0.72f, 465, 225, 241F, 0f, "Known to the ancient Greeks and Visible to the naked Eyes");
        Planet Earth = new Planet("Earth", 1.0f, 25, 365.24f, 1, 1, "Originates from \"Die Erde,\" the German word for \"The Ground \"");
        Planet Mars = new Planet("Mars", 1.52f, 5, 876, 1.1f, 2, "Known to the ancient Greeks and Visible to the naked Eyes");
        Planet Jupiter = new Planet("Jupiter", 5.20f, 100, 4343.5f, 0.30f, 79, "Known to the ancient Greeks and Visible to the naked Eyes");

        Mercury.DisplayDetails();
        Venus.DisplayDetails();
        Earth.DisplayDetails();
        Mars.DisplayDetails();
        Jupiter.DisplayDetails();

    }
}
  /*  Create a class that captures planets. Each planet has a name, a distance from the sun, and its gravity relative to Earth’s gravity.
        For distance and gravity, use the type double which captures real numbers. Make objects for Earth and your favorite non-earth planet.
*/