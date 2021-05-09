package proxy.case2;

public interface SocketInterface {
    String readLine();
    void writeLine(String str);
    void dispose();
}
