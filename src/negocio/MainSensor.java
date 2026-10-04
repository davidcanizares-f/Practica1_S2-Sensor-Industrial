package negocio;

public class MainSensor {
    public static void main() {
        Sensor sensorTemperatura = new Sensor();
        sensorTemperatura.nombre = "Sensor de Temperatura";
        sensorTemperatura.lectura = 38;
        sensorTemperatura.tipo = "Temperatura";
        sensorTemperatura.unidad = "°C";

        Sensor sensorPresion = new Sensor();
        sensorPresion.nombre = "Sensor de Presion";
        sensorPresion.lectura = 101.3;
        sensorPresion.tipo = "Presion";
        sensorPresion.unidad = "kPa";

        Sensor sensorHumedad = new Sensor();
        sensorHumedad.nombre = "Sensor de Humedad";
        sensorHumedad.lectura = 60.0;
        sensorHumedad.tipo = "Humedad";
        sensorHumedad.unidad = "%";

        System.out.println("=== Información inicial ===");
        sensorTemperatura.mostrarInformacion();
        sensorPresion.mostrarInformacion();
        sensorHumedad.mostrarInformacion();

        System.out.println("=== Actualizar lectura del sensor de temperatura ===");
        sensorTemperatura.actualizarLectura(35.3);
        sensorTemperatura.mostrarLectura();

        System.out.println("\n--- Las otras lecturas no cambian ---");
        sensorPresion.mostrarLectura();
        sensorHumedad.mostrarLectura();

        System.out.println("\n=== Reiniciar lectura del sensor de humedad ===");
        sensorHumedad.reiniciarLectura();
        sensorHumedad.mostrarLectura();
        sensorTemperatura.mostrarLectura();
        sensorPresion.mostrarLectura();
    }
}

