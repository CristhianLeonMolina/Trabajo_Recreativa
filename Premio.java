package JuegosRecreativos;

public class Premio {

    private String nombre;
    private int coste, stock;

    public Premio(String nombre, int coste, int stock) {
        this.setNombre(nombre);
        this.setCoste(coste);
        this.setStock(stock);
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCoste() {
        return this.coste;
    }

    public int getStock() {
        return this.stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCoste(int coste) {
        if (coste < 0) {
            System.out.println("En este establecimiento no disponemos de productos gratuitos");
        } else {
            this.coste = coste;
        }
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("No podemos tener un stock menor que 0 unidades");
        } else {
            this.stock = stock;
        }
    }
    
    @Override
    public String toString() {
    return ("Nos quedan " + this.getStock() + " " + this.getNombre().toLowerCase() + " con un coste de " + this.getCoste() + " tickets.");
    }
}