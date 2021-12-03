import java.util.ArrayList;

class q1 {
    public static ArrayList<Integer> prime(int n) {
        ArrayList<Integer> primeNum = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++){
            primeNum.add(i);
        }
        //System.out.println(primeNum);
        int removed = 0;
        int p = primeNum.get(0);
        while(p<=n){
            for(int i = primeNum.size()-1; i >= 0; i--){
                if(primeNum.get(i)%p==0 && primeNum.get(i)!=p){
                   primeNum.remove(i); 
                   removed++;
                }
                
            }
            for(int i : primeNum){
                if(i > p){
                    p = i;
                    break;
                }
            }
            if(removed == 0) break;
            removed = 0;
        }
        return primeNum;
    }
    
    public static void main (String[] args) {
        System.out.println(prime(100));
    }

}
