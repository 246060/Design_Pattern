package Interpreter.case2;

import java.util.List;

public class Client {

    public static void main(String[] args) {

        Expression query =
                new Select("name",
                        new From("people"));

        Context context = new Context();
        List<String> result = query.interpret(context);
        System.out.println(result);

        Expression query2 =
                new Select("*",
                        new From("people"));
        List<String> result2 = query2.interpret(context);
        System.out.println(result2);

        Expression query3 =
                new Select("name",
                        new From("people",
                                new Where(name -> name.toLowerCase()
                                                      .startsWith("d"))));
        List<String> result3 = query3.interpret(context);
        System.out.println(result3);


    }
}
