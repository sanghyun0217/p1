
import java.util.Arrays;

/**
 * implement  DS_My DataStructureADT and 
 * does not have any public or package level fields, methods, or inner classes
 * @author sanghyun lee
 **/

public class DS_My implements DataStructureADT {

	// TODO may wish to 
	// 

	/**
	 * such a class and its members should be "private,"
	 * define an inner class,for storing key and value as a pair
	 * 
	 **/

	private class Pair {
		private Comparable key;
		private Object value;

		private Pair(Comparable k, Object v) {
			this.key = k; 
			this.value = v; // initialize value 
		}
	}

	private Pair[] array; //  initialize Array
	private int size; // initialize size
	
	/**
	   * constructor of DS_My.
	   * 	   
	   * */
	
	public DS_My() {
		this.array = new Pair[600]; //
		this.size = 0;
	}

	/**
	   * insert method could check array is null or already exist if there is not null and not exist
	   * add new element in array.
	   * 	   
	   * @param comparable k
	   * @param object v
	   * */
	@Override
	public void insert(Comparable k, Object v) {
		if (k == null) { // check if k equal null throw exception.
			throw new IllegalArgumentException();

		}
		for (int i = 0; i < this.size; i++) { // check if array[i] equal to k, throw exception. 
			if (array[i].key.equals(k)) {
				throw new RuntimeException();
			}
		}
		Pair a = new Pair(k, v); 
		array[this.size] = a;
		this.size++; // next array
		//System.out.println(size);

	}
	/**
	   * remove method could check array is null and remove array elements until size 0.
	   * 	   
	   * @param comparable k
	   * */
	@Override
	public boolean remove(Comparable k) {
		if (k == null) {
			throw new IllegalArgumentException();
		}

		for (int i = 0; i < this.size; i++) {
			if (array[i].key.equals(k)) {
				size--;
			//	System.out.println(size);
				for (int j = i; j < array.length-1; j++) { 
					array[j] = array[j + 1];
				}
				return true;

			}
		}

		return false;
	}
	/**
	   * contain method check array element
	   * 	   
	   * @param comparable k
	   * @return true if array element exsit in array else false. 
	   * */
	@Override
	public boolean contains(Comparable k) {
		for (int i = 0; i < this.size; i++) {
			if (array[i].key.equals(k)) {
				return true;
			}

		}
		return false;
	}
	/**
	   * get method could check array is null or not and if array element equal object k 
	   * return array[i].value
	   * 	   
	   * @param comparable k
	   * */
	@Override
	public Object get(Comparable k) {
		if (k == null) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < this.size; i++) {
			if (array[i].key.equals(k)) {
				return array[i].value;
			}
		}
		return null;
	}

	/**
	 * return this size
	 * 
	 * @return this.size
	 */
	@Override
	public int size() {

		return this.size;	
	}

}
