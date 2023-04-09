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

**Explanation:**

**1.** In fuction we have array ```arr``` and lenght ```n```

**2.** First condition ```n == 1``` if true returns first value of array

**3.** If ```n > 1``` function recursively calls itself with the array ```arr``` and the size of the array decremented by ```n - 1```, stores it into ```smallest```

**4.** The function then checks if the last element of the array ```arr[n-1]``` is smaller than the current smallest value ```smallest```.

**4.1.** If statement is true, it returns ```arr[n-1]```

**4.2.** If statement is false, it returns ```smallest```

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

**Description:** This function getting the average of each value of the array.

**Explanation:**

**1.** Function have array named ```arr``` and lenght of array named ```n```

**2.** If ```n == 0``` this function will end with value 0.

**3.** If ```n > 0``` function recursively calls itself with the array ```arr``` and ```n-1```.

**3.1.** It multiplies the previous average value ```getAverageOfArray(arr, n-1)``` by the number of elements in the array ```n-1``` and adds the value of the current element in the array ```arr[n-1]```

**3.2.** Result is then divided by ```n``` to get the new average value.

**4.** In the end it returns the average


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

**Description:** This function decides whether a number is Prime or Composite.

**Explanation:**

**1.** In function we have the user input ```n``` and value ```i = 2```.

**2.** To work this function have 3 conditions.

**2.1.** First Condition checks is ```n <= 2```, if statement true function will ends with value ```return "Prime";```.

**2.2.** Second Condition checks is ```n % i == 0```, if statement true function will ends with value ```return "Composite";```.

**2.3.** Third Condition checks is ```i * i > n```, if statement true function will ends with value ```return "Prime";```.

**3.** If all statements are false function recursively calls itself with values ```n, i+1``` and getting back to the first condition.

---

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

**Description:** This function finding factorial of given value.

**Explanation:**

**1.** Function have only user input ```n```.

**2.** In first of all function checking is ```n == 0```, if statement true function returns with value ```return 1;``` 

**3.** If ```n > 0 ``` function recursively calls itself with ```n-1```, for getting factorial it multiplies to ```n```.

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

**Description:** This function getting fibonacci of given value.

**Explanation:**

**1.** In function we have user input ```n```

**2.** Function checks is ```n == 0``` or ```n == 1```, if statement is true function will return the given value ```n```

**3.** If ```n > 1``` function recursively calls itself with ```n-1``` and ```n-2```, and adds both to find fibonacci solution.

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
**Description:** 

**Explanation:**

**1.** 

**2.** 

**3.**

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

**Description:** 

**Explanation:**

**1.** 

**2.** 

**3.**

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

**Description:** 

**Explanation:**

**1.** 

**2.** 

**3.**

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

**Description:** 

**Explanation:**

**1.** 

**2.** 

**3.**

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

**Description:** 

**Explanation:**

**1.** 

**2.** 

**3.**

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
