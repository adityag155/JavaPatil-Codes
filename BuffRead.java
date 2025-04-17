
import java.io.*;

class BuffRead
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter data, & S to stop");
        int i = 0;
        char ch = ' ';
        while(ch != 'S')
        {
            i = br.read();
            ch = (char)i;
            if(ch != 'S')
                System.out.println(ch);
        }
    }
}
