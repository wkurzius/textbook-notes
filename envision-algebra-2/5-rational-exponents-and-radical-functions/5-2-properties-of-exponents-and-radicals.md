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

A variation of this rule exists for products and quotients.

> ### Powers of Products and Quotients
>
> A product or quotient raised to a power is equivalent to each factor being raised to the same power.
>
> $$\begin{align}
> (ab)^n &= a^nb^n \\[1em]
> \left(\frac{a}{b}\right)^n &= \frac{a^n}{b^n}
> \end{align}$$
{: .definition}

The last couple of are rules are for rewriting, and the first might be counterintuitive at first.

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

Our last rule requires a bit of set up to see why it works. Let's use the quotient rule, but on an expression that would yield a negative exponent.

$$\begin{align}
\frac{h^3}{h^5} &= h^{-2}\\[1em]
\frac{h^3}{h^5} &= \frac{h\cdot h \cdot h}{h \cdot h \cdot h \cdot h \cdot h}=\frac{1}{h^2}\\[1em]
h^{-2} &= \frac{1}{h^2}
\end{align}$$

> ### The Negative Rule
>
> The reciprocal of a power has an exponent with the opposite sign.
>
> $$\begin{align}
> a^{-n} &= \frac{1}{a^n} \\[1em]
> a^n    &= \frac{1}{a^{-n}}
> \end{align}$$
{: .definition}

## Rewriting Powers and Roots

You'll be asked to use the rules above to rewrite powers and roots. There are two things to keep in mind.

1. Roots are just fractional exponents, so all of the above applies to them as well.
2. "Simplified" is in the eye of the beholder.

The latter is worth mentioning because of problems like the one below.

$$\begin{align}
\sqrt[3]{\frac{18n^2}{24n}}
\end{align}$$

One could reasonably assume that the simplified version would be

$$\begin{align}
\sqrt[3]{\frac{3n}{4}}
\end{align}$$

This is number 30 from the book. And the solution is listed as

$$\begin{align}
\frac{\sqrt[3]{6n}}{2}
\end{align}$$

They assume you would recognize that a factor of $24$ is $8$, which is a perfect cube. I suggest just making sure you can transform the original into the given answer, and don't sweat it if you didn't guess which form they wanted.

I do recommend looking through all the examples in the book. There are a lot and it's not worth repeating all of them here. You should be doing this anyway, but doubly so for this section.

## Rationalize a Denominator

Sometimes you will be asked to rationalize a denominator, which means write an equivalent expression that doesn't have a radical in the denominator. An example of one is $\frac{1}{\sqrt5}$. These just require multiplying by the radical.

$$\begin{align}
\frac{1}{\sqrt5} \cdot \frac{\sqrt5}{\sqrt5} = \frac{\sqrt5}{5}
\end{align}$$

If the denominator instead has a binomial with a radical, then you need to multiply by its conjugate. Your difference of squares rule can speed up the multiplication.

$$\begin{align}
\frac{1}{2+\sqrt5} \cdot \frac{2-\sqrt5}{2-\sqrt5} = \frac{2-\sqrt5}{-1} = -2 + \sqrt5
\end{align}$$
