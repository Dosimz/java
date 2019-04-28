package pepsi;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class UserCntion {
	public static void main(String[] args){
        try {
        Socket s = new Socket("192.168.1.187", 8000);
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.OutputStream()));
        OutputStream ops = s.getOutputStream();
        OutputStreamWriter opsw = new OutputStreamWriter(ops);
        BufferedWriter bw = new BufferedWriter(opsw);
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("您要说什么? -->");
            String str = sc.next();
            bw.write("于浩哲" + str + "\r\n\r\n");
            bw.flush();
            System.out.println("我听到您说话了");
            if( str == "quit" ){
                break;
            }
        }        
        // 从服务端接收数据
        InputStream ips = s.getInputStream();
        InputStreamReader ipsr = new InputStreamReader(ips);
        BufferedReader br = new BufferedReader(ipsr);
        String strings = "";
        while ((strings = br.readLine()) != null) 
            System.out.println(strings);
        s.close();
    
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
