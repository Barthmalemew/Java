import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args){
        final int PORT = 8080;

        try(ServerSocket serverSocket = new ServerSocket(PORT))
        {
            System.out.println("Server is running...");

        } catch (IOException e) {

        }
    }
}
