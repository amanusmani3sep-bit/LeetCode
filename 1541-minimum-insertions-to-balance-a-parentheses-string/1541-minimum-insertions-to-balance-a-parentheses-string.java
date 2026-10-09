class Solution {
    public int minInsertions(String s) {
        int bal = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                if (bal % 2 != 0) {
                    bal--;
                    count++;
                }

                bal += 2;
            } 
            else {
                bal--;

                if (bal < 0) {
                    count++;
                    bal = 1;
                }
            }
        }

        return count + bal;
    }
}