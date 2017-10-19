/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.interfaces;

import java.util.EventListener;
import servidor.eventos.Evento;

/**
 *
 * @author PERSONAL
 */


//hacer una clase que escuche esta clase
public interface IEventListener extends EventListener{
    
 void eventConectado(Evento ev);
 void eventoDesconectado(Evento ev);
         
}
