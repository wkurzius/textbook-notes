---
title: 5.5 Function Operations
layout: notes
course: Algebra 2 and Trig
---

- Combine functions by addition, subtraction, multiplication, or division and identify the domain of the result.
- Compose functions, specifying the order in which the functions are applied and describing the domain of the composite function.

## Assignment

- All vocabulary copied into notes
- p279 ~~12–19,~~ 21–36 ([pdf](./pdf/alg2-practice-0505.pdf))
  - Answers to [odd questions](../misc/alg2-odd-answers.pdf) / [even questions](../misc/alg2-even-answers.pdf)

---

## Performing Basic Operations on Functions

Functions, like any other value or variable, can have operations performed on them.

$$\begin{align}
f(x) &= 3x+4 &\text{and} && g(x)&=x^2-3x+2
\end{align}$$

$$\begin{align}
(f+g)(x) &= (3x+4) + (x^2-3x+2) \\
(f-g)(x) &= (3x+4) - (x^2-3x+2) \\
(f\cdot g)(x) &= (3x+4)(x^2-3x+2) \\
\left(\frac{f}{g}\right)(x) &= \frac{3x+4}{x^2-3x+2} \\
\end{align}$$

What you need to watch out for is restrictions on the domain. Any restrictions in either of the original function carry over to the new one. Also, any issues with the new function's domain need to be identified.

For the example above, $f$ and $g$ don't have any restrictions on their domain, and the results of any addition, subtraction, or multiplication don't introduce any, either. With division, however, a little factoring show that $x\neq\left\\{1,2\right\\}$.

## Function Composition

Your basic operations work with functions, but there is an other operation that is made available to us because of how functions work. Sticking with the same $f$ and $g$ as before, here is function composition.

$$\begin{align}
f(g(x)) &= 3(x^2-3x+2)+4 \\
g(f(x)) &= (3x+4)^2-3(3x+4)+2
\end{align}$$

Or alternatively

$$\begin{align}
(f\circ g)(x) &= 3(x^2-3x+2)+4 \\
(g\circ f)(x) &= (3x+4)^2-3(3x+4)+2
\end{align}$$

What's happening here is that one function is being plugged into the other.