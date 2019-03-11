package sdp.iterator;

import java.util.Iterator;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet();
        dataSet.add(new Element(1, "Java"));
        dataSet.add(new Element(2, "Python"));
        dataSet.add(new Element(4, "JavaScript"));
        
        Iterator<Element> iterator = dataSet.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
