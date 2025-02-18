---
title: 1.3 Radicals and Rational Exponents
---

{: .lesson-dates}
Lesson date: February 7, 2025.

- Evaluate square roots.
- Use the product rule to simplify square roots.
- Use the quotient rule to simplify square roots.
- Add and subtract square roots.
- Rationalize denominators.
- Use rational roots.

## Assignment

- 1–4, 5–65 odd
- *Recommended*: all **vocabulary** and concept blocks copied into notes

---

## Evaluating Square Roots

Square rooting a number is the inverse of squaring a number, so you are finding the number that multiplies by itself to get the number in question.

$$\begin{align}
\sqrt{25}=5
\end{align}$$

The symbol above the 25 is called the radical and when evaluated produces a positive number, called the **principle square root**. This extra qualifier is there because $(-5)^2 = 25$, so technically $\sqrt{25}=-5$. To avoid the ambiguity, we focus on just the positive root.

Keep in mind that the radical acts as a grouping symbol, so evaluate anything under it first before square rooting.

### Product and Quotient Rules

Square roots and radicals are essentially exponents, so they inherit all of their rules.

$$\begin{align}
\sqrt{ab} &= \sqrt{a}\cdot\sqrt{b} \\
\sqrt{\frac{a}{b}} &= \frac{\sqrt{a}}{\sqrt b}
\end{align}$$

## Simplifying Square Roots

Some square roots can be simplified and rewritten.

$$\begin{align}
\sqrt{18} = \sqrt 9 \cdot \sqrt 2 = 3\sqrt 2
\end{align}$$

Knowing your perfect squares makes this easier to do. See if you can rewrite anything under the radical as a factor of 4, 9, 16, 25, and so on.

If you end up with the exact same expression under multiple square roots, then you can add them like you would variables.

$$\begin{align}
\sqrt 2 + 3\sqrt 2 = 4\sqrt 2
\end{align}$$

## Rationalizing Denominators

It's common practice to rewrite a fraction so there is no square root in the denominator, also known as rationalizing the denominator. To get that done, we multiply both the numerator and denominator by the exact square root we are looking to remove.

$$\begin{align}
\frac{2}{\sqrt{10}}\cdot \frac{\sqrt{10}}{\sqrt{10}} &= \frac{2\sqrt{10}}{10} \\
&= \frac{\sqrt{10}}{5}
\end{align}$$

We can do this since we technically are multiplying by 1, so we're not changing the value of the expression.

If the denominator happens to have a sum involving a square root, we instead multiply by the conjugate, which is the same expression, but with subtraction instead of addition (or vice versa).

$$\begin{align}
\frac{4}{1+\sqrt 5}\cdot \frac{1- \sqrt 5}{1-\sqrt 5} &= \frac{4 - 4\sqrt 5}{(1+\sqrt5)(1-\sqrt5)}
\end{align}$$

To multiply what we know have in the denominator we'll use distribution, but everything in one set of parentheses will be multiplied by everything in the other.

$$\begin{align}
(a + b)(c + d) = ac + ad + bc + bd
\end{align}$$

Here is the finished problem from before.

$$\begin{align}
\frac{4}{1+\sqrt 5}\cdot \frac{1- \sqrt 5}{1-\sqrt 5} &= \frac{4 - 4\sqrt 5}{(1+\sqrt5)(1-\sqrt5)} \\[1em]
&= \frac{4-4\sqrt5}{1-\sqrt5+\sqrt5-5} \\[1em]
&= \frac{4-4\sqrt5}{-4}\\
&=-1+\sqrt5
\end{align}$$

## Other Roots

Square roots are the most common root, but you can root with other numbers besides two.

$$\begin{align}
\sqrt[3]{-27} &= -3 \\
\sqrt[4]{10000} &= 10
\end{align}$$

Note the negative in the first one. With an odd exponent, we can work with negatives. And the principle root will always match the original's sign.

## Rational Exponents

I mentioned earlier that roots are just exponents. We typically don't write them that way, but $\sqrt 2 = (2)^{1/2}$. One way to prove that to yourself is $\sqrt{2^2} = 2$ and $(2^{1/2})^2=2^{2/2}=2^1=1$.

$$\begin{align}
\sqrt[n]{a}=a^{\frac{1}{n}}
\end{align}$$

This means you can now tackle problems with fractional exponents. Your numerator can be translated as your "regular" power, and the denominator as your root. You can also do them in either order: either root first or power first.

$$\begin{align}
4^\frac{3}{2} &= \sqrt{4^3} \\
              &= \sqrt{64}        &&\text{Power first} \\
              &= 8
\end{align}$$

Or

$$\begin{align}
4^\frac{3}{2} &= \sqrt{4^3} \\
              &= 2^3        &&\text{Square root first} \\
              &= 8
\end{align}$$
