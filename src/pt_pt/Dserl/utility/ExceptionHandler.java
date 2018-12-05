package pt_pt.Dserl.utility;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionHandler {


    public static void ThrowEX(Exception ex){
        System.out.println("Ocorreu um erro na aplicação. Chame um administrador." + "\n" + " -- Detalhes do erro --" + "\n");
        StringWriter sw = new StringWriter();
        ex.printStackTrace(new PrintWriter(sw));
        String exceptionAsString = sw.toString();
        System.out.println(exceptionAsString);
    }


}
