import java.util.Random;
import java.util.Scanner;

public class Generator {
	
	String firstName;
	 String lastName;
	 
	 public Generator(String firstName, String lastName) {
		 setFirstName(firstName);
		 setLastName(lastName);
		 }
	 public String getFirstName() {
		 return firstName;
	 }
	 public void setFirstName(String firstName) {
		 this.firstName = firstName;
	 }
	 public String getLastName() {
		 return lastName;
	 }
	 public void setLastName(String lastName) {
		 this.lastName = lastName;
	 }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical \n2. Admin \n3. Human Resource \n4.Legal");
		Scanner input = new Scanner(System.in);
		int department = input.nextInt(); 
		Credentials dis = new Credentials();
		Generator call = new Generator("VK", "CS");
		call.setFirstName("VK");
		call.setLastName("CS");
		
if(department==1) {
	      dis.display(call.getFirstName(),call.getLastName(),"tech",1);
			       }
if(department==2) {
	dis.display(call.getFirstName(),call.getLastName(),"admin",2);
                  }
if(department==3) {
	dis.display(call.getFirstName(),call.getLastName(),"hr",3);
                  }
if(department==4) {
	dis.display(call.getFirstName(),call.getLastName(),"legal",4);
                  }
	}
	}