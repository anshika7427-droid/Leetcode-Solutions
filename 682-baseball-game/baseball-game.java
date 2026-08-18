class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> lst = new ArrayList<>();
        
        for(int i = 0 ; i < operations.length ; i++){
            if(operations[i].equals("C")){
                lst.remove(lst.size()-1);
            }else if(operations[i].equals("D")){
                lst.add(lst.get(lst.size() - 1) * 2);
            }else if(operations[i].equals("+")){
                int n = lst.size() - 1;
                lst.add(lst.get(n)+lst.get(n-1));
            }else{
                int n = Integer.parseInt(operations[i]);
                lst.add(n);
            }
        }
        int sum = 0;
        for(int num : lst){
            sum = sum + num;
        }
        return sum;
    }
}