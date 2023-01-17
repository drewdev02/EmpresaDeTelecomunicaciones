import Entidades.CentralTelefonica;
import Entidades.Cliente;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTest {
    @Test
    public void testAddCliente() {
        CentralTelefonica centralTelefonica = new CentralTelefonica();
        Cliente cliente = new Cliente();
        centralTelefonica.addCliente(cliente);
        assertTrue(centralTelefonica.getClientes().contains(cliente));
    }

    @Test
    public void testRmdCliente() {
        CentralTelefonica centralTelefonica = new CentralTelefonica();
        Cliente cliente = new Cliente();
        centralTelefonica.addCliente(cliente);
        centralTelefonica.remCliente(cliente);
        assertFalse(centralTelefonica.getClientes().contains(cliente));
    }

}
