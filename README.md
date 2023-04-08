# :neutral_face: Sayat Adilkhanov's Assingment 1

# Main 🚀

The Main class is created to call each class by using Scanner and methods (switch-case)

```java
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which Problem you wanna solve (1-9)");
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

# Problem:one:

This code finds the minimum element of the array using a loop 
```java
        int lowest = 0; 
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] > arr[j])
                {
                    lowest = arr[i];
                    arr[i] = arr[j]; 
                    arr[j] = lowest; 
                }
            }
        }
```
# Problem:two:

This code finds the Average of all the elements of the array with summing them using the for loop and divides them by the lenght of the array itself

1.It summing every value of array to avg ```avg = avg +j; ```

2.And then dividing it to array lenght ``` avg = avg/n; ```

3.After all it returns the final value ```return avg;```
```java
        double avg = 0; 
        for (int j : arr) 
            {
                avg = avg + j;
            }
        avg = avg/n; 
        return avg; 
```            
# Problem:three:

This code tries to figure out whether the input number is prime or composite by using the cycle

1.In loop we enter integer ```i = 2``` with condition ```i <= n``` , to 

```java
        String a = "Prime";
        for (int i = 2; i <= n / 2; ++i) 
        {
            if (n % i == 0)
            {
                a = "Composite";
                break;
            }
        }
        return a;
``` 
# Problem:four:


```java
        int avg = 1;
        for (int j = 1; j <= n; j++)
        {
            avg = avg * j;
        }
        return avg;
``` 
# Problem:five:


```java
        if (n == 0 || n == 1)
        {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
``` 
# Problem:six:


```java
        return pow(a,n);
``` 
# Problem:seven:


```java
        if (start >= end) 
        {
            System.exit(0); 
            return 0;
        } else
        {
            int temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp;
            return ArrayReverse(arr, start + 1, end - 1);
        }
``` 
# Problem:eight:


```java
        for (char c = 'a'; c <= 'z'; c++) 
        {
            if (a.contains(String.valueOf(c)))
            {
                return "No";
            }

        }
        return "Yes";
``` 
# Problem:nine:


```java
        if (k == 0 || n == k)
        {
            return 1;
        }
        else {
            return FindBinomialCoefficient(n-1, k-1) + FindBinomialCoefficient(n-1, k);
        }
``` 
# Problem:one::zero:


```java
        if (a == b) 
            return a; 
        if (a == 1 || b == 1) 
            return 1;
        if (a == 0 || b == 0)
            return 0;
        int c = Math.min(a, b);
        while(a % b != 0)
        {
            c = a % b;
            a = b;
            b = c;
        }
        return c;
``` 
