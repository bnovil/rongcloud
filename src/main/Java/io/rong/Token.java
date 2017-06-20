package io.rong;

import io.rong.util.HostType;
import io.rong.util.HttpUtil;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author:lzq
 * @Discription
 * @Date: Created on 2017/6/20.
 * @Modified By:
 */
public class Token {
    public static void main(String[] args) throws Exception {
//        URL url = new URL("47.89.37.227:9091/obd/signIn?cid=123&password=12345&email=jack123@qq.com");
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        conn.setRequestMethod("GET");
//        conn.setRequestProperty("Cookie","Token=b501245140f94748927b7be61be9c2af;cid=123");
//        String s = HttpUtil.returnResult(conn);
//        System.out.println(s);

        Th1 t = new Th1();
        Thread thread = new Thread(t);
        thread.start();

    }


}

class Th1 implements Runnable {
    static {
        System.out.println("static");
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " test");
    }
}
