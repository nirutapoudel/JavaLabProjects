package SocketProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(6666);
            Socket socket=serverSocket.accept(); //establishes connection
            DataInputStream dataInputStream= new DataInputStream(socket.getInputStream());
            String msg= dataInputStream.readUTF();
            System.out.println("message from client is:" +msg);
            serverSocket.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}