---
title: 6.3 Logarithms
layout: notes
course: Algebra 2 and Trig
---

- Understand the inverse relationship between exponents and logarithms.
- Use logarithms to solve exponential models.
- Evaluate logarithms using technology.

## Assignment

- All **vocabulary** copied into notes
  - common logarithm, logarithm, logarithmic function, natural logarithm
- p319 13–20, 25–57 ([pdf](./pdf/alg2-practice-0603.pdf))
  - Answers to [odd questions](../misc/alg2-odd-answers.pdf) / [even questions](../misc/alg2-even-answers.pdf)

## Additional Resources

- [Additional practice worksheet](./pdf/alg2-add-practice-0603.pdf)

---

## Understand Logarithms

Much like how subtraction is the inverse of addition, and division is the inverse of multiplication, logarithms are the inverse of exponents. They allow you to solve equations like ${2^x}=32$.

> ### Definition of Logarithms
>
> Let $b$ and $x$ both be positive numbers, and $b\neq1$.
>
> $$\begin{align}
> \log_b{x} = y \quad\text{if and only if*} \quad b^y = x
> \end{align}$$
{: .definition}

> \* "If and only if" is a logical statement meaning either both statements are true, or both are false.

Logarithms (or logs) are read as "log base $b$ of $x$". What's written above on the left is the logarithmic form, and on the right is exponential form. Here's an example involving numbers.

$$\begin{align}
\log_4{16} = 2 \quad\leftrightarrow \quad 4^2=16
\end{align}$$

Moving between the two forms allows you to evaluate simple logarithms. If asked to evaluate $\log_3{9}$, you can rewrite it so it's easier to see what is being asked.

$$\begin{align}
\log_3{9} \quad\rightarrow\quad 3^? = 9
\end{align}$$

## The Common and Natural Logarithms

Outside of carefully constructed problems, logarithms typically evaluate to irrational numbers, much like square roots, so calculators are required to get an estimate. Desmos can evaluate logarithms by typing `log` followed by an underscore (`_`) to enter the base.

In order to get a base on a TI-84, hit `MATH` and scroll down until you see `logBASE(`.

The TI-84s do have a `log` button right on the front, but no base is listed if you use it. If you omit the base, the default or **common logarithm** is base $10$, and this also holds true for when logarithms are written.

$$\begin{align}
\log5 = \log_{10}{5}
\end{align}$$

There is also the **natural logarithm** where the base is the number $e$.

$$\begin{align}
\ln6 = \log_e{6}
\end{align}$$

OK, what the heck is $e$? The number $e$ is similar to $\pi$ in that they are both irrational, so they are expressed using symbols rather than their actual value. $e$ is approximately $2.718$ and is called the **natural base**. Why $e$ gets it own logarithm and symbol is tough to explain without going way off-topic. The short(est) version is that $e$ is the result of plugging large numbers into the function below.

$$\begin{align}
\lim_{x\to\infty}\left(1+\frac{1}{x}\right)^x = e
\end{align}$$

That function is the result of asking what would happen, if instead of doubling something, we increased by it by $50\%$ twice over the same time period. Or what about $25\%$ four times? Or $10\%$ ten times? By breaking the $100\%$ increase into an infinite number of smaller increases, applied an infinite number of times over the same period, instead of a doubling it, you "$e$ it". This is the idea behind [compound interest](https://en.wikipedia.org/wiki/E_(mathematical_constant)#Compound_interest).

Just being aware of $e$ and it's approximate value is enough for now, so don't sweat the function or the compound interest.

## Solving With Logarithms

Logarithms have a lot of unique properties, most of which we'll cover in later sections, but for now there is one important one we'll use to solve equations involving exponents or logarithms.

$$\begin{align}
\log_bb^x = x \\
b^{\log_b{x}} = x
\end{align}$$

Matching the bases of exponents and logarithms allows you to solve for the power. We can use these to solve equations like the ones below.

$$\begin{align}
25 &= 10^{x-1} \\
\log{25} &= \log{10^{x-1}} &&\text{Find $\log_{10}$ of both sides} \\
\log{25} &= x-1 \\
\log{25} + 1 &= x \\
1 + \log{25} &= x &&\text{Reorder for clarity.} \\[2em]
\ln{(2x+3)} &= 4 \\
e^{\ln{(2x+3)}} &= e^4 && \text{Set both sides as powers of $e$} \\
2x+3 &= e^4 \\
x &= \frac{e^4 - 3}{2}
\end{align}$$

The *exact* value of $x$ was found for both of the equations above, but often an *approximate* answer is what the problem is looking for, so have a calculator nearby when working on the assignment.
