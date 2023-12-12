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
public class Tarjeta
{
    private int creditos;
    private int tickets;
    private int numTarjeta;
    static int i = 0;
    
    //constructor de la clase
    public Tarjeta(int creditos)
    {
        this.setCreditos(creditos);
        this.setTickets(0);
        this.setNumTarjeta(i++);
    }
    
    //getter para obtener la cantidad de creditos en la tarjeta
    public int getCreditos()
    {
        return (this.creditos);
    }
    
    //getter para obtener la cantidad de tickets que posee el usuario almacenados en la tarjeta
    public int getTickets()
    {
        return (this.tickets);
    }
    
    //getter para obtener el numero de la tarjeta del usuario
    public int getNumTarjeta()
    {
        return (this.numTarjeta);
    }
    
    //setter para cambiar la cantidad de creditos en la tarjeta
    public void setCreditos(int creditos)
    {
        this.creditos = creditos;
    }
    
    //setter para cambiar la cantidad de tickets en la tarjeta
    public void setTickets(int tickets)
    {
        this.tickets = tickets;
    }
    
    //setter para establecer el número de la nueva tarjeta
    public void setNumTarjeta(int numTarjeta)
    {
        this.numTarjeta = numTarjeta;
    }
    
    //metodo toString que pasa a string el numero de la tarjeta, la cantidad de creditos y la cantidad de tickets
    @Override
    public String toString()
    {
        return ("La tarjeta " + this.numTarjeta + " cuenta con " + this.creditos + " creditos y tiene " + this.tickets + " tickets.");
    }
}
