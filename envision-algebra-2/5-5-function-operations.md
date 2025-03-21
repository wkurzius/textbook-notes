---
title: 5.5 Function Operations
layout: notes
course: Algebra 2 and Trig
---

- Combine functions by addition, subtraction, multiplication, or division and identify the domain of the result.
- Compose functions, specifying the order in which the functions are applied and describing the domain of the composite function.

## Assignment

- All **vocabulary** copied into notes
  - composite function, composition of functions
- p279 ~~12–19,~~ 21–36 ([pdf](./pdf/alg2-practice-0505.pdf))
  - Answers to [odd questions](../misc/alg2-odd-answers.pdf) / [even questions](../misc/alg2-even-answers.pdf)

## Additional Resources

- [Additional practice worksheet](./pdf/alg2-add-practice-0505.pdf)

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

Your basic operations work with functions, but there is an other operation that is made available to us because of how functions work. Let's set it up by reviewing function notation.

$$\begin{align}
f(x) &= 3x+4 \\
f(2) &= 3(2)+4 \\
f(-8) &= 3(-8)+4 \\
f(a) &= 3a + 4
\end{align}$$

Whatever value $x$ is assigned, even if another variable, that will be substituted in for $x$ in the function. We can extend that idea to substitute in other functions.

$$\begin{align}
f(g(x)) &= 3(x^2-3x+2)+4 \\
g(f(x)) &= (3x+4)^2-3(3x+4)+2
\end{align}$$

Or with the alternative notation.

$$\begin{align}
(f\circ g)(x) &= 3(x^2-3x+2)+4 \\
(g\circ f)(x) &= (3x+4)^2-3(3x+4)+2
\end{align}$$

Determining the domain is slightly different with composition. The inner function's domain needs to be accounted for, along with the final composition. What does not need to be accounted for the outer function alone.

To put it another way, if we have $f(g(x))$, we care about the domain of $g(x)$ and $f(g(x))$. We don't need to worry about the domain of $f(x)$.
