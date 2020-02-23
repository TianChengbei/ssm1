package com.tian.leetcode;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_58 {
    public static void main(String[] args) {
        Solution_58 solution_58 = new Solution_58();
        int hello_worlds = solution_58.lengthOfLastWord("hello worlds");
        System.out.println(hello_worlds);
    }

    public int lengthOfLastWord(String s) {
        String[] strs = s.trim().split(" ");
        return strs[strs.length-1].length();
    }

    // hello word00
    public int lengthOfLastWord_2(String s) {
        int end = s.length() - 1;
        while (end>=0 && s.charAt(end) == ' ') end--;
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') start--;
        return end -start;
    }

}
