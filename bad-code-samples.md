## sample 1

### nie wywołujemy konstruktora klasy bazowej Object
### nie stosujemy pól, które później nie są wykorzystywane
### dyskusyjne wykorzystanie this.address

```
public class Message {

    String address;
    String timestamp;
    String type;
    
    public Message() {
        super();
    }
    
    public String getAdress() {
        return this.address;
    }
}
```

## sample 2

### za dużo rozgałęzień - utrudniony rozwój i wprowadzanie nowych funkcji
### utrudnione testy

``` 
// ...
} else if(room == 10){
    System.out.print("You are in the north ce");
    if(hasKey){
        System.out.println("There is nothing");
    } else {
        System.out.println("There is somethin");
    }
} else if(room == 11){
    System.out.println("The door to the first");
} else if(room == 12){
    System.out.println("You are in the middle");
    if(rat1Health > 0)
        System.out.println("A gigantic rat st");
    else
        System.out.println("There isn't anyth");
} else if(room == 13){
    System.out.println("You find yourself at");
} else if(room == 14){
    System.out.println("You are in a giant ro");
} else if(room == 15){
    System.out.print("You are in a hidden cor");
    if(!hasGem){
        System.out.println("In its mouth is t");
    } else {
        System.out.println("Its mouth, where");
    }
} else if(room == 16){
    System.out.print("You are in a side room");
  // ... 
  ```

## sample 3

### nie połykamy wyjątków

```catch( Exception e ) {}```

## sample 4

### niepotrzebna logika

```
public static boolean isNull(int value) {
    Integer integer = new Integer(value);

    if(integer == null) {
        return true;
    } else {
        return false;
    }
}
```

## sample 5

### metoda logicznie poprawna, ale nie daje nam zysku w postaci mniejszej ilości kodu lub większej czytelności

```
/**
* ...
* ...
* ...
*/
boolean isNotNull( Object o ) {
  return o != null;
}
```

## sample 6

```
/**
 * Klasa ta generuje liczby pierwsze do określonego przez użytkownika
 * maksimum. Użytym algorytmem jest sito Eratostenesa.
 * <p>
 * Eratostenes z Cyrene, urodzony 276 p.n.e. w Cyrene, Libia --
 * zmarł 194 p.n.e. w Aleksandrii. Pierwszy człowiek, który obliczył
 * obwód Ziemi. Znany również z prac nad kalendarzem
 * z latami przestępnymi i prowadzenia biblioteki w Aleksandrii.
 * <p>
 * Algorytm jest dosyć prosty. Mamy tablicę liczb całkowitych
 * zaczynających się od 2. Wykreślamy wszystkie wielokrotności 2. Szukamy
 K O M E N T A R Z E 9 3
 * następnej niewykreślonej liczby i wykreślamy wszystkie jej wielokrotności.
 * Powtarzamy działania do momentu osiągnięcia pierwiastka kwadratowego z maksymalnej wartości.
 *
 * @author Alphonse
 * @version 13 Feb 2002 atp
 */
public class PrimesGeneratorRaw {

    /**
     * @param maxValue jest limitem generacji.
     */
    public static int[] generatePrimes(int maxValue)
    {
        if (maxValue >= 2) // Jedyny prawidłowy przypadek.
        {
            // Deklaracje.
            int s = maxValue + 1; // Rozmiar tablicy.
            boolean[] f = new boolean[s];
            int i;
            // Inicjalizacja tablicy wartościami true.
            for (i = 0; i < s; i++)
                f[i] = true;
            // Usuwanie znanych liczb niebędących pierwszymi.
            f[0] = f[1] = false;
            // Sito.
            int j;
            for (i = 2; i < Math.sqrt(s) + 1; i++)
            {
                if (f[i]) // Jeżeli i nie jest wykreślone, wykreślamy jego wielokrotności.
                {
                    for (j = 2 * i; j < s; j += i)
                        f[j] = false; // Wielokrotności nie są pierwsze.
                }
            }
            // Ile mamy liczb pierwszych?
            int count = 0;
            for (i = 0; i < s; i++)
            {
                if (f[i])
                    count++; // Licznik trafień.
            }
            int[] primes = new int[count];
            // Przeniesienie liczb pierwszych do wyniku.
            for (i = 0, j = 0; i < s; i++)
            {
                if (f[i]) // Jeżeli pierwsza.
                    primes[j++] = i;
            }
            return primes; // Zwracamy liczby pierwsze.
        }
        else // maxValue < 2
            return new int[0]; // Zwracamy pustą tablicę, jeżeli niewłaściwe dane wejściowe.
    }
}
```

### refactored

```
/**
 * Klasa ta generuje liczby pierwsze do określonego przez użytkownika
 * maksimum. Użytym algorytmem jest sito Eratostenesa.
 * Mamy tablicę liczb całkowitych zaczynających się od 2.
 * Wyszukujemy pierwszą nieokreśloną liczbę i wykreślamy wszystkie jej
 * wielokrotności. Powtarzamy, aż nie będzie więcej wielokrotności w tablicy.
 */
public class PrimesGeneratorRefactored {

    private static boolean[] crossedOut;
    private static int[] result;

    public static int[] generatePrimes(int maxValue)
    {
        if (maxValue < 2)
            return new int[0];
        else
        {
            uncrossIntegersUpTo(maxValue);
            crossOutMultiples();
            putUncrossedIntegersIntoResult();
            return result;
        }
    }
    private static void uncrossIntegersUpTo(int maxValue)
    {
        crossedOut = new boolean[maxValue + 1];
        for (int i = 2; i < crossedOut.length; i++)
            crossedOut[i] = false;
    }
    private static void crossOutMultiples()
    {
        int limit = determineIterationLimit();
        for (int i = 2; i <= limit; i++)
            if (notCrossed(i))
                crossOutMultiplesOf(i);
    }
    private static int determineIterationLimit()
    {
// Każda wielokrotność w tablicy ma podzielnik będący liczbą pierwszą
// mniejszą lub równą pierwiastkowi kwadratowemu wielkości tablicy,
// więc nie musimy wykreślać wielokrotności większych od tego pierwiastka.
        double iterationLimit = Math.sqrt(crossedOut.length);
        return (int) iterationLimit;
    }
    private static void crossOutMultiplesOf(int i)
    {
        for (int multiple = 2*i;
             multiple < crossedOut.length;
             multiple += i)
            crossedOut[multiple] = true;
    }
    private static boolean notCrossed(int i)
    {
        return crossedOut[i] == false;
    }
    private static void putUncrossedIntegersIntoResult()
    {
        result = new int[numberOfUncrossedIntegers()];
        for (int j = 0, i = 2; i < crossedOut.length; i++)
            if (notCrossed(i))
                result[j++] = i;
    }
    private static int numberOfUncrossedIntegers()
    {
        int count = 0;
        for (int i = 2; i < crossedOut.length; i++)
            if (notCrossed(i))
                count++;
        return count;
    }
}
```
