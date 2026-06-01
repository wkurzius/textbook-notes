---
title: 5.2 Growth and Decay
layout: page
course: AP Calc
last-reviewed: 2026-03-23 10:15:12
prev-link: "./5-1-slope-fields-and-eulers-method.html"
next-link: "./5-3-separation-of-variables.html"
---

- Use separation of variables to solve a simple differential equation.
- Use exponential functions to model growth and decay in applied problems.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p384 (20 problems) 1, 6, 9, 11, 12, 14, 15, 19, 23, 25, 31, 38, 39, 42, 45, 48, 54, 59–61

## Additional Resources

- AP Topics: 7.6, 7.7, 7.8
- Khan Academy
  - [Finding general solutions using separation of variables](https://www.khanacademy.org/math/ap-calculus-ab/ab-differential-equations-new/ab-7-6/v/separable-differential-equations-introduction){: target="_blank"}
  - [Finding particular solutions using initial conditions and separation of variables](https://www.khanacademy.org/math/ap-calculus-ab/ab-differential-equations-new/ab-7-7/v/finding-constant-of-integration-rational){: target="_blank"}
  - [Exponential models with differential equations](https://www.khanacademy.org/math/ap-calculus-ab/ab-differential-equations-new/ab-7-8/v/modeling-population-with-simple-differential-equation){: target="_blank"}

---

## Differential Equations

Now that we've introduced differential equations involving both $x$ and $y$, it's time to start solving them. The technique we'll use is called **separation of variables**, and revolves around $\frac{dy}{dx}$ behaving like a fraction (even though it isn't).

> ### Solving a Differential Example
>
> Find the general solution of the differential equation.
>
> $$\begin{align}
> \frac{dy}{dx} &= \frac{2x}{y} \\
> \end{align}$$
{: .example}

We'll want to get all the $y$ terms on one side and the $x$ terms on the other. This means splitting up $dy$ and $dx$.

$$\begin{align}
\frac{dy}{dx} &= \frac{2x}{y} \\
       y\, dy &= 2x \, dx \\
  \int y\, dy &= \int 2x \, dx \\
\frac{1}{2}y^2 &= x^2 + C \\
y^2 - 2x^2 &= C
\end{align}$$

$\blacksquare$
{: .qed}

We'll eventually get into how to solve the more complicated ones, but this is enough to get us through the next part.

## Growth and Decay Models

In an exponential growth or decay function you see a pattern of repeated multiplication. In other words, the rate of change is just taking the current value and multiplying by the base. Think  doubling or tripling an amount.

$$\begin{align}
\frac{dy}{dt} = ky
\end{align}$$

Now that we know how to solve simple differentials, we can find a general solution to this.

$$\begin{align}
\frac{dy}{dt} &= ky \\
\frac{dy}{y} &= k\, dt \\
\int \frac{1}{y} \, dy &= \int k \, dt \\
\ln y &= kt + C \\
y &= e^{kt + c} \\
y &= e^{kt}e^C \label{exp-prop}\\
y &= Ce^{kt} \label{const}
\end{align}$$

Steps \ref{exp-prop} and \ref{const} are common with separation of variables, and explain why you started seeing $C$ as a factor rather than an addend. Multiplying bases results in addition of powers, so we applied that to step \ref{exp-prop}, and in step \ref{const} $e^C$ is just a constant, so we can just drop the base.

> ### Exponential Growth and Decay
>
> $$\begin{align}
> y = Ce^{kt}
> \end{align}$$
>
> where $C$ is the **initial value**, $k$ the **constant of proportionality**.
{: .definition}

Let's apply this to a few examples.

> ### Example: Exponential Growth
>
> When $t=0$, $y=2$. And when $t=2$, $y=4$. If the rate of change is proportional to $y$, then write an expression for $y(t)$.
{: .example}

First off, since we get $t=0$, we get the initial condition $C$ for free. We still need $k$, but we'll use our other point to find that.

$$\begin{align}
y &= 2e^{kt} \\
4 &= 2e^{k\cdot2} \\
\ln 2 &= 2k \\
\frac{1}{2}\ln 2 &= k \\[1em]
y&\approx 2e^{0.3466t}
\end{align}$$

$\blacksquare$
{: .qed}

> ### Example: Population Growth
>
> An experimental population of fruit flies increases according to the law of exponential growth. There were 100 flies after the second day of the experiment and 300 flies after the fourth day. Approximately how many flies were in the original population?
{: .example}

No initial condition this time, so we'll have to get creative. We have two points, so we can solve for one variable using one point, then substitute when using the other point. (If you remember trying to slope-intercept form from two points, it's a similar strategy.)

$$\begin{align}
y &= Ce^{kt} \\
100 &= Ce^{k\cdot 2} \\
\frac{100}{e^{2k}} &= C \\
100e^{-2k} &= C \\[1em]

300 &= Ce^{4k} \\
300 &= \left(100e^{-2k}\right)e^{4k} \\
300 &= 100e^{2k} \\
\ln3 &= 2k \\
\frac{1}{2}\ln3 &= k \\[1em]

k &\approx 0.5493
\end{align}$$

We can solve for $C$ now that we have $k$.

$$\begin{align}
100 &= Ce^{0.5493(2)} \\
100e^{-0.5493(2)} &= C \\[1em]
C&\approx 33
\end{align}$$

Although we just needed the initial condition, for completion's sake our model is $y=33e^{0.5493t}$.

$\blacksquare$
{: .qed}

> ### Example: Newton's Law of Cooling
>
> Let $y$ represent the temperature (in °F) of an object in a room whose temperature is kept at a constant 60°F. The object cools from 100°F to 90°F in 10 minutes. How much longer will it take for the temperature of the object to decrease to 80°F?
{: .example}

An object cools proportional to the ambient temperature (which you don't need to know and instead will be given to you if needed). We'll start with our initial definition of the proportional rate of change, but modified to account for the difference in temperature of the room.

$$\begin{align}
\frac{dy}{dt} &= k(y-60) \\
\int \frac{dy}{y-60} &= \int k \, dt \\
\ln(y-60) &= kt + C \\
y &= Ce^{kt}+60
\end{align}$$

OK, so we have a slightly different model to work with. We'll keep the same strategy, but adjust if we need to. First up is finding $C$

$$\begin{align}
100 &= Ce^{0k} + 60 \\
40 &= C \\[1em]
\end{align}$$

Turns out that $C$ is not the initial condition. Remember, different model. Old assumptions are out the window.

$$\begin{align}
90 &= 40e^{10k} + 60 \\
\ln\frac{3}{4} &= \ln e^{10k} \\
\frac{1}{10}\ln\frac{3}{4} &=k \label{newton-nocalc}\\
-0.0288 &\approx k \\[1em]

y&= 40e^{-0.0288t}+60
\end{align}$$

You can find out when this will be 80°F through a little calculator work, which I'll skip here. The mechanics of solving these is the important bit, and most AP problems involving this topic are not in the calculator portion. That just means your multiple choice solutions will look like what's in equation $\ref{newton-nocalc}$.

$\blacksquare$
{: .qed}

## An Alternative Approach

So, you can technically do each of those examples above with what you learned in algebra. Exponential models can be built if you know the initial condition $C$, the growth (or decay) rate $a$, and how frequently that growth happens $t$.

> ### Alternate Example: Exponential Growth
>
> When $t=0$, $y=2$. And when $t=2$, $y=4$. If the rate of change is proportional to $y$, then write an expression for $y(t)$.
{: .example}

Using our old exponential modeling rules, we knew the initial amount of $y=2$, and we technically knew the rate of growth, though it wasn't called out by name. We went from $2$ to $4$, so it doubled, but it took two ticks of $t$ leading to $\frac{t}{2}$ as the exponent.

$$\begin{align}
y = 2\cdot2^{t/2}
\end{align}$$

Of course, AP Calculus assumes you use calculus, so the bases will be almost exclusively $e$. But you can rewrite it. Just find what power you need to make $e$ to be $2$.

$$\begin{align}
e^x &= 2 \\
x &= \ln 2
\end{align}$$

That gives us $y=2e^{\ln2 \cdot t/2}$, meaning $k=\frac{1}{2}\ln2$, which matches what we got earlier.

$\blacksquare$
{: .qed}

> ### Alternate Example: Population Growth
>
> An experimental population of fruit flies increases according to the law of exponential growth. There were 100 flies after the second day of the experiment and 300 flies after the fourth day. Approximately how many flies were in the original population?
{: .example}

Going from 100 to 300 over two days means it tripled every two days, so we already have this.

$$\begin{align}
y = C3^{t/2}
\end{align}$$

Now we can plug in a point to find $C$.

$$\begin{align}
100 &= C3^{2/2} \\
\frac{100}{3} &= C \\[1em]

y = 33.\overline{3} \cdot 3^{t/2}
\end{align}$$

Again, you can rewrite the base like above and end up with $k=\frac{1}{2}\ln3$.

$\blacksquare$
{: .qed}

> ### Alternate Example: Newton's Law of Cooling
>
> Let $y$ represent the temperature (in °F) of an object in a room whose temperature is kept at a constant 60°F. The object cools from 100°F to 90°F in 10 minutes. How much longer will it take for the temperature of the object to decrease to 80°F?
{: .example}

Knowing that something won't cool below the temperature of the room, we can look at this a different way. An object is 40°F above the room temp and cools to 30°F above room temp in 10 minutes.

$$\begin{align}
y = 40\cdot \frac{3}{4}^{t/10} + 60
\end{align}$$

We add 60 at the end to adjust our floor. The original growth/decay model assumes that to be zero, so we need to adjust accordingly.

And like the others, you can rewrite in the base you need and we get $k= \frac{1}{10}\ln\frac{3}{4}$.

$\blacksquare$
{: .qed}

This alternative approach can save you time depending on the problem, but it's not always helpful. One type of problem where this won't help (though it can get you close) is if you get the rate of change instead of a growth rate. In that case you need to rely on $\frac{dy}{dt}=kt$.
