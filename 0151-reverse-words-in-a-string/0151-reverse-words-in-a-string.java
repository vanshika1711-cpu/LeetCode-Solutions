class Solution {
    public String reverseWords(String s) {

        int len = s.length() - 1;
        StringBuilder ans = new StringBuilder();

        int i = len;

        while (i >= 0) {

            // spaces skip karo
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            // i = current word ka end
            int j = i;

            // j ko word ke start se pehle tak le jao
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            // word append karo
            if (ans.length() > 0) {
                ans.append(" ");
            }

            ans.append(s.substring(j + 1, i + 1));

            // next word ki taraf jao
            i = j - 1;
        }

        return ans.toString();
    }
}