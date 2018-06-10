package concurrent.interrupt;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
/** 素数生成器
*   20180610
 *  zhangshijun
**/
public class PrimeGenerator implements Runnable{

    private final List<BigInteger> primes = new ArrayList<BigInteger>();

    //停止线程运行借助volatile来修饰的变量cancelled来处理。
    private volatile boolean cancelled;

    @Override
    public void run() {
        BigInteger p = BigInteger.ONE;
        while(!cancelled){
            p = p.nextProbablePrime();
            synchronized (this){
                primes.add(p);
            }
        }
    }

    public void cancel(){
        cancelled = false;
    }

    public synchronized List<BigInteger> get(){
        return new ArrayList<>(primes);
    }

}
