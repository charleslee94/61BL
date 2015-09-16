import java.util.Collections;

public class TestExceptions {

	public static void main (String [ ] args) {
		Object[] nes;
		try {
		    nes = new Object[4];
		    nes[0] = new Object();

		} catch (NullPointerException e) {
			System.out.println ("got null pointer");
		}
		try {

			Object[] x = new String[3];
			x[0] = new Integer(0);

		} catch (ArrayStoreException e) {
			System.out.println ("got illegal array store");
		}
		try {
		    Object x = new Integer(0);
		    String yes = new String((String) x);

		} catch (ClassCastException e) {
			System.out.println ("got illegal class cast");
		}
	}

}
