import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Test0 {
    private static List<String> newlistHost = new ArrayList<String>();
    private static List<String> newlistName = new ArrayList<String>();
    static String Universities[] = {
        //?? "北京大学-www.pku6.edu.cn",
        //?? "中国传媒大学-www.cuc6.edu.cn",
        // "石油大学-www.upc6.edu.cn",
        "测试-www.ibm.com",
        "东北大学-www.neu6.edu.cn",
        "辽宁大学-www6.lnu.edu.cn",
        "大连理工大学-www.dlut.edu.cn",
        "大连海事大学-www.dlmu.edu.cn",
        "东北财经大学-www.dufe.edu.cn",
        "吉林大学-www.jlu6.edu.cn",
        "哈尔滨工程大学-www.hrbeu.edu.cn",
        "西安交通大学-www.xjtu6.edu.cn",
        "西北农林科技大学-www.nwsuaf6.edu.cn",
        // "西北工业大学-www.nwpu6.edu.cn",
        // "第四军医大学-www.fmmu6.edu.cn",
        // "长安大学-www.chd6.edu.cn",
        "中国科学技术大学-www6.ustc.edu.cn",
        "合肥工业大学-www.hfut.edu.cn",
        "阜阳师范学院-www.fync.edu.cn",
        "电子科技大学-www.uestc6.edu.cn",
        "浙江大学-www.zju6.edu.cn",
        "浙江工业大学-www.zjut6.edu.cn",
        "浙江财经学院-www.zufe6.edu.cn",
        "集美大学 IPv6实验网-ipv6.jmu.edu.cn",
        "复旦大学 IPv6-www.fudan6.edu.cn",
        "复旦大学 Aurora-nr6.fudan.edu.cn",
        "复旦大学 Extmail-mailv6.alum.fudan.edu.cn",
        // "同济大学高性能计算机研究中心-hpcc.tongji6.edu.cn",
        // "同济大学-www.tongji6.edu.cn",
        // "上海理工大学-www6.usst.edu.cn",
        "上海电力学院-www.shiep.edu.cn",
        "华南理工大学-www.ipv6.scut.edu.cn",
        "上海交通大学-ipv6.sjtu.edu.cn",
        "上海外国语大学-www.shisu6.edu.cn",
        "暨南大学-www.jnu.edu.cn",
        "华南理工大学-www.scut.edu.cn",
        "南京师范大学-www.nnu6.edu.cn",
        "南京农业大学-www.njau6.edu.cn",
        "厦门大学-www.xmu6.edu.cn"
        };


    //获取域名
    public static void getYuming(String[] list){
        for(int i=0;i< list.length;i++){
            // System.out.println(list[i]); 已拿到
            String[] aa = list[i].split("-");
            newlistHost.add(aa[1]);
            newlistName.add(aa[0]);
        }
        // for(int i = 0;i < newlistHost.size();i++){
        //     System.out.println(newlistHost.get(i));
        //     InetAddress ia = InetAddress.getByName(newlistHost.get(i));
        //     String a = ia.getCanonicalHostName();
        //     String b = ia.getHostName();
        //     System.out.println(a);
        //     System.out.println(b);
        // }
        // System.out.println(newlistHost);
        // System.out.println(newlistName);
    }

    public static void printName(List<String> newlistHost) throws UnknownHostException{
        getYuming(Universities);
        for(int i = 0;i < newlistHost.size();i++){
            // System.out.println(newlistHost.get(i));  测试是否能拿到列表newlistHost          
            try {
                long time = System.currentTimeMillis();
                InetAddress ia = InetAddress.getByName(newlistHost.get(i));
                time = System.currentTimeMillis() - time;
                String a = ia.getCanonicalHostName();
                String b = ia.getHostAddress();
                System.out.println("[主机名]: "+a + "   [IP地址]: "+b + "   [消耗时间]: "+time);
                // System.out.println(b + time);
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("该域名无法响应");
                continue;
            } 
            // finally{
            //     System.out.println("余昊泽");
            // }
        }
        System.out.println("余昊泽");
    }
    
    public static void main(String[] args) throws Exception{
        printName(newlistHost);
    }
}