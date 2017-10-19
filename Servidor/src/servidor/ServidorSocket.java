/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import servidor.utils.EventoListener;

/**
 *
 * @author PERSONAL
 */
public class ServidorSocket {
    
    private ServerSocket serverSocket;
    private int puerto;
    private LinkedList<Socket> clientesList;
    // private EventListenerList eventListener = new EventListenerList();
    private Escuchador escuchador;
    private EventoListener eventoListener;
    
    public ServidorSocket() {
        this.clientesList = new LinkedList<Socket>();
        this.eventoListener = new EventoListener();
        
    }
    
    public void iniciar(int puerto) {
        this.puerto = puerto;
        try {
            serverSocket = new ServerSocket(puerto);
            escuchador = new Escuchador(this.serverSocket);
            escuchador.agregarEventListener(new EventoListener());
            escuchador.start();
            System.out.println("Esperando Conexiones : Server ON !!");
            
        } catch (Exception e) {
            System.out.println("Error ." + e.getMessage());
        } finally {
            
        }
        
    }
    
//    private void eventoOnConectado(Event ev) {
//        eventoListener.eventConectado(ev);
//    }
    
}
