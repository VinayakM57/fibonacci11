public class fibonacci11{
public static void  generatefibonacci(int n){
    int first =0 , second=1;
    System.out.println("Fibonacci series"+first+","+second);
    for(int i=2; i<n; i++){
        int next = first + second;
        System.out.println(","+next);
        first = second;
        second = next;
    }
    System.out.println();
}
public static void main(String[] args) {
    int n=10;
    generatefibonacci(n);
}
}
