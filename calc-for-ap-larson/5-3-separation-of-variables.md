---
title: 5.3 Separation of Variables
course: AP Calc
last-reviewed:
---

- Recognize and solve differential equations that can be solved by separation of variables.
- Use differential equations to model and solve applied problems.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p393 5–9 odd, 13–25 odd, 33, 37, 39, 45 *57, 61–63, 79–81*{: .ap-problems}

## Additional Resources

- AP Topics: 7.6, 7.7
- After this section, you can complete **Unit 7 Progress Checks MCQ, and FRQ Parts A and B**
- Khan Academy
  - [Finding general solutions using separation of variables](https://www.khanacademy.org/math/ap-calculus-ab/ab-differential-equations-new/ab-7-6/v/separable-differential-equations-introduction){: target="_blank"}
  - [Finding particular solutions using initial conditions and separation of variables](https://www.khanacademy.org/math/ap-calculus-ab/ab-differential-equations-new/ab-7-7/v/finding-constant-of-integration-rational){: target="_blank"}

---

## Separation of Variables

We looked at this for the first time in [last section](./5.2-growth-and-decay.md), but we'll look at more varied examples here. In general, you can separate variables if it can be written in the form below.

$$\begin{align}
M(x) + N(y) \frac{dy}{dx} = 0
\end{align}$$

This form might not be immediately obvious, so some working out might be required.

### Example 1

> Find the general solution of $(x^2+4)\frac{dy}{dx} = xy$.
{: .example}

$$\begin{align}
(x^2+4)\frac{dy}{dx} &= xy \\
(x^2+4)\,dy &= xy\,dx \\
\frac{1}{y}\,dy &= \frac{x}{x^2+4}\,dx \\
\int \frac{1}{y}\,dy &= \int \frac{x}{x^2+4}\,dx \\
\ln |y| &= \frac{1}{2}\ln(x^2 + 4) + C \\
|y| &= e^C\sqrt{x^2+4} \cdot e^C \\
\end{align}$$

At this point, there are two things that need addressing. The first is the absolute value, which we can deal with by rewriting with $\pm$.

$$\begin{align}
y &= \pm e^C\sqrt{x^2+4} \\
\end{align}$$

Next is the fact that $e^C>0$, meaning we can't rewrite this is as $C$ ... at least not yet. The $\pm$ allows us to have negatives, so we are left with a $C$ that can be anything *but* zero.

Something you can check easily—and should check for each differential—is if $y=0$ is a solution. Remember that you need $y$ and $y'$ to check if a function is a solution The derivative of $y=0$ is $y'=0$, so this is an easy solution to check. And it turns out that yes, $y=0$ is a solution in this case, so since we have everything covered, we can now safely say the general solution is

$$\begin{align}
y &= C\sqrt{x^2+4} \\
\end{align}$$

### Example 2: Particular Solutions

> Given the initial solution of $y(0)=1$, find the particular solution of the equation
> $$\begin{align}
> xy\, dx + e^{-x^2}\left(y^2-1\right)\, dy = 0
> \end{align}$$
{: .example}

This looks intimidating, but $dy$ and $dx$ are already split into two terms, so we can move them to opposite sides and start moving things as needed.

$$\begin{align}
e^{-x^2}\left(y^2-1\right)\, dy &= -xy\, dx \\
e^{-x^2}\left(y^2-1\right)\, dy &= -xy\, dx \\
\frac{y^2-1}{y}\, dy &= -xe^{x^2}\, dx \\
\int \frac{y^2-1}{y}\, dy &= \int -xe^{x^2}\, dx \\
\int y - \frac{1}{y}\, dy &= \int -xe^{x^2}\, dx \\
\frac{y^2}{2} - \ln|y| &= -\frac{1}{2}e^{x^2}+C &\text{Let $u=x^2$}
\end{align}$$

There's no sense in solving for $y$ here. You have a mix of a logarithmic and non-logarithmic functions, which has no algebraic solutions, meaning transcendental numbers and this is a rabbit hole we are not going down.

Anyway, we can use the initial condition now to find the $C$ needed for our particular solution.

$$\begin{align}
\frac{(1)^2}{2} - \ln(1) &= -\frac{1}{2}e^{(0)^2}+C \\
\frac{1}{2} - 0 &= -\frac{1}{2} + C \\
1 &= C
\end{align}$$

Implicit functions, where both variables are on the same side, are preferred when it can't be defined explicitly.

$$\begin{align}
\frac{y^2}{2} - \ln|y| + \frac{1}{2}e^{x^2} &= 1 \\
y^2 - \ln y^2 + e^{x^2} &= 2
\end{align}$$

---

Make sure you look through the remaining examples in the book. We'll go through a few more in class, too.
