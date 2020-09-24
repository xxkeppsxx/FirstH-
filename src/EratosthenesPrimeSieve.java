import java.util.ArrayList;

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

    public void algorithmforPrimes(){

    }
}

     





