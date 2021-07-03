import java.util.ArrayList;
/**
 * ClientService class is used to track clients walking into a business like a bank, clinic, pharmacy,
 * etc. Usually, the client that walks in first is the first client to be served.
 *
 *  @author Xi  Lin
 *  * @since   2021-07-04
 */
public class ClientService implements ICollection{
    private ArrayList clients;

    public ClientService(int totalClients){
        if(totalClients>0){
            this.clients=new ArrayList( totalClients );
        }else{
            throw new IllegalArgumentException("Illegal Capacity:"+totalClients);
        }
    }
    public boolean add(Object newItem) {
        clients.add(newItem);
        return true;
    }

    public Object getNext() {
        clients.remove(0);
        return clients.get(0);
    }
}
