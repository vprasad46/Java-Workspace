class Taxi{
    
    long revenue;
    Location location;
    int time;
    Taxi(Location location, long revenue, int time){this.location=location;this.revenue=revenue;this.time=time;}
    public void setTime(int time){this.time = time;}
    public void setLocation(Location location){this.location = location;}
    public void setRevenue(long revenue){revenue= revenue + this.revenue;}
    public int getTime(){return time;}
    public long getRevenue(){return revenue;}
    public Location getLocation(){return location;}
    
}	