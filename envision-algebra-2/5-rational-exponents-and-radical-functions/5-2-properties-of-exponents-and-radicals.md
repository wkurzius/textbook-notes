---
title: 5.2 Properties of Exponents and Radicals
---

{: .lesson-dates}
Lesson date: February 25, 2025.

- Use the properties of exponents and radicals to identify ways to rewrite radical expressions.
- Interpret radical expressions that represent a quantity in terms of its context.

## Assignment

- All vocabulary copied into notes
- p253 13–26, 31–56
  - Answers to [odd questions]({{site.baseurl}}/misc/alg2-odd-answers.pdf) / [even questions]({{site.baseurl}}/misc/alg2-even-answers.pdf)

---

## Exponent Rules

> Some terminology first so we are on the same page. A power is when a base is raised to an exponent. So, $x^2$ is a power. It has a base of $x$ and an exponent of $2$.

There are a number of these to go through, most of which you can prove to yourself by keeping in mind that an exponent means repeated multiplication of the base. The first rule we'll cover is a perfect example of this. The expression $x^3 \cdot x^2$ is the same as $(x \cdot x \cdot x)\cdot(x \cdot x)=x^5$.

> ### The Product Rule
>
> Multiplying powers with the same base results in an addition of the exponent.
>
> $$\begin{align}
> a^m \cdot a^n = a^{m + n}
> \end{align}$$
{: .definition}

A similar thing happens when you divide powers with the same base. This time, bases on top and bottom divide out and are removed. The expression $\frac{x^3}{x^2}$ is equivalent to $\frac{x \cdot x \cdot x}{x \cdot x}$ or just $x$.

> ### The Quotient Rule
>
> Dividing powers with the same base results in an subtraction of the exponent.
>
> $$\begin{align}
> \frac{a^m}{a^n}=a^{m-n}
> \end{align}$$
{: .definition}

Our last operation is exponents on top of exponents. So, $(x^2)^3 = (x \cdot x)\, (x \cdot x)\, (x \cdot x) = x^6$.

> ### The Power Rule
>
> Raising a power to an exponent results in a power with the product as an exponent.
>
> $$\begin{align}
> (a^m)^n = a^{mn}
> \end{align}$$
{: .definition}

The next couple are rules for rewriting, and the first might be counterintuitive at first.

> ### The Zero Rule
>
> Anything to the zero power is one.
>
> $$\begin{align}
> a^0 = 1
> \end{align}$$
{: .definition}

A clearer way of writing this rule would be $1\cdot a^0 = 1$. There is always a $1$ in front of any term, so even when there is no power, there' still a $1$. Here's another way to think of it using the quotient rule.

$$\begin{align}
\frac{a^n}{a^n} &= 1 \\[1em]
\frac{a^n}{a^n} &= a^{n-n} = a^0 \\[1em]
a^0 &= 1
\end{align}$$

### The Negative Rule

What happens if we use the quotient rule and we end up with negative numbers?

$$\begin{align}
\frac{h^3}{h^5} &= h^{-2}\\[1em]
\frac{h^3}{h^5} &= \frac{h\cdot h \cdot h}{h \cdot h \cdot h \cdot h \cdot h}=\frac{1}{h^2}\\[1em]
h^{-2} &= \frac{1}{h^2}
\end{align}$$

A factor with a negative exponent becomes the same factor with a positive exponent if it is moved across the fraction bar.

$$\begin{align}
a^{-n} &= \frac{1}{a^n} \\[1em]
a^n    &= \frac{1}{a^{-n}}
\end{align}$$

### Powers of Product and Quotient Rules

These are straightforward if you remember that raising something to a power means repeated multiplication. So, $(xy)^2=(xy)(xy) = x^2y^2$.

$$\begin{align}
(ab)^n &= a^nb^n \\[1em]
\left(\frac{a}{b}\right)^n &= \frac{a^n}{b^n}
\end{align}$$