public class Conversion {
    public static void main(String[] args) {
        // System.out.println("Direct conversion :");
        // byte a=5;
        // System.out.println("byte :"+a);
        // short b=a;
        // System.out.println("short "+b);
        // int c=b;
        // System.out.println("int "+c);
        // long d=c;
        // System.out.println("long "+d);
        // float e=d;
        // System.out.println("float "+e);
        // double f=e;
        // System.out.println("double "+f);
    

// we can not convert any other data type in char without type casting


        System.out.println("Type casting conversion :");
        double a=97.1;
        System.out.println("double "+a);
        float b=(float)a;
        System.out.println("float "+b);
        long c=(long)b;
        System.out.println("long "+c);
        int d=(int)c;
        System.out.println("int "+d);
        short e=(short)d;
        System.out.println("short "+e);
        char f=(char)e;
        System.out.println("char "+f);
        byte g=(byte)f;
        System.out.println("byte "+g);
    }
}
