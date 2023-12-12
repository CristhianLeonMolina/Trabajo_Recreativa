/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_recreativa;

/**
 *
 * @author developer
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Tarjeta tarjeta1 = new Tarjeta(40);
        Tarjeta tarjeta2 = new Tarjeta(15);
        Premio premio1 = new Premio("Oso de Peluche", 70, 40);
        Premio premio2 = new Premio("Luces", 30, 100);
        Premio premio3 = new Premio("Mantel", 50, 50);
        Premio premio4 = new Premio("Yoyo", 5, 500);
        Premio premio5 = new Premio("Consola", 5000, 1);
        Premio premio6 = new Premio("Juego de Mesa", 100, 30);
        Terminal terminal1 = new Terminal(premio1, premio2, premio3);
        Terminal terminal2 = new Terminal(premio4, premio5, premio6);
        Juego juego1 = new Juego("Tetris", 20);
        Juego juego2 = new Juego("Baloncesto", 15);
        
        terminal1.toString();
        terminal2.toString();
        
        terminal1.convertir(tarjeta1, 50);
        terminal2.convertir(tarjeta2, 20);
        
        juego1.pagar(tarjeta1);
        juego2.pagar(tarjeta2);
        
        terminal1.consultar(tarjeta1);
        terminal2.consultar(tarjeta2);
        
        terminal1.transferir(tarjeta1, tarjeta2);
        terminal2.transferir(tarjeta1, tarjeta2);
        

        
        terminal1.canjear(tarjeta2, premio1);
        terminal2.canjear(tarjeta2, premio5);
        
        juego1.pagar(tarjeta1);
        juego2.pagar(tarjeta2);
    }
    
}
