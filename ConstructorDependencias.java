import java.util.List;

public class ConstructorDependencias {
    private ClienteRepository repository;

    public ConstructorDependencias.(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> obtenerClientes() {
        return repository.getAllClientes();
    }
}

public class ClienteRepository {
    public List<Cliente> getAllClientes() {
        // Lógica para obtener clientes desde una base de datos o fuente de datos
    }
}