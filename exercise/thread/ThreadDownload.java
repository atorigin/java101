package exercise.thread;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class ThreadDownload  extends Thread {
    
    private String url;
    private String name;

    public ThreadDownload(String url , String name) {
        this.url = url;
        this.name = name;
    }

    // override run 實做多線程
    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        try {
            webDownloader.download(url, name);
            System.out.println("我下載好了 " + name + " 圖片");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadDownload t1 = new ThreadDownload("https://i3.read01.com/4F5xCRHg3wf7B9X8iquaHtA/0.jpg", "t1.jpg");
        ThreadDownload t2 = new ThreadDownload("https://i3.read01.com/dnKcwsuDlZJr4mDngXzmVn8/0.jpg", "t2.jpg");
        ThreadDownload t3 = new ThreadDownload("https://i3.read01.com/Se5vFXrNnTDIZUuBkoRGu0w/0.jpg", "t3.jpg");

        // 繼承 Thread 類別，要實現 run method，並且要調用時必須呼叫 start() method
        // 參考 https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Thread.html
        t1.start();
        t2.start();
        t3.start();
    }
}

/**
 ad
 */
class WebDownloader {
    // 傳入下載檔案的 url 及存檔檔名
    public void download(String url , String name) throws Exception {
        try (InputStream in = new URL(url).openStream();
                BufferedInputStream bis = new BufferedInputStream(in);
                FileOutputStream fos = new FileOutputStream(name)) {
 
            byte[] data = new byte[1024];
            int count;
            while ((count = bis.read(data, 0, 1024)) != -1) {
                fos.write(data, 0, count);
            }
        }
    }
}