package com.tian.interview;

/**
 * @author tianchengbei
 * @since 2019-12-10
 */
public class Daxi {

    public static void main(String[] args) {
        int[][] param = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merge = merge(param);
        System.out.println(merge);


        System.out.println("------------");
        System.out.println(valid("apple","a3e"));
                 //                     i************iz****n
    }



    /**
     * 第一题
     * @param intervals
     * @return
     */
    public static int[][] merge(int[][] intervals) {
        int[][] resu = new int[intervals.length][2];
        int z = 0;
        for (int i = 0; i < intervals.length; i++) {
            int a = intervals[i][0];
            int b = intervals[i][intervals[i].length - 1];
            if (z == 0) {
                resu[z][0] = a;
                resu[z][1] = b;
                z++;
            } else {
                int ll = resu[z - 1][0];
                int lr = resu[z - 1][1];
                if (a >= ll && a <= lr) {
                    //有交叉
                    resu[z - 1][1] = b;
                } else {
                    //没有交叉
                    resu[z][0] = a;
                    resu[z][1] = b;
                    z++;
                }
            }

        }
        return resu;
    }

    /**
     * 第二题
     * s = “internationalization"，abbr = "i12iz4n"
     *
     * @param word
     * @param abbr
     * @return
     */
    public static boolean valid(String word, String abbr) {
        String newStr = "";
        for (int i = 0; i < abbr.length(); i++) {
            char c = abbr.charAt(i);
            boolean isABC = (c >= 'a' && c <= 'z');
            //如果是是字符
            if (isABC) {
                newStr = newStr + c;
                continue;
            }
            //数字
            String num = "";
            while (!(c >= 'a' && c <= 'z') && i < abbr.length()) {
                num += c;
                i++;
                if(i>=abbr.length()) break;
                c = abbr.charAt(i);
            }
            int intnum = Integer.valueOf(num);
            for(int j=0;j<intnum;j++) newStr+="*";
            i = i-1;
        }
        System.out.println(newStr);
        if(word.length() == newStr.length()){
            for(int i=0;i<word.length();i++){
                if(word.charAt(i) == newStr.charAt(i) || newStr.charAt(i) == '*'){
                    continue;
                }else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}