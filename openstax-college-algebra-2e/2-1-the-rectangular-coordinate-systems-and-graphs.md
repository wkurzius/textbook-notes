---
title: 2.1 The Rectangular Coordinate Systems and Graphs
layout: notes
course: College Prep Math
---

- Plot ordered pairs in a Cartesian coordinate system.
- Graph equations by plotting points.
- Graph equations with a graphing utility.
- Find x-intercepts and y-intercepts.
- Use the distance formula.
- Use the midpoint formula.

## Assignment

- 1–4, 5–47 odd ([link](https://openstax.org/books/college-algebra-2e/pages/2-1-the-rectangular-coordinate-systems-and-graphs#fs-id1553580))
- *Recommended*: all **vocabulary** and concept blocks copied into notes

---

## Plotting Ordered Pairs in the Cartesian Coordinate System

Cartesian Coordinate System is the fancy name for this:

![Cartesian coordinate system](./img/2-1-ccs.jpg)

It consists of an **$x$-axis** (horizontal) and a **$y$-axis** (vertical), and the point where they meet is the **origin**. The four areas that are created by the intersecting axes are **quadrants** and are numbered I through IV starting with the top-right and moving counter-clockwise.

An **ordered pair** is used to identify the location of a point on the plane, for example $(3,-1)$. The first number is the **$x$-coordinate** and the second is the **$y$-coordinate**. Starting from the origin, you use these numbers to locate your point. In this case, you move along the $x$-axis by $3$ and the $y$-axis by $-1$.

![The point (3,-1) plotted](./img/2-1-plot-point.jpg)

## Graphing Equations by Plotting Points

Equations with two variables can be graphically represented on the coordinate plane since each axis can represent one of the variables. An equation with to variables typically looks like

$$\begin{align}
y= 2x-1
\end{align}$$

The equation has an infinite number of solutions, and you can find any one of those solutions by plugging in one number, then solving for the other. In the one above, the equation is written in terms of $x$, meaning it's easiest to use $x$-values to determine $y$-values, though there's nothing stopping you from doing it the other way. Below are some coordinate pairs that were determined by choosing an $x$-value first.

![Table of values](./img/2-1-table.png)

And when you plot those points on the coordinate plane, you get an idea of the equation's shape.

![2x-1 graphed](./img/2-1-2x-1.jpg)

Note that you shouldn't automatically connect the dots of a graph. I can tell you that this equation doesn't have any gaps in it, but that's not always the case. More on that later on.

## Finding $x$-intercepts and $y$-intercepts

Intercepts are where the graph of an equation crosses either axis. Every intercept has the property that at least one of the values is $0$. More specifically, every $x$-intercept will have a $y$-value of $0$, and vice-versa for $y$-intercepts.

To find intercepts algebraically, simply plug $0$ in for the appropriate variable and solve for the other.

$$\begin{align}
y &= 2x - 1 \\
y &= 2(0) - 1  \\
y &= -1 \\
&(0,-1) &&\text{The $y$-intercept} \\[1.5em]
y &= 2x - 1 \\
0 &= 2x-1 \\
1 &= 2x \\
\frac{1}{2} &= x \\
&\left(\frac{1}{2},0\right) &&\text{The $x$-intercept} \\[1.5em]
\end{align}$$

## The Distance Formula

The Pythagorean Theorem relates the length of the three sides of a right triangle.

$$\begin{align}
a^2 + b^2 = c^2
\end{align}$$

We can use this to find the distance between any two points by simply making that distance part of a right triangle. If you connect the two points with one horizontal and one vertical line, you'll have a right triangle with your distance as the long side. The lengths of the two lines you added will be $a$ and $b$.

![Right triangle and distance between two points](./img/2-1-distance.jpg)

If drawing a picture isn't your thing, there is the formula itself.

$$\begin{align}
d = \sqrt{(x_1-x_2)^2+(y_1-y_2)^2}
\end{align}$$

- $(x_1-x_2)$ gives you the horizontal distance
- $(y_1-y_2)$ gives you the vertical distance
- Squaring and then adding those two is dicated by the Pythagorean Theorem
- Find the square root is needed since the sum would produce $d^2$, while we need just $d$

In the picture above, we have the points $(1,1)$ and $(5,6)$. Let's find the distance. I'll use $(5,6)$ as the first point and $(1,1)$ as the second just to make the subtraction easier, but the other way would work just as well.

$$\begin{align}
d &= \sqrt{(5-1)^2+(6-1)^2} \\
  &= \sqrt{(4)^2+(5)^2} \\
  &= \sqrt{16+25} \\
d &= \sqrt{41}
\end{align}$$

Expect to get irrational answers like we just did above. Whole number results are rare.

## The Midpoint Formula

To find the midpoint between two points, simply average their $x$ and $y$-coordinates. This works because the midpoint is both horizontally and vertically in the middle of the two original points.

![Midpoint](./img/2-1-midpoint.jpg)

Given the points $(1,1)$ and $(3,5)$, the midpoint would be

$$\begin{align}
\left(\frac{x_1+x_2}{2}, \frac{y_1+y_2}{2}\right) = \left(\frac{1+3}{2}, \frac{1+5}{2}\right) = (2,3)
\end{align}$$
