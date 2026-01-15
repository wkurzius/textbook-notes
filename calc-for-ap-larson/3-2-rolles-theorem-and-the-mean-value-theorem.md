---
title: 3.2 Rolle's Theorem and the Mean Value Theorem
layout: page
course: AP Calc
last-reviewed: 2025-12-16 09:33:07
prev-link: "./3-1-extrema-on-an-interval.html"
next-link: "./3-3-the-first-derivative-test.html"
---

- Understand and use Rolle's Theorem.
- Understand and use the Mean Value Theorem.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p224 1, 2, 9–21 odd, 24–26, 29, 31, 35, 40–48 even, 52, 53 *64–66, 81–83*{: .ap-problems}

## Additional Resources

- AP Topics: 5.1
- Khan Academy
  - [Using the mean value theorem](https://www.khanacademy.org/math/ap-calculus-ab/ab-diff-analytical-applications-new/ab-5-1/v/mean-value-theorem-1){: target="_blank"}

---

## When Instantaneous Matches Average

Rolle's theorem is another theorem that applies a rigorous definition to something that, at least in insight, is fairly simple.

> ### Rolle's Theorem
> If a real-valued function $f$ is continuous on a proper closed interval $[a, b]$, differentiable on the open interval $(a, b)$, and $f(a) = f(b)$, then there exists at least one $c$ in the open interval $(a, b)$ such that $f'( c ) = 0$.
{: .definition}

In other words, drawing a curve between two points that have the same vertical value means at some point that curve is flat.

Rolle's theorem doesn't directly appear on the AP exam, and is really only a jumping off point for the meat of the section, the Mean Value Theorem.

> ### Mean Value Theorem
>
> If $f$ is continuous on the closed interval $[a,b]$ and differentiable on the open interval $(a,b)$, then there exists a number $c$ in $(a,b)$ such that
>
> $$ f'(c)=\frac{f(b)-f(a)}{b-a} $$
{: .definition}

In other words, if you draw a secant line from the point on the curve at the beginning of the interval to the end, there is at least one point on the curve itself with a matching slope.

> The proof for this is in the book, but a visual representation might help first. Here is [a graph in Desmos](https://www.desmos.com/calculator/2myh3vghif){: target="_blank"} that shows a function on a closed interval with a secant line connecting the two endpoints.
>
> In that graph, the third function $h(x)$—which is hidden by default—is just the difference between the curve and the secant line. Since $h(x)$ has endpoints with matching verticals, this fits Rolle's Theorem meaning there's at least one point where $h'(c)=0$. From there we can conclude that the derivatives of the other two functions at $c$ must be the same.

The Mean Value Theorem is an important underlying concept for both problem solving and proving other theorems. With that said, check out the [Cram Sheet](../pdfs/ap-calc-cram-sheet.pdf) I shameless stole from someone else.

> ## Example 1
>
> For $f(x) = 5 - \frac{4}{x}$, find all values of $c$ in the interval $(1,4)$ where
>
> $$\begin{align}
> f'(c) &= \frac{f(4)-f(1)}{4-1}
> \end{align}$$
{: .example}

In other words, find all the points in that interval that satisfy the Mean Value Theorem. That means we need the average rate of change over that interval.

$$\begin{align}
\frac{f(4)-f(1)}{4-1} &= \frac{4-1}{4-1} \\
                      &= 1
\end{align}$$

Now we need the derivative of $f$ so we can see where it equals our average rate of change. Best to rewrite with negative exponents to make this easier.

$$\begin{align}
f(x)  &= 5 - 4x^{-1} \\
f'(x) &= 4x^{-2} \\
f'(x) &= \frac{4}{x^2} \\
\end{align}$$

Now set it equal to our average rate of change.

$$\begin{align}
1 &= \frac{4}{x^2} \\
x^2 &= 4 \\
x &= \pm 2
\end{align}$$

Only one of those falls within our interval, so one point satisfies and that is when $x=2$.

■
{: .qed}

> ## Example 2
>
> Two stationary police cars, both equipped with radar, are 5 miles apart on a highway. As a truck passes the first patrol car, its speed is clocked at 55 miles per hour. Four minutes later, the truck passes the second patrol car and its speed is clocked at 50 miles per hour.
>
> Did the truck exceed the speed limit of 55 miles per hour at some time during the 4 minutes?
{: .example}

Without doing anything calculus related, we can get the truck's average speed over that interval. It traveled 5 miles in 4 minutes, so

$$\begin{align}
\frac{\units[5]{mi}}{\units[4]{min}} \cdot \frac{\units[60]{min}}{\units[1]{hr}} =
\frac{\units[300]{mi}}{\units[4]{hr}} = \units[75]{mph}
\end{align}$$

By the Mean Value Theorem, if the truck's average speed was 75 miles per hour, it must have traveled at 75 miles per hour at some point (likely way more than that for a significant portion of the time).

■
{: .qed}

Problems don't get much more complicated than that. The trick is recognizing _when_ it needs to be applied, and also invoking its name in any FRQs.
