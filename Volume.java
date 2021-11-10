import java.util.Scanner;
class Volume
{
     static public void main(String...ar)
     {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Radius:");
     float r = sc.nextFloat();
     System.out.println("Enter Height:");
     float h = sc.nextFloat();
     float volume1 = 3.14f*r*r*h/3;
     System.out.println("Volume Of Cone is: "+volume1); 

     float volume2 = 3.14f*r*r*h;
     System.out.println("Volume Of Cylinder is: "+volume2); 
     
     float volume3 = 4/3*3.14f*r*r*r;
     System.out.println("Volume Of Sphere is: "+volume3); 

     }
}