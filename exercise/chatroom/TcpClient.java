package exercise.chatroom;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
    
    public static void main(String[] args) {
;
        // io 流
        
        try {
            // 1. 連線 server socket
            Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9999);
            // 2. 要輸出資料給 server
            OutputStream os = socket.getOutputStream();
            os.write("你好，學習 io 流".getBytes());

            // 關閉 socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
