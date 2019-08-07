package java_20190807;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketScanDemo {
	public static void main(String[] args) {
		Socket socket = null;
		for(int i=1; i<1024;i++) {
			//Socket 객체가 생성되었다는 이야기는 host, port로 통신할수 있다는 얘기 이고 이는 해당 host에 port번호를 사용하고 있다는 얘기임
			try {
				socket =new Socket("211.119.250.80",i);
				System.out.println(i+"번호를 사용하고 있습니다");
			} catch (UnknownHostException e) {
				System.out.println("호스트가 존재하지 않습니다");
				//e.printStackTrace();
			} catch (IOException e) {
				System.out.println(i+"번호를 사용하지 않고 있습니다");
				//e.printStackTrace();
			}
		}
	}
}
