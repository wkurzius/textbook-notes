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

In Example 2 from the book, it uses our area of a circle model from above and asks for the rate of change of the area when the radius is 4 feet and the rate at which the radius changes is 1 foot per second.

$$\begin{align}
\frac{dA}{dt} &= 2\pi r \frac{dr}{dt} \\
&= 2\pi (4\text { ft})(1 \text{ft/sec}) \\
& = 8\pi \text{ ft}^2\text{/sec}
\end{align}$$

Note the use of units. Dimensional analysis is highly recommended so that you can a) determine the correct units, and b) verify you arrived at a correct solution. If the units don't make sense, there is likely a problem with your work. Here, square feet per second makes sense we are talking about area over time.
