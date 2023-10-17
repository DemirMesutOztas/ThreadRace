import java.util.ArrayList;

public class Main
{
        public  static ArrayList<Integer> tek =  new ArrayList<>();
        public static ArrayList<Integer> cift =  new ArrayList<>();

        public static ArrayList<String> tekClass = new ArrayList<>();
        public static ArrayList<String> ciftClass = new ArrayList<>();



    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> sayi = new ArrayList<>();
        ArrayList<Integer> sayi1 = new ArrayList<>();
        ArrayList<Integer> sayi2 = new ArrayList<>();
        ArrayList<Integer> sayi3 = new ArrayList<>();
        ArrayList<Integer> sayi4 = new ArrayList<>();


        for(int i=0; i<100; i++)
        {
            sayi.add(i+1);
        }

        for(int i=0;i<100;i++)
        {
            if(i>=0 && i<25)
            {
                sayi1.add(i+1);
            }
            else if(i>=25 && i<50)
            {
                sayi2.add(i+1);
            } else if (i>=50 && i<75)
            {
                sayi3.add(i+1);
            }
            else
            {
                sayi4.add(i+1);
            }
        }

        SimpleThread s1 = new SimpleThread();
        SimpleThread s2 = new SimpleThread();
        SimpleThread s3 = new SimpleThread();
        SimpleThread s4 = new SimpleThread();
        s1.classveri=sayi1;
        s2.classveri=sayi2;
        s3.classveri=sayi3;
        s4.classveri=sayi4;
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);
        Thread t4 = new Thread(s4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("ÇİFT");
        for(int i=0;i<Main.cift.size();i++)
        {
            System.out.println(Main.ciftClass.get(i)+":"+Main.cift.get(i));
        }
        System.out.println("TEK");
        for(int i=0;i<Main.tek.size();i++)
        {
            System.out.println(Main.tekClass.get(i)+":"+Main.tek.get(i));
        }













    }
}