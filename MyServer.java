import java.io.*;
import java.net.*;

class MyServer {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(15);
            Socket s = ss.accept();

            // Reading data from client
            InputStream is = s.getInputStream();

            int i;
            char ch;

            while ((i = is.read()) != -1) {
                ch = (char) i;
                System.out.println(ch);
            }

            // Closing all objects
            is.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
