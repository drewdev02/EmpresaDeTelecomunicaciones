package Entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Esta clase representa el controlador
 * principal de la empresa de telecomunicaciones
 */
@Getter
@Setter
public class CentralTelefonica {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    /**
     * Este metodo resive un cliente y lo adiciona
     * al listado de la central telefonica de los clientes
     *
     * @param cliente
     */
    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);

    }

    /**
     * Este metodo resive un cliente y lo elimina del
     * listado de clientes perteneciente a la central telefonica
     *
     * @param cliente
     */
    public void remCliente(Cliente cliente) {
        this.clientes.remove(cliente);

    }

    /**
     * Este metodo resive un cliente y cambia el estado
     * de su cuenta a baja temporal (suspendida)
     *
     * @param cliente
     */
    public void bajaTemporal(Cliente cliente) {

    }

    /**
     * Este metodo resive un cliente y segun los
     * servicios contratados por este calcula el pago mensual
     * que debe realizar devolviendo el monto del pago mensual
     * como un float
     *
     * @param cliente
     * @return
     */
    public float pagoMensual(Cliente cliente) {
        return 0;
    }
}
