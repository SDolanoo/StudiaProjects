package Lab_Podstawy_programowania;

class laby_dwa {
    public static void main(String[] args) {
        // 1. Napisz funkcję, która przyjmuje tablicę i liczbę do znalezienia,
        // a następnie zwraca indeks tej liczby w tablicy (lub -1, jeśli nie
        // znaleziono).
        int[] myArr = { 4, 2, 5, 1, 3 };
        int searchValue = 3;
        System.out.println(intToIndex(myArr, searchValue));
        // 2. Napisz funkcję, która przyjmuje zakres liczb i zwraca tablicę liczb
        // pierwszych w tym zakresie.
        isPrimeNumber(searchValue);
        // 3. Napisz funkcję, która przyjmuje tablicę i liczbę,
        // a następnie zlicza ile razy ta liczba występuje w tablicy.
        int[] myOtherArr = { 4, 3, 5, 1, 3 };
        int otherSearchValue = 3;
        howManyIntsInArr(myOtherArr, otherSearchValue);
        // 4.Napisz funkcję rekurencyjną, która oblicza sumę liczby całkowitej,
        // dodając do niej wszystkie liczby od 1 do tej liczby.
        int recurseValue = 4;
        int recTimes = 0;
        recursion(recurseValue, recTimes);
    }

    public static int intToIndex(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return (i);
            }
        }
        return -1;
    }

    public static void isPrimeNumber(int n) {
        int m = n / 2;
        int flag = 0;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println(n + " is a prime number");
        }
    }

    public static void howManyIntsInArr(int[] arr, int n) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                result += 1;
            }
        }
        System.out.println(n + " occurs " + result + " times.");
    }

    public static void recursion(int n, int recTimes) {
            if (recTimes < n) {
                recTimes += 1;
                System.out.println("Recursion recursed "+ recTimes + " times.");
                recursion(n, recTimes);
            } else if (recTimes == n) {
                System.out.println("End.");
            }
    }
}