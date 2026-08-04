class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        Map<Character, Character> key = new HashMap<>();
        key.put(')', '(');
        key.put(']', '[');
        key.put('}', '{');

        for(char c: s.toCharArray()){
            if(key.containsKey(c)){
                if(stack.isEmpty()){
                    return false;
                }

                char i = stack.pop();

                if(i != key.get(c)){
                    return false;
                }
            }
            else{
                stack.addFirst(c);                
            }
        }

        return stack.isEmpty();
    }
}
