import java.io.FileReader;
public class FileDemo
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader("log.txt");
        int i;
        while((i = fr.read()) !=-1)
        System.out.print((char) i);
        fr.close();
    }
}
