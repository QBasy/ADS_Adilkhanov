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

This code finds the Average of all the elements of the array with summing them using the for loop and divides them by the size of the array itself
```java
        double avg = 0; // Initialize a variable average
        for (int j : arr) // Creating loop to summarize every value of array to our average
            {
                avg = avg + j; // Here is the summarizing
            }
            avg = avg/n; // Dividing our average to array size
            return avg; // Returning completed average
```            
# Problem:three:


```java
``` 
# Problem:four:


```java
``` 
# Problem:five:


```java
``` 
# Problem:six:


```java
``` 
# Problem:seven:


```java
``` 
# Problem:eight:


```java
``` 
# Problem:nine:


```java
``` 
# Problem:one::zero:


```java
``` 
