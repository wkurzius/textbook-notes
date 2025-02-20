---
title: 1.5 Factoring Polynomials
---

{: .lesson-dates}
Lesson date: February 24, 2025.

- Factor the greatest common factor of a polynomial.
- Factor a trinomial.
- Factor by grouping.
- Factor a perfect square trinomial.
- Factor a difference of squares.
- Factor the sum and difference of cubes.
- Factor expressions using fractional or negative exponents.

## Assignment

- 1–3, 5–53 odd
- *Recommended*: all **vocabulary** and concept blocks copied into notes

---

## The GCF of a Polynomial

The greatest common factor is the largest factor of two or more terms. So, the numbers $12$ and $18$ have a GCF of $6$. This idea doesn't change once your terms start to have variables, but the process is a bit different.

If you have the terms $12x^2$ and $18x^3$, you want to find the largest factor of the two like before, but you can look at the coefficients and variables separately. We already know the GCF of $12$ and $18$ is $6$, but now we need the GCF of $x^2$ and $x^3$. This will always be the smallest exponent of the two, which in this case is $x^2$.

$$\begin{align}
\text{GCF}(12x^2,18x^3) = 6x^2
\end{align}$$

You can check these by dividing each term by the GCF. What you get should have no common factors. Here, we get $12x^2 / 6x^2 =2$ and $18x^3 / 6x^2 = 3x$. Since $2$ and $3x$ have no common factors, then $6x$ is indeed our GCF.

## Factoring a Trinomial with Leading Coefficient 1

There are other ways that polynomials can be factored. Trinomials, specifically, can sometimes be factored into two binomials. However, there is a pattern to look for before you can start factoring trinomials.

Let's start with multiplying two binomials. And we'll focus for now on ones with only an $x$.

$$\begin{align}
(x+a)(x+b) &= x^2 + ax + bx + ab \\
           &= x^2 + x(a + b) + ab
\end{align}$$

What that means is that if you multiply two binomials in the form of $x$ plus some number, the result has the sum of the two numbers as the $x$ term and the product of the two as the constant.

$$\begin{align}
(x+2)(x+3) &= x^2 + 2x + 3x + 6 \\
           &= x^2 + 5x + 6
\end{align}$$

Our two numbers, $2$ and $3$, add up to make $5x$ and multiply to $6$. So, if we want to work backwards, we need to determine what two numbers add up to the coefficient of the $x$ term and multiply to produce the constant.

$$\begin{align}
x^2 + 10x + 16
\end{align}$$

We need two numbers that add up to $10$ and multiply to $16$. It's usually easiest to start with the multiplication, then see which pair of factors work for the addition. In this case the pair of numbers is $2$ and $8$, which means our trinomial factors to be

$$\begin{align}
x^2 + 10x + 16 = (x + 2)(x + 8)
\end{align}$$

You should also look at negative factors for the multiplication. Here is the same trinomial, but with $-10x$ instead. Now we need factors that add up to $-10$, which would be $-2$ and $-8$ since both of those still multiply to a positive $16$.

$$\begin{align}
x^2 - 10x + 16 = (x - 2) (x - 8)
\end{align}$$

In this one, our constant is negative, so we'll need a pair of factors where one of them is negative. The pair still need to add up for the middle term.

$$\begin{align}
x^2 + 4x - 12 = (x+6)(x-2)
\end{align}$$

## Factoring by Grouping

All of the trinomials above had a leading coefficient of $1$. For trinomials with a leading coefficient other than $1$, we'll have to take some extra steps.

$$\begin{align}
5x^2 + 7x  - 6
\end{align}$$

The first new step is to multiply both our constant and leading coefficient first, which here gives us $-30$. Now we want factors of $-30$ that add up to $7$.
