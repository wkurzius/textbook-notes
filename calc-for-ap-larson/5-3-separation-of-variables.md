---
title: 5.3 Separation of Variables
layout: page
course: AP Calc
last-reviewed:
prev-link: "./5-2-growth-and-decay.html"
next-link: "./6-1-area-of-a-region-between-two-curves.html"
---

- Recognize and solve differential equations that can be solved by separation of variables.
- Use differential equations to model and solve applied problems.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p393 (21 problems) 5–9 odd, 13–25 odd, 33, 37, 39, 45, 57, 61–63, 79–81

## Additional Resources

- AP Topics: 7.6, 7.7
- After this section, you can complete these Progress Checks on AP Classroom
  - **Unit 7 MCQ**
  - **Unit 7 FRQ Part A**
  - **Unit 7 FRQ Part B**
- Khan Academy
  - [Finding general solutions using separation of variables](https://www.khanacademy.org/math/ap-calculus-ab/ab-differential-equations-new/ab-7-6/v/separable-differential-equations-introduction){: target="_blank"}
  - [Finding particular solutions using initial conditions and separation of variables](https://www.khanacademy.org/math/ap-calculus-ab/ab-differential-equations-new/ab-7-7/v/finding-constant-of-integration-rational){: target="_blank"}

---

## Separation of Variables

We saw this for the first time in the [last section](./5.2-growth-and-decay.md), but we'll look at more varied examples here. In general, you can separate variables if it can be written in the form below.

$$\begin{align}
\frac{dy}{dx} = f(x)g(y)
\end{align}$$

If you can get it in this form (and I do suggest it), you should check when $g(y)=0$. This will give you your constant solutions since if $g(y)=0$ then $\frac{dy}{dx}=0$.

> ### Example: Find a General Solution
>
> Find the general solution of $(x^2+4)\frac{dy}{dx} = xy$.
{: .example}

Solving for $\frac{dy}{dx}$ gives us $\frac{dy}{dx}=\frac{xy}{x^2+4}$. So, $f(x)=\frac{x}{x^2+4}$ and $g(y)=y$. From there, if $g(y)=0$ then $y=0$, so we have at least one constant solution. Now we can move on to our general solution.

$$\begin{align}
\frac{dy}{dx}&=\frac{xy}{x^2+4} \\
\frac{1}{y}\,dy &= \frac{x}{x^2+4}\,dx \\
\int \frac{1}{y}\,dy &= \int \frac{x}{x^2+4}\,dx \\
\ln |y| &= \frac{1}{2}\ln(x^2 + 4) + C \\
\ln |y| &= e^{\frac{1}{2}\ln(x^2 + 4) + C} \\
\ln |y| &= e^{\frac{1}{2}\ln(x^2 + 4)}e^C \\
\ln |y| &= e^{\ln\sqrt{x^2 + 4}}e^C \\
|y| &= e^C\sqrt{x^2+4} \\
\end{align}$$

> There's a lot of exponent and log rules happening in those last few steps. Make sure you review them if you're not sure how each step one about.

At this point, there are some things that need addressing. First is the absolute value. Ideally we want $y=$, so to get that we can rewrite $e^C$ with a $\pm$.

$$\begin{align}
y &= \pm e^C\sqrt{x^2+4} \\
\end{align}$$

Now, we could put $C$ instead of $\pm e^C$, but we have to verify that every constant is covered first. In this case, ${\pm e^C \neq 0}$, but we already found that $y=0$ is a solution, so we're in the clear.

$$\begin{align}
y &= C\sqrt{x^2+4} \\
\end{align}$$

$\blacksquare$
{: .qed}

> ### Example 2: Particular Solutions
>
> Given the initial solution of $y(0)=1$, find the particular solution of the differential equation.
>
> $$\begin{align}
> xy\, dx + e^{-x^2}\left(y^2-1\right)\, dy = 0
> \end{align}$$
{: .example}

Finding a particular solution just means an extra step after getting the general one. So, we'll work this one out like before. Rearrange so we can find constant solutions, then separate and integrate.

$$\begin{align}
xy\, dx + e^{-x^2}\left(y^2-1\right)\, dy = 0 \\
e^{-x^2}\left(y^2-1\right)\, dy = -xy\, dx \\
\frac{dy}{dx} = -\frac{xy}{e^{-x^2}\left(y^2-1\right)}dx \\
\end{align}$$

$g(x)=\frac{y}{y^2-1}$, so $y=0$ is a solution again. Also, we can quickly see that $y\neq\pm1$.

$$\begin{align}
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

$\blacksquare$
{: .qed}

Make sure you look through the remaining examples in the book. We'll go through a few more in class, too.
