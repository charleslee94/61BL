package mapstuff;
import java.util.ArrayList;

public class Map<Y, X> {
    
    public ArrayList<Y>  map (ArrayList<X> list, Function<X, Y> func) {
        ArrayList<Y> nlist = new ArrayList<Y>();
        for ( X elem : list) {
            nlist.add(func.apply(elem));
        }
        return nlist;
    }
}
