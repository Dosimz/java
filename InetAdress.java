import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

import sun.net.InetAddressCachePolicy;

public class InetAdress {
    public static void main(String[] args) {
        try {
            InetAddress localAddress = InetAddress.getLocalHost();
            InetAddress name = InetAddress.getByName("yuyi-pc"); 
            InetAddress local = InetAddress.getByName("localhost"); 
            System.out.println(localAddress);
            System.out.println(name);
            System.out.println(local);

            InetAddress ias[] = InetAddress.getAllByName("www.baidu.com");
            for(InetAddress ia:ias){
                System.out.println(ia);
            }

        
        } catch (UnknownHostException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}