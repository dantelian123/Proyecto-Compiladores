package proyecto.compiladores;
import java.io.FileInputStream;

public class ProyectoCompiladores {

    public static void main(String[] args) {
        interpretar("entrada.txt");
    }

    private static void interpretar(String path) {
        analizadores.Sintactico pars;
        try {
            pars=new analizadores.Sintactico(new analizadores.Lexico(new FileInputStream(path)));
            pars.parse();        
        } catch (Exception ex) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println("Causa: "+ex.getCause());
        } 
    } 
}
