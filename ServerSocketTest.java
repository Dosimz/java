import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest{
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8000);
            System.out.println("端口监听中。。。");

                Socket s = server.accept();
                System.out.println("accept");
                new ClientThread(s).start();//         
        //         BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //         System.out.println("1");
        //         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));    
        //         System.out.println("2");
        //         String sw = null;
        //     while (true){ 
        //         System.out.println("准备接收");
        //         sw = br.readLine();
        //         System.out.println("我说：" + sw);
        //         bw.write("来自服务器的回复 \r\n");
        //         bw.flush();
        //     }
        } catch (Exception e) {
            //TODO: handle exception
        }

    }
}

class ClientThread extends Thread {
    Socket s;

    public ClientThread(Socket _s){
        this.s = _s;
    }
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));    
            String sw = null;
            while (true){ 
                System.out.println("准备接收");
                sw = br.readLine();
                System.out.println("我说：" + sw);
                bw.write("来自服务器的回复 \r\n");
                bw.flush();
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        

    }
}

