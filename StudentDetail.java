import java.util.Scanner;
class Student
{
     static public void main(String...ar)
     {
     Scanner sc = new Scanner(System.in);
     char grade=0;
     System.out.println("Enter Rollno:");
     int roll = sc.nextInt();
     System.out.println("Enter Student Name:");
     String studentName = sc.next();
     System.out.println("Enter College Name:");
     String collName = sc.next();
     System.out.println("Enter Course Name:");
     String courseName = sc.next();
     System.out.println("Enter Year:");
     int year = sc.nextInt();
     System.out.println("Enter Semester:");
     int sem = sc.nextInt();
     System.out.println("Enter Subject Name 1:");
     String subName1 = sc.next();
     System.out.println("Enter Subject Name 2:");
     String subName2 = sc.next();
     System.out.println("Enter Subject Name 3:");
     String subName3 = sc.next();
     System.out.println("Enter Subject Name 4:");
     String subName4 = sc.next();
     System.out.println("Enter Subject Name 5:");
     String subName5 = sc.next();
     System.out.println("Enter Max Marks:");
     int Max = sc.nextInt();
     System.out.println("Enter Min Marks:");
     int Min = sc.nextInt();
     System.out.println("Enter obtained Marks:");
     int obtained = sc.nextInt();
     float per = (obtained * 100)/Max;
     System.out.println("Percentage=" + per); 
     
     if(per>=90) {
         
        System.out.println("grade A");
	grade='A';
     }
     else if(per>=75 && per<=89) {
         
        System.out.println("grade B");
	grade='B';
     }
     else if(per>=60 && per<=74) {
         
        System.out.println("grade C");
	grade='C';
     }
     else if(per>=33 && per<=59) {
        
        System.out.println("grade D");
	grade='D';
     }
     else {
        System.out.println("You are not eligible"); 
     }
     
    if(grade=='A') {
      System.out.println("Eligible for Companies:\n1.Microsoft Corportation\n2.Infosys\n3. Larsen & Turbo Infotech Ltd");
      System.out.println("\nEnter your choice to know details of the company");
      int choice=sc.nextInt();
      switch(choice)
      {
	 case 1: System.out.println("Company Name: Microsoft Corporation");
		 System.out.println("Address: Smartworks, sixth floor, Veerbhadra Nagar Rd, Maharashtra");
		 System.out.println("City: Mumbai");
		 System.out.println("Contact: 9856247631");
		 System.out.println("Total branches: 177");
		 break;

	 case 2: System.out.println("Company Name: Infosys");
		 System.out.println("Address: 138, Old Mhabalipuram Rd, Sholinganallar, Tamilnadu");
		 System.out.println("City: Chennai");
		 System.out.println("Contact: 7564213895");
		 System.out.println("Total branches: 191");
		 break;

	 case 3: System.out.println("Company Name: Larsen & Turbo Infotech Ltd");
		 System.out.println("Address: B Block Wing no-1 First floor, Ecc Division Cyber Gatew, Telangana");
		 System.out.println("City: Hyderabad");
		 System.out.println("Contact: 9865724851");
		 System.out.println("Total branches: 4");
		 break;

	 default: System.out.println("Your choice is invalid.");

      }
    }
     
    if(grade=='B') {
      System.out.println("Eligible for Companies:\n1.Tech Mahindra Ltd\n2.Wipro\n3.Mphasis Ltd");
      System.out.println("\nEnter your choice to know details of the company");
      int choice=sc.nextInt();
      switch(choice)
      {
	 case 1: System.out.println("Company Name: Tech Mahindra");
		 System.out.println("Address: Karnataka ");
		 System.out.println("City: Banglore");
		 System.out.println("Contact: 7568421569");
		 System.out.println("Total branches: 20");
		 break;

	 case 2: System.out.println("Company Name: Wipro");
		 System.out.println("Address: Madhya Pradesh");
		 System.out.println("City: Indore");
		 System.out.println("Contact: 8756241369");
		 System.out.println("Total branches: 120");
		 break;

	 case 3: System.out.println("Company Name: Mphasis Ltd");
		 System.out.println("Address: Maharashtra");
		 System.out.println("City: Mumbai");
		 System.out.println("Contact: 9875632412");
		 System.out.println("Total branches: 100");
		 break;

	 default: System.out.println("Your choice is invalid.");

      }
    }
     
    if(grade=='C') {
      System.out.println("Eligible for Companies:\n1. Birlasoft\n2. TCS\n3. Appentus");
      System.out.println("\nEnter your choice to know details of the company");
      int choice=sc.nextInt();
      switch(choice)
      {
	 case 1: System.out.println("Company Name: Birlasoft");
		 System.out.println("Address: Maharashtra");
		 System.out.println("City: Pune");
		 System.out.println("Contact: 76654213892");
		 System.out.println("Total branches: 120");
		 break;

	 case 2: System.out.println("Company Name: TCS");
		 System.out.println("Address: Tamilnadu");
		 System.out.println("City: Chennai");
		 System.out.println("Contact: 9875624130");
		 System.out.println("Total branches: 200");
		 break;

	 case 3: System.out.println("Company Name: Appentus");
		 System.out.println("Address: Kerala");
		 System.out.println("City: Thiruvananthapuram");
		 System.out.println("Contact: 9875642134");
		 System.out.println("Total branches: 80");
		 break;

	 default: System.out.println("Your choice is invalid.");

      }
    }
     
    if(grade=='D') {
      System.out.println("Eligible for Companies:\n1. Sasken\n2. Hexaware Technologies\n3. Techjini");
      System.out.println("\nEnter your choice to know details of the company");
      int choice=sc.nextInt();
      switch(choice)
      {
	 case 1: System.out.println("Company Name: Sasken");
		 System.out.println("Address: Maharashtra");
		 System.out.println("City: Pune");
		 System.out.println("Contact: 75488961235");
		 System.out.println("Total branches: 60");
		 break;

	 case 2: System.out.println("Company Name: Hexaware Technologies");
		 System.out.println("Address: Karnataka");
		 System.out.println("City: Banglore");
		 System.out.println("Contact: 9875642789");
		 System.out.println("Total branches: 200");
		 break;

	 case 3: System.out.println("Company Name: Techjini");
		 System.out.println("Address: Tamilnadu");
		 System.out.println("City: Chennai");
		 System.out.println("Contact: 9977584621");
		 System.out.println("Total branches: 120");
		 break;

	 default: System.out.println("Your choice is invalid.");

      }
    }
    
}
}

