---
title: 5.4 Solving Radical Equations
layout: notes
course: Algebra 2 and Trig
---

{: .lesson-dates}
Lesson date: March 3, 2025.

- Solve radical equations in one variable.
- Explain how extraneous solutions may arise when solving radical equations.
- Solve radical inequalities and apply the solution within a real-world context.

## Assignment

- All vocabulary copied into notes
- p270 15–23, 26–46 ([pdf](./pdf/alg2-practice-0504.pdf))
  - Answers to [odd questions](../misc/alg2-odd-answers.pdf) / [even questions](../misc/alg2-even-answers.pdf)

---

## Solving an Equation With One Radical

A radical should be treated like any other exponent, so isolate it and then perform whatever operation needed to undo the radical.

$$\begin{align}
\sqrt{x+5} - 1 &= 3 \\
\sqrt{x+5} &= 4 \\
x+5&=16 \\
x &= 11
\end{align}$$

With radicals, specifically square roots and any other even root, you need to check for extraneous solutions.

$$\begin{align}
\sqrt{3x-2} &= x-4 \\
3x-2 &= x^2 - 8x + 16 \\
0 &= x^2 - 11x + 18 \\
0 &= (x - 9)(x - 2)
\end{align}$$

We get $x=2$ and $x=9$, but with $2$ ...

$$\begin{align}
\sqrt{3x-2} &= x-4 \\
\sqrt{3(2)-2} &= (2)-4 \\
\sqrt{4} &= -2
\end{align}$$

OK, so that is technically true, but unfortunately not how the square root function is *defined*. It might seem pedantic, but to make the square root function actually behave like a function, we limit it to one output per input. This is also why it an even root issue. Odd roots already behave like properly functions without any extra restrictions.

So, despite appearances at the end, there is only one solution. You can see the actual solution compared to the extraneous one [here in Desmos](https://www.desmos.com/calculator/zqxgtbkhfr).

## Radicals on Both Sides

With two radicals, you can choose to split them up or keep them together. Ultimately, you'll end having to square twice to get rid of each. Here's one equation solved with two different approaches.

$$\begin{align}
          \sqrt{x+9} - \sqrt{2x} &=3               &\qquad \sqrt{x+9} - \sqrt{2x} &=3 \\
(x + 9) - 2\sqrt{2x(x+9)} + (2x) &= 9              &\qquad             \sqrt{x+9} &= 3 + \sqrt{2x} \\
                 \sqrt{2x^2+18x} &= \frac{3}{2}x   &\qquad                  x + 9 &= 9 + 6\sqrt{2x} + 2x \\
                      2x^2 + 18x &= \frac{9}{4}x^2 &\qquad                     -x &= 6\sqrt{2x} \\
                      8x^2 + 72x &= 9x^2           &\qquad                    x^2 &= 36(2x) \\
                       x^2 - 72x &= 0              &\qquad              x^2 - 72x &= 0
\end{align}$$

Again, since we are squaring we need to check for extraneous solutions. Here, it's a little more clear cut as plugging $72$ yields $-3=3$, so only $0$ works as a solution.
