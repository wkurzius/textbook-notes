---
title: 4.1 Antiderivatives and Indefinite Integration
layout: page
course: AP Calc
last-reviewed: 2026-01-29 18:16:26
prev-link: "./3-6-optimization-problems.html"
next-link: "./4-2-area.html"
---

- Write the general solution of a differential equation and use indefinite integral notation for antiderivatives.
- Use basic integration rules to find antiderivatives.
- Find a particular solution to a differential equation.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p287 2, 3, 9–11, 14, 17, 20, 23, 26, 29, 32, 35, 38, 39, 42, 44, 48 *52, 53, 57, 65, 67, 74–77*{: .ap-problems}

## Additional Resources

- AP Topics: 6.7, 6.8, 6.14, 7.1, 7.6, 7.7
- Khan Academy
  - [The fundamental theorem of calculus and definite integrals](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-7/v/connecting-the-first-and-second-fundamental-theorems-of-calculus){: target="_blank"}
  - [Finding antiderivatives and integrals: basic rules and notation: reverse power rule](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-8a/v/indefinite-integrals-of-x-raised-to-a-power){: target="_blank"}
  - [Finding antiderivatives and integrals: basic rules and notation: common indefinite integrals](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-8b/v/antiderivative-of-x-1){: target="_blank"}
  - [Finding antiderivatives and integrals: basic rules and notation: definite integrals](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-8c/v/reverse-power-rule-for-definite-integrals){: target="_blank"}
  - [Modeling situations with differential equations](https://www.khanacademy.org/math/ap-calculus-ab/ab-differential-equations-new/ab-7-1/v/differential-equation-introduction){: target="_blank"}
  - [Finding general solutions using separation of variables](https://www.khanacademy.org/math/ap-calculus-ab/ab-differential-equations-new/ab-7-6/v/separable-differential-equations-introduction){: target="_blank"}
  - [Finding particular solutions using initial conditions and separation of variables](https://www.khanacademy.org/math/ap-calculus-ab/ab-differential-equations-new/ab-7-7/v/finding-constant-of-integration-rational){: target="_blank"}

---

## Antiderivatives

We've dealt with derivatives for a while, but now we will start working backwards with antiderivatives. A function $F$ is an antiderivative of $f$ when $F'(x) = f(x)$.

> Just to clear the air, there is no proper notation for an antiderivative. The most common way to note it is with the function's uppercase version. So, the antiderivative of $f(x)$ is $F(x)$.

Also, note that in our definition, it says "*an* antiderivative" because there is never just one. The derivative of both $x^2$ and $x^2 + 3$ is $2x$, and so both are antiderivatives of $2x$. Generally, we refer to that constant as $C$, so if you wanted to talk about *the* antiderivative of $2x$, it would be $x^2+C$.

### Solving a Differential Equation

A differential equation is an equation that involves derivatives, and the first example in the book shows how to solve the differential equation $dy/dx = 2$. What you are being asked to solve, or find, is the function $y$ that would satisfy the equation. Perhaps more helpful, we want to solve for $y$ in this equation.

$$\begin{align}
\frac{d}{dx}[y] = 2
\end{align}$$

What function when derived, results in a $2$? In this case, our solution is $y = 2x + C$.

### The Integral Sign

For various reasons, the typical way differential equations are set up is in **differential form**, rather than what we saw above. So, the more common approach is $dy=2\,dx$. From there we can apply our new operation of **antidifferentiation**, which uses the integral symbol $\int$.

$$\begin{align}
\int dy = \int 2 \, dx
\end{align}$$

The one immediate benefit to using the differential setup is we can immediately see the **variable of integration**. So on the right side, we know whatever function we come up with should have an $x$ as its variable.

$$\begin{align}
\int 1\, dy &= \int 2 \, dx \\
          y &= 2x + C
\end{align}$$

Technically we should have a $C$ on the left side as well, but since it stands for any constant, we can just combine them on one side to make our lives easier.

## Basic Integration Rules

Just like when learning derivatives, there are a lot of rules that need to be digested. Luckily, these are all just the inverses of the derivative rules. Here's a [cheat sheet](../pdfs/integration-cheat-sheet.pdf) for reference, but remember that you do not get access to anything like this on the AP exam.

There are lots of examples in the book, all of which you should look through. I won't highlight any here since they are pretty straightforward.

## Initial Conditions and Particular Solutions

In the differential equation above, we found the **general solution** for a differential equation. This just means we didn't know the constant and just put a $C$ in its place. A **particular solution**, on the other hand, means that you also know some extra information that will allow you to determine the constant. This extra information is called the **initial condition**.

> ## Initial Condition Example
>
> Find the particular solution to $F'(x)=3x^2-1$ given the initial condition $F(2)=4$.
{: .example}

First, we need the general solution. Once we have that, we can use the initial condition to find the value of $C$.

$$\begin{align}
F'(x) &= 3x^2 - 1 \\
F(x)  &= \int 3x^2 -1 \, dx \\
   &= x^3 - x + C    && \text{General solution} \\[1em]
4  &= (2)^3 - 2 + C  && \text{Substitute initial condition} \\
-2 &= C \\[1em]
y  &= x^3 - x - 2    && \text{Particular solution}
\end{align}$$

■
{: .qed}
