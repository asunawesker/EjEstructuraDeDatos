package cola;

/**
 *
 * @author asunawesker
 */
public class Node <T> {
    
    private T data;
    private Node<T> link;

    public Node(){
        setLink(null);
    }

    public Node(T data){
      setData(data);
      setLink(null);
    }

    public void setData(T data){
        this.data=data;
    }

    public T getDato(){
        return data;
    }

    public void setLink(Node<T> link){
        this.link=link;
    }

    public Node<T> getLink(){
        return link;
    }
}
