package assighment2;

import java.util.ArrayList;

public interface CatCafe {
    public void treatCustomer(Customer customer) throws CatNotFoundException;
    public void buyCat(Cat cat) throws Exception;
    public void close();
}
