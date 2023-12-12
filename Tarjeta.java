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
    private int i = 0;
    
    public Tarjeta(int creditos, int tickets)
    {
        this.setCreditos(creditos);
        this.setTickets(0);
        this.setNumTarjeta(i++);
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
    
    public void setCreditos(int creditos)
    {
        if (creditos >= 0)
            this.creditos = creditos;
        else
            System.out.println("Parámetro no válido: creditos");
    }
    
    public void setTickets(int tickets)
    {
        if (tickets >= 0)
            this.tickets = tickets;
        else
            System.out.println("Parámetro no válido: tickets");
    }
    
    public void setNumTarjeta(int numTarjeta)
    {
        this.numTarjeta = numTarjeta;
    }
}
