---
title: 6.5 Properties of Logarithms
layout: notes
course: Algebra 2 and Trig
---

- Use Properties of Logarithms to rewrite logarithmic expressions.
- Use the Change of Base Formula to evaluate logarithmic expressions and solve equations.

## Assignment

- All **vocabulary** copied into notes
  - change of base formula
- p331 7–15, 20–40 ([pdf](./pdf/alg2-practice-0605.pdf))
  - Answers to [odd questions](../misc/alg2-odd-answers.pdf) / [even questions](../misc/alg2-even-answers.pdf)

## Additional Resources

- [Additional practice worksheet](./pdf/alg2-add-practice-0605.pdf)

---

## The Properties of Logarithms

This section is really just a list of identities and rules, and then practicing with those rules. I'll try to show you where each comes from, but as long you remember the identity, you'll be in good shape.

> ### The Product Property of Logarithms
>
> $$\begin{align}
> \log_b mn = \log_b m + \log_b n
> \end{align}$$
{: .definition}

To see where this comes from, let's start with just $mn$. Remember that logarithms are the inverse of exponents, so ${b^{\log_b x}=x}$

$$\begin{align}
mn &= b^{\log_b m} b^{\log_b n} = b^{\log_b m + \log_b n} \\
\log_b{mn} &= \log_b \left(b^{\log_b m + \log_b n}\right) = \log_b m + \log_b n
\end{align}$$

> ### The Power Property of Logarithms
>
> $$\begin{align}
> \log_b m^n=n\log_b m
> \end{align}$$
{: .definition}

Here is the proof for the power property. Like the other, the first line sets up how the expression will be rewritten, and the second proves the identity.

$$\begin{align}
m^n &= (b^{\log_b m})^n = b^{n\log_b m} \\
\log_b m^n &= \log_b (b^{n\log_b m}) = n\log_b m
\end{align}$$

---

> ### The Quotient Property of Logarithms
>
> $$\begin{align}
> \log_b \frac{m}{n} = \log_b m - \log_b n
> \end{align}$$
{: .definition}

We could prove this one the same way as the product property, but let's go another route for the sake of mixing things up.

$$\begin{align}
\log_b \frac{m}{n} &= \log_b (mn^{-1}) \\
 &= \log_b m + \log_b n^{-1} \\
 &= \log_b m - \log_b n
\end{align}$$

### Examples

Here are a few ways you can use these rules to rewrite logarithms. 

$$\begin{align}
\log_5(a^2b^7) &= \log_5 a^2 + \log_5 b^7 \\
               &= 2\log_5 a + 7\log_5 b
\end{align}$$

$$\begin{align}
4 \ln m + 3 \ln n - \ln p &= \ln m^4 + \ln n^3 - \ln p \\
 &= \ln \frac{m^4n^3}{p}
\end{align}$$

## Change of Base Rule

Useful for when you rather work with either the common or natural logarithm.

> ### Change of Base Formula
>
> Let $b$ be the original base and $a$ the new one.
>
> $$\begin{align}
> \log_b m = \frac{\log_a m}{\log_a b}
> \end{align}$$
{: .definition}

So, if wanted to rewrite $\log_2 3$ in the common logarithm ...

$$\begin{align}
\log _2 3 = \frac{\log 3}{\log 2}
\end{align}$$

And because I did it for the other ones, here's the proof. Let ${m=\log_b x}$ and we'll start by applying the new base to the exponential version of $m$.

$$\begin{align}
m &= \log_b x \\
b^m &= x \\
\log_a b^m &= \log_a x \\
m \log_a b &= \log_a x \\
m &= \frac{\log_a x}{\log_a b} \\
\log_b x &= \frac{\log_a x}{\log_a b} \\
\end{align}$$
