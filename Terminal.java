package JuegosRecreativos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Terminal {

    private Premio NombrePremios[] = new Premio[3];

    public Terminal(Premio premio1, Premio premio2, Premio premio3) { //Constructor de la clase "Terminal" que permite almacenar en al array 3 objetos de la clase "Premio".
        this.setNombrePremios(0, premio1);
        this.setNombrePremios(1, premio2);
        this.setNombrePremios(2, premio3);
    }

    public void setNombrePremios(int posicionPremio, Premio premio) { //Método setter que selecciona un premio y lo guarda en una posición exacta del array "NombrePremios".
        this.NombrePremios[posicionPremio] = premio;
    }

    public Premio[] getNombrePremios() { //Método getter que devuelve el array "NombrePremios".
        return this.NombrePremios;
    }

    public void convertir(Tarjeta tarjeta, int dinero) { //Método para convertir dinero en tickets.
        if (dinero >= 0) {
            tarjeta.setTickets(tarjeta.getTickets() + (dinero * 2));
            System.out.println(tarjeta.toString());
        } else {
            System.out.println("Has introducido un valor negativo");
        }
    }

    public void consultar(Tarjeta tarjeta) { //Método que consulta los datos de la tarjeta.
        System.out.println(tarjeta.toString());
    }

    public void transferir(Tarjeta tarjeta1, Tarjeta tarjeta2) { //Método que permite transferir créditos o tickets de una tarjeta a otra.
        Scanner sc = new Scanner(System.in);
        int valorTransferencia = 0;
        int eleccion = 0;
        try {
        do {
            System.out.println("Introduce un número acorde al tipo de transferencia" + "\n"
                    + "0. Tickets" + "\n"
                    + "1. Créditos" + "\n");
            eleccion = sc.nextInt();
        } while (eleccion != 0 && eleccion != 1);
        } catch (InputMismatchException ex) {
            System.out.println("Carácter no permitido");
        }
        int contadorEleccion = 1;
        if (eleccion == 0) {
            for (int i = 0; i < contadorEleccion; i++) {
                System.out.print("Introduce los tickets a transferir: ");
                valorTransferencia = sc.nextInt();
                if (valorTransferencia < 0) {
                    System.out.println("Has introducido un valor negativo, inténtalo de nuevo.");
                    contadorEleccion++;
                } else if (valorTransferencia <= tarjeta1.getTickets()) {
                    tarjeta1.setTickets(tarjeta1.getTickets() - valorTransferencia);
                    tarjeta2.setTickets(tarjeta2.getTickets() + valorTransferencia);
                } else {
                    System.out.println("Has intentado transferir más tickets de los que tienes, inténtalo de nuevo.");
                    contadorEleccion++;
                }
            }
        } else {
            for (int i = 0; i < contadorEleccion; i++) {
                System.out.print("Introduce los créditos a transferir: ");
                valorTransferencia = sc.nextInt();
                if (valorTransferencia < 0) {
                    System.out.println("Has introducido un valor negativo, inténtalo de nuevo.");
                    contadorEleccion++;
                } else if (valorTransferencia <= tarjeta1.getCreditos()) {
                    tarjeta1.setCreditos(tarjeta1.getCreditos() - valorTransferencia);
                    tarjeta2.setCreditos(tarjeta2.getCreditos() + valorTransferencia);
                } else {
                    System.out.println("Has intentado transferir más créditos de los que tienes, inténtalo de nuevo.");
                    contadorEleccion++;
                }
            }
        }
        System.out.println(toString());
    }

    public void canjear(Tarjeta tarjeta, Premio premio) { //Método que permite canjear tickets por premios.
        int tenerPremio = 0;
        for (int i = 0; i < NombrePremios.length; i++) {
            if (premio == NombrePremios[i]) {
                tenerPremio++;
                i = NombrePremios.length;
                if (premio.getStock() > 0) {
                    tenerPremio++;
                    if (premio.getCoste() > tarjeta.getTickets()) {
                        System.out.println("No te puedes permitir este premio, consigue más tickets 😀");
                    } else {
                        tenerPremio++;
                    }
                }
            } else {
                System.out.println("No disponemos del premio solicitado en este terminal");
            }

        }
        if (tenerPremio == 3) {
            premio.setStock(premio.getStock() - 1);
            System.out.println("Ya puedes recoger el premio: " + premio.getNombre());
            System.out.println("Nos quedan " + premio.getStock() + " unidades de este premio en el terminal actual");
        }
    }

    @Override
    public String toString() { //Paso a String de los atributos de cada premio del array que contiene los premios disponibles.
        return ("En este terminal disponemos de los siguientes premios:" + "\n"
                + this.NombrePremios[0].getNombre() + ", nos quedan " + this.NombrePremios[0].getStock() + " y su coste es de " + this.NombrePremios[0].getCoste() + " tickets" + "\n"
                + this.NombrePremios[1].getNombre() + ", nos quedan " + this.NombrePremios[1].getStock() + " y su coste es de " + this.NombrePremios[1].getCoste() + " tickets" + "\n"
                + this.NombrePremios[2].getNombre() + ", nos quedan " + this.NombrePremios[2].getStock() + " y su coste es de " + this.NombrePremios[2].getCoste() + " tickets" + "\n");
    }
}
