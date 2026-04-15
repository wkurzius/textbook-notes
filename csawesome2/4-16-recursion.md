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

The factorial version is built on the idea that $5!=5\cdot4!$, and $4! = 4 \cdot 3!$, and so on. At each point, we can break the problem down into a smaller version of the same problem. And since we can define factorial as

$${n! = n \cdot (n-1)!}$$

that is literally what we program into our code in line 3.

## Breaking the Pattern

We need the recursion to stop at some point, and that's where line 2 comes into play. This is referred to as the **base case**, which is the point where we stop repeating the method call. If this base case doesn't exist—or doesn't work for whatever reason—you end up with a infinite recursion and a **`StackOverflowError`**.

In Java, the stack is a list of the all the currently running methods, listed in their order of execution. The catch with recursion is that none of the methods actually finish (or close) until you hit that base case. The `return` statement on line 3 won't actually return anything until the `factorialRecursion(n-1)` completes and is multiplied by `n`. And that new one won't finish until the next one finishes, which also won't finish until the next one does, and you get the idea. The base case is needed to end this pattern.

A `StackOverflowError` occurs when the stack becomes too large and the program crashes. The limit is very high, tens of thousands of method calls, which is nothing you have to worry about as long your base case is working properly.

## Recursion Closing

The two examples below highlight this quirk of a method not finishing until it's actually done. If you run the two, the first will print out numbers from `1` to `n`, while the second will count down from `n` to `1`.

```java
public static void countUp(int n) {
    if (n > 1)
        countUp(n - 1);
    System.out.println(n);
}

public static void countDown(int n) {
    System.out.println(n);
    if (n > 1)
        countDown(n - 1);
}
```

I suggest tracing these two methods. They'll give you some insight into how recursion works.

## Coding Practice

Yeah, the AP exam is clear that you don't have to actually write any recursive code on the exam, but you learn best by doing. This is optional, but try out the [recursive exercises on CodingBat](https://codingbat.com/java/Recursion-1).
