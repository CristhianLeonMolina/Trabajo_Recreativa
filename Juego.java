package recreativos;
public class Juego
{
    private String  nombre;
    private int     coste;
    private int     premio;
    
    /**constructor para la clase*/
    public Juego(String nombre, int coste)
    {
        this.setNombre(nombre);
        this.setCoste(coste);
    }
    
    /**getter para obtener el nombre del juego al que nos referimos*/
    public String getNombre()
    {
        return (this.nombre);
    }
    
    /**getter para obtener el precio del juego al que nos referimos*/
    public int getCoste()
    {
        return (this.coste);
    }
    
    /**setter para nombrar o modificar el nombre del juego*/
    private void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    /**setter para dar valor o modificar el valor del precio del juego*/
    private void setCoste(int coste)
    {
        if (coste >= 0)
            this.coste = coste;
        else
            System.out.println("Parámetro no válido: coste");
    }
    
    /**metodo para pagar el juego al que se quiere jugar, restando los créditos y sumando los nuevos tickets que han sido generados aleatoriamente.*/
    public void pagar(Tarjeta tarjetaPago)
    {
        if ((tarjetaPago.getCreditos() - this.coste) >= 0)
        {
            this.premio = (int)(Math.random()*51);
            tarjetaPago.setCreditos(tarjetaPago.getCreditos() - this.coste);
            tarjetaPago.setTickets(tarjetaPago.getTickets() + this.premio);
            System.out.println("¡Has recibido " + this.premio + " tickets! Ahora cuentas con " + this.coste + " créditos");
        }
        else
            System.out.println("Saldo insuficiente");
    }
    
    /**metodo que pasa a string el nombre del juego y su precio*/
    @Override
    public String toString()
    {
        return ("El juego " + this.nombre + " tiene un precio de " + this.coste + " creditos");
    }
    
}
