package Code;
import java.io.*;
import java.net.*;
import java.util.Scanner;

	public class SimpleServer {
	public static void main(String[] args) {
		try {
			Scanner k = new Scanner(System.in);
			
			String message;
			ServerSocket MyService = new ServerSocket(1254);
			System.out.println("Server runs");
			
			while (true) {
				Socket client = MyService.accept();
				System.out.println("Connection is from: "+client.getInetAddress());
				
				DataInputStream input = new DataInputStream(client.getInputStream());
				PrintStream output = new PrintStream(client.getOutputStream());
				
				// reading
				message = k.nextLine();
				message = input.readUTF();
				System.out.println("response message "+message);
				
				// close everything
				output.close();
				input.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
