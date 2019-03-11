package sdp.iterator;

import java.util.Iterator;

/**
 *
 * @author rafiul islam
 */
public class ElementIterator implements Iterator<Element>{
    private Element[] elements;
    private int iteratePosition = 0;
    
    public ElementIterator(Element[] elements){
        this.elements = elements;
    }
    
    @Override
    public boolean hasNext(){
        if(iteratePosition+1 >= elements.length){
            return false;
        }
        if(elements[iteratePosition] == null){
            return false;
        }
        return true;
    }
    
    @Override
    public Element next(){
        return elements[iteratePosition++];
    }
}
