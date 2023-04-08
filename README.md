# Sayat Adilkhanov's Assingment 1

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
```java
        int lowest = 0; // Initialize variable to hold the smallest value found
        for (int i = 0; i < n; i++) // This loop iterates through each element of the array
        {
            for (int j = i + 1; j < n; j++) // This loop iterates through all elements after the current element
            {
                if (arr[i] > arr[j]) // Compare the current element with each of the elements after it
                {
                    lowest = arr[i]; // Save the element as the smallest found so far
                    arr[i] = arr[j]; // Swap the element with the smaller
                    arr[j] = lowest; // Set the smaller element as the new current element
                }
            }
        }
```
# Problem:two:

# Problem:three:

# Problem:four:

# Problem:five:

# Problem:six:

# Problem:seven:

# Problem:eight:

# Problem:nine:

# Problem:one::zero:
