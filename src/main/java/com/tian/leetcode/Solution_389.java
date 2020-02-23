package com.tian.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * <p>
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * <p>
 * 请找出在 t 中被添加的字母。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 输入：
 * s = "abccd"
 * t = "abcccd"
 * <p>
 * 输出：
 * e
 * <p>
 * 解释：
 * 'e' 是那个被添加的字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_389 {

    public char findTheDifference(String s, String t) {
        int[] abc = new int['z' - 'a' + 1];
        for (int i = 0; i < s.length(); i++) {
            abc[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (abc[t.charAt(i) - 'a'] == 0) {
                return t.charAt(i);
            } else {
                abc[t.charAt(i) - 'a']--;
            }
        }
        return 'a';
    }

    public char findTheDifference_2(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i)) || map.get(t.charAt(i))== 0) {
                return t.charAt(i);
            } else{
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }
        }
        return 'a';
    }

}
