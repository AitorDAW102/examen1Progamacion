import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto dividido por ';' con la palabra clave tras un '#'");
        System.out.print("==> ");
        String txt= sc.nextLine();
        sc.close();
        procesarTexto(txt);
    }

    private static void procesarTexto(String txt) {
        StringTokenizer sacarClave= new StringTokenizer(txt,"#");
        String frase = sacarClave.nextToken();
        String clave= sacarClave.nextToken();

        StringTokenizer dividirFrase= new StringTokenizer(frase,";");
        StringBuilder procesada= new StringBuilder();

        while(dividirFrase.hasMoreTokens()){
            String palabra=dividirFrase.nextToken();
            if(palabra.equalsIgnoreCase(clave)){
                procesada.append("***");
            } else {
                if (palabra.length()%2==0){
                    procesada.append(palabra.toUpperCase());;
                } else {
                    procesada.append(palabra.toLowerCase());
                }
            }
            procesada.append(" ");
        }
        System.out.println(procesada);
    }
}
