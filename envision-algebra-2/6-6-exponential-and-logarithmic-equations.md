---
title: 6.6 Exponential and Logarithmic Equations
layout: notes
course: Algebra 2 and Trig
---

- Use logarithms to express the solutions to exponential models.
- Solve exponential and logarithmic equations.

## Assignment

- All **vocabulary** copied into notes
  - exponential equation, logarithmic equation
- p338 10–19, 24–46 ([pdf](./pdf/alg2-practice-0606.pdf))
  - Answers to [odd questions](../misc/alg2-odd-answers.pdf) / [even questions](../misc/alg2-even-answers.pdf)

## Additional Resources

- [Additional practice worksheet](./pdf/alg2-add-practice-0606.pdf)

---

I strongly recommend you work through all the examples in the text. This section is heavy on using things you've already learned in new ways.

## Solving Exponential Equations Using a Common Base

$$\begin{align}
\left(\frac{1}{2}\right)^{x+7}&=4^{3x}
\end{align}$$

One way to approach equations with exponents is to get them in the same base. We can do that here since ${\frac{1}{2}=2^{-1}}$ and ${4=2^2}$.

$$\begin{align}
\left(\frac{1}{2}\right)^{x+7}&=4^{3x} \\
\left(2^{-1}\right)^{x+7} &= \left(2^2\right)^{3x} \\
2^{-x-7} &= 2^{6x} \\
-x-7 &= 6x \\
x &= -1
\end{align}$$

## Solving Exponential Equations Using Logarithms

$$\begin{align}
3^{x+1} &= 5^x
\end{align}$$

If you can't get the bases to match up, for whatever reason, you can always use logarithms instead. This allows you to use logarithm properties to get your variable out of the power.

The base of the logarithm doesn't matter much, just be consistent. The book's version of this example uses the common logarithm, so I'll use the natural one here.

$$\begin{align}
3^{x+1} &= 5^x \\
\ln 3^{x+1} &= \ln 5^x \\
(x+1)\ln 3 &= x\ln 5 \\
x\ln 3 + \ln 3 &= x\ln 5 \\
x\ln 3 - x\ln 5 &= -\ln 3 \\
x\left(\ln 3 - \ln 5\right) &= -\ln 3 \\
x &= \frac{-\ln 3}{\ln 3 - \ln 5}
\end{align}$$

## Solve Logarithmic Equations

$$\begin{align}
\ln(x^2-16) &= \ln(6x)
\end{align}$$

This are pretty straightforward, but since you can't find the logarithm of a negative you need to watch for extraneous solutions.

$$\begin{align}
\ln(x^2-16) &= \ln(6x) \\
x^2 - 16 &= 6x \\
x^2 - 6x - 16 &= 0 \\
(x-8)(x+2) &= 0 \\
x &= \{-2, 8\}
\end{align}$$

Plugging back in reveals the problem. With $x=8$ we get $\ln48$, which is OK, but $x=-2$ yields $\ln(-12)$. So our only solution is $x=8$.
