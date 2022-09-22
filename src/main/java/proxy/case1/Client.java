package proxy.case1;

import proxy.case1.proxy.SocketProxy;
import proxy.case1.subject.SocketInterface;

import java.util.Scanner;

public class Client {
    // https://sourcemaking.com/design_patterns/proxy/java/1
    public static void main(String[] args) {

        final String host = "127.0.0.1";
        final int port = 8080;
        final boolean isServer = "first".equals(args[0]) ? true : false;

        // The client deals with the wrapper
        SocketInterface socket = new SocketProxy(host, port, isServer);

        String str;
        boolean skip = true;

        while (true) {

            if ("second".equals(args[0]) && skip) {
                skip = !skip;

            } else {
                str = socket.readLine();
                System.out.println("Receive - " + str);

                if (str.equals(null)) {
                    break;
                }
            }

            System.out.println("Send ---- ");
            str = new Scanner(System.in).nextLine();
            socket.writeLine(str);

            if ("quit".equals(str)) {
                break;
            }
        }
    }
}
