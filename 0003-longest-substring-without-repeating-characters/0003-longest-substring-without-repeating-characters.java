class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0, si = 0;
        for(int ei = 0; ei < s.length(); ei++){
            char ch = s.charAt(ei);
            if(map.containsKey(ch)){
               si = Math.max(si, map.get(ch)+1);
            }
            res = Math.max(res, ei-si+1);
            map.put(ch, ei);
        }

        return res;
    }
}