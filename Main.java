//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to MPG calculator App!");
        int total_miles=0;
        int total_gallons=0;

        Scanner input = new Scanner(System.in);
        System.out.printf("enter number of trips, (exist enter -1):%n");
        int total_trips=input.nextInt();
        if(total_trips!=-1){
            int counter= 1 ;
            while (counter <= total_trips    ){
                Trip t = new Trip();
                t.setTrip_id(counter);
                System.out.printf("enter milles in trip[%d]%n",t.getTrip_id());
                int trip_miles = input.nextInt();
                t.setMiles(trip_miles);
                System.out.printf("Gallons used: %n");
                int trip_gallons = input.nextInt();
                t.setGallons(trip_gallons);
                t.print();
                total_miles+=t.getMiles();
                total_gallons+=t.getGallons();
                counter++;
            }
            System.out.printf("Total MPG-(all trips): %.2f " , (double)total_miles / total_gallons);
        }else {
            System.out.printf("you have no trip%n");
        }

    }
}
