/**
 * 1. bool add(Object newItem) is used to add a newItem to a collection in the class that
 * implements the interface. Returns true if the item is successfully added.
 * 2. getNext() is used to return an available item. Items that are returned should be removed
 * from the collection.
 *
 * @author  Xi  Lin
 * @since   2021-07-04
 */
public interface ICollection {
          boolean add(Object newItem);
          Object getNext();
}
