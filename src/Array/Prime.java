package Array;

public class Prime {
	public static boolean isPrime(int num) {
	    if (num <= 1) return false;

	    for (int i = 2; i <= Math.sqrt(num); i++) {
	        if (num % i == 0) return false;
	    }
	    return true;
	    
	}
	

public static void printPrimes(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (isPrime(arr[i])) {
            System.out.println(arr[i]);
        }
    }
}
	public static void main(String[] args) {

	    int[] arr = {10, 3, 5, 8, 11, 15, 17};
	    System.out.println(arr);

}
}



/*public class PrimeArray {

// Method to check if number is prime
public static boolean isPrime(int num) {
    if (num <= 1)
        return false;

    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0)
            return false;
    }
    return true;
}

// Method to create and return array of primes
public static int[] getPrimes(int[] arr) {

    // First count how many primes
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (isPrime(arr[i])) {
            count++;
        }
    }

    // Create array of correct size
    int[] primes = new int[count];

    int j = 0;
    for (int i = 0; i < arr.length; i++) {
        if (isPrime(arr[i])) {
            System.out.println(arr[i]);   // print prime
            primes[j] = arr[i];          // store prime
            j++;
        }
    }

    return primes;
}

public static void main(String[] args) {

    int[] arr = {10, 3, 5, 8, 11, 15, 17};

    int[] primeArray = getPrimes(arr);

    // Just to verify returned array
    System.out.println("Stored Prime Numbers:");
    for (int i = 0; i < primeArray.length; i++) {
        System.out.print(primeArray[i] + " ");
    }
}
}*/



/*public class PrintPrimes {

// Method to check if a number is prime
public static boolean isPrime(int num) {
    if (num <= 1)
        return false;

    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0)
            return false;
    }
    return true;
}

// Method to print primes from an array
public static void printPrimes(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (isPrime(arr[i])) {
            System.out.println(arr[i]);
        }
    }
}

public static void main(String[] args) {
    int[] arr = {10, 3, 5, 8, 11, 15, 17};

    printPrimes(arr);  // call method
}
}*/