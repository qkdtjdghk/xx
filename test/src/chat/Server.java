package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	ServerSocket a;

	public static void main(String[] args) {
		Thread b = new chat();
		b.start();
	}

}

class chat extends Thread {
	public void run() {
		try {
			ServerSocket a = new ServerSocket(2015);
			Socket bb = a.accept();
			DataInputStream bc = new DataInputStream(bb.getInputStream());
			System.out.println(bc.readUTF());
			DataOutputStream bd = new DataOutputStream(bb.getOutputStream());
			bd.writeUTF("引切引切引切");
			a.close();

		} catch (Exception b) {

		}
	}
}
