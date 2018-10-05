import java.math.BigInteger;

public class Factorial {

    private BigInteger factorial; // Value from which reversed factorial needs to be calculated

    private int reversedFactorial; // Calculated value

    /**
     * Constructor of the class
     * @param factorial BigInteger value
     */
    public Factorial (BigInteger factorial)
    {
        if(factorial.compareTo(BigInteger.ONE) < 1)  throw new Error("Factorial can not be calculated from number less than 1.");
        this.factorial = factorial;
    }

    /**
     * Getter of the reversedFactorial variable
     */
    public int getReverseFactorial()
    {
        this.setReverseFactorial();
        return this.reversedFactorial;
    }

    /**
     * Setter of the reversedFactorial variable
     */
    private void setReverseFactorial()
    {
        BigInteger del = this.factorial;
        int i = 1;
        while (del.compareTo(BigInteger.ONE) == 1){
            i++;
            del = del.divide(BigInteger.valueOf(i));
        }
        this.reversedFactorial = i >= 1 ? i : 0;
    }
}
