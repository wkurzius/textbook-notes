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

### Fractional or Negative Exponents

The same rule for dealing with variables and exponents applies even if you have negative or fractional exponents. Determine which is the smallest exponent and factor that one out.

$$\begin{align}
2x^\frac{1}{4} + 5x^\frac{3}{4} = x^\frac{1}{4}\left(2+5^\frac{1}{2}\right)
\end{align}$$

$$\begin{align}
3x(x+2)^{-\frac{1}{3}}+4(x+2)^\frac{2}{3} &= (x+2)^{-\frac{1}{3}}(3x + 4(x+2)) \\
&= (x+2)^{-\frac{1}{3}}(7x + 8)
\end{align}$$

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

All of the trinomials above had a leading coefficient of $1$. For trinomials with any other coefficient, we'll have to take some extra steps.

$$\begin{align}
5x^2 + 7x  - 6
\end{align}$$

The first new step is to multiply both our constant and leading coefficient, which in this case gives us $-30$. Now we want factors of $-30$ that add up to $7$, and we'll use those to split up our middle term. The factors that work for this polynomial are $-3$ and $10$.

$$\begin{align}
5x^2 + 7x  - 6\\
=5x^2 -3x + 10x  - 6
\end{align}$$

Now, we are going to factor out the GCF from the *just the first two terms*. And then we'll do the same for the only the last two terms.

$$\begin{align}
5x^2 -3x + 10x  - 6 \\
= x(5x-3) + 2(5x-3)
\end{align}$$

What is left in the two sets of parentheses should match *exactly*. We now have two terms that share a factor, meaning we can factor it out like we would anything else.

$$\begin{align}
x(5x-3) + 2(5x-3) \label{prefactor} \\
= (5x-3)(x+2) \label{postfactor}
\end{align}$$

To help you understand that last step, pretend the expression in \ref{prefactor} is $xu + 2u$. Both terms have a $u$ in common, so we can factor it as $u(x+2)$. The same thing happened in \ref{postfactor}, except instead of $u$ we have $(5x-3)$.

And that's it. I suggest checking your work and expanding what you cam up with to make sure it matches the original trinomial.

$$\begin{align}
5x^2 + 7x  - 6 = (5x-3)(x+2)
\end{align}$$

## Factoring Special Forms

These are extensions of the special forms from last section. Like those, these are shortcuts that will save you time once you pick up on the pattern, but are not required to know by heart.

### Factoring Perfect Square Trinomials

A perfect square trinomial comes from squaring a binomial.

$$\begin{align}
(a+b)^2 = a^2 + 2ab + b^2
\end{align}$$

If you are able to recognize that your trinomial is in that form, you can skip quickly to the end. Otherwise, you can factor as normal and you'll still arrive at the same pair of binomials.

To spot these, look for perfect squares in your first and last term. If you take their square roots, multiply and then double them, you should get the middle term. In the one below, the square roots are $5x$ and $2$. Those do multiply and double to be $20x$, so we can take advantage of the shortcut.

$$\begin{align}
25x^2 + 20x + 4 = (5x+2)^2
\end{align}$$

### Factoring Difference of Squares

This shortcut is probably worth knowing since it tends to come up a lot. If you see two terms being subtracted, you can factor it using the square roots of each. One binomial will be addition and the other subtraction.

$$\begin{align}
a^2 - b^2 &= (a+b)(a-b) \\
9x^2 - 25 &= (3x+5)(3x-5)
\end{align}$$

It's worth pointing out that for both perfect square trinomials and difference of squares, there's no rule that says you need perfect squares for them to work. You'll just run into problems with perfect squares more often than without.

## Factoring Sum and Difference of Cubes

SOAP. Remember the acronym SOAP. **S**um **O**pposite **A**lways **P**ositive. These dictate your signs when factoring either the sum or difference of cubes.

> ### Sum and Difference of Cubes
>
> When factoring the sum or difference of cubes, your signs follow the SOAP acronym: same, opposite, always positive.
>
> $$\begin{align}
> a^3+b^3 &= (a+b)(a^2-ab+b^2) \\
> a^3-b^3 &= (a-b)(a^2+ab+b^2)
> \end{align}$$
{: .definition}

This is a rule that requires memorization as we have not covered other ways to factor these types of polynomials.
