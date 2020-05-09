import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class MultithreadedEchoServer{
	ExecutorService service;

	public MultithreadedEchoServer(){
		this.service = Executors.newCachedThreadPool();
		int portNumber = 5000;
		try{
			ServerSocket serverSocket = new ServerSocket(portNumber);
			while(true){
				Socket clientSocket = serverSocket.accept();
				ConnectionHandler handler = new ConnectionHandler(clientSocket);
				this.service.execute(handler);
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args){
		MultithreadedEchoServer myself = new MultithreadedEchoServer();
	}

	public class ConnectionHandler implements Runnable{
		private Socket clientSocket;

		public ConnectionHandler(Socket clientSocket){
			this.clientSocket = clientSocket;
		}

		public void run(){
			try{
				DataOutputStream out = new DataOutputStream(this.clientSocket.getOutputStream());
				DataInputStream in = new DataInputStream(this.clientSocket.getInputStream());

				String line = "";
				while( (line = in.readUTF()) != null){
					out.writeUTF(line);
				}
				in.close();
				out.close();
				clientSocket.close();
			} catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
