import Entidades.CentralTelefonica;
import Entidades.Cliente;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTest {
    CentralTelefonica centralTelefonica;
    Cliente cliente;


    @Before
    public void setUp() {
        centralTelefonica = new CentralTelefonica();
        cliente = new Cliente("Juan", "123456", "Calle 1", "123456", 10, "Activo", "8:00", 100);
    }

    @Test
    public void testAddCliente() {
        centralTelefonica.addCliente(cliente);
        assertTrue(centralTelefonica.getClientes().contains(cliente));
    }

    @Test
    public void testRmdCliente() {
        centralTelefonica.addCliente(cliente);
        centralTelefonica.remCliente(cliente);
        assertFalse(centralTelefonica.getClientes().contains(cliente));
    }

}
