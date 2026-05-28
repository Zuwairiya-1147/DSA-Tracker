class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        ArrayList<Integer> a = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
            a.add(e.getValue());
        }
        return a;
    }
}