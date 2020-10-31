import java.util.*;
import java.lang.Math.*;

public class Boo {


  // I have a couple methods below, but the really important ones are booMethod(no input) and binary2boo(integer input here);
  // I haven't rigorously run tests with them besides the couple of checks with online converters.
  // This was a fun short thing to code.
  public static void main(String[] args){
    System.out.println("Boo!");

    int n = 33;

    for (int i = largest2(n); i >= 0; i--){
    System.out.print(binSub(n)[i]);
    }
    System.out.println();
    for (int i = largest2(n); i >= 0; i--){
    System.out.print(binary2boo(n)[i]);
    }

  }


  // Finds the largest power of 2 factor with the given number.
  private static int largest2(double n){
    return (int)Math.floor(Math.log(n)/Math.log(2));
  }

  // Decimal to Binary Converter Method.
  private static int[] binSub(int D){

    //This is the largest 2 power.
    int pow2val = largest2(D);
    int[] binaryRep = new int[pow2val+1];
    int Dcurr = D;

    while (pow2val >= 0){

      if (Math.pow(2,pow2val) <= Dcurr){
        Dcurr = Dcurr - (int)Math.pow(2,pow2val);
        binaryRep[pow2val] = 1;
      } else {
        binaryRep[pow2val] = 0;
      }
        pow2val = pow2val - 1;
    }

    return binaryRep;
  }

  private static String[] binary2boo(int D){

    int[] binaryRep = binSub(D);
    String[] booRep = new String[binaryRep.length];

    for (int i = binaryRep.length-1; i >= 0; i--){

      if (binaryRep[i] == 1){
        booRep[i] = "b";
      } else if (i < binaryRep.length-2 && booRep[i+1] == "o" && booRep[i+2] == "b") {
        booRep[i] = "o!";
      } else {
        booRep[i] = "o";
      }

    }
    return booRep;
  }


  private static void booMethod(){
    System.out.println("scary");
  }

}
