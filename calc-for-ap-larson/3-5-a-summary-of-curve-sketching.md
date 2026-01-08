---
title: 3.5 A Summary of Curve Sketching
layout: page
course: AP Calc
last-reviewed: 2026-01-08 14:11:12
prev-link: "./3-4-concavity-and-the-second-derivative-test.html"
next-link: "./3-6-optimization-problems.html"
---

- Analyze and sketch the graph of a function.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p253 1, 12, 15, 22, 27, 31, 35, 36, 42, 43, 49, 53, 57, 64 *90, 99–102*{: .ap-problems}

## Additional Resources

- AP Topics: 5.8, 5.9
- After this section, you can complete **Unit 5 Progress Checks MCQ Part B and FRQ Part A**
- Khan Academy
  - [Sketching curves of functions and their derivatives](https://www.khanacademy.org/math/ap-calculus-ab/ab-diff-analytical-applications-new/ab-5-8/v/calculus-graphing-using-derivatives){: target="_blank"}
  - [Connecting a function, its first derivative, and its second derivative](https://www.khanacademy.org/math/ap-calculus-ab/ab-diff-analytical-applications-new/ab-5-9/v/calculus-based-justification-for-function-increasing){: target="_blank"}

---

## Analyzing the Graph of a Function

Now that we've learned how to use derivatives to determine when a function is increasing or decreasing and when it's concave up or down, we can wrap everything up into one package.

> ### Guidelines for Analyzing the Graph of a Function
>
> 1. Determine the domain and range of the function
> 2. Determine the intercepts, asymptotes, and symmetry of the graph.
> 3. Find where $f'$ and $f''$ are $0$ or don't exist, then determine extrema and points of inflection.
{: .definition}

The book has a slew of examples which highlight some common things to look for, as well as organizational tips. When you read through them, here are some things to look for.

- Example 1: The table they use here is helpful. I suggest adopting it or something similar. A more detailed version of this one is below.
- Example 2: Slant asymptotes are mentioned. These occur in rational functions when the numerator is one degree higher than the denominator. This is not critical information for the AP exam.
- Example 3: Two different horizontal asymptotes / end behaviors.
- Example 4: Factoring with fractional exponents.
- Example 5: A reminder of properties of polynomials, such as number of extrema and points of inflection.
- Example 6: Mentions that vertical asymptotes are only guaranteed when you have $0$ in the denominator _and_ something other than $0$ in the numerator. $0/0$ is the indeterminate form, so they rewrite to get another version to see what's actually going on.
- Example 7–10: Note that the tables are *not* used as justification. Instead, verbal explanations are given, with any tables there only to organize work done before the explanations.
- Examples 9 and 10 are the type of problem that will likely appear on the exam.

> ## Example 1
>
> Analyze the graph of $f(x) = \frac{2(x^2-9)}{x^2-4}$
{: .example}

First is domain and range. Our only concern in this function is the denominator, which means for our domain $x\neq\pm2$. Range is tougher to analyze, and sometimes its easier to come back to this after determining your asymptotes and extrema.

For horizontal asymptotes, we have one at $y=2$. The degrees are equal, so that means leading coefficients determine that.

Vertical asymptotes will pop up when the denominator is $0$, but watch for removable discontinuities. Factoring is required to determine if that's the case.

$$\begin{align}
f(x) &= \frac{2(x^2-9)}{x^2-4} \\
     &= \frac{2(x-3)(x+3)}{(x-2)(x+2)}
\end{align}$$

Nothing divides out, so we have vertical asymptotes at $x=\pm2$.

Even symmetry is when $f(-x)=f(x)$. Since we only have $x^2$, negatives don't matter so this does have even symmetry, meaning it's symmetrical with respect to the $y$-axis.

Odd symmetry, or with respect to the origin is tested with $f(-x) = -f(x)$. That doesn't work here, so no odd symmetry. In fact, unless your function is $f(x)=0$, then you can't have both even and odd symmetry at the same time anyway.

We can get our $y$-intercepts by finding $f(0)$, which gives us a point of $\left(0,\frac{9}{2}\right)$.

The $x$-intercept we get by setting the function equal to $0$.

$$\begin{align}
0 &= \frac{2(x^2-9)}{x^2-4} \\
0 &= x^2-9 \\
\pm3 &= x
\end{align}$$

Two zeros, or $x$-intercepts at $(0,-3)$ and $(0,3)$.

Next up is increasing and decreasing intervals, which calls for the first derivative. Distribution will make this easier.

$$\begin{align}
f(x) &= \frac{2x^2-18}{x^2-4} \\
f'(x) &= \frac{4x(x^2 - 4) - 2x(2x^2-18)}{(x^2-4)^2} \\
      &= \frac{4x^3 - 16x - 4x^3 + 36x}{(x^2-4)^2} \\
      &= \frac{20x}{(x^2-4)^2} \\
\end{align}$$

Based on that, we have critical points at $0$ and $\pm2$. We know that $\pm2$ are vertical asymptotes, so the only candidate for an extrema is $0$, but each will still be a boundary for increasing and decreasing intervals.

At this point, I'm going to start setting up my table. I like working across since that follows the shape of the graph, but the book presents a vertical table. Do whatever works for you.

|         | $(\infty,-2)$ | $x=-2$ | $(-2,0)$ |     $x=0$     | $(0,2)$ | $x=2$ | $(2,\infty)$ |
| :-----: | :-----------: | :----: | :------: | :-----------: | :-----: | :---: | :----------: |
| $f(x)$  |               |  Und.  |          | $\frac{9}{2}$ |         | Und.  |              |
| $f'(x)$ |      $-$      |  Und.  |   $-$    |      $0$      |   $+$   | Und.  |     $+$      |

Now the second derivative and concavity.

$$\begin{align}
f'(x) &= \frac{20x}{(x^2-4)^2} \\
f''(x) &= \frac{20(x^2-4)^2 - (20x)(2(x^2-4) \cdot 2x)}{(x^2-4)^4} \\
       &= \frac{20(x^4 - 8x^2 + 16) - (20x)(4x^3-16x)}{(x^2-4)^4} \\
       &= \frac{20\left((x^4 - 8x^2 + 16) - (4x^4-16x^2)\right)}{(x^2-4)^4} \\
       &= \frac{20(-3x^4 + 8x^2 + 16)}{(x^2-4)^4} \\
       &= \frac{20(-x^2+4)(3x^2+4)}{(x^2-4)^4} \\
       &= \frac{-20(x^2-4)(3x^2+4)}{(x^2-4)^4} \\
       &= \frac{-20(3x^2+4)}{(x^2-4)^3} \\
\end{align}$$

Only when $x=\pm2$ do we have an undefined derivative. There's no way to produce a zero. This means we have slightly different intervals to test compared to the first derivative. Our two middle ones have merged to be $(-2,2)$.

|          | $(\infty,-2)$ | $x=-2$ | $(-2,0)$ |     $x=0$     | $(0,2)$ | $x=2$ | $(2,\infty)$ |
| :------: | :-----------: | :----: | :------: | :-----------: | :-----: | :---: | :----------: |
|  $f(x)$  |               |  Und.  |          | $\frac{9}{2}$ |         | Und.  |              |
| $f'(x)$  |      $-$      |  Und.  |   $-$    |      $0$      |   $+$   | Und.  |     $+$      |
| $f''(x)$ |      $-$      |  Und.  |   $+$    |      $+$      |   $+$   | Und.  |     $-$      |

OK, final analysis. The one critical point when $x=0$ is a confirmed minimum by both tests. We are going from decreasing to increasing, and it's concave up.

As for the intervals, I'm going to add another row for the final shape. Each interval can be either increasing or decreasing, and concave up or down. That means four different shapes. This graph happens to have all four.

|          | $(\infty,-2)$ | $x=-2$ | $(-2,0)$ |     $x=0$     | $(0,2)$ | $x=2$ | $(2,\infty)$ |
| :------: | :-----------: | :----: | :------: | :-----------: | :-----: | :---: | :----------: |
|  $f(x)$  |               |  Und.  |          | $\frac{9}{2}$ |         | Und.  |              |
| $f'(x)$  |      $-$      |  Und.  |   $-$    |      $0$      |   $+$   | Und.  |     $+$      |
| $f''(x)$ |      $-$      |  Und.  |   $+$    |      $+$      |   $+$   | Und.  |     $-$      |
|  Shape   |       ◝       |   VA   |    ◟     |     Min.      |    ◞    |  VA   |      ◜       |

Combined with the information about horizontal asymptotes and zeros, we can sketch this and likely get pretty close. Our two vertical asymptotes break this graph into three sections. The left-most one is ◝ shaped and runs up against the horizontal asymptote $y=2$ and the vertical asymptote at $x=-2$, while crossing the $x$-axis at $x=-3$.

Because of the even symmetry, the right-most section is the mirror of the left. The horizontal asymptote is still the northern boundary, the vertical asymptote at $x=2$ is on it's left, and it hits the $x$-axis at $x=3$.

In the middle we have a "cup", a concave up section that runs up against the two vertical asymptotes and has a minimum at $\left(0,\frac{9}{2}\right)$.

This also means we have a clearer picture of our range. The two outer sections get as high as $y=2$, and the middle section goes as low as $y=\frac{9}{2}$, meaning our range is $(-\infty,2)\cup\left[\frac{9}{2},\infty\right]$.

$\blacksquare$
{: .qed}
