import java.io.File;

public class Main {
    public static void main(String[] args) {
//        File f1 = new File("D:\\Ebook\\《不二》冯唐.mobi");
//        System.out.println(f1.getAbsolutePath());
//        System.out.println(f1.length());
        System.out.println(f(100));
    }

    public static int f(int n){
        if(n==1){
            return 1;
        }else {
            return f(n-1) + n;
        }
    }
}