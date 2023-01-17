package Entidades;

public class ClienteEstatal extends Cliente {
    private boolean esLineaArrendada;

    public ClienteEstatal(String nombre, String numeroCarnet, String direccion, String telefono, int numeroLlamadas, String estado, String horaDespertar, double pagoMensual) {
        super(nombre, numeroCarnet, direccion, telefono, numeroLlamadas, estado, horaDespertar, pagoMensual);
    }


}
