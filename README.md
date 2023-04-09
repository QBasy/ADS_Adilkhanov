# Assignemt_1 
### Made with :heart: by Sayat Adilkhanov


---


# Main 🚀

The Main class is created to call each class by using Scanner and methods (switch-case)

```java
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which Problem you wanna solve (1-10)");
        int n = scanner.nextInt();
        switch (n)
        {
            case 1 -> Problem1.main();
            case 2 -> Problem2.main();
            case 3 -> Problem3.main();
            case 4 -> Problem4.main();
            case 5 -> Problem5.main();
            case 6 -> Problem6.main();
            case 7 -> Problem7.main();
            case 8 -> Problem8.main();
            case 9 -> Problem9.main();
            case 10 -> Problem10.main();
        }
```      


---


# Problem:one:
**Description:** This function returns minimum value of the array by using recursive function

**1.** In fuction we have array ```arr``` and lenght ```n```

**2.** First condition ```n == 1``` if true returns first value of array

**3.** If ```n > 1``` function recursively calls itself with the array ```arr``` and the size of the array decremented by ```n - 1```, stores it into ```smallest```

**4** The function then checks if the last element of the array ```arr[n-1]``` is smaller than the current smallest value ```smallest```.

**4.1** If statement is true, it returns ```arr[n-1]```

**4.2** If statement is false, it returns ```smallest```

```java
    public static int findSmallestValueInArray(int[] arr, int n) 
    {
        if (n == 1) {
            return arr[0];
        }
        int smallest = findSmallestValueInArray(arr, n - 1);
        if (arr[n - 1] < smallest) {
            return arr[n - 1];
        } else {
            return smallest;
        }
    }
```


---


# Problem:two:




```java
    public static double getAverageOfArray(int[] arr, int n)
    {
        if (n == 0) {
            return 0;
        }
        else {
            return ((getAverageOfArray(arr, n-1) * (n-1)) + arr[n-1]) / n;
        }
    }
```  


---


# Problem:three:



```java
    public static String findPrimeNumber(int n, int i) {
        if (n <= 2) { 
            return "Prime";
        }
        else if (n % i == 0) { 
            return "Composite";
        }
        else if (i * i > n) { 
            return "Prime";
        }
        else { 
            return findPrimeNumber(n, i+1);
        }
    }
``` 


---


# Problem:four:


```java
    public static int getFactorial(int n) {
        if (n == 0) { 
            return 1;
        }
        else {
            return n * getFactorial(n-1);
        }
    }
``` 


---


# Problem:five:


```java
    public static int getFibonacci(int n)
    {
            if (n == 0 || n == 1)
        {
            return n;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
``` 


---


# Problem:six:


```java
    public static double getPower(double n, double a)
    {
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return a * getPower(a, n-1);
        }
    }
``` 


---


# Problem:seven:


```java
    public static double makeArrayReverse(int[] arr, int start, int end)
    {
        if (start >= end)
        {
            System.exit(0);
            return 0;
        } else
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp; 
            return makeArrayReverse(arr, start + 1, end - 1); 
        }
    }
``` 


---


# Problem:eight:


```java
    public static String isVariableContainsLetter(String a)
    {
        for (char c = 'a'; c <= 'z'; c++)
        {
            if (a.contains(String.valueOf(c)))
            {
                return "No";
            }

        }
        return "Yes";
    }
``` 


---


# Problem:nine:


```java
    public static int findBinomialCoefficient(int n, int k)
    {
        if (k == 0 || n == k)
        {
            return 1;
        }
        else {
            return findBinomialCoefficient(n-1, k-1) + findBinomialCoefficient(n-1, k);
        }
    }
``` 


---


# Problem:one::zero:


```java
    public static int findGCD(int a, int b)
    {
        if (b == 0)
        {
            return a;
        } else
        {
            return findGCD(b, a % b);
        }
    }
``` 
