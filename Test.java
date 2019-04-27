import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test{
            // 传域名，    返回主机名  和  主机别名
        // localhost
        //www.ibm.com
        //www.126.com
        //202.108.9.77
        //211.100.26.121
    public static void printName(String i) throws UnknownHostException{
        InetAddress ia = InetAddress.getByName(i);
        String a = ia.getCanonicalHostName();
        String b = ia.getHostName();
        // String[] list = {a, b};
        System.out.println(a);
        System.out.println(b);

    };
    public static void main(String[] args) throws UnknownHostException{
        // Test test = new Test();
        printName("www.ibm.com");
        // System.out.println(names[0] + names[1]);
    }
        
    // public static void main(String[] args) throws UnknownHostException{        
    //     args = new String[]{"www.baidu.com", "5"};

    //     java.security.Security.setProperty("networkaddress.cache.ttl", args[1]);
    //     //获取系统时间, 拿到系统当前的毫秒数
    //     long time = System.currentTimeMillis();
    //     InetAddress ia[] = InetAddress.getAllByName(args[0]);
    //     time = System.currentTimeMillis() - time;
    //     System.out.println("第一次访问域名耗时：----~~~~" + time + "毫秒");
    //     //第二次访问实践获取
    //     time = System.currentTimeMillis();
    //     ia = InetAddress.getAllByName(args[0]);
    //     time = System.currentTimeMillis() - time;
    //     System.out.println("第2次访问域名耗时：----~~~~" + time + "毫秒");

    //     for(InetAddress i : ia)
    //         System.out.println(i);
    // }
}