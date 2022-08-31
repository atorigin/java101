package exercise.fileupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws Exception {
        // 客戶端流程
        // 1. 創建 socket
        // 2. 透過 socket 來建立 output stream
        // 3. 讀取文件到 input stream
        // 4. 透過 output stream 將讀進來的檔案 input stream 寫出去到 server (用 output stream 輸出到 server 端)
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9000); // 創建 Socket 連接到 server 端
        OutputStream os = socket.getOutputStream();
        FileInputStream fis = new FileInputStream(new File("image.png"));
        
        byte[] buffer = new byte[1024];
        int len;

        // 將 file intput stream 讀到 buffer 裡面判斷長度 , 若長度不為 -1 代表還有資料所以要對 output stream 繼續寫出(輸出)
        while ((len=fis.read(buffer)) != -1 ) {
            os.write(buffer,0,len);
        }

        // 傳送完 , 通知 server 已經 output 完了
        // API 說明 : Disables the output stream for this socket.
        socket.shutdownOutput();

        // 結束要關閉 stream
        os.close();
        fis.close();
        socket.close();
    }
}
