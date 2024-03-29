/**
 * Clase que representan a las gruas encargadas de mover contenedores de un tipo específico.
 */
public class Grua implements Runnable {
    private String id; // ID asociado a la grua.

    /**
     * Constructor parametrizado dado el id de la grua ("mercante" o "azucar" o "harina" o "sal")
     *
     * @param id
     */
    public Grua(String id) {
        this.id = id;
    }

    /**
     * Método que comienza al arrancar el hilo
     */
    @Override
    public void run() {
        Plataforma.getInstance().get(id);
    }

    /**
     * Método que deposita un contenedor del barco 'b' en la plataforma.
     *
     * @param contenedor
     * @param b
     */
    public void put(String contenedor, BarcoMercante b) {
        Plataforma.getInstance().put(contenedor, b);
    }
}
