package chaper03;

/**
 * 
 * @author dudy
 *
 */

class ArrayBub {

	private long[] a;
	private int nElems;

	// ---------------------------------------
	public ArrayBub(int max) { // constructor
		a = new long[max];
		nElems = 0;
	}

	// ------------------------------------
	public void insert(long value) { // put elements into array
		a[nElems] = value;
		nElems++;
	}

	public void display() { // displays array contents
		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	public void bubbleSort() {
		int out, in;

		for (out = nElems - 1; out > 1; out--) { // outer loop(backward)
			for (in = 0; in < out; in++) { // inner loop(forward)
				if (a[in] > a[in + 1]) // out of order?
					swap(in, in + 1); // swap them
			}
		}
	} // end bubbleSort

	private void swap(int one, int two) {

		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}

}

/////////////////////////////////////////////////////
public class BubbleSort {
	public static void main(String[] args) {
		int maxSize = 10000;
		ArrayBub arr = new ArrayBub(maxSize);

		for (int j = 0; j < maxSize; j++) {
			long n = (long) (java.lang.Math.random() * (maxSize - 1));
			arr.insert(n);
		}

		// arr.display();
		long start = System.currentTimeMillis();

		arr.bubbleSort();

		long end = System.currentTimeMillis();
		System.out.println("Time " + (end - start));
		// arr.display();

	}
}
