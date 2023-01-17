import Entidades.CentralTelefonica;
import Entidades.Cliente;
import Entidades.ClienteEstatal;
import Entidades.ClienteResidencial;
import org.junit.Before;
import org.junit.Test;

import static Entidades.EstadoCliente.ACTIVO;
import static Entidades.EstadoCliente.SUSPENDIDO;
import static org.junit.Assert.*;

public class MainTest {
    CentralTelefonica centralTelefonica;
    Cliente cliente;
    ClienteEstatal clienteEstatal;
    ClienteResidencial clienteResidencial;
    ClienteEstatal clienteEstatal1;
    ClienteResidencial clienteResidencial1;
    ClienteResidencial clienteResidencial2;

    /**
     * Creamos el setup para los demas test
     */
    @Before
    public void setUp() {
        centralTelefonica = new CentralTelefonica();
        cliente = new Cliente("Juan",
                "123456",
                "Calle 1",
                "123456",
                10,
                SUSPENDIDO,
                "8:00",
                100);
        centralTelefonica.addCliente(cliente);

        clienteEstatal = new ClienteEstatal("Juan",
                "123456",
                "Calle 1",
                "123456",
                10,
                ACTIVO,
                "8:00",
                100,
                true);
        centralTelefonica.addCliente(clienteEstatal);

        clienteEstatal1 = new ClienteEstatal("PEPE",
                "123456",
                "Calle 1",
                "123456",
                10,
                ACTIVO,
                "8:00",
                100,
                false);
        centralTelefonica.addCliente(clienteEstatal);

        clienteResidencial = new ClienteResidencial("Juan",
                "123456",
                "Calle 1",
                "123456",
                10,
                ACTIVO,
                "8:00",
                100,
                true,
                true);
        centralTelefonica.addCliente(clienteResidencial);

        clienteResidencial1 = new ClienteResidencial("Pedro",
                "123456",
                "Calle 1",
                "123456",
                10,
                ACTIVO,
                "8:00",
                100,
                false,
                false);
        centralTelefonica.addCliente(clienteResidencial1);

        clienteResidencial2 = new ClienteResidencial("Ana",
                "123456",
                "Calle 1",
                "123456",
                10,
                ACTIVO,
                "8:00",
                100,
                true,
                false);
        centralTelefonica.addCliente(clienteResidencial2);

    }

    /**
     * Test para comprobar si se agraga el cliente al listado de
     * la central telefonica
     */
    @Test
    public void testAddCliente() {
        assertTrue(centralTelefonica.getClientes().contains(cliente));
    }

    /**
     * Test para comprobar si el cliente se elimina con exito
     * del listado de la central telefonica
     */
    @Test
    public void testRmdCliente() {
        centralTelefonica.remCliente(cliente);
        assertFalse(centralTelefonica.getClientes().contains(cliente));
    }

    /**
     * Test para comprobar si se hace efectiva la baja
     * temporal de un cliente
     */
    @Test
    public void testBajaTemporal() {
        centralTelefonica.bajaTemporal(cliente);
        assertEquals(SUSPENDIDO, cliente.getEstado());
    }


    /**
     * Test de comprobacion para el metodo que
     * calcula el pago que debe ralizar cada cliente
     * segun los servivios contratados.
     */
    @Test
    public void testPagoMensualCliente() {
        centralTelefonica.pagoMensual(cliente);
        assertEquals(100, cliente.getPagoMensual());
        centralTelefonica.pagoMensual(clienteEstatal);
        assertEquals(101, clienteEstatal.getPagoMensual());
        centralTelefonica.pagoMensual(clienteEstatal1);
        assertEquals(100, clienteEstatal1.getPagoMensual());
        centralTelefonica.pagoMensual(clienteResidencial);
        assertEquals(102, clienteResidencial.getPagoMensual());
        centralTelefonica.pagoMensual(clienteResidencial1);
        assertEquals(100, clienteResidencial1.getPagoMensual());
        centralTelefonica.pagoMensual(clienteResidencial2);
        assertEquals(101, clienteResidencial2.getPagoMensual());
    }
}
