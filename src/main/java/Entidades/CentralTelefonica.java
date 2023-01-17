package Entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class CentralTelefonica {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);

    }

    public void remCliente(Cliente cliente) {
        clientes.remove(cliente);

    }
}
