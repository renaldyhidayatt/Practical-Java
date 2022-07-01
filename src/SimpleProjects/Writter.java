package SimpleProjects;

import java.io.PrintWriter;

public class Writter {
    public static void kentang(){
        PrintWriter pw = new PrintWriter(System.out, true);
        String st = "project 2";
        pw.println("This is " + st);
    }
}
