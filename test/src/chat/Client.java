package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Socket bb = new Socket("200.1.4.213", 2015);
			DataOutputStream bd = new DataOutputStream(bb.getOutputStream());
			bd.writeUTF("�ɽ��ϴ�~~~");
			DataInputStream bc = new DataInputStream(bb.getInputStream());
			System.out.println(bc.readUTF());

			bb.close();

		} catch (Exception e) {
		}
	}
}
