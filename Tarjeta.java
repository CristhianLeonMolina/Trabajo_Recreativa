package recreativos;
public class Tarjeta
{
    private int creditos;
    private int tickets;
    private int numTarjeta;
    static int i = 0;
    
    /**constructor de la clase*/
    public Tarjeta(int creditos)
    {
        this.setCreditos(creditos);
        this.setTickets(0);
        this.Tarjeta(i++);
    }
    
    /**getter para obtener la cantidad de creditos en la tarjeta
    * @param créditos: Cantidad de créditos alamcenados en la tarjeta
    */
    public int getCreditos()
    {
        return (this.creditos);
    }
    
    /**getter para obtener la cantidad de tickets que posee el usuario almacenados en la tarjeta
    * @param tickets: Cantidad de tickets alamcenados en la tarjeta
    */
    public int getTickets()
    {
        return (this.tickets);
    }
    
    /**getter para obtener el numero de la tarjeta del usuario
    * @param numTarjeta: Numero de identificación de la tarjeta
    */
    public int getNumTarjeta()
    {
        return (this.numTarjeta);
    }
    
    /**setter para cambiar la cantidad de creditos en la tarjeta
    * @param créditos: Cantidad de créditos alamcenados en la tarjeta
    */
    public void setCreditos(int creditos)
    {
        this.creditos = creditos;
    }
    
    /**setter para cambiar la cantidad de tickets en la tarjeta
    * @param tickets: Cantidad de tickets alamcenados en la tarjeta
    */
    public void setTickets(int tickets)
    {
        this.tickets = tickets;
    }
    
    /**metodo toString que pasa a string el numero de la tarjeta, la cantidad de creditos y la cantidad de ticketsç
    * @param créditos: Cantidad de créditos alamcenados en la tarjeta
    * tickets: Cantidad de tickets alamcenados en la tarjeta
    * numTarjeta: Numero de identificación de la tarjeta
    */
    @Override
    public String toString()
    {
        return ("La tarjeta " + this.numTarjeta + " cuenta con " + this.creditos + " creditos y tiene " + this.tickets + " tickets.");
    }
}
