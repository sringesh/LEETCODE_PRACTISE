class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for(String word : banned){
            bannedSet.add(word.toLowerCase());
        }
        Map<String,Integer> freq = new HashMap<>();
        String[] newpara = paragraph.toLowerCase().split("[^a-z]+");
        for(String word : newpara){
            if(!bannedSet.contains(word)){
            freq.put(word,freq.getOrDefault(word,0)+1);
            }
        }

        String answer = "";
        Integer maxcount = 0;
        for(String word : freq.keySet()){
            if(freq.get(word)>maxcount){
                maxcount = freq.get(word);
                answer = word;
            }
        }
        return answer;
    }
}