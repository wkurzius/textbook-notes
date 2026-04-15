---
title: 4.16 Recursion
layout: page
course: AP CSA
prev-link: ./4-15-sorting-algorithms.html
next-link: ./4-17-recursive-searching-and-sorting.html
---

- Determine the result of calling recursive methods

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.16 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-16-recursion.html){: target="_blank"}
- [4.58 Code Practice for Recursion](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/recursionCodePractice.html){: target="_blank"}

---

Recursion is when a method calls itself.

```java
public static void recursed() {
    System.out.println("Recursed!");
    recursed();
}
```

It's a form of repetition that is desirable, and sometimes necessary, for some problems. For the moment, we'll look at problems that work with either looping for recursion.

Below is a loop that calculates the factorial of a number.

```java
public static int factorialLoop(int n) {
    int product = 1;

    for (int i = 2; i <= n; i++)
        product *= i;

    return product;
}
```

Now, here is the recursive version.

```java
public static int factorialRecursion(int n) {
    if (n == 1) return 1;
    return n * factorialRecursion(n-1);
}
```

The factorial version is built on the fact that $5!=5\cdot4!$, and $4! = 4 *3!$, and so on. At each point, we can break the problem down into a smaller version of the same problem. And since we can define factorial as ${n! = n \cdot (n-1)!}$, that is literally what we program into our code in line 3.

But we still need this loop to stop at some point, and that's where line 2 comes into play. This is referred to as the **base case**, which is the point where we stop repeating the method call. If this base case doesn't exist—or doesn't work for whatever reason—you end up with a infinite recursion and a **`StackOverflowError`**.

In Java, the stack is a list of the all the currently running methods, listed in their order of execution. The catch with recursion is that none of the methods actually finish (or close) until you hit that base case. The `return` statement on line 3 won't actually return anything until the `factorialRecursion(n-1)` completes. And that new one won't finish until the next one finishes, which also won't finish until the next one does, and you get the idea. The base case is needed to end this repetition.

So, a `StackOverflowError` occurs when the base case doesn't halt the process and the stack becomes too large and the program crashes. The stack limit is somewhere in the 10000s, but it depends on the methods in the stack.

```java
public static void countUp(int n) {
    if (n > 1) countUp(n - 1);
    System.out.println(n);
}

public static void countDown(int n) {
    System.out.println(n);
    if (n > 1) countDown(n - 1);
}
```