import Entidades.CentralTelefonica;
import Entidades.Cliente;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainTest {
    @Test
    public void testAddCliente() {
        CentralTelefonica centralTelefonica = new CentralTelefonica();
        Cliente cliente = new Cliente();
        centralTelefonica.addCliente(cliente);
        assertTrue(centralTelefonica.getClientes().contains(cliente));
    }

}
