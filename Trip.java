public class Trip {

    private int miles;
    private int gallons;
    private int trip_id;
    public Trip (){
        this.miles =0 ;
        this.gallons =0 ;
        this.trip_id=0;
    }

    public void setMiles(int miles){
        this.miles = miles;
    }
    public  void setGallons(int gallons){
        this.gallons = gallons;
    }
    public void setTrip_id(int id){
        this.trip_id=id;
    }
    public int getTrip_id()
    {
        return this.trip_id;
    }
    public int getMiles(){
       return  this.miles;
    }
    public int getGallons(){
       return  this.gallons;
    }
    public double mpg(){
        return (double)this.miles / this.gallons ;
    }
    public void print() {
        System.out.printf("%n----------------------%n" +
                        "Trips ID: %d%n" +
                        "Miles: %d%n" +
                        "Gallons: %d%n" +
                        "mpg: %.2f%n" +
                        "----------------------%n"
                ,this.trip_id,this.miles,this.gallons,this.mpg());
    }

}
