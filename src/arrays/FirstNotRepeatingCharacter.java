package arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author 作者:杨林波 email:CQyanglinbo@gmail.com
 * @version 创建时间:2018年7月23日上午10:28:11 找出数组中第一个没有重复的字符，如果都重复了则返回‘_’,要求只迭代一次数组
 **/

public class FirstNotRepeatingCharacter {
	/**
	 * indexof()方法从前往后遍历，lastindexof()从后往前遍历
	 * 
	 * @param s
	 * @return
	 */
	char firstNotRepeatingCharacter(String s) {
		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (s.indexOf(array[i]) != s.lastIndexOf(array[i])) {
				continue;
			} else {
				return array[i];
			}
		}
		return '_';
	}

	/**
	 * 第二种方法用链表，但是遍历了两次
	 * 
	 * @param s
	 * @return
	 */
	char firstNotRepeatingCharacter2(String s) {
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i)).intValue() + 1);
			else
				map.put(s.charAt(i), 1);
		}
		for (Character key : map.keySet()) {
			if (map.get(key) == 1)
				return key;
		}
		return '_';
	}
}
