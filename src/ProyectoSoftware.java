public class ProyectoSoftware {
    private String nombre="overwatch3";
    private String tipoProyecto="videojuego";
    private int mesesDesarrollo=18;
    private boolean estaDesplegado=false;
    private double presupuesto=1300000.01;
    private int numeroDeDesarrolladores=100;

    public ProyectoSoftware(String nombre, String tipoProyecto,
                            int mesesDesarrollo, boolean estaDesplegado,
                            double presupuesto,int numeroDeDesarrolladores){
        this.nombre=nombre;
        this.tipoProyecto=tipoProyecto;
        this.mesesDesarrollo=mesesDesarrollo;
        this.estaDesplegado=estaDesplegado;
        this.presupuesto=presupuesto;
        this.numeroDeDesarrolladores=numeroDeDesarrolladores;
    }
    public ProyectoSoftware(String nombre, String tipoProyecto,
                            int mesesDesarrollo,
                            double presupuesto){
        this.nombre=nombre;
        this.tipoProyecto=tipoProyecto;
        this.mesesDesarrollo=mesesDesarrollo;
        this.estaDesplegado=false;
        this.presupuesto=presupuesto;
        this.numeroDeDesarrolladores=1;
    }
    public boolean esDeTipo(String tipo){
        return tipoProyecto.equalsIgnoreCase(tipo);
    }
    public String categoria(){
        if (numeroDeDesarrolladores<=2){
            return "Indie";
        } else if (numeroDeDesarrolladores<=8){
            return "Estandar";
        } else {
            return "Corporativo";
        }
    }
    public double costeTotal(double costeLicencias){
        if (estaDesplegado){
            presupuesto+=presupuesto*15/100;
            presupuesto+=costeLicencias;
        } else {
            presupuesto+=costeLicencias;
        }
        return presupuesto;
    }

    public String getTipoProyecto() {
        return tipoProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esProyectoEstrella(){
        return (tipoProyecto.equalsIgnoreCase("IA")||presupuesto>50000);
    }
    public String toString() {
        String despliegue;
        if (estaDesplegado) {
            despliegue = "\nEsta desplegado";
        } else{
            despliegue = "\nNo desplegado";
        }
        return "El proyecto "+nombre+" de tipo "+tipoProyecto+" ,lleva "+mesesDesarrollo+
                " meses de desarrollo. El presupuesto es de "+presupuesto+" € y trabajan "+
                numeroDeDesarrolladores+"  desarrolladores \nCategoria: "+categoria()+despliegue;
    }
}
