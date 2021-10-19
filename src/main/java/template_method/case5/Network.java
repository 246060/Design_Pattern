package template_method.case5;

/**
 * Base class of social network.
 */
abstract public class Network {

    String userName;
    String password;

    public Network() { }

    public Network(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     * Publish the data to whatever network.
     */
    public final boolean post(String message) {

        // Authenticate before posting. Every network uses a different authentication method.
        if (logIn(this.userName, this.password)) {
            // Send the post data.
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
