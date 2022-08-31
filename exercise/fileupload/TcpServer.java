package exercise.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws Exception {
        // 服務器端流程
        // 1. 創建 Socket 要監聽某個 port
        // 2. 等待客戶端連接
        // 3. 建立 input stream 用來接收客戶的輸出資料流
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        
        // 4. 建立檔案輸出流 , 要把收到的資料流寫成本地檔案用
        FileOutputStream fos = new FileOutputStream(new File("recieved.png"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len=is.read(buffer)) != -1) {
            fos.write(buffer,0,len);
        }

        // 關閉 straem
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
    
}
