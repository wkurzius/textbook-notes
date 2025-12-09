---
title: 2.5 Implicit Differentiation
layout: notes
course: AP Calc
last-reviewed: 2025-11-14 10:24:03
---

- Distinguish between functions written in implicit form and explicit form.
- Use implicit differentiation to find the derivative of a function.
- Find derivatives of functions using logarithmic differentiation.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p180 1–21 odd, 25, 28–31, 42, 43, 47, 49, 50, 53, 55, 59–61, 63, 68 *80, 81, 84–87*{: .ap-problems}

## Additional Resources

- AP Topics: 3.2, 5.12
- Khan Academy
  - [Implicit differentiation](https://www.khanacademy.org/math/ap-calculus-ab/ab-differentiation-2-new/ab-3-2/v/implicit-differentiation-1){: target="_blank"}
  - [Exploring behaviors of implicit relations](https://www.khanacademy.org/math/ap-calculus-ab/ab-diff-analytical-applications-new/ab-5-12/v/implicit-curve-horizontal-tangent){: target="_blank"}

---

Up until this point, we've differentiated explicit functions, which is when a function $y$ is written as a function of $x$. Like, $y=1/x$. An implicit function is when this isn't the case. If we rearranged that equation, we can get the implicit function $xy=1$.

So, we'll be looking at how to differentiate functions that can't be defined explicitly. Equations like $y^2=x$.

Before that, let's revisit chain rule and the power rule. And let's be really picky and define our inner function as $u=x$.

$$\begin{align}
\frac{d}{dx}[u^2] &= 2u\frac{d}{dx}[u] \\[1em]
                  &= 2u\frac{du}{dx} \\[1em]
                  &= 2x\frac{dx}{dx} && \text{Substitute $u=x$} \\[1em]
                  &= 2x
\end{align}$$

Since we are always differentiating with respect to $x$, those steps are unnecessary. It's the equivalent of asking how $x$ changes with respect to $x$. Well, at a rate of $1$ for every $1$.

We're also going to bring in the fact that differentiating is an operation that should be performed on both sides of an equation.

$$\begin{align}
y &= x^2 + 4 \\
\frac{d}{dx}[y] &= \frac{d}{dx}[x^2+4] \\
\frac{dy}{dx} &= 2x
\end{align}$$

Again, this was going on behind the scenes, but not worth mentioning before. Sorry about that. Remember when you learned that the coefficient of $x$ was $1$?

Now with all that out in the open, let's do some implicit differentiation.

### Example 1

> Find the derivative of $y^2=x$.
{: .example}

$$\begin{align}
\frac{d}{dx}[y^2]&=\frac{d}{dx}[x] && \text{Differentiate both sides}\\[1em]
2y\frac{d}{dx}[y] &= 1 &&\text{Chain rule applied to $y$} \\[1em]
2y\frac{dy}{dx} &= 1 \\[1em]
\frac{dy}{dx} &= \frac{1}{2y} && \text{Solve for $dy/dx$}
\end{align}$$

$\blacksquare$
{: .qed}

There's a general strategy for implicit differentiation on page 175 in the book that I'll include here as well.

> #### Guidelines for Implicit Differentiation
>
> 1. Differentiate both sides with respect to $x$.
> 2. Collect all terms involving $\frac{dy}{dx}$ on one side, with the rest going on the other.
> 3. Factor out $\frac{dy}{dx}$.
> 4. Solve for $\frac{dy}{dx}$.
{: .definition}

### Example 2

> Find $dy/dx$ given that $y^3+y^2-5y-x^2=-4$.
{: .example}

$$\begin{align}
\frac{d}{dx}[y^3+y^2-5y-x^2]&=\frac{d}{dx}[-4] \\
3y^2\frac{dy}{dx} + 2y\frac{dy}{dx}-5\frac{dy}{dx}-2x&=0 \\
3y^2\frac{dy}{dx} + 2y\frac{dy}{dx}-5\frac{dy}{dx}&=2x \\
\frac{dy}{dx}(3y^2 + 2y-5)&=2x \\
\frac{dy}{dx} &= \frac{2x}{3y^2 + 2y-5}
\end{align}$$

$\blacksquare$
{: .qed}

When finding higher order derivatives, you can substitute in early ones when needed.

### Example 3

>  Find the second derivative of $x^2+y^2 = 25$.
{: .example}

$$\begin{align}
\frac{d}{dx}[x^2 + y^2] &= \frac{d}{dx}[25] \\[1em]
2x +2y\frac{dy}{dx} &= 0 \\[1em]
2y\frac{dy}{dx} &= -2x \\[1em]
\frac{dy}{dx} &= \frac{-2x}{2y} \\[1em]
\frac{dy}{dx} &= -\frac{x}{y} \\[1em]
\end{align}$$

Now for number 2.

$$\begin{align}
\frac{d^2y}{dx^2}&=-\frac{1\cdot y-x\frac{dy}{dx}}{y^2} \\[1em]
&= -\frac{y-x\left(-\frac{x}{y}\right)}{y^2} \\[1em]
&= -\frac{y+\frac{x^2}{y}}{y^2} \\[1em]
&= -\frac{\frac{y^2}{y}+\frac{x^2}{y}}{y^2}\\[1em]
\frac{d^2y}{dx^2} &= -\frac{y^2+x^2}{y^3}
\end{align}$$

$\blacksquare$
{: .qed}

> Quick note: you will not be able to graph derivatives of implicit functions in most cases.

## Logarithmic Differentiation

This is a strategy for differentiating functions that would otherwise involve a heavy use of product or quotient rule, or when you have a variable in both the base and exponent, like $x^x$. Using this is a personal preference and is not directly tested on the AP exam.

We'll cover an example or two class, but generally the trick is to find the natural log of both sides, and then use the appropriate log rule to rewrite, then differentiate as usual.
