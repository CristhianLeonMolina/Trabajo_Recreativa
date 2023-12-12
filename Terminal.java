package JuegosRecreativos;

import java.util.Scanner;

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

    public void convertir(Tarjeta tarjeta, int dinero) {
        if (dinero >= 0) {
            tarjeta.setTickets(tarjeta.getTickets() + (dinero * 2));
            System.out.println(toString());
        } else {
            System.out.println("Error");
        }
    }

    public void consultar(Tarjeta tarjeta) {
        System.out.println(toString() + tarjeta.getNumTarjeta());
    }

    public void transferir(Tarjeta tarjeta1, Tarjeta tarjeta2) {
        Scanner sc = new Scanner(System.in);
        int valorTransferencia = 0;
        int eleccion = 0;
        int cont = 1;
        for (int i = 0; i < cont; i++) {
            System.out.println("Introduce un número acorde a la transferencia" + "\n"
                    + "0. Tickets" + "\n"
                    + "1. Créditos" + "\n");
            eleccion = sc.nextInt();
            if (eleccion != 0 && eleccion != 1) {
                cont++;
            }
        }
        int contadorEleccion = 1;
        if (eleccion == 0) {
            for (int i = 0; i < contadorEleccion; i++) {
                System.out.println("");
                System.out.print("Introduce un valor a transferir de tickets: ");
                valorTransferencia = sc.nextInt();
                if (valorTransferencia < 0) {
                    System.out.println("Error");
                    contadorEleccion++;
                } else if (valorTransferencia < tarjeta1.getTickets()) {
                    tarjeta1.setTickets(tarjeta1.getTickets() - valorTransferencia);
                    tarjeta2.setTickets(tarjeta2.getTickets() + valorTransferencia);
                } else {
                    System.out.println("Has intentado transferir más tickets de los que tienes");
                    contadorEleccion++;
                }
            }
        } else {
            for (int i = 0; i < contadorEleccion; i++) {
                System.out.println("");
                System.out.print("Introduce un valor a transferir de créditos: ");
                valorTransferencia = sc.nextInt();
                if (valorTransferencia < 0) {
                    System.out.println("Error");
                    contadorEleccion++;
                } else if (valorTransferencia < tarjeta1.getCreditos()) {
                    tarjeta1.setCreditos(tarjeta1.getCreditos() - valorTransferencia);
                    tarjeta2.setCreditos(tarjeta2.getCreditos() + valorTransferencia);
                } else {
                    System.out.println("Has intentado transferir más créditos de los que tienes");
                    contadorEleccion++;
                }
            }
        }
        System.out.println(toString());
    }

    public void canjear(Tarjeta tarjeta, Premio premio) {
        int tenerPremio = 0;
        for (int i = 0; i < NombrePremios.length; i++) {
            if (premio == NombrePremios[i]) {
                tenerPremio++;
                i = NombrePremios.length;
                if (premio.getStock() > 0) {
                    tenerPremio++;
                    if (premio.getCoste() > tarjeta.getTickets()) {
                        System.out.println("El coste del premio es mayor que los tickets que dispones en la tarjeta");
                    } else {
                        tenerPremio++;
                    }
                }
            } else {
                System.out.println("No tenemos el premio en este terminal");
            }

        }
        if (tenerPremio == 3) {
            premio.setStock(premio.getStock() - 1);
            System.out.println("Ya puedes recoger el premio: " + premio.getNombre());
            System.out.println("Quedan " + premio.getStock() + " premios en este terminal");
        }
    }

    @Override
    public String toString() {
        return ("En este terminal disponemos de los siguientes premios:" + "\n"
                + this.NombrePremios[0] + " , nos quedan " + this.NombrePremios[0].getStock() + " y su coste es de " + this.NombrePremios[0].getCoste() + " tickets" + "\n"
                + this.NombrePremios[1] + " , nos quedan " + this.NombrePremios[1].getStock() + " y su coste es de " + this.NombrePremios[1].getCoste() + " tickets" + "\n"
                + this.NombrePremios[2] + " , nos quedan " + this.NombrePremios[2].getStock() + " y su coste es de " + this.NombrePremios[2].getCoste() + " tickets");
    }
    //cambiar bucles for por while
}
//revisar sout
