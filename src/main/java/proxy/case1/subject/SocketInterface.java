package proxy.case1.subject;

public interface SocketInterface {
    String readLine();
    void writeLine(String str);
    void dispose();
}
