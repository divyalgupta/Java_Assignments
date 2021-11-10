import java.util.Scanner;
class Area 
{
     static public void main(String...ar)
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("To find Area of circle");
       System.out.println("Enter Radius:");
       float rad = sc.nextFloat();
       float area1 = 3.14f*rad*rad;
       System.out.println("Area Of Circle is: "+area1); 

       System.out.println("To find Area of Triangle");
       System.out.println("Enter base:");
       float b = sc.nextFloat();
       System.out.println("Enter height:");
       float h = sc.nextFloat();
       float area2 = b*h/2;
       System.out.println("Area of Triangle is: "+area2);

       System.out.println("To find Area of Rectangle");
       System.out.println("Enter length:");
       float l = sc.nextFloat();
       System.out.println("Enter breadth:");
       float B = sc.nextFloat();
       float area3 = l * B;
       System.out.println("Area of Rectangle is: "+area3);
     }
}