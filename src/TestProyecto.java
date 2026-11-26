public class TestProyecto {
    public static void main(String[] args) {
        System.out.println();
        ProyectoSoftware p1 = new ProyectoSoftware("GestorInventario",
                "Escritorio",18,true,1200,5);

        ProyectoSoftware p2 = new ProyectoSoftware("chatIA","IA",18,60000);

        if (p1.esProyectoEstrella()){
            System.out.println("El proyecto "+p1.getNombre()+" es proyecto estrella. Categoria "+p1.categoria());
        } else{
            System.out.println("El proyecto "+p1.getNombre()+" no es proyecto estrella. Categoria "+p1.categoria());
        }
        System.out.println();
        if (p2.esProyectoEstrella()){
            System.out.println("El proyecto "+p2.getNombre()+" es proyecto estrella. Categoria "+p2.categoria());
        } else {
            System.out.println("El proyecto "+p2.getNombre()+" no es proyecto estrella. Categoria "+p2.categoria());
        }


        System.out.println();
        System.out.println();


        String esTipo="IA";
        if (p1.esDeTipo(esTipo)){
            System.out.println("El proyecto "+p1.getNombre()+" es de tipo "+esTipo);
        } else {
            System.out.println("El proyecto "+p1.getNombre()+" no es de tipo "+esTipo);
        }
        System.out.println();
        if (p2.esDeTipo(esTipo)){
            System.out.println("El proyecto "+p2.getNombre()+" es de tipo "+esTipo);
        } else {
            System.out.println("El proyecto "+p2.getNombre()+" no es de tipo "+esTipo);
        }


        System.out.println();
        System.out.println();


        System.out.println(p1.toString());
        System.out.println();
        System.out.println(p2.toString());
    }
}
