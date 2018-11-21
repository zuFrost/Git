public class RaspTest {
    public static void main(String[] args) {
        int maxPrimesCount = 40000;
        int currentPrimesCount = 1;
        long prevTime, execTime;
        prevTime = System.currentTimeMillis();


        long[] primes = new long[maxPrimesCount];
        long currentNumber = 3;

        boolean isPrime = false;

        primes[0]=2;

        while (currentPrimesCount < maxPrimesCount) {
            isPrime = true;
            for (int i = 0; i < currentPrimesCount; i++) {
                if (currentNumber % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[currentPrimesCount] = currentNumber;
                currentPrimesCount++;
            }
            currentNumber++;
        }

        execTime = System.currentTimeMillis() - prevTime;
        System.out.println(execTime);
        System.out.print(currentNumber-1);


    }
}