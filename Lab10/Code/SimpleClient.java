package Code;
import java.net.*;
import java.io.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
public class SimpleClient {
	public static void main(String[] args) {
	try {
		String response;
		// socket creation
		Socket MyClient = new Socket("127.0.0.1",1254);
		
		// creating streams
		DataInputStream is = new DataInputStream(MyClient.getInputStream());
		DataOutputStream os = new DataOutputStream(MyClient.getOutputStream());
		
		// message
		System.out.println("Hello world");
		
		response = is.readUTF();
		System.out.println("Server response: "+response);
		
		MyClient.close();
		
	}catch (IOException e) {
		System.out.println("error "+ e.getMessage());
		}
	}
}
