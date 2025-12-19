---
title: 3.3 Increasing and Decreasing Functions and the First Derivative Test
layout: page
course: AP Calc
last-reviewed: 2025-12-18 09:48:25
prev-link: 
next-link: 
---

- Determine intervals on which a function is increasing or decreasing.
- Apply the First Derivative Test to find relative extrema of a function.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p233 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55, 57, 58, 59–65 odd,75, 76, 80, 81–86, 90 *97, 99, 101, 115–117*{: .ap-problems}

## Additional Resources

- AP Topics: 5.3
- After this section, you can complete **Unit 5 Progress Check MCQ Part A**
- Khan Academy
  - [Determining intervals on which a function is increasing or decreasing](https://www.khanacademy.org/math/ap-calculus-ab/ab-diff-analytical-applications-new/ab-5-3/v/increasing-decreasing-intervals-given-the-function){: target="_blank"}

---

## Increasing and Decreasing Functions

The theme of this chapter is curve sketching, or how to determine the features of a curve without technology. In the first section we found out how to find extreme points. After a short detour with the Mean Value Theorem—which is used to prove a lot of the ideas in this section—we're back to curve sketching with increasing and decreasing functions.

This is a pretty straightforward idea on the surface. If the derivative is positive, the slope is positive, so the function is increasing. Negative means decreasing. However, testing every number is not realistic, so we'll combine this with the idea of critical points. Critical points were all candidates for local extrema, so that means in between those critical points, the slope will be consistently positive or negative.

> ### Example
>
> Find the open intervals on which $f(x)=x^3-\frac{3}{2}x^2$ is increasing or decreasing.
{: .example}

We'll start with the same process for finding extrema, meaning we need a derivative so we can find critical points.

$$\begin{align}
f(x) &= x^3 - \frac{3}{2}x^2 \\
f'(x) &= 3x^2 - 3x \\[1em]
0 &= 3x(x-1)
\end{align}$$

The derivative is a polynomial, so we don't need to worry about any places where is doesn't exist, so we're left with critical points at $x=0$ and $x=1$. These will act as our interval boundaries.

At this point, it's helpful to set up a table or a sign chart to keep track of your intervals. In our case, we have two critical points, meaning three intervals. I'll also set up rows for the test and resulting sign. the next steps, which is the test and .

| Interval     | $x<0$ | $0<x<1$ | $x>1$ |
| ------------ | :---: | :-----: | :---: |
| $f'$ test    |       |         |       |
| Sign of $f'$ |       |         |       |

Now, pick a value in each interval and plug it into your derivative to see if it's positive or negative.

With the end intervals, pick massive numbers to make your life easier. We only need a sign, so the exact value is unnecessary. In this case, our derivative is an even degree polynomial with a positive coefficient, so you should get positives when you test. So, for these end intervals, our function is increasing.

For the other interval we need to pick a reasonable value to test. I'll go with $\frac{1}{2}$, which leads to $f'\left(\frac{1}{2}\right)=\frac{3}{2}\left(-\frac{1}{2}\right)=-\frac{3}{4}$

> Tip: you have access to both the original and factored versions of the derivative, so use whichever will be easiest. Though, factored might be preferred since you just need the sign.

Here is the completed table.

| Interval     |        $x<0$         |                  $0<x<1$                  |        $x>1$        |
| ------------ | :------------------: | :---------------------------------------: | :-----------------: |
| $f'$ test    | $f'(-100) = 29\,700$ | $f'\left(\frac{1}{2}\right)=-\frac{3}{4}$ | $f'(100) = 29\,700$ |
| Sign of $f'$ |         $+$          |                    $-$                    |         $+$         |
| Conclusion   |         Inc.         |                   Dec.                    |        Inc.         |

■
{: .qed}

## The First Derivative Test

The above process leads to a nice side effect: you can quickly spot whether a critical point is a maximum or a minimum. If consecutive intervals switch from increasing to decreasing, then you have a relative maximum. It's a minimum when going from decreasing to increasing.

Just watch for situations where part of the domain is missing. For $f(x)=\frac{1}{x^2}$, you end up with a table like this.

| Interval     | $x<0$ | $x>0$ |
| ------------ | :---: | :---: |
| Sign of $f'$ |  $+$  |  $-$  |
| Conclusion   | Inc.  | Dec.  |

This implies that there is a a maximum at $x=0$, but $f(0)$ does not exist.
