import Entidades.CentralTelefonica;
import Entidades.Cliente;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTest {
    CentralTelefonica centralTelefonica;
    Cliente cliente;

    /**
     * Creamos el setup para los demas test con una instancia
     * de CentralTelefonica y otra de Cliente
     */
    @Before
    public void setUp() {
        centralTelefonica = new CentralTelefonica();
        cliente = new Cliente("Juan", "123456", "Calle 1", "123456", 10,
                "Activo", "8:00", 100);
    }

    /**
     * Test para comprobar si se agraga el cliente al listado de
     * la central telefonica
     */
    @Test
    public void testAddCliente() {
        centralTelefonica.addCliente(cliente);
        assertTrue(centralTelefonica.getClientes().contains(cliente));
    }

    /**
     * Test para comprobar si el cliente se elimina con exito
     * del listado de la central telefonica
     */
    @Test
    public void testRmdCliente() {
        centralTelefonica.addCliente(cliente);
        centralTelefonica.remCliente(cliente);
        assertFalse(centralTelefonica.getClientes().contains(cliente));
    }

}
