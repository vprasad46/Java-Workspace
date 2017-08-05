import java.util.Scanner;
public class Index{
    
     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of taxis: ");
        int n = input.nextInt();
        Taxi[] taxi = new Taxi[n];
        
        for(int i=0;i<n;i++){
                taxi[i] = new Taxi(Location.A,0,9);
            }
        
        int ch=1;
        while(ch==1){
            System.out.println("*********************");
            System.out.println("1. Book Taxi.\n2. Quit Application.");
            System.out.println("*********************");
            ch = input.nextInt();
           if(ch==1){
            Person person = new Person();
            System.out.println("*********************");
            System.out.println("Customer ID: "+person.setId());
            System.out.println("*********************");
            System.out.println("::Pickup Location::");
            System.out.println("--A--B--C--D--E--F--");
            char loc = input.next(".").charAt(0);
            switch(loc){
                case 'A':  person.setPickup(Location.A);break;
                case 'B':  person.setPickup(Location.B);break;
                case 'C':  person.setPickup(Location.C);break;    
                case 'D':  person.setPickup(Location.D);break;
                case 'E':  person.setPickup(Location.E);break;
                case 'F':  person.setPickup(Location.F);break;
            }
            System.out.println("::Drop Location::");
            System.out.println("--A--B--C--D--E--F--");
            loc = input.next(".").charAt(0);
            switch(loc){
                case 'A':  person.setDrop(Location.A);break;
                case 'B':  person.setDrop(Location.B);break;
                case 'C':  person.setDrop(Location.C);break;    
                case 'D':  person.setDrop(Location.D);break;
                case 'E':  person.setDrop(Location.E);break;
                case 'F':  person.setDrop(Location.F);break;
            }
            System.out.println("::Pick up time::");
            person.setTime(input.nextInt());
            int ride=-1;
            Index obj = new Index();
            ride = obj.getTaxi(person.getPickup(),person.getTime(),taxi);
            if(ride==-1&&person.getPickup().next()!=null)
            	ride = obj.getTaxi(person.getPickup().next(), person.getTime()-1, taxi);
            if(ride==-1&&person.getPickup().previous()!=null)
            	ride = obj.getTaxi(person.getPickup().previous(), person.getTime()-1, taxi);
            if(ride!=-1){
            taxi[ride].setRevenue(obj.calRevenue(person.getPickup(),person.getDrop()));
            taxi[ride].setTime(obj.calTime(person.getTime(),person.getPickup(),person.getDrop()));
            taxi[ride].setLocation(person.getDrop());
            System.out.println("Taxi-"+(ride+1)+" is alloted");
            }
            else System.out.println("No Taxis Available");
           }
        }
    }
    
    public int getTaxi(Location location, int time, Taxi[] taxis){
        long leastrev=0;
        int flag = 0;
        int ride = -1;
        
        for(int i =0;i<taxis.length;i++){
         if(taxis[i].getLocation()==location&&taxis[i].getTime()==time){
             if(flag == 0){
                 leastrev = taxis[i].getRevenue();
                 flag = 1;
                 ride = i;
             }
             else{
                 if(taxis[i].getRevenue()<leastrev)
                 ride = i;
             }
          }
       }
       return ride;
    }
    
    public long calRevenue(Location pickup,Location drop){
    	
    	long revenue=100;
    	int kms=-5;
    	if(pickup.getvalue()-drop.getvalue()>0)
    		kms += pickup.getvalue()-drop.getvalue();
    	else
    		kms += -(pickup.getvalue()-drop.getvalue());
    	
    	revenue += kms*10;
    	
    	return revenue;
    }
    
    public int calTime(int time,Location pickup,Location drop){
    	
    	if(pickup.getvalue()-drop.getvalue()>0)
    		time += (pickup.getvalue()-drop.getvalue())/15;
    	else
    		time +=-((pickup.getvalue()-drop.getvalue())/15);
    	
    	return time;	
    	
    }
 }
 
 
