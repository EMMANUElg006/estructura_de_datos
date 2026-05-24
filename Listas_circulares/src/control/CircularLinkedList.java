package control;
import model.Contac;
import model.Node;
public class CircularLinkedList {
    private Node tail;
    private int size;

    public CircularLinkedList (){
        this.tail = null;
        this.size = 0;
    }

    public void add(Contac Contac){
        Node newNode = new Node(Contac);

        if (tail == null) {
            tail = newNode;
            tail.setNext(tail);

        }  else {
            newNode.setNext (tail.getNext());
            tail.setNext (newNode);
            tail = newNode;
        }
        size ++;
    }

    public Contac finByName(String){
        if(tail==null) return null;

        Node current = tail.getNext();// primer nodo

        do{
            if(current.getvalue().getFullName().equalsIgnoreCase(name)){
                return current.getValue();
            }
            current = current.getNext();
        }while (current !=tail.getNext());
        return null;

    }

    // metodo eliminar
    public boolean delateBYName (String name){
        if(tail == null) return false;

        Node current =tail.getNext();
        Node previous = tail;
        do{
            if(current.getValue().getFullName().equalsIgnoreCase(name)){

                //caso: 1
                if (current == tail && current.getNext()==tail){
                    tail= null;
                    // Caso : 2

                    if(current == tail.getNext()){
                        tail.setNext(current.getNext());
                    }
                    //caso: 3
                    else if (current == tail){
                        previous.setNext(current.getNext());
                        tail =previous;
                    }
                    // CASO: 4
                    else {
                        previous.setNext(current.getNext());
                        size--;
                        return true;
                    }
                }
            }

        }while (current != tail.getNext());
        return false;
    }
}
