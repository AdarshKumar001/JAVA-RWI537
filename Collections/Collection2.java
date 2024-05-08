import java.util.ArrayList;

public class Collection2 {
    public static void main(String[] args) {
        ArrayList A=new ArrayList<>();
        A.add(10);
        A.add("Adarsh");
        A.add('B');
        A.add(100);
        System.out.println(A);
        System.out.println(A.add("Rohit"));
        System.out.println(A);

        ArrayList B=new ArrayList<>();
        B.add(120);
        B.add("Ajeet");
        B.add('A');
        B.add(500);
        System.out.println(B);

        System.out.println(B.contains(120));  //contains

        B.addAll(A);
        System.out.println(B);
        A.removeAll(B);         //removeAll
        System.out.println(A);
        A.clear();
        System.out.println(A);


        ArrayList C=new ArrayList<>();
        C.add("aaa");
        C.add("bbb");
        C.add("ccc");
        System.out.println(C);
        System.out.println(C.size());
        System.out.println(C.isEmpty());
    

        ArrayList D=new ArrayList<>();
        D.add("ddd");
        D.add("aaa");
        D.add("Adarsh");
        System.out.println(D);
        C.removeAll(D);
        System.out.println(C);

    }
    
}
