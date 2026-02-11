---
title: 4.3 Riemann Sums and Definite Integrals
layout: page
course: AP Calc
last-reviewed: 2026-02-10 20:27:12
prev-link: "./4-2-area.html"
next-link: "./4-4-the-fundamental-theorem-of-calculus.html"
---

- Understand the definition of a Riemann sum.
- Evaluate a definite integral using limits and geometric formulas.
- Evaluate a definite integral using properties of definite integrals.
- Approximate a definite integral using the Trapezoidal Rule.
- Analyze the approximate error in the Trapezoidal Rule.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p312 1–5 odd, 9–14, 18, 20, 25, 30, 31–35 odd, 40–50 even, 51, 53, 54, 57, 61–65 odd *74, 75, 89, 92, 94, 114–117*{: .ap-problems}

## Additional Resources

- AP Topics: 6.2, 6.3, 6.6, 6.8
- Khan Academy
  - [Approximating areas with Riemann sums](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-2/v/simple-riemann-approximation-using-rectangles){: target="_blank"}
  - [Riemann sums, summation notation, and definite integral notation](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-3/v/sigma-notation-sum){: target="_blank"}
  - [Applying properties of definite integrals](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-6/v/negative-definite-integrals){: target="_blank"}
  - [Finding antiderivatives and integrals: basic rules and notation: reverse power rule](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-8a/v/indefinite-integrals-of-x-raised-to-a-power){: target="_blank"}
  - [Finding antiderivatives and integrals: basic rules and notation: common indefinite integrals](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-8b/v/antiderivative-of-x-1){: target="_blank"}
  - [Finding antiderivatives and integrals: basic rules and notation: definite integrals](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-8c/v/reverse-power-rule-for-definite-integrals){: target="_blank"}

---

## Trapezoidal Rule

Before we get into the meat of this section, we're going to jump back to approximating area, but this time with trapezoids.

> ![The area under a curve approximated by trapezoids.](./img/4.3-figure-2.png)
>
> **Figure 4.3.1** The area under a curve approximated by trapezoids.
{: .figure}

You can see from the picture, this leads to better estimates, though when an estimate is over or under now depends on its concavity. Trapezoids give overestimates when the curve is concave up and underestimates when it's concave down. You'll likely get a question or two about these estimates, so make sure you draw pictures before guessing.

As for finding the area, summation notation doesn't really help here. Even when the width (height) of each trapezoid is same, the area still depends on two variables: the two bases. Most questions you see will tell you to use a certain number of trapezoids to estimate the area and you'll just have to work it out.

Since the area of a trapezoid is $\frac{1}{2}h(b_1+b_2)$, that means four trapezoids will look like this.

$$\begin{align}
A &\approx \frac{h}{2}(b_1+b_2) + \frac{h}{2}(b_2+b_3) + \frac{h}{2}(b_3+b_4) + \frac{h}{2}(b_4+b_5) \\
  &\approx \frac{h}{2}((b_1+b_2)+(b_2+b_3)+(b_3+b_4)+(b_4+b_5)) \\
  &\approx \frac{h}{2}(b_1 + 2b_2 + 2b_3 + 2b_4 + b_5)
\end{align}$$

You have a sum of all your bases, but the interior ones are doubled up. Then it's just a matter of multiplying by half the height.

## Riemann Sums

In the previous section, we summed up products that existed on an interval. This is known as a Riemann sum, and **does not require the use of sigma notation**. I stress that because there was a strong emphasis on using sigma notation last section. Although you will have to read and write sigma notation, you don't need to use it. If you need to approximate an area, just do the calculations and skip the notation.

Anyway, one of the uses of Riemann sums is approximating the area under a curve. One slight difference between what we did last section and Riemann sums proper is that the latter allows for subintervals of varying length. If you're given a table of values, like the one below, and asked to approximate the sum using a left Riemann sum, the fact that the subintervals are different lengths doesn't matter.

> |        |      |      |      |      |
> | :----: | :--: | :--: | :--: | :--: |
> | $x$    | $10$ | $12$ | $15$ | $16$ |
> | $g(x)$ | $5$  | $1$  | $7$  | $7$  |
> {: .headless-table .min-width}
>
> **Figure 4.3.1** A function split into three unequal subdivisions. Using a left Riemann sums yields an approximation of $20$, while a right Riemann produces $30$.
{: .figure}

