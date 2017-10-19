/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.net.Socket;

/**
 *
 * @author PERSONAL
 * 
 */


//hacer ping al server cada cierto tiempo(FRECUENCIA) para saber si esta 
//conectado ---> 1. cerrar la conex perdida(matar hilo,cerrar)
//               2. Crear nueva conexion 
class ClienteSocket { 
    private Socket socket ;
    private String name ;
    
}
