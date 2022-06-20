package System_;

import com.sun.nio.sctp.PeerAddressChangeNotification;

/**
 * 构造方法为私有
 */
public class Test {
    public static void main(String[] args) {
        //数组复制，原数组，原数组起始位置，目的数组，目的数组起始位置，复制长度
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        System.arraycopy(array1,0,array2,0,array1.length);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        //使用currentTimeMillis()计时，单位：毫秒
        long start = System.currentTimeMillis();
        System.arraycopy(array1,0,array2,0,array1.length);
        for (int i = 0; i < array2.length; i++) {
        }
        long end = System.currentTimeMillis();
        System.out.println(start-end);

        //退出jvm:exit()
        System.exit(0);
        System.out.println("Done!");//不会执行
    }
}
