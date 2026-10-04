package negocio;

public class Sensor {
    public String nombre;
    public double lectura;
    String tipo;
    String unidad;

    public void mostrarInformacion(){
        System.out.println("Sensor: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Lectura: " + lectura + " " + unidad);
        System.out.println("----------------------------------------");
    }
    public void actualizarLectura(double nuevaLectura){
        lectura = nuevaLectura;
    }

    void mostrarLectura(){
        System.out.println("> " + nombre + ":");
        System.out.println("\t Lectura: " + lectura + " " + unidad);
    };
    void reiniciarLectura(){
        lectura = 0;
    };
}
