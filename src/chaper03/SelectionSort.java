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

	public void selectSort(){  // selectSort  
		int out, in , min = 0;
		for(out = 0; out < nElems -1;out++){
			min = out;
			for(in = out+1; in< nElems; in++){
				if(a[in] < a[min]){
					min = in;
				}
			}
			swap(out,min);
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
		int maxSize = 100;
		ArrayBub1 arr = new ArrayBub1(maxSize);

		arr.insert(77); // insert 10 items
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);

		arr.display();

		arr.selectSort();

		arr.display();

	}
}
