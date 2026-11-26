public class Ej3 {
    public static void main(String[] args) {
        int columnas = 5;
        for (int i=0;i<=columnas;i++){
            for (int x=0;x<=i;x++){
                if(x==i){
                    System.out.print("*");
                }else {
                    System.out.print((x+1)*2);
                }
            }
            System.out.println();
        }
        for (int i=columnas-1;i>=0;i--){
            for (int x=0;x<=i;x++){
                if(x==i){
                    System.out.print("*");
                }else {
                    System.out.print((x+1)*2);
                }
            }
            System.out.println();
        }
    }
}
