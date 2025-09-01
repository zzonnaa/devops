public class Fact{
  public static long compute(long n){
    if(n<0) throw new IllegalArgumentException("Negative numbers not allowed");
    int re= 1;
    for(int i=2;i<=n;i++){
      re*=i;
    }
    return re;
  }
  public static void main(String[] args){
    long n=5;
    System.out.println("Factorial of"+n+"is: "+compute(n));
  }
}
