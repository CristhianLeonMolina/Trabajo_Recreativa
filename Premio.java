package JuegosRecreativos;

public class Premio {

    private String nombre;
    private int coste, stock;

    public Premio(String nombre, int coste, int stock) { //Constructor de la clase "Premio" con los atributos nombre, coste y stock.
        this.setNombre(nombre);
        this.setCoste(coste);
        this.setStock(stock);
    }

    public String getNombre() { //Método getter del atributo nombre.
        return this.nombre;
    }

    public int getCoste() { //Método getter del atributo coste.
        return this.coste;
    }

    public int getStock() { //Método getter del atributo stock.
        return this.stock;
    }

    public void setNombre(String nombre) { //Método setter del atributo nombre.
        this.nombre = nombre;
    }

    public void setCoste(int coste) { //Método setter del atributo coste.
        if (coste < 0) {
            System.out.println("En este establecimiento no disponemos de productos gratuitos");
        } else {
            this.coste = coste;
        }
    }

    public void setStock(int stock) { //Método setter del atributo stock.
        if (stock < 0) {
            System.out.println("No podemos tener un stock menor que 0 unidades");
        } else {
            this.stock = stock;
        }
    }
    
    @Override
    public String toString() { //Paso a String de los atributos del premio.
    return ("Nos quedan " + this.getStock() + " " + this.getNombre().toLowerCase() + " con un coste de " + this.getCoste() + " tickets.");
    }
}