This allowance for varying length does have an effect on the general formula. Our, width was $\Delta x$, but since it can vary it becomes $\Delta x_i$.

$$\begin{align}
\sum^n_{i=1} f(c_i)\,\Delta x_i
\end{align}$$

Not a huge deal in the grand scheme of things, but the big perspective switch comes with the limit version.

$$\begin{align}
\lim_{\Vert\Delta\Vert\to 0} \sum^n_{i=1} f(c_i)\,\Delta x_i
\end{align}$$

Instead of trying to pump as many rectangles as we can into the interval, we reduce their widths to zero. The $\Vert\Delta\Vert$ symbol references the width of the widest rectangle, so as long as that one gets down to zero, the others go with it.

Again, this won't have a significant impact on the problems you'll be working out, just a little shift in the underlying logic of how it all works.

## Definite Integral

The Riemann sum limit above has so much utility that it has it's own name and notation: the **definite integral**.

$$\begin{align}
\lim_{\Vert\Delta\Vert\to 0} \sum_{i=1}^n f(c_i) \Delta x_i = \int_a^b f(x) \, dx
\end{align}$$

The sigma becomes an elongated 'S', $\Delta x$ becomes $dx$, the limit is just assumed, and rather than counting rectangles with $i$ and $n$, we state the beginning and end of the interval with $a$ and $b$.

> This new notation looks a lot like what we did with antidifferentiation and indefinite integrals in 4.1. While those produced functions, definite integrals produce values. There is a connection between the two, but we're not there quite yet.

For now, this new notation doesn't change anything. It's just an abbreviated way of stating things we've already been doing. The area under the curve $x^2$ on the interval $[3,7]$ can now be written as

$$\begin{align}
\int_3^7 x^2\, dx
\end{align}$$

> ## Example
>
> Write the definite integral as Riemann sum limit and  (optionally) evaluate it.
>
> $$\begin{align}
> \int_{-2}^1 2x \, dx
> \end{align}$$
{: .example}

Start with your form and then fill in the function and width.

$$\begin{align}
& \lim_{n \to \infty} \sum_{i=1}^{n} f(c_i) \Delta x_i \\
& \lim_{n \to \infty} \sum_{i=1}^{n} (2x_i) \left(\frac{3}{n}\right)
\end{align}$$

Our interval begins at $-2$, so for $x_i$ we end up with $-2+\frac{3i}{n}$.

$$\begin{align}
& \lim_{n \to \infty} \sum_{i=1}^{n} f(c_i) \Delta x_i \\
& \lim_{n \to \infty} \sum_{i=1}^{n} \left(2\left(-2+\frac{3i}{n}\right)\right) \left(\frac{3}{n}\right)
\end{align}$$

The book has the steps to reduce this down, and I encourage you to go through them, but for the sake of getting an answer, we'll use Demos.

$$\begin{align}
\int_3^7 x^2\, dx = -3
\end{align}$$

Here's a link if you don't believe me: <https://www.desmos.com/calculator/qwzspvcnd9>

$\blacksquare$
{: .qed}

OK, so the negative number is new because everything we've done up until this point has been above the $x$-axis. Since $2x$ is negative left of the $y$-axis, the heights of our infinitely narrow rectangles are negative, meaning their "areas" are negative.

I know that doesn't make much sense, but that means the definite integral won't necessarily give you the area under a curve. It can, but it will require a little manipulation, but that's for later.

Also, you might have noticed there is another way to find the area under this curve: find the area of the triangles. While the summation technique will work, sometimes it's easier to use what you know from geometry to evaluate certain definite integrals. Constant functions will give you rectangles, linear functions produce triangles and trapezoids, and you'll even see some semicircles.

## Properties of Definite Integrals

Examples 4 through 7 highlight the various properties of definite integrals, but I won't cover them here. The one notable exception is the negative definite integral, where the interval can be reversed.

$$\begin{align}
\int_a^b f(x)\, dx = - \int_b^a f(x)\, dx
\end{align}$$
