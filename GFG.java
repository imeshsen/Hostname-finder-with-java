// Java program to demonstrate getting 
// the System name of the user

import java.net.InetAddress;
public class GFG {
	public static void main(String[] args)
	{
		try {

			// get system name
			String SystemName
				= InetAddress.getLocalHost().getHostName();

			// SystemName stores the name of the system
			System.out.println("System Name : "
							+ SystemName);
		}
		catch (Exception E) {
			System.err.println(E.getMessage());
		}
	}
}
