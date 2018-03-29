import java.io.*;
public class console {
public static void main(String[] args) {
    Console cons;
    String txt;
    if ((cons = System.console()) != null &&
        (txt = cons.readLine("type")) != null) {
        System.out.println(txt);
    }}
}

