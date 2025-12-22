---
title: 7.1 Basic Integration Rules
layout: page
course: AP Calc
last-reviewed:
prev-link: ./4-8-inverse-trigonometric-function-integration.html
next-link: ./5-1-slope-fields-and-eulers-method.html
---

- Review procedures for fitting an integrand to one of the basic integration rules.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p461 2, 3, 6, 8, 9, 11, 14, 17, 20, 23, 26, 29, 32, 35, 38, 41, 44, 48 *52–64 even, 72, 81–84, 94–98*{: .ap-problems}

## Additional Resources

- AP Topics: 6.9, 6.10, 6.14
- After this section, you can complete **Unit 6 Progress Checks MCQ Part A, and FRQ Parts A and B**
- Khan Academy
  - [Integrating using substitution](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-9/v/u-substitution){: target="_blank"}
  - [Integrating functions using long division and completing the square](https://www.khanacademy.org/math/ap-calculus-ab/ab-integration-new/ab-6-10/v/integral-partial-fraction){: target="_blank"}

---

## Fitting Integrands to Basic Integration Rules

This section is a collection of examples and strategies for integrating. Most you have seen before, but some of these are unique cases. I won't copy them here, buy I will highlight the summary at the end.

> ### Procedures for Fitting Integrands to Basic Integration Rules
>
> Expand (numerator)
>
> $$\begin{align}
> (1+e^x)^2 = 1 +2e^x +e^{2x}
> \end{align}$$
>
> Separate numerator
>
> $$\begin{align}
> \frac{1+x}{x^2+1} = \frac{1}{x^2+1} + \frac{x}{x^2+1}
> \end{align}$$
>
> Complete the square
>
> $$\begin{align}
> \frac{1}{\sqrt{2x-x^2}} = \frac{1}{\sqrt{1-(x-1)^2}}
> \end{align}$$
>
> Divide improper rational functions
>
> $$\begin{align}
> \frac{x^2}{x^2+1} = 1 - \frac{1}{x^2+1}
> \end{align}$$
>
> Add and subtract terms in numerator
>
> $$\begin{align}
> \frac{2x}{x^2+2x+1} &= \frac{2x+2-2}{x^2+2x+1} = \frac{2x+2}{x^2+2x+1} - \frac{2}{(x+1)^2}
> \end{align}$$
>
> Use trigonometric identities
>
> $$\begin{align}
> \cot^2 x = \csc^2 x - 1
> \end{align}$$
>
> Multiply and divide by Pythagorean conjugate
>
> $$\begin{align}
> \frac{1}{1+\sin x} &= \left(\frac{1}{1 + \sin x}\right)\left(\frac{1 - \sin x}{1 - \sin x}\right) \\[1em]
> &= \frac{1-\sin x}{1-\sin^2 x} \\[1em]
> &= \frac{1-\sin x}{\cos^2 x} \\[1em]
> &= \sec^2 x - \frac{\sin x}{\cos^2 x}
> \end{align}$$
{: .definition}
