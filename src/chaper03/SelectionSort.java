package chaper03;

/**
 * 
 * @author dudy
 *
 */

class ArrayBub1 {

	private long[] a;
	private int nElems;

	// ---------------------------------------
	public ArrayBub1(int max) { // constructor
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

	public void selectSort() { // selectSort 只交换N次，min为指向最小的下标
		int out, in, min = 0;
		for (out = 0; out < nElems - 1; out++) {
			min = out;
			for (in = out + 1; in < nElems; in++) {
				if (a[in] < a[min]) {
					min = in;
				}
			}
			swap(out, min);
		}
	}

	private void swap(int one, int two) {

		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}

/////////////////////////////////////////////////////
public class SelectionSort {
	public static void main(String[] args) {
		int maxSize = 10000;
		ArrayBub1 arr = new ArrayBub1(maxSize);
		for (int j = 0; j < maxSize; j++) {
			long n = (long) (java.lang.Math.random() * (maxSize - 1));
			arr.insert(n);
		}

		// arr.display();
		long start = System.currentTimeMillis();

		arr.selectSort();

		long end = System.currentTimeMillis();
		System.out.println("Time " + (end - start));
		// arr.display();
	}
}
