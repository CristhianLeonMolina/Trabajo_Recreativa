package JuegosRecreativos;

public class Premio {

    private String nombre;
    private int coste, stock;
    /**
     * Constructor de la clase "Premio".
     * @param nombre: nombre del premio
     * @param coste: coste del premio
     * @param stock: stock del premio
     */
    public Premio(String nombre, int coste, int stock) {
        this.setNombre(nombre);
        this.setCoste(coste);
        this.setStock(stock);
    }
    
    /**
     * Método que permite recibir el atributo "nombre".
     * @return String: El valor del parámetro "nombre"
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Método que permite recibir el atributo "coste".
     * @return int: El valor del parámetro "coste"
     */
    public int getCoste() {
        return this.coste;
    }

    /**
     * Método que permite recibir el atributo "stock".
     * @return int: El valor del parámetro "stock"
     */
    public int getStock() {
        return this.stock;
    }

    /**
     * Método que permite establecer el atributo "nombre".
     * @param nombre: nombre del premio
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método que permite establecer el atributo "coste".
     * @param coste: coste del premio
     */
    public void setCoste(int coste) {
        if (coste < 0) {
            System.out.println("En este establecimiento no disponemos de productos gratuitos.\n");
        } else {
            this.coste = coste;
        }
    }

    /**
     * Método que permite establecer el atributo "stock".
     * @param stock: stock del premio
     */
    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("No podemos tener un stock menor que 0 unidades.\n");
        } else {
            this.stock = stock;
        }
    }
    
    @Override
    /**
     * Paso a String de los atributos de cada premio.
     * @return String: datos del premio
     */
    public String toString() {
    return ("Nos quedan " + this.getStock() + " " + this.getNombre().toLowerCase() + " con un coste de " + this.getCoste() + " tickets.\n");
    }
}
