import java.util.ArrayList;
public class Satellite2
{
   public static void main(String[]args)
   {
	   
       ArrayList<Location2> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda2(honLoc));
       locate.add(new Toyota2("8, 9"));
       locate.add(new GMC2(3, 8));


       double[] home = {0, 0};
   	 	 	
     	for(Location2 l : locate)
     	{
			double x = (Math.round((Math.random()*100)*100.00))/100.00;
			double y = (Math.round((Math.random()*100)*100.00))/100.00;
          
			System.out.println("After " + l.getID() + " Moved (" +getLocation(l.getLoc())+")");
          
			l.move(x,y);
          
			System.out.println("\nNew Location: (" + getLocation(l.getLoc()) + ")\n\n");
		}
		
		String printout = "\n\n" +
               "==========================" + "\nStarting locations...";
			   
			    for (Location2 l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }


       printout += "\n\n" + "==========================" + "\nDistance from home...";


       for (Location2 l : locate)
       {
		   System.out.printf("\nDistance for " + l.getID() + ": %.2f", getDistance(l.getLoc(), home));
       }
	   
   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return String.format("%.2f,%.2f", loc[0], loc[1]);
   }
}