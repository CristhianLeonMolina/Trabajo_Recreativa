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
    
    public Tarjeta(int creditos, int tickets, int numTarjeta)
    {
        this.setCreditos(creditos);
        this.setTickets(tickets);
        this.setNumTarjeta(numTarjeta);
    }
    
    public int getCreditos()
    {
        return (this.creditos);
    }
    
    public int getTickets()
    {
        return (this.tickets);
    }
    
    public int getNumTarjeta()
    {
        return (this.numTarjeta);
    }
    
    public void setCreditos(int tarjeta)
    {
        this.creditos = tarjeta;
    }
    
    public void setTickets(int tickets)
    {
        this.tickets = tickets;
    }
    
    public void setNumTarjeta(int numTarjeta)
    {
        this.numTarjeta = numTarjeta;
    }
}
