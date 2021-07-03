/**
 * ShoppingBag class is used to track items in a shopping bag. When an item is placed in an empty
 * bag, it is placed at the bottom of the bag, then we place another item on top of it and so on until
 * the bag is full. When emptying a bag, we start with the item on top then the next until the bag is
 * empty.
 *
 *  @author Xi  Lin
 *  * @since   2021-07-04
 */
public class ShoppingBag implements ICollection{
    private Object[] list;
    private int total;

    public  ShoppingBag(int totalItems){
        if(totalItems>0){
            this.list=new Object[totalItems];
        }else{
            throw new IllegalArgumentException("Illegal Capacity:"+totalItems);
        }
    }

    @Override
    public boolean add(Object newItem) {
        if(total<list.length){
            list[total]=newItem;
            total++;
            return  true;
        }else{
            return false;
        }
    }

    @Override
    public Object getNext() {
        for (int i = 0; i < total - 1; i++) {
            list[i] =list[i + 1];}
        list[total-1]=null;
        total--;
        return list[0];
    }


}
