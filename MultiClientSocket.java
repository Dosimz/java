import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MultiClientSocket{
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",8000); //创建链接

            Scanner sc = new Scanner(System.in);

                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));    //输入流
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream())); //输出流
            while (true) {
                System.out.println("您要说点什么呢？");
                String strbw = sc.next();
                bw.write(strbw+"\r\n");
                bw.flush();
                System.out.println("已发出。。");
                String strbr = br.readLine();
                System.out.println(strbr);
                // bw.close();
            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}