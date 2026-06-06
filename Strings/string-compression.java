class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;
        while (read < chars.length) {
            char c = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == c) {
                read++;
                count++;
            }
            chars[write++] = c;
            if (count > 1) {
                String cnt = String.valueOf(count);
                for (int i = 0; i < cnt.length(); i++) {
                    chars[write++] = cnt.charAt(i);
                }
            }
        }
        return write;
    }
}