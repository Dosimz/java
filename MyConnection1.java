import java.net.*;

public class MyConnection1 extends Thread {
    private int minPort, maxPort;

    public MyConnection1(int minPort, int maxPort) {
        this.minPort = minPort;
        this.maxPort = maxPort;
    }

    public void run() {
        for (int i = minPort; i <= maxPort; i++) {
        try {
            Socket socket = new Socket("127.0.0.1", i);
            System.out.println(String.valueOf(i) + ":ok");
            socket.close();
        } catch (Exception e){
           
        }
    }
}

public static void main(String[] args) {

    args = new String[] { "1024", "9999", "1000" };

    int minPort = Integer.parseInt(args[0]);
    int maxPort = Integer.parseInt(args[1]);
    int threadCount = Integer.parseInt(args[2]);
    // 模拟线程
    int portIncrement = ((maxPort - minPort + 1) / threadCount)
                + (((maxPort - minPort + 1) % threadCount) == 0 ? 0 : 1);
    MyConnection1[] instances = new MyConnection1[threadCount];
    for (int i = 0; i < threadCount; i++) {
        instances[i] = new MyConnection1(minPort + portIncrement * i,
                        minPort + portIncrement - 1 + portIncrement * i);
        instances[i].start();
        System.out.println("线程 ： " + (i + 1) + "已启动");
        instances[i].run();
        }
    }
}