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
            Index helloworld = new Index();
            
            ride = helloworld.getTaxi(person.getPickup(),person.getTime(),taxi);

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
 }
 
 