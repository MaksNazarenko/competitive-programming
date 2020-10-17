class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> mySet = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        
        for(int i = 0; i < s.length() - 9; i++) {
            String dna = s.substring(i, i + 10);
            if(mySet.contains(dna)) {
                repeated.add(dna);
            } else {
                mySet.add(dna);
            }
        }
        return new ArrayList(repeated);
    }
}