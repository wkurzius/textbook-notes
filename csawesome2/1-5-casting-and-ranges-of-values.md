---
title:  1.5 Casting and Ranges Of Values
layout: page
course: AP CSA
prev-link: "./1-4-assignment-and-input.html"
next-link: "./1-6-compound-assignment-operators.html"
---

- Develop code to cast primitive values to different primitive types in arithmetic expressions and determine the value that is produced as a result
- Describe conditions when an integer expression evaluates to a value out of range

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.5 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-5-casting.html){: target="_blank"}

---

## Casting

The word "cast" has a lot of meanings, but in this case we're using the one that means shape or mould. We previously saw that trying to store a `double` in an `int` results in a compiler error for losing precision. To get around that, you can cast the value, or change its type.

```java
int i = (int) 2.7;
```

Of course, you'll lose the the decimal portion of the number.

Going the other way, doesn't result in a loss, but instead the value is **widened**, meaning it's allowed more precision. We've seen how adding `.0` to an integer widens the calculation as `double` is kind of infectious, but this isn't possible when working with variables. Instead, cast something to a double to make sure you don't lose your decimals.

```java
int num = 5;
int den = 2;

double quotient =  num / den;               // result is 2.0
double quotient = (double) (num / den);     // still 2.0
double quotient = (double) num / den;       // perfection
```

## Rounding

Our first bit of official problem solving. How do you round a double to the nearest integer when the only tool you have is rounding down? I'll put the code for how to do this below, and see if you can figure out why is works, and then maybe when it wouldn't work.

```java
int nearestInt = (int)(number + 0.5);
```

If the decimal value is below `0.5` you should round down, and adding `0.5` won't change that since it's not enough to make it over the next integer. Anything greater than or equal `0.5` should be rounded up, and adding `0.5` will push it over the next one.

Where this won't work is with negative numbers. Rounding up implies the next largest number, not the most positive number. To fix this, you need a version for negative numbers that subtracts `0.5`.

## Range of Values

### `int`

A **bit**, which is short for a binary digit (0 or 1), is the smallest unit of storage in a computer. A **byte** (get it?) is made up of 8 bits, at least as far as we are concerned. Reality is often messier.

An `int` is alloted 32 bits, or 4 bytes, of data when declared. One of those bits is reserved for the sign of the number, leaving 31 for the value itself. This means your integers have to fall between about $\pm2^{31}$. I say "about" because again, reality is messy. You can see the actual values using the `Integer.MAX_VALUE` and `Integer.MIN_VALUE`. You end up getting one more negative because zero gets lumped in with the positives.

```java
System.out.println(Integer.MAX_VALUE);  //  2,147,483,647
System.out.println(Integer.MIN_VALUE);  // -2,147,483,648
```

> If you're curious about some of the inner workings, [this post on Stack Overflow](https://stackoverflow.com/a/6853536){: target="_blank"} is a good place to start.

Now, you can add to these values without error, or at least an error in the traditional sense. Instead, you'll get a **logic error**, where the program behaves unexpectedly. What really happened is that the computer did exactly what you told it to do, you just told it to do something wrong. Adding beyond the max value of integer results in an overflow, and you end up in the negatives.

```java
System.out.println(Integer.MAX_VALUE + 1);  // Outputs -2147483648
```

### `double`

Not technically an AP topic, but since we're talking about the limits of `int`, might as well do `double`, too. You get 8 bytes of memory with a `double`, or 64 bits. You can also see their limits in a similar fashion, though they don't behave the same way.

```java
System.out.println(Double.MAX_VALUE);       // outputs 1.7976931348623157E308
System.out.println(Double.MIN_VALUE);       // outputs 4.9E-324
System.out.println(Double.MAX_VALUE+1);     // outputs 1.7976931348623157E308
System.out.println(Double.MAX_VALUE*10);    // outputs Infinity
System.out.println(Double.MIN_VALUE/10);    // outputs 0.0
```

That top number translates to $1.7976931348623157\times10^{308}$. Which seems impressive, but if you look at line 3, adding one doesn't really do anything. In fact—and I'm going to jump the gun a bit here—the two values are equal as far as Java is concerned. The double equals `==` below is your traditional equals sign from algebra.

```java
System.out.println(Double.MAX_VALUE+1 == Double.MAX_VALUE);     // outputs true
```

Your limited to about 15 decimal places of precision. So, while you can store ridiculously large (or long) numbers, you can only access their first 15 digits.

As for `Double.MIN_VALUE`, notice it's not negative. Instead, the limits are the smallest and largest numbers that can be represented.

And overflow doesn't happen with doubles, instead it just spits out `Infinity`. On the smaller end, `0.0`.
