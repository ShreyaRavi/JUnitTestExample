

public class ArrayCount {

	int[] arr;
	
	public ArrayCount(int ...x) {
		arr = x;
	}
	
	public int arrayLength() {
		return arr.length;
	}
	
	public Class<?> arrayType() {
		return Integer.TYPE;
	}
	
	public boolean setElement(int val, int index) {
		boolean checkBounds;
		if (checkBounds = isIndexInBounds(index, arr)) {
			arr[index] = val;
		}
		return checkBounds;
	}
	
	public int getElement(int index) {
		if (isIndexInBounds(index, arr)) {
			return arr[index];
		}
		return -1;
	}
	
	public static boolean isIndexInBounds(int index, int[] array) {
		if ((index < array.length) && (index >= 0)) {
			return true;
		}
		return false;
	}
	
}
