package com.pht.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoApplication {
    public static void main(String[] args) throws IOException, InterruptedException {

        final int listenPort = 6565;

        // 启动服务端
        EchoServer server = new EchoServer(listenPort);
        server.startService();

        // 启动客户端
        EchoClient client = new EchoClient(listenPort);
        client.startService();

        // 在控制台输入，服务端直接原文返回输入信息
        // 控制台结果示例：
        /**
         2020-03-31 16:58:44.049 - Welcome to My Echo Server.(from SERVER)

         Enter: hello!
         2020-03-31 16:58:55.452 - hello!(from SERVER)

         Enter: this is koal.
         2020-03-31 16:59:06.565 - this is koal.(from SERVER)

         Enter: what can i do for you?
         2020-03-31 16:59:12.828 - what can i do for you?(from SERVER)

         Enter: bye!
         2020-03-31 16:59:16.502 - Bye bye!(from SERVER)
         */
    }

}
class EchoServer {
    private  int port ;
    private final ServerSocket server;
    public EchoServer(int port) throws IOException {
        server = new ServerSocket(port);
    }
    public void startService() throws IOException {
        System.out.println("server");

        new Thread(()->{
            try {
                Socket accept = server.accept();
                InputStream  in = accept.getInputStream();
                OutputStream out  =accept.getOutputStream();
                byte[] buff = new byte[1024];
                int n ;
                String firline="Welcome to My Echo Server.";
                out.write(firline.getBytes());
                Scanner sc =new Scanner(System.in);
                boolean endflag =false;
                do {
                    System.out.print("Enter:");
                    String line=sc.nextLine();
                    if(line.equals("bye")){
                        endflag=true;
                    }
                    System.out.println(line);
                    out.write(line.getBytes());
                }while(!endflag);
            } catch (IOException e) {
                e.printStackTrace();
            }
        },"server").start();
    }
// TODO
}
class EchoClient {
    private final  Socket client;

    private  int port ;

    public EchoClient(int port) throws IOException {
        client =new Socket("localhost",port);
    }

    public void startService(){
        System.out.println("client");

            new Thread(()->{
                try{
                    Thread.sleep(1000);
                    //创建输入流对象
                    InputStream in = client.getInputStream();
                    //创建缓冲区
                    byte[] buffer = new byte[1024];
                    //设置流的长度
                    int n;
                        while((n=in.read(buffer))>0){
//                        System.out.println("client打印"+new String(buffer,0,n));

                    }


                }catch(IOException e){

                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            },"client").start();
    }
    // TODO
}

