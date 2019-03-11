package sdp.iterator;

import java.util.Iterator;


/**
 *
 * @author rafiul islam
 */
public class DataSet implements MakeIterable<Element>{
    
    private Element[] elements;
    private final int MAX = 10;
    private int position = 0;
    
    public DataSet(){
        elements = new Element[MAX];
    }
    
    public void add(Element element){
        if(position + 1 >= MAX){
            System.err.println("Overflow");
            return;
        }
        elements[position++] = element;
    }
    
    @Override
    public Iterator<Element> getIterator() {
       return new ElementIterator(elements);
    }
}
