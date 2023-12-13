/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recreativos;

/**
 *
 * @author developer
 */
public class Juego
{
    private String  nombre;
    private int     coste;
    
    //constructor para la clase
    public Juego(String nombre, int coste)
    {
        this.setNombre(nombre);
        this.setCoste(coste);
    }
    
    //getter para obtener el nombre del juego al que nos referimos
    public String getNombre()
    {
        return (this.nombre);
    }
    
    //getter para obtener el precio del juego al que nos referimos
    public int getCoste()
    {
        return (this.coste);
    }
    
    //setter para nombrar o modificar el nombre del jeugo
    private void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    //setter para dar valor o modificar el valor del precio del juego
    private void setCoste(int coste)
    {
        if (coste >= 0)
            this.coste = coste;
        else
            System.out.println("Parámetro no válido: coste");
    }
    
    //metodo para pagar el juego al que se quiere jugar, restando los créditos y sumando los nuevos tickets que han sido generados aleatoriamente
    //se puede hacer que al darte los tickets también te indique la cantidad que te ha dado
    public void pagar(Tarjeta tarjetaPago)
    {
        if ((tarjetaPago.getCreditos() - this.coste) >= 0)
        {
            tarjetaPago.setCreditos(tarjetaPago.getCreditos() - this.coste);
            tarjetaPago.setTickets(tarjetaPago.getTickets() + (int)(Math.random()*51));
        }
        else
            System.out.println("Saldo insuficiente");
    }
    
    //metodo que pasa a string el nombre del juego y su precio
    @Override
    public String toString()
    {
        return ("El juego " + this.nombre + " tiene un precio de " + this.coste + " creditos");
    }
    
}
