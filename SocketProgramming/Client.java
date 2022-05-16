package SocketProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket("localhost", 6666);
            DataOutputStream dataOutputStream= new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("Hello Server");
            dataOutputStream.flush();
            dataOutputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
