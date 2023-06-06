import java.util.Random;

class Credentials{
	
   static String Credentail(String firstName,String lastName,String Dept1) {
		 
			String Email = firstName+lastName+"@"+Dept1+".company.com";
	
	   return Email;
	 }
	 
     static String Credentail(String firstName,String lastName, int Dept) {
				
			Random objGenerator = new Random();       
	        
			int randomNumber = objGenerator.nextInt(100);
			
			String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String alphabet1 = "abcdeffghijklmnopqrstuvwxyz";
			String alphabet2 = "@#$%&?";
			StringBuilder sb = new StringBuilder();
		    Random random = new Random();
		    int length = 3;
		    for(int i = 0; i < length; i++) {
		        int index = random.nextInt(alphabet.length());
		        int index1 = random.nextInt(alphabet1.length());
		        char randomChar = alphabet.charAt(index);
		        char randomChar1 = alphabet1.charAt(index);
		        char randomChar2 = alphabet2.charAt(4);
		        sb.append(randomChar);
		        sb.append(randomChar1);
		        sb.append(randomChar2);
		    }
		    String randomString = sb.toString();


		String Password = randomNumber+randomString+Dept;
		return Password;
	 }
	  void display(String firstName,String lastName,String Dept,int Dept1) {
		  System.out.println("Dear "+firstName +" your generated credentials are as follows");
		  System.out.println("Email     --------->      "+Credentail(firstName,lastName,Dept));
			System.out.println("Password  --------->      "+Credentail(firstName,lastName,Dept1));
	  }
}