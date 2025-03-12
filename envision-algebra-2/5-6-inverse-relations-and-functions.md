---
title: 5.6 Inverse Relations and Functions
layout: notes
course: Algebra 2 and Trig
---

- Use tables, graphs, and equations to represent the inverse of a relation.
- Write an equation for the inverse of a function by restricting the domain.
- Verify that one function is the inverse of another, using composition.

## Assignment

- All vocabulary copied into notes
- p288 ~~9–20,~~ 23–38 ([pdf](./pdf/alg2-practice-0506.pdf))
  - Answers to [odd questions](../misc/alg2-odd-answers.pdf) / [even questions](../misc/alg2-even-answers.pdf)

---

## Relations and Functions

A word that we don't see much any more is **relation**, which is the umbrella term for any set of ordered pairs. Functions, which are a specific type of relation, tend to be the focus after they are introduced. An **inverse relation** is where the ordered pairs are reversed, so something like $(2,5)$ becomes $(5,2)$.

With functions specifically, if its inverse also qualifies as a function, then it is an **inverse function**. They are often denoted by $f^{-1}$. To find an inverse function, switch the variables and rearrange. So, if $f(x) = 2x + 3$ then

$$\begin{align}
        x &= 2y + 3 \\
        y &= \frac{x-3}{2} \\
f^{-1}(x) &= \frac{x-3}{2}
\end{align}$$

And you can verify that the two are inverses of each other by using function composition. If they are inverses, then $f(g(x)) = x$ and also $g(f(x)) = x$. Checking one is enough to prove inversality (not a real word).

$$\begin{align}
f(g(x)) &= 2\left(\frac{x-3}{2}\right) + 3 \\
        &= x - 3 + 3 \\
f(g(x)) &= x
\end{align}$$

You can think of inverse functions as undoing the original, which is why you are left with just $x$ after the composition.

Also worth noting is that when graphed, the inverse is a reflection of the original over the line $y=x$, which is where the ordered pairs equal each other.

You can see our pair graphed on Desmos [here](https://www.desmos.com/calculator/fv9rgwo6fa).

## Domain and Range

Everything above is the simple version, whereas reality is more complicated. When you invert a function, it's domain and range are swapped and any restrictions go along with it. The function $x^2$ does not have an inverse function, as its [actual inverse is not a function](https://www.desmos.com/calculator/tiygqoykan).

So, a function has to be one-to-one in order for it to have an inverse, meaning each $x$ value maps to exactly one $y$ value (which is the definition of a function), but also each $y$ value matches to exactly one $x$ value. You can use the Horizontal Line Test to see if a function has an inverse. It works exactly like the Vertical Line Test, except horizontal.