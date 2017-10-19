/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.utils;

import java.net.Socket;
import servidor.eventos.Evento;
import servidor.interfaces.IEventListener;

/**
 *
 * @author PERSONAL
 */
public class EventoListener implements IEventListener{
    private Socket socket;
    private boolean conectado;

    public EventoListener() {
        
    }
    
    
    
    @Override
    public void eventConectado(Evento ev) {
        this.socket = ev.getSocket();
        System.out.println("IP conectado : "+socket.getInetAddress());
    }

    @Override
    public void eventoDesconectado(Evento ev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Socket getSocket() {
        return socket;
    }
    
    
    
    
}
