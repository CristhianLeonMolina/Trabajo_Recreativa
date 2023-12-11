package JuegosRecreativos;

public class Premio {
    private String nombre;
    private int coste, stock;
    
    public Premio(String nombre, int coste, int stock){
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
    this.coste = coste;
    }
    
    public void setStock(int stock) {
    this.stock = stock;
    }
}
