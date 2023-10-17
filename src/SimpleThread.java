import java.sql.SQLOutput;
import java.util.ArrayList;

public class SimpleThread implements Runnable
{

    public ArrayList<Integer> classveri;

    private final Object LOCK = new Object();


    public SimpleThread()
    {

        classveri= new ArrayList<>();
    }

    @Override
    public void run() {


        this.find();


    }

    public void find()
    {

            for(Integer i : this.classveri)
            {

                if(i%2==0)
                {
                   /*Main.cift.add(i);
                   Main.ciftClass.add(Thread.currentThread().getName());


                    */
                    addEven(i);

                }
                else
                {
                    /*
                    Main.tek.add(i);
                    Main.tekClass.add(Thread.currentThread().getName());


                     */
                    addOdd(i);
                }


        }


    }

    public synchronized static void addEven(Integer i)
    {
        Main.cift.add(i);
        Main.ciftClass.add(Thread.currentThread().getName());
    }

    public synchronized static void addOdd(Integer i)
    {
        Main.tek.add(i);
        Main.tekClass.add(Thread.currentThread().getName());
    }






}
