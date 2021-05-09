package proxy.case1;

public class Client {
    // https://www.journaldev.com/1572/proxy-design-pattern
    public static void main(String[] args) {

        String user = "Pankaj";
        String pwd = "wrong_pwd";

        CommandExecutor executor = new CommandExecutorProxy(user, pwd);

        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");

        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }
    }
}
