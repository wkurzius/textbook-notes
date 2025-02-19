---
title: 5.1 𝘯th Roots, Radicals, and Rational Exponents
---

{: .lesson-dates}
Lesson date: February 19, 2025.

- Use properties of exponents to rewrite expressions involving radicals in terms of rational exponents.
- Find all real $n$th roots of a number.
- Evaluate expressions with rational exponents.
- Use $n$th roots to solve equations by rewriting expressions using the properties of exponents.

## Assignment

- All vocabulary copied into notes
- p245 18–26, 31–50
  - Answers to [odd questions]({{site.baseurl}}/misc/alg2-odd-answers.pdf) / [even questions]({{site.baseurl}}/misc/alg2-even-answers.pdf)

---

## The 𝘯th Root

The majority of the chapter deals with exponents and roots, so we'll start with looking at roots beyond the square root.

> ### The 𝘯th Root of a Number
>
> The $n$th root of a number $c$ is any $x$ such that $x^n=c$. It can be denoted by
> $$\begin{align}
> \sqrt[n]c
> \end{align}$$
> where $n$ is the index and $c$ is the radicand.
{: .definition}

Often, finding a particular root of a number comes down to either knowing it or using a calculator. How they are calculated is beyond what the scope of this course.

There are, however, a few ways to arrive at an answer if you know your factoring rules. For example, finding $\sqrt[4]{16}$ using difference of squares.

$$\begin{align}
x^4 &= 16 \\
x^4 - 16 &= 0  \\
(x^2 - 4)(x^2+4) &= 0 \\
(x-2)(x+2)(x^2+4) &= 0 \\[0.5em]
x&=\pm2
\end{align}$$

## Rational Exponents

Subtraction can be rewritten as addition, division as multiplication, and the same with roots as exponents.

> ### Roots as Rational Exponents
>
> A root can be written as an exponent with the index in the denominator of the exponent.
>
> $$\begin{align}
> \sqrt[n]{a}=a^{\frac{1}{n}}
> \end{align}$$
{: .definition}

Keep in mind that $(a^2)^3=a^6$. So, in order to undo an exponent with another exponent (rooting), it would have to multiply to 1.

$$\begin{align}
(3^2)^{\frac{1}{2}} = 3^\frac{2}{2} = 3^1 = 3
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

You can also use to tackle problems with higher exponents easily.

$$\begin{align}
\sqrt[4]{x^{20}y^8} &= \left(x^{20}y^8\right)^\frac{1}{4} \\
                    &= x^\frac{20}{4}y^\frac{8}{4} \\
                    &= x^5y^2
\end{align}$$

And also solve equations involving powers.

$$\begin{align}
2x^5 &= 64 \\
 x^5 &= 32 \\
 \left(x^5\right)^\frac{1}{5} &= 32^\frac{1}{5} \\
 x &= 2
\end{align}$$
