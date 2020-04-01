package emailapp;

import java.util.Scanner;
public class Email {
	private String firstname, lastname, password, department;
	private int mailbox_capacity=20;
	private int defaultpasswordlength=10;
	private String email, new_email;
	private String alternate_email;
	private String companySuffix = "iter.com";
	
	
	// constructor to receive first name and last name
	
	public Email(String firstname, String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
	    this.department = setdepartment();
	    this.password = RandomPassword(8);
	    
	    //Combine element to Generate email.
	    
	    email=firstname.toLowerCase() +""+lastname.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix;
	    
		
	}
	
	
	// ask for the Department
	
	private String setdepartment()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" NEW STUDENT "+firstname+""+lastname+ " ENTER DEPARTMENT CODE");
		System.out.println("1.ComputerScience");
		System.out.println("2.Mechanical");
		System.out.println("3.Electronics");
		System.out.println("4.Civil");
		int choice = sc.nextInt();
		
		if(choice==1) { return "ComputerScience"; }
		else if (choice==2) {return "Mechanical";}
		else if (choice==3) {return "Electronics";}
		else if (choice==4){return "Civil";}
		else {return "Incorrect choice";}
	}
	// Generate Password
	
	private String RandomPassword(int length)
	{
		String passwordset ="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*1234567890abcdefghijklmnopqrstuvwxyz";
		char[] password = new char[length];
		for(int i=0; i<length;i++)
		{
			int rand =(int) (Math.random() * passwordset.length());
			password[i] = passwordset.charAt(rand);
		}
		return  new String(password);
	}
	// set the mailbox capacity
	public void setMailBoxCapacity()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Password?");
		String pass = sc.nextLine();
		if (pass.equals(password))
		{
		System.out.println("Enter MailBox Capacity that you want: ");
		mailbox_capacity= sc.nextInt();
		System.out.println("Your Capacity Has Been Changed");
		}
		else
		{
			System.out.println("wrong password entered");
		}
	}
	
	//set the alternate email
	
	public void setAlternateEmail()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Password?");
	String pass = sc.nextLine();
	if (pass.equals(password))
	{
	System.out.println("Enter Your Alternate Email id:");
	
	new_email = sc.nextLine();
	System.out.println("Alternate Email Registrated");
	}
	else
	{
		System.out.println("wrong password entered");
	}
	}
	
	// set the password
	
	public void setChangePassword()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Old Password");
		String new_password =sc.nextLine();
		if(new_password.equals(password))
		{
		System.out.println("Enter your New Password");
		password = sc.nextLine();
		System.out.println("Password Changed");
		}
		else
		{
			System.out.println("wrong password entered");
		}
	}
	public int getMailBoxCapacity()
	{
		return mailbox_capacity;
	}
	public String getAlnernateEmail()
	{
		return alternate_email;
	}
	public String getPassword()
	{
		return password;
	}
	
	public String ShowInfo()
	{
		return "NAME:"+" "+firstname+" "+lastname+
				"\nYour Email : "+""+email+
				"\nMailBoxCapacity : "+""+mailbox_capacity+"GB"+
				"\nYour Passsword : "+password+
				"\nDepartment : "+department+
				"\nYour Alternate Email id: "+new_email;
	}

}
