package packing;

public class Buffer_ {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println(i1 == i2);//false

        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf(100);
        System.out.println(i3 == i4);//true，在-127~128之间，直接从内存中返回已经创建号的Integer[]

        Integer i5 = 100;
        Integer i6 = 100;
        System.out.println(i5 == i6);//true


        Integer i7 = 200;
        Integer i8 = 200;
        System.out.println(i7 == i8);//false

    }
}
