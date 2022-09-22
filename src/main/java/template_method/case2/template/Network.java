package template_method.case2.template;


abstract public class Network {

    protected String userName;
    protected String password;

    public Network() { }

    public Network(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    // template method
    public final boolean post(String message) {

        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract protected boolean logIn(String userName, String password);
    abstract protected boolean sendData(byte[] data);
    abstract protected void logOut();
}
