package exercise.chatroom;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) {
        int serverPort = 9999;
        try {
            // 1. 建立監聽 server
            ServerSocket serverSocket = new ServerSocket(serverPort);
            // 2. 等待 client 端連線
            Socket socket = serverSocket.accept();
            // 3. 讀取 client 的資料
            InputStream is = socket.getInputStream();

            // 4. 建立一個存放 client 資料的 container
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            // 這邊是製作一個 1024 長度的資料容器，但若接收 client 端資料長度大過 1024 就會有亂碼(資料不完整)
            byte[] buffer = new byte[1024];
            int len;
            // 這邊透過 while 邊接邊寫到 baos
            while ((len=is.read(buffer)) != -1) {
                // 不斷寫到 baos 容器裡面
                baos.write(buffer, 0, len);
            }

            // 打印收到的 client 端資料，收到的是 byte，所以要轉 string
            System.out.println(baos.toString());

            // 關閉
            baos.close();
            is.close();
            socket.close();
            serverSocket.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
