// Interfaz que define el contrato del servicio
//nota: cambiar servicio por el nombre del archivo para que funcione
public interface Servicio {
    void hacerAlgo();
}

// Implementación concreta del servicio
public class ServicioImpl implements Servicio {
    @Override
    public void hacerAlgo() {
        // Implementación específica
    }
}

// Cliente que depende de un servicio (desacoplado herméticamente)
//nota: cliente debe ser creado como clase aparte
public class Cliente {
    private final Servicio servicio;

    // Constructor que acepta una implementación concreta de Servicio
    public Cliente(Servicio servicio) {
        this.servicio = servicio;
    }

    public void realizarOperacion() {
        servicio.hacerAlgo();
    }
}
