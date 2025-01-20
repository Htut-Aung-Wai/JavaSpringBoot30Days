import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;

public class D5 {

    public static void main ( String [] args)
    {   String input="hello nothing is in file";
        Scanner in=new Scanner(System.in);
        File inputFile=new File("/home/htut-aung-wai/IdeaProjects/JavaSpringBoot30Days/fileWrite.txt");

        try{
            System.out.println("Enter word to input to file and enter 'e' to save and exit: ");
            FileWriter fwriter=new FileWriter("/home/htut-aung-wai/IdeaProjects/JavaSpringBoot30Days/fileWrite.txt");
                while(!input.equals("e"))
                {
                    input=in.nextLine();

                    fwriter.write(input+"\n");
                }
            fwriter.close();
        }
        catch (Exception e)
        {
            System.out.println("Something went Wrong ;;");
        }
        finally {
            System.out.println("Try Catch is executed");
        }

        try{
            String output="";
            File outputFile=new File("/home/htut-aung-wai/IdeaProjects/JavaSpringBoot30Days/fileWrite.txt");
            Scanner inread=new Scanner(outputFile);
                while (inread.hasNextLine())
                {
                    output=output+"\n"+inread.nextLine();
                }

            System.out.println(output);
            inread.close();

        }
        catch (FileNotFoundException e)
        {

            System.out.println("FIle read Error");
        }


    }
}
