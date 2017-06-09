/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Karla Murillo
 */
public class Nodo {
      
    public String name;
    public Lista.Nodo next, prev;

    public Nodo(String name) {
        this.name = name;
        this.next = null;
        this.prev = null;
    }
}
