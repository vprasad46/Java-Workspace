class Person{
    
    static int id=0;
    int time;
    Location pickup_loc,drop_loc;
    
    public void setPickup(Location pickup_loc){this.pickup_loc = pickup_loc;}
    public void setDrop(Location drop_loc){this.drop_loc= drop_loc;}
    public void setTime(int time){this.time = time;}
    public int setId(){id++;return id;}
    public Location getPickup(){return pickup_loc;}
    public int getTime(){return time;}
    public Location getDrop(){return drop_loc;}
}