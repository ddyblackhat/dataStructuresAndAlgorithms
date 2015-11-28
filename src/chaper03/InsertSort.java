package chaper03;

/**
 * 
 * @author dudy
 *
 */

class ArrayInsert {

	private long[] a;
	private int nElems;

	// ---------------------------------------
	public ArrayInsert(int max) { // constructor
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

	/**
	 * 在外层的for 循环中， out变量 从1 开始， 向右移动。 它标记了未排序部分的最左端的数据。
	 * 而在内层的while循环中， in 变量从 out 变量开始， 向左移动， 直到temp变量小于in所指的
	 * 数据项，或者它已经不能再往左移动为止。
	 */
	public void insertSort(){  
		int out, in ;
		for(out = 1; out < nElems; out ++){  // out is dividing line 
			long temp = a[out];              // remove marked item 
			in = out;
			while( in > 0 && a[in-1] > temp ){
				a[in] = a[in - 1 ];         //  shift item to right
				--in;
			}
			a[in] = temp;
		}
		
	}

	private void swap(int one, int two) {

		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}

/////////////////////////////////////////////////////
public class InsertSort {
	public static void main(String[] args) {
		int maxSize = 100;
		ArrayInsert arr = new ArrayInsert(maxSize);

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

		arr.insertSort();
		
		arr.display();

	}
}
