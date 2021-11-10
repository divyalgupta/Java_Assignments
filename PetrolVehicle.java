import java.util.Scanner;
class Vehicle
{
     static public void main(String...ar)
     {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter average:");
     float avg = sc.nextFloat();
     System.out.println("Enter per day consumption:");
     float consumption = sc.nextFloat();
     System.out.println("Enter Total petrol fill-up:");
     float petrolFillUp = sc.nextFloat();
     float value = petrolFillUp * (avg/consumption);
     System.out.println("Petrol of vehicle get finished in days:"+value); 
     }
}
