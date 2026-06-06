class Solution {
    public boolean isValid(String s) {
        Stack<Character> valid = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                valid.push(s.charAt(i));
            else {
                if (valid.isEmpty())
                    return false;
                char top = valid.pop();
                if (s.charAt(i) == ')' && top == '(' || s.charAt(i) == ']' && top == '['
                        || s.charAt(i) == '}' && top == '{')
                    continue;
                else
                    return false;
            }
        }
        return valid.isEmpty();
    }
}