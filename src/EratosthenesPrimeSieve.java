import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class EratosthenesPrimeSieve implements PrimeSieve {
    int obergrenze;

    public EratosthenesPrimeSieve(int pObergrenze) {
        this.obergrenze = pObergrenze;
    }

    @Override
    public boolean isPrime(int p) {
        boolean isItPrime = true;

        if (p <= 1) {
            isItPrime = false;

            return isItPrime;
        } else {
            for (int i = 2; i <= p / 2; i++) {
                if ((p % i) == 0) {
                    isItPrime = false;

                    break;
                }

            }
        }
        return isItPrime;
    }


    @Override
    public void printPrimes() {
        for (int i = 2; i <= obergrenze; i++) {

            boolean isPrimzahl = true;

            for (int j = 2; j < i && isPrimzahl; j++) {

                if ((i % j) == 0) {
                    isPrimzahl = false;
                }
            }

            if (isPrimzahl) {
                System.out.println(i + " ist eine Primzahl!");
            }
        }
    }

    public void algorithmforPrimes() {
        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> nature = new ArrayList<>();
        for (int i = 2; i <= obergrenze; i++) {
            if (isPrime(i)) {
                primes.add(i);
            } else if(!isPrime(i)) {
                nature.add(i);

            }

        }
        for (int i: nature){

            for(int j: primes){
                for(int k:primes){
                    if((k + j) == i){
                        System.out.println(i + " summe" + ":" + i + "=" + j +"+" + k);

                    }

                }

            }

        }


    }
}







