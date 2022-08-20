# FM_SOFTWARE_JAVA

### Q1
There are four rows. We declare the variables first, then we go through each row one by one. When a row's column value is less than "n-i," a space is printed in that row. Print "*" if the column value is smaller than 2i-1. Move to a new row after each row.
### Q2
 Make a new BufferedReader class object. Print user inputs after receiving them.
Make a new Scanner class object. Print user inputs after receiving them.

### Q3
Ask the user how many rows there are and take the input. We declare the variables first, then we go through each row one by one. When a row's column value is less than "n-i," a space is printed in that row. Print "*" if the column value is smaller than 2i-1. Move to a new row after each row.

### Q4
Request a string from the user. Make a character array out of it. Check for tiny or capital vowels as you go over each element in a loop; if you find any, increase the counter. Print the counter variable at the end.

### Q5
When sorting using the bubble method, we compare the current element to the next element, see whether it is greater, then compare the next element to its next element, and swap if the next element is smaller than the current element. In this manner, the greatest element is placed first in the last slot.

### Q6
Use a switch statement to perform the corresponding operation based on the user's input after taking the user's input. For several operations, there are defined cases. The operation is carried out in each instance, and the relevant output is shown.

### Q7
to ensure case sensitivity Declare a check variable and accept two String inputs from the user. Check for equality by using the "equalsTo()" method, and then put the result in the check variable. Display the appropriate message in accordance with the value of the check.
Take two String inputs from the user and declare a check variable to have no regard for case. Check for equality by using the "equalsIgnoreCase()" method, and then save the result in the check variable. Display the appropriate message in accordance with the value in the check.

### Q8
Take input from the user (num).
Store the input in a new variable (element).
Until num is not equal to zero, find the reminder of the num and store it in a variable (reverse).
Divide the num by ten and repeat step 3 using a while loop.
Check if the element is equal to reverse.
If it is equal,
Print it is palindrome
Else print it is not palindrome.

### Q9


### Q10
Request three Strings from the user. Compare Strings 1 and 2 first. If 1 is more than 2, compare it to 2 and 3, and if so, lap 1 is the fastest. If 3, however, 3 is greater than 2, lap 2 is the fastest. Compare 3 to 1 if 1 is not larger than 2 in that case. The quickest lap is the first if 3 is greater than 1, while the fastest lap is the third if 1 is greater than 3.

### Q11
The 2's complement of one number can be added to another to produce subtraction. Take two integer inputs, calculate the second number's complement, add it to the first, then publish the result.

### Q12
Similar to Q10, however in this case the least of two strings is found using the ternary operator, and the least value is then compared with each String and the associated lap is printed.

### Q13
Another method named checkFunction() conducts the verification and, depending on equality, returns 0 or 1 or 2. This method accepts two arguments that are Strings.

### Q14
Similar to Q5, but with a separate method called "bubbleSort()" that takes an array and the number of entries as parameters.

### Q15

### Q16
There are two classes created: "MIT" and "Student." 3 Objects are generated in the "MIT" class, and the methods in the "Student" class specify their name, registration number, and stream.

### Q17
Take the user's input as an integer array, store the relevant characters in a separate character array, then display the character array as a string.
Use the "toCharArray()" method to turn a user-supplied String into a character array, then store the characters' corresponding ASCII values in a different integer array before printing the character array.
Both getting ASCII values from characters and getting characters from ASCII values are done via typecasting.

### Q18_Primality_Test
Take a number as input.
Check if there is a divisor of the number in the range of [two, number] because two is the smallest prime number.
There is no number that can be completely divided by more than half of the number itself. We need to loop through two to the number itself divided by two (number/2).
If any divisor is found, then the number is not prime; otherwise, the given number is prime.

### Q18_Regex
Create an IP address regular expression, then check to see if the pattern matches the user's input using the matches() method. If it does, the output message will be printed.

### Q18 Java Big Integer
BigInteger class is used for the mathematical operation which involves very big integer calculations that are outside the limit of all available primitive data types.
Make two Strings into objects of the BigInteger class to transform them into Big Integers. Two more BigIntegers, "add" and "mul," to be created and initialised to contain the addition and multiplication values, respectively. Use the BigInteger class's add() and multiply() methods to add and multiply, then report the results.

### Q18 Java Big Decimal
We duplicate the largest index and store it in a new BigDecimal (initially assumed to be 0th index). The next step is to compare this bigdecimal to the subsequent array values. Update both the huge index's value and the number itself if we discover a larger number. The elements of the current and huge string in the string array s are then switched. The sorted array is then printed.

### Q18 Java Anagram
We can rearrange the characters of each string by sorting their characters, which will produce two normalized arrays of characters.

If two strings are anagrams, their normalized forms should be the same.

In Java, we can first convert the two strings into char[] arrays. Then we can sort these two arrays and check for equality

### Q18 Valid username Regular Expression
The regular expression is written in the class UsernameValidator. The first word may start with a capital or tiny letter [a-zA-Z]. Any letter, a number, or underscore [a-zA-Z0-9_] could come after the initial characters. The length ranges from 8 to 30 characters, making 7,29.

### Q18 Pattern Syntax Checker
we can use regex to find pattern in syntax and with  using well defined syntax we can use the Pattern.compile() method and if we catch an exception we set the flag to 1. If the flag is 1 then it is an invalid string and if it remains 0 then it is a valid string. 

### Q18 Substring Comparison
Using String.compareTo() :
It compares and returns the following values as follows:
if (string1 > string2) it returns a positive value.
if both the strings are equal lexicographically
i.e.(string1 == string2) it returns 0.
if (string1 < string2) it returns a negative value.








