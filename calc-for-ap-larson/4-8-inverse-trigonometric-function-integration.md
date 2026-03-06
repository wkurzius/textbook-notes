---
title: "4.8 Inverse Trigonometric Functions: Integration"
layout: page
course: AP Calc
last-reviewed: 2026-03-06 09:17:28
prev-link: "./4-7-the-natural-logarithmic-function-integration.html"
next-link: ./7-1-basic-integration-rules.html
---

- Integrate functions whose antiderivatives involve inverse trigonometric functions.
- Use the method of completing the square to integrate a function.
- Review the basic integration rules involving elementary functions.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p361 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 33–36, 45, 47, 54, 55, 59, 62 *70, 74–77*{: .ap-problems}

## Additional Resources

- AP Topics: 6.10, 6.14
- Khan Academy
  - [Integrating functions using long division and completing the square](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-10/v/integral-partial-fraction){: target="_blank"}

---

## Integrals and Inverse Trigonometric Functions

We're going to throw three more integration rules at you for this last section, each dealing with inverse trigonometric functions.

> ### Integrals Involving Inverse Trigonometric Functions
>
> Let $a>0$, and $u$ be any differentiable function.
>
> $$\begin{align}
> &\int \frac {1}{\sqrt{a^2 - u^2}} \, du  = \arcsin{\frac{u}{a}} + C \\
> &\int \frac {1}{a^2 + u^2} \, du         = \frac{1}{a}\arctan{\frac{u}{a}} + C\\
> &\int \frac {1}{u\sqrt{u^2 - a^2}} \, du = \frac{1}{a}\text{arcsec}{\frac{\left| u \right|}{a}} + C
> \end{align}$$
{: .definition}

These are just the opposite of your differentiation rules, so as a reminder with test day approaching, make sure you know your rules. Most of the integration rules are just the mirror of the differentiation ones, so you can save some time there. I have a [Cram Sheet](../pdfs/ap-calc-cram-sheet.pdf) posted back on the main page that is unfortunately more than one sheet of paper.

Anyway, examples 1–3 in the book go over the basic usage of the inverse trig rules above. All use tricks you've seen before, like  factoring out a constant or $u$-substitution.

## Completing the Square

The new strategy that appears in this section is completing the square, which you've used in the past to solve quadratic equations. This meant adding $\left(b/2\right)^2$ to both sides of the equation, with the goal of making the quadratic a perfect square.

$$\begin{align}
x^2 - 6x + 13 &= 10 \\
x^2 -6x \mathbin{\color{red}{+}}{\color{red}9} +13 &= -3 \mathbin{\color{red}{+}}{\color{red}9} \\
(x - 3)^2 +13 &= 19 \\
(x - 3)^2     &= 6 \\
x - 3         &= \pm\sqrt{6} \\
x             &= \pm\sqrt{6}+3
\end{align}$$

But since we are not solving equations, anything added has to be immediately be subtracted.

$$\begin{align}
& x^2 - 6x + 13 \\
& x^2 - 6x \mathbin{\color{red}{+}}{\color{red}9 - 9} + 13 \\
& (x^2 - 6x + 9) - 9 + 13 \\
& (x-3)^2 + 4
\end{align}$$

The result is the sum of a squared binomial and a constant. And since all the inverse trig rules involve some combination of $u^2$ and $a^2$, this is exactly what we are looking for.

> ## Completing the Square Example 1
>
> Find $\displaystyle \int \frac{1}{x^2 - 4x + 7} \, dx$.
{: .example}

$$\begin{align}
\int \frac{1}{x^2 - 4x + 7} \, dx
  &= \int \frac{1}{x^2 - 4x +4 - 4 + 7} \, dx \\
  &= \int \frac{1}{(x - 2)^2 + 3} \, dx &\text{$\frac{1}{u^2 + a^2}$ matches the $\arctan$ rule } \\
  &= \frac{1}{\sqrt{3}}\arctan\frac{x-2}{\sqrt{3}} + C
\end{align}$$

$\blacksquare$
{: .qed}

> ## Completing the Square Example 2
>
> Find $\displaystyle \int \frac {1} { \sqrt{3x - x^2} } \, dx$.
{: .example}

With this one, we now have sign changes to worry about.

$$\begin{align}
\int \frac {1} { \sqrt{3x - x^2} } \, dx
  &= \int \frac {1} { \sqrt{ -\left ( x^2 - 3x + \frac{9}{4} - \frac{9}{4} \right) } } \, dx \\
  &= \int \frac {1} { \sqrt{ -\left(x - \frac{3}{2} \right)^2 + \frac{9}{4} } } \, dx \\
  &= \int \frac {1} { \sqrt{ \frac{9}{4} -\left(x - \frac{3}{2} \right)^2 } } \, dx &\text{$\frac{1}{\sqrt{a^2 - u^2}}$ matches the $\arcsin$ rule }\\
  &= \arcsin\frac{x - \frac{3}{2}}{\frac{3}{2}} + C \\
  &= \arcsin\left(\frac{2}{3}x - 1 \right) + C
\end{align}$$

$\blacksquare$
{: .qed}

## Review of Basic Integration Rules

The brief, remaining part of the section discusses what you can and can't integrate with what you have been taught so far. Knowing what you can't integrate might have limited use on the AP Exam, but the other examples are nice a summary of the forms that you can work with, albeit with a little work to transform them.
