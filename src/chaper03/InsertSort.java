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
	 * ������for ѭ���У� out���� ��1 ��ʼ�� �����ƶ��� �������δ���򲿷ֵ�����˵����ݡ� �����ڲ��whileѭ���У� in ������
	 * out ������ʼ�� �����ƶ��� ֱ��temp����С��in��ָ�� ������������Ѿ������������ƶ�Ϊֹ��
	 */
	public void insertSort() {
		int out, in;
		for (out = 1; out < nElems; out++) { // out is dividing line
			long temp = a[out]; // remove marked item
			in = out;
			while (in > 0 && a[in - 1] > temp) {
				a[in] = a[in - 1]; // shift item to right
				--in;
			}
			a[in] = temp;
		}

	}

}

/////////////////////////////////////////////////////
public class InsertSort {
	public static void main(String[] args) {
		int maxSize = 10000;
		ArrayInsert arr = new ArrayInsert(maxSize);
		for (int j = 0; j < maxSize; j++) {
			long n = (long) (java.lang.Math.random() * (maxSize - 1));
			arr.insert(n);
		}

		// arr.display();
		long start = System.currentTimeMillis();

		arr.insertSort();

		long end = System.currentTimeMillis();
		System.out.println("Time " + (end - start));
		// arr.display();

	}
}
