/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.eventos;

import java.net.Socket;
import java.util.EventObject;

/**
 *
 * @author PERSONAL
 */


public class Evento extends EventObject{

    private Socket cliente;
    
    public Evento(Object source) {
        super(source);
    }

    public void setSocket(Socket cliente) {
        this.cliente = cliente;
    }

    public Socket getSocket() {
        return cliente;
    }
}
