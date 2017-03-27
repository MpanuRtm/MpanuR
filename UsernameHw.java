import java.util.Scanner;
public class UserName {

	public static void main(String[] args) {
		String Username = "Ralph";
		String Pw = "rtm2612";
	Scanner stdin = new Scanner(System.in);
	System.out.println("Enter your username");
	Username = stdin.next();
	System.out.println("Enter your password");
	Pw = stdin.next();
	if (Username.equals(Username) && (Pw.equals(Pw))) {
		
		System.out.println(" Welcome " + Username);
	}
	else {
		System.out.println("Wrong username or password");
	}
	}

}

