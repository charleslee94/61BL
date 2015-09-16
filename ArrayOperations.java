public class ArrayOperations {

	// Delete the value at the given position in the argument array,
	// shifting all the subsequent elements down, and storing a 0
	// as the last element of the array.
	public static void delete (int[] values, int pos) {
		if (pos < 0 || pos >= values.length) {
			return;
		}
		if (pos == values.length - 1) {
		    values[pos] = 0;
		    return;
		}
		int temp = pos;
		for (int i = pos; i < values.length - 1; i++) {
		        values[i] = values[temp + 1];
		        temp++;
		}
		values[values.length - 1] = 0;
	}
		
	
	// Insert newInt at the given position in the argument array,
	// shifting all the subsequent elements up to make room for it.
	// The last element in the argument array is lost.
	public static void insert (int[] values, int pos, int newInt) {
		if (pos < 0 || pos >= values.length) {
			return;
		}
		int k = pos + 1;
		int temp = 0;
		for ( int i = pos; i < values.length - 1; i++) {
		    if (i == pos) {
		        temp = values[i];
		        values[i] = newInt;
		        values[k] = temp;
		        k++;
		    }
		    
		}
	}
	public static int[] zip( int[] array1, int[] array2) {
	    int[] done = new int[array1.length + array2.length];
	    int counter = 0;
	    int count1 = 0;
	    int count2 = 0;
	    while (counter < array1.length + array2.length) {
	        if (counter % 2 == 0) {
	            done[counter] = array1[count1];
	            count1++;
	        } else {
	            done[counter] = array2[count2];
	            count2++;
	        }
	        counter++;
	    }
	    for (int elem : done) {
            System.out.println(elem);
	    }
	    return done;
	}
	public static void main(String[] args) {
	    int[] values = {1, 2, 3, 4, 5};
        insert (values, 0, 0);
        int[] afterInsert1 = {0, 1, 2, 3, 4};
        for (int elem : values) {
            System.out.println(elem);
        }
	}
}
