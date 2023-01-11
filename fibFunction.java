//https://leetcode.com/problems/fibonacci-number/description/
public int fib(int n) {
  // Another solution - brute force
  // int Fn = n==2 ?  1 : n;
  // int oneBeforeN = 1;
  // int twoBeforeN = 1;
  // for(int i=2; i<n; i++) { // 0 1 1 2 4
  //   Fn = oneBeforeN + twoBeforeN;
  //   twoBeforeN = oneBeforeN;
  //   oneBeforeN = Fn;
  // }
  // return Fn; 
  if(n<=1){
    return n;
  }
  Hashtable<Integer, Integer> fibMap = new Hashtable<Integer, Integer>();
  fibMap.put(0, 0);
  fibMap.put(1, 1);
  return fib(n, fibMap);
}

public int fib(int n, Hashtable<Integer, Integer> fibMap){
  if(!fibMap.containsKey(n)){
    int currentFib = fib(n-1, fibMap) + fib(n-2, fibMap);
    fibMap.put(n, currentFib);
  }
  return fibMap.get(n);
}
