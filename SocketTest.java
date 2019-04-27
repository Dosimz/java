import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("192.168.1.188",8090);
            System.out.println("链接成功");
        } catch (UnknownHostException e) {
            //TODO: handle exception
            e.printStackTrace();
            System.out.println("未知主机");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
