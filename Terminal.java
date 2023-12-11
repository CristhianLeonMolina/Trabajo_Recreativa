package JuegosRecreativos;

public class Terminal {

    private Premio NombrePremios[] = new Premio[3];

    public Terminal(Premio premio1, Premio premio2, Premio premio3) {
        this.setNombrePremios(0, premio1);
        this.setNombrePremios(1, premio2);
        this.setNombrePremios(2, premio3);
    }

    public void setNombrePremios(int posicionPremio, Premio premio) {
        this.NombrePremios[posicionPremio] = premio;
    }

    public Premio[] getNombrePremios() {
        return this.NombrePremios;
    }

    public int convertir(Tarjeta tarjeta, int dinero) {
        int tickets = dinero * 2;
        System.out.println(tarjeta.toString());
        return tickets;
    }

    @Override
    public String toString() {
        return ("El saldo es el siguiente: " + Tarjeta.getCreditos() + " , tiene " + Tarjeta.getTickets() + " tickets");
    }
}
