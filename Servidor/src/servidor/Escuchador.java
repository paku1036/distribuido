/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import servidor.eventos.Evento;
import servidor.interfaces.IEventListener;

/**
 *
 * @author PERSONAL
 */
public class Escuchador extends Thread {

    private ServerSocket serverSocket;
    private int nro;
    private boolean conectado;
    private Object listener;

    public Escuchador(ServerSocket serverSocket) {
//        super();
        this.serverSocket = serverSocket;
        this.nro = 0;
        this.conectado = true;
    }



    public boolean isConectado() {
        return conectado;
    }



    @Override
    public void run() {

        while (conectado){
            Socket cliente =new Socket();
            
            try {
                System.out.println("Escuchando si llega alguna conexion");
                cliente=serverSocket.accept();
                System.out.println("Se conecto un cliente");                               
                Evento event = new Evento(this);
                event.setSocket(cliente);
                
                eventoConexion(event); 
            } catch (Exception ex) {
                System.out.println("Error : s");
                //evento de error 
            }                                           
        }         

    }

    public void agregarEventListener(IEventListener listener) {
        this.listener = listener;
        
    }    
    
    private void eventoConexion(Evento event) {
        IEventListener listener =  (IEventListener)this.listener;
        listener.eventConectado(event);
        
    }
    
    
    
    
    
    
    
    
    

}
