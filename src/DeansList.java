import java.util.ArrayList;
/**
 * DeansList class is used to track students on dean’s list. Students with gpa >=3.7 are added to the
 * dean’s list.
 *
 *  @author Xi  Lin
 *  * @since   2021-07-04
 */
public class DeansList implements ICollection {
    private ArrayList<Student> deansList;

    public DeansList() {
        deansList = new ArrayList();
    }

    public boolean add(Object newItem) {
        if (((Student) newItem).getGpa() >= 3.7) {
            deansList.add((Student) newItem);
            return true;
        } else {
            return false;
        }
    }

    public Object getNext() {
        if (deansList.size() == 0) {
            return false;
        } else {
            int index = 0;
            for (int i = 0; i < deansList.size(); i++) {
                if (deansList.get(i).getGpa() > deansList.get(index).getGpa()) {
                    index = i;
                }
            }
            return deansList.remove(index);
        }
    }
}







