package emailapp;
import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("prabhu", "rout");
		System.out.println(em1.ShowInfo());
		while(true)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.To Change Your Password");
		System.out.println("2.To Give Alternate Email Id");
		System.out.println("3.To Give The Capacity Of MailBox");
		System.out.println("4.To ShowInfo");
		System.out.println("5.To Exit");
		int ch = sc.nextInt();
		if(ch == 1)
		{
			em1.setChangePassword();
		}
		else if(ch ==2)
		{
			em1.setAlternateEmail();
		} 
		else if(ch==3) 
		{
			em1.setMailBoxCapacity();
		}
		else if(ch==4)
		{
			System.out.println(em1.ShowInfo());
			
		}
		else if(ch==5)
		{
			break;
		}
		
	}

}
}