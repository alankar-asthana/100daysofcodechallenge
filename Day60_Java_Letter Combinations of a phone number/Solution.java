class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        backtrack("", digits, 0, result, map);
        return result;
    }

    private void backtrack(String combination, String digits, int index, List<String> result, Map<Character, String> map) {
        if (index == digits.length()) {
            result.add(combination);
            return;
        }

        String letters = map.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            backtrack(combination + letters.charAt(i), digits, index + 1, result, map);
        }
    }
}
