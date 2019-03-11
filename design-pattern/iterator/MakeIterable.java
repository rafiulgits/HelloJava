package sdp.iterator;

import java.util.Iterator;

/**
 *
 * @author rafiul islam
 */
public interface MakeIterable<T> {
    public Iterator<T> getIterator();
}
