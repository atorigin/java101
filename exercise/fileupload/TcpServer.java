package exercise.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        
        // 接收檔案並輸出
        FileOutputStream fos = new FileOutputStream(new File("recieved.png"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len=is.read(buffer)) != -1) {
            fos.write(buffer,0,len);
        }

        fos.close();
        socket.close();
        serverSocket.close();
    }
    
}
