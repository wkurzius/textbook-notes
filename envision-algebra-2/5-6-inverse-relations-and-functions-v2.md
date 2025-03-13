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

## Inverse Relations

A word that we don't see much any more is **relation**, which is the umbrella term for any set of ordered pairs. I create the inverse of a relation, or just an **inverse relation**, take the ordered pairs and reverse them.

$$\begin{align}
(x,y) \quad\rightarrow\quad (y,x)
\end{align}$$

If the relation can be represented by an equation, then the inverse would be the same equation with the variables swapped.

$$\begin{align}
y = 2x + 3 \quad\rightarrow\quad x = 2y + 3
\end{align}$$

With some graphing utilities, like Desmos, the inverse relation above can be graphed without a problem. Others though, like a TI-84, require that the equation be written in terms of $x$.

$$\begin{align}
x = 2y + 3 \quad\rightarrow\quad y = \frac{x-3}{2}
\end{align}$$

Here are all three equations—the original and both inverses—[graphed on Desmos](https://www.desmos.com/calculator/nrv5zzf0wt). You'll see that the inverses are a reflection of the original over the line ${y=x}$, the line that contains all the points where the $x$ and $y$ values are equal. This reflection is a quick way to check if two relations *aren't* inverses of each other, but shouldn't be used to prove that they are.

## Inverse Functions

Functions are a specific type of relation, one were each input maps to exactly one output. You might remember the Vertical Line Test, where if there's any place on a curve that you can draw a vertical line through more than one point, then it's not a function.

An **inverse function** has to follow the same rules, but sometimes the original function has to be tweaked in order for it to have a proper inverse. The function $f(x)=x^2$ is one of those cases. When graphed, it forms a parabola which fails the **Horizontal Line Test**. This works the same way as it's vertical counterpart, except this tests if a function has a proper inverse.

So, $f(x)=x^2$ fails the test and doesn't have a proper inverse, but we can still create one if we modify the domain so there are no repeated $y$ values. With parabolas, this means starting at the vertex and 