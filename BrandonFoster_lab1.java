/*************************************************************************
 *  Fishy cake
 *  Lab 1
 *  Name: Brandon Foster
 *  Compilation:  javac BrandonFoster_lab1.java
 *  Execution:    java BrandonFoster_lab1
 *  
 *  Various examples of IEEE 754 binary floating point calculations.
 *
 *  >> java Fp
 *
 *************************************************************************/

public class BrandonFoster_lab1 { 

    public static void main(String[] args) { 
        boolean b;
        double d, d1, d2, d3;
        float f;

        // Answer the questions below *by implementing them in code*, then
        // printing out a nicely formatted answer.
        // See Example below for sample format (yours doesn't have to be
        // exactly like that, but make your answer clear/readable)

        // Example (0.7+0.1!=0.8):
/*
        d1=0.7; d2=0.1;
        if(d1+d2 != 0.8){
          System.out.println("0.7 + 0.1 does not equal 0.8:");
          System.out.println("0.7 + 0.1 = " + (d1+d2));
        }
        else
          System.out.println("0.7 + 0.1 == 0.8");
*/
	
	//(1) Does 0.1 + 0.2 equal 0.3?
        //System.out.println("(1) Does 0.1 + 0.2 equal 0.3?");
	if(((0.1 + 0.2) == 0.3)){
		System.out.println("\t0.1 + 0.2 equals 0.3");
	}else{
		System.out.println("\t0.1 + 0.2 does not equal 0.3");
	}

	
        //(2) Does 0.1 + 0.3 equal 0.4?
	//System.out.println("(1) Does 0.1 + 0.2 equal 0.3?");
	if(((0.1 + 0.2) == 0.3)){
		System.out.println("\t0.1 + 0.2 equals 0.3");
	}else{
		System.out.println("\t0.1 + 0.2 does not equal 0.3");
	}

        //(3) Does 0.1 + 0.1 + 0.1 equal 0.3?
	//System.out.println("(3) Does 0.1 + 0.1 + 0.1 equal 0.3?");
	if((0.1 + 0.1 + 0.1) == 0.3){
		System.out.println("\t0.1 + 0.1 + 0.1 equals 0.3");
	}else{
		System.out.println("\t0.1 + 0.1 + 0.1 does not equal 0.3");
	}

        //(4) Does 0.1 + 0.1 + 0.1 + 0.1 + 0.1 equal 0.5?
	//System.out.println("(4) Does 0.1 + 0.1 + 0.1 + 0.1 + 0.1 equal 0.5?");
	if((0.1 + 0.1 + 0.1 + 0.1 + 0.1) == 0.5){
		System.out.println("\t0.1 + 0.1 + 0.1 + 0.1 + 0.1 equals 0.5");
	}else{
		System.out.println("\t0.1 + 0.1 + 0.1 + 0.1 + 0.1 does not equal 0.5");
	}

        //(5) Does 3 * 0.1 equal 0.3?
  	//System.out.println("(5) Does 3 * 0.1 equal 0.3?");
	if((3 * 0.1) == 0.3){
		System.out.println("\t3 * 0.1 equals 0.3");
	}else{
		System.out.println("\t3 * 0.1 does not equal 0.3");
	}

        //(6) Does 1138/1000.0 equal 0.001*1138?
	//System.out.println("(6) Does 1138/1000.0 equal 0.001*1138?");
	if((1138/1000.0) == (0.001 * 1138)){
		System.out.println("\t1138/1000.0 equals 0.001*1138");
	}else{
		System.out.println("\t1138/1000.0 does not equal 0.001*1138");
	}

        //(7) Does sqrt(x) * sqrt(x) not equal |x|?
	double x = 1.5;
	//System.out.println("(7) Does sqrt(x) * sqrt(x) not equal |x|?");
	if((Math.sqrt(x) * Math.sqrt(x)) != Math.abs(x)){
		System.out.println("\tsqrt(x) * sqrt(x) does not equal |x|");
	}else{
		System.out.println("\tsqrt(x) * sqrt(x) equals |x|");
	}

        //(8) Write code to see if floating point addition is associative.
        //    In other words: does ((d1 + d2) + d3) == (d1 + (d2 + d3))?
	//System.out.println("(8) Is floating point addition associative?");
	if(((0.3 + 0.2) + 0.1) == (0.3 + (0.2 + 0.1))){
		System.out.println("\tFloating point addition is associative.");
	}else {
		System.out.println("\tFloating point addition is not associative.");
	}
         
        //(9) Repeat (8) for multiplication:
	//System.out.println("(9) Is floating point multiplication associative?");
	if(((0.3 * 0.2) * 0.1) == (0.3 * (0.2 * 0.1))){
		System.out.println("\tFloating point multiplication is associative.");
	}else{
		System.out.println("\tFloating point multiplication is not associative.");
	}

        // (10) Demonstrate that cos(pi/2) doesn't exactly equal zero.
        // Hint: use Math.PI and Math.cos()
	//System.out.println("(10) Demonstrate that cos(pi/2) doesn't exactly equal zero.");
	System.out.println("\tcos(pi/2) = " + Math.cos(Math.PI / 2));



    }
}
