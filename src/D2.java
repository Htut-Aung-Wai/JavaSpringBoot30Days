

public class D2 {
    public static String[] array ={"1","2","3","4","5"};

    public static void ForLoopMethod()
    {
        System.out.println("For looping");
        for (int i=0;i<array.length;i++)
        {

            System.out.println(array[i]);
        }

    }

    public static void WhileLoopMethod()
    {
        int j=0;
        System.out.println("While looping");
        while (j<array.length)
        {
            System.out.println(array[j]);
            j++;

        }
    }

    public static void ForEachMethod()
    {
        System.out.println("For each loop");
        for (String arrayList : array)
        {

            System.out.println(arrayList);
        }
    }

    public static void main(String [] args)
    {
        ForLoopMethod();
        WhileLoopMethod();
        ForEachMethod();


    }


}
