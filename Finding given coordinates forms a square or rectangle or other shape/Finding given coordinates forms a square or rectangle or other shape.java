
public class HelloWorld{

     public static void main(String []args){
       
       int x1,y1,x2,x3,x4,y2,y3,y4;
       
       x1 = 0;
       y1 = 0;
       x2 = 0;
       y2 = 3;
       x3 = 3;
       y3 = 0;
       x4 = 3;
       y4 = 3;
       
       double side1 = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
       double side2 = Math.sqrt(Math.pow((x2-x4),2) + Math.pow((y2-y4),2));
       double side3 = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
       double side4 = Math.sqrt(Math.pow((x3-x1),2) + Math.pow((y3-y1),2));
       
       if(side1 == side2 && side2 == side3 && side3 == side4 && side4 == side1)
        System.out.println("::This is a square::");
       else if(side1 == side3 && side2 == side4 && side2 != side3 && side3 != side4)
        System.out.println("::This is a rectangle::");
       else
        System.out.println("::Some other Shape::");
     }
     
     
}
