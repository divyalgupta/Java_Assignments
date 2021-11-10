import java.util.Scanner;
class DisplayGuestDetail
{
     static public void main(String[] args)
     {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter year between 2011 to 2019:");
     int year = sc.nextInt();
     System.out.print("Guest Name is: ");
     switch(year) {
     case 2011:
            System.out.println("Ravi Patel\n He is a Teacher and a famous Politician.\nHe worked for many Govt. Schools in the year 1995");
            break;
     
     case 2012:
            System.out.println("Manohar Lal Khattar\nHe is the first BJP leader to be sworn in as the Chief Minister of Harayana on 26 October 2014.");
            break;
     case 2013:
            System.out.println("Sumitra Mahajan\nShe is one of the most members of the Indian Parliament.\nShe has won eight consecutive elections in the Indore constituency in Madhya Pradesh");
            break;
     
     case 2014:
            System.out.println("Ashok Gehlot\nHe is a senior Congress leader and soon he is the Chief Minister of Rajasthan.\nFormly he served as CM of Rajasthan two times, from 1998 to 2003 and from 2008 to 2013.");
            break;

     case 2015:
            System.out.println("Naman Patil\nHe is a former member of parliament from Palakkad terms.");
            break;

     case 2016:
            System.out.println("Rakesh Yadav\nHe worked for the welfare of poor and needy people and became a social activist.");
            break;

     case 2017:
            System.out.println("Vijay Shah\nHe ia MLA from Harsood and former Cabinet Minister in BJP government of Madhya Pradesh.");
            break;

     case 2018:
            System.out.println("Prakash Jain\nHe is a young Environmentalist and a active socialist.");
            break;

     case 2019:
            System.out.println("Sourabh Joshi\nHe started is political career by becoming the student leader from the National Students Union of India in 2002.");
            break;
     default:
            System.out.println("Invalid Selection");
     }
     
 }
}
