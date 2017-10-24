public class Test {

    public static final Object obj = new Object();

    public static void main(String[] args) {

//        new Thread( new Produce()).start();
//        new Thread( new Consumer()).start();
        Object o=1.3;
//        System.out.println(1.3 instanceof double );
//        System.out.println(1 instanceof double );
//        System.out.println(o instanceof Float );
        float  f=0.1F*3;
        double b=0.311111111111111111111111111111111111111111111111111111111111;
        double d=0.3111111111111111111111111111111111111;
        float c=0.3f;
        int m=-2;
        long n=3+Integer.MAX_VALUE;
        System.out.println(f);
        System.out.println(f == b );
        System.out.println(f == c );
        System.out.println(0.3 == 0.3 );
        System.out.println(m == n );


    }
}