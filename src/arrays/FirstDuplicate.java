package arrays;

/**
 * @author 作者:杨林波 email:CQyanglinbo@gmail.com
 * @version 创建时间:2018年7月23日上午10:19:21
 *
 **/
public class FirstDuplicate {
	int firstDuplicate(int[] a) {
		int[] iterated = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			if (a[i] == iterated[a[i]]) {
				return a[i];
			} else {
				iterated[a[i]] = a[i];
			}
		}
		return -1;
	}
}
