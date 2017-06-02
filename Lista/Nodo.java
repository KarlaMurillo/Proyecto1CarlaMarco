
package Lista;

/**
 *
 * @author Marco
 */
public class Nodo {
       
    public String name;
    public Nodo next, prev;

    public Nodo(String name) {
        this.name = name;
        this.next = null;
        this.prev = null;
    }
    
}
