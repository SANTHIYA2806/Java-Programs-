import java.util.*;
import java.math.*;
public class LongFactorial {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);

        BigInteger x,i,fac = new BigInteger("1");
        x = s.nextBigInteger();

        for(i=new BigInteger("1"); i.compareTo(x)<=0; i=i.add(BigInteger.ONE)){
            fac = fac.multiply((i));
        }
        System.out.println(fac);
    }
}
