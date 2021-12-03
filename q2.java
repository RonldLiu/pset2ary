import java.util.ArrayList;

class q2 {
    public static void GC(int n) {
        ArrayList<Integer> primeNum;
        primeNum = q1.prime(n);
        for(int i: primeNum){
            if(primeNum.contains(n-i)){
                System.out.println(n + "=" + i + "+" + (n-i));
                break;
            }
        }
    }
    
    public static void main (String[] args) {
        GC(50);
    }

}
