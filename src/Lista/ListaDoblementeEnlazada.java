package Lista;

/**
 *
 * @author karla
 */
public class ListaDoblementeEnlazada {
    
//variables
    public Nodo head, tail;
    private int size;

    public ListaDoblementeEnlazada() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    //                  INSERCIONES
    public void insertarAlInicio(String name){
        
        Nodo nuevoNodo = new Nodo(name);
        
        if(this.head == null){//la lista está vacía
            this.head = nuevoNodo;
            this.tail = nuevoNodo;
        
        }else{
            // la lista tiene algún elemento
            nuevoNodo.next = this.head;
            
            this.head.prev = nuevoNodo;
            
            this.head = nuevoNodo;
        }
        this.size++;
    }//end method
    
    public void inserAlFinal(String name){
        Nodo nuevoNodo = new Nodo(name);
        
        if(this.tail == null){//lista vacía
            this.head = nuevoNodo;
            this.tail = nuevoNodo;
        
        }else{
            
            nuevoNodo.prev = this.tail;
            this.tail.next = nuevoNodo;
            this.tail = nuevoNodo;
        }
        this.size++;
    }
    
    
   //                      ELIMINACIONES
    public boolean eliminarElemento(String name){
        Nodo temp = this.head;
        
        while(temp != null && !name.equals(temp.name)){
            temp = temp.next;
        }
        
        if(this.size == 0){
            return false;
        }else{
            if(temp == null){
                return false;
            }else{
                //pregunto si es el primero
                if(temp == this.head){
                    this.head = this.head.next;
                    this.head.prev = null;
                    
                    --size;
                    return true;
                }else{
                    temp.prev.next = temp.next;
                    if(temp == this.tail){
                        this.tail = this.tail.prev;
                    }else{
                        temp.next.prev = temp.prev;
                    }
                    
                    --size;
                    return true;
                }
            }
        }
    }//end method
    
    
    //                      IMPRESIONES 
    public void imprimirLista(){
        Nodo temp = this.head;
        System.out.println("List size: " + this.size);
        System.err.print("NULL<--> ");
        while(temp != null){
            System.err.print(temp.name + "<--> ");
            temp = temp.next;
        }
        System.err.println("NULL");
    }//end method
}
