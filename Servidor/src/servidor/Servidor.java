/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

/**
 *
 * @author PERSONAL
 */
public class Servidor {
    
    
    
    
    public static void main(String[] args) {
        ServidorSocket servidor = new ServidorSocket();
        servidor.iniciar(2000);
    }
}
