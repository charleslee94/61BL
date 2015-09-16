package mapstuff;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class MapTest<Y, X> extends Map<Y, X> {

    @Test
    public void test() {
        ArrayList<Integer> list1 = new ArrayList<Integer>(1);
        list1.add(2);
        System.out.println(list1.get(0));
        assertEquals(1, 2);
    }

}
