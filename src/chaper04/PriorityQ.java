package chaper04;
/**
 * 优先级队列 :升序优先级队列
 * 应用： 在抢占式多任务操作系统中，程序排在优先级队列中，这样优先级最高的程序就会先得到时间片
 * 并得以执行。
 * 特点： 可以快速访问最小关键值得数据项，还应该实现相当快的插入数据项。通常使用堆来实现
 * 排序数组：  最小值 放在数组的最后。
 */
public class PriorityQ {
	private  int maxSize;
	private long[]  queArray;
	private int nItems;
	
	public PriorityQ(int s) {
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}
	
	public void insert(long item){
		int j;
		if(nItems == 0)
			queArray[nItems++] = item;
		else {  //从 数组最后 移动，大于则交换
			for(j = nItems -1; j>=0; j--){
				if(item > queArray[j]){
					queArray[j+1] = queArray[j];
				} else 
					break;
			}
			queArray[j+1] = item;
			nItems++;
		}
	}
	
	public long remove(){
		return queArray[--nItems];
	}
	
	public long peekMin(){
		return queArray[nItems-1];
	}
	
	public boolean isEmpty(){
		return (nItems == 0);
	}
	
	public boolean isFull(){
		return (nItems == maxSize);
	}
	
	public static void main(String[] args) {
		PriorityQ thePQ = new PriorityQ(5);
		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);
		
		
		while( !thePQ.isEmpty()){
			long item = thePQ.remove();
			System.out.print(item + " ");
		}
		System.out.println("");
	}
}
