import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args)
    {
        final int PORT = 8080;
        final String SERVER_ADDRESS = "localhost";

        try(Socket socket = new Socket(SERVER_ADDRESS, PORT)) {

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //output to server here.

            //response from server here.

        }catch (Exception e)
        {

        }
    }
}
