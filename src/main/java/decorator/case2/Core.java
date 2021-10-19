package decorator.case2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Core implements LCD{

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void write(String[] s) {
        System.out.print("INPUT:    ");
        try {
            s[0] = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void read(String[] s) {
        System.out.println("Output:   " + s[0]);
    }
}
