---
title: 2.7 Related Rates
layout: notes
course: AP Calc
---

- Find a related rate.
- Use related rates to solve real-life problems.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p195 2, 3, 7, 10–12, 14, 15–19 odd, 20, 23, 24, 28 *35, 36, 40, 45–47*{: .ap-problems}

## Additional Resources

- AP Topics: 4.2, 4.3, 4.4, 4.5
- Khan Academy
  - [Straight-line motion: connecting position, velocity, and acceleration](https://www.khanacademy.org/math/ap-calculus-ab/ab-diff-contextual-applications-new/ab-4-2/v/one-dimensional-motion-with-calculus){: target="_blank"}
  - [Rates of change in other applied contexts (non-motion problems)](https://www.khanacademy.org/math/ap-calculus-ab/ab-diff-contextual-applications-new/ab-4-3/v/modeling-a-forgetting-curve){: target="_blank"}
  - [Introduction to related rates](https://www.khanacademy.org/math/ap-calculus-ab/ab-diff-contextual-applications-new/ab-4-4/v/rates-of-change-between-radius-and-area-of-circle){: target="_blank"}
  - [Solving related rates problems](https://www.khanacademy.org/math/ap-calculus-ab/ab-diff-contextual-applications-new/ab-4-5/e/related-rates){: target="_blank"}

---

## Finding Related Rates

With implicit differentiation, we can start looking at how math models change with respect to time. For instance, how the area of a circle changes with respect to time.

$$\begin{align}
\frac{d}{dt}[A] &= \frac{d}{dt}[\pi r^2] \\
\frac{dA}{dt} &= 2\pi r \frac{dr}{dt}
\end{align}$$

What this means is that the rate of change of the area is related to both the current radius and the rate of change of the radius. Typically, these types of problems provide values for most of the variables or rates, and you'll be left to solve for the remaining one.

## Example 1

> A pebble is dropped into a calm pond, causing ripples in the form of concentric circles. The radius $r$ of the outer ripple is increasing at a constant rate of $1$ foot per second. When the radius is $4$ feet, at what rate is the total area $A$ of the disturbed water changing?
{: .example}

We can use our area of a circle model from above for this.

$$\begin{align}
\frac{dA}{dt} &= 2\pi r \frac{dr}{dt} \\
&= 2\pi (4\text { ft})(1 \text{ft/sec}) \\
& = 8\pi \text{ ft}^2\text{/sec}
\end{align}$$

$\blacksquare$
{: .qed}

Note the use of units. Dimensional analysis is highly recommended so that you can a) determine the correct units, and b) verify you arrived at a correct solution. If the units don't make sense, there is likely a problem with your work. Here, square feet per second makes sense we are talking about area over time.

## Example 2

> An airplane flying at an altitude of $6$ miles is on a path that will take it directly over a radar tracking station. The direct distance from the plane to the station $s$ is decreasing at a rate of $400$ miles per hour when $s = 10$ miles. What is the horizontal speed of the plane?
>
>> ![](./img/2-7-plane.png){: width="300"}
>>
>> **Figure 2.7.1** An airplane flying at an altitude of $6$ miles, $s$ miles from the station.
> {: .figure}
{: .example}



$\blacksquare$
{: .qed}
