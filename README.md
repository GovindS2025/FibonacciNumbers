🔢 Fibonacci Numbers – Definition
Fibonacci numbers form a sequence where each number is the sum of the two preceding ones, starting from 0 and 1.

✅ Fibonacci Sequence:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

Example:
Let's say n = 7:

bash
i = 0: a = 0, b = 1 → print 0, sum = 0 + 1 = 1 → update a = 1, b = 1
i = 1: a = 1, b = 1 → print 1, sum = 1 + 1 = 2 → update a = 1, b = 2
i = 2: a = 1, b = 2 → print 1, sum = 1 + 2 = 3 → update a = 2, b = 3
i = 3: a = 2, b = 3 → print 2, sum = 2 + 3 = 5 → update a = 3, b = 5
i = 4: a = 3, b = 5 → print 3, sum = 3 + 5 = 8 → update a = 5, b = 8
i = 5: a = 5, b = 8 → print 5, sum = 5 + 8 = 13 → update a = 8, b = 13
i = 6: a = 8, b = 13 → print 8, sum = 8 + 13 = 21 → update a = 13, b = 21

and so on...

What's Different in Java 17?
var keyword: In Java 17, you're free to use var for local variables (such as sc, n, a, b, etc.). The Java compiler infers the type based on the assigned value, so you don't need to explicitly declare the type (e.g., int, Scanner).

var sc = new Scanner(System.in); is valid in Java 17.

var n = sc.nextInt(); is also valid.

var a = 0; and var b = 1; are valid for integers.

Where to place code: The main() method is still necessary. Code can't run outside of a method (like inside the class body). So, all the logic (variable declarations, loops, input handling, etc.) must be inside the main() method or another method.

Key Notes:
var works in local variables only, not at the class level or instance level. For instance, you cannot use var to declare instance variables in the class body.

var in Java 17 helps to make your code more concise and avoids redundancy. It’s a nice way to infer types without explicitly writing them.
