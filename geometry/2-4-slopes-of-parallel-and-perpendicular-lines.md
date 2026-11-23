---
title: 2.4 Slopes of Parallel and Perpendicular Lines
layout: page
course: Geometry
prev-link: ./2-3-parallel-lines-and-triangles.html
next-link: ./3-1-reflections.html
---

- Show that two lines in the coordinate plane are parallel by comparing their slopes, and use that information to solve problems
- Show that two lines in the coordinate plane are perpendicular by comparing their slopes, and use that information to solve problems

## Assignment

- Option 1: **p97**{: .envision-hw-blue} 13, 17--24, 26, 28--32 (16 problems, [PDF link](./pdf/aga_gm_0204_pps.pdf){: target="_blank"})
- Option 2: **IXL**{: .ixl} (SmartScore ≥70 on each)
  - [Slopes of parallel and perpendicular lines](https://www.ixl.com/math/geometry/slopes-of-parallel-and-perpendicular-lines){: target="_blank"}
  - [Equations of parallel and perpendicular lines](https://www.ixl.com/math/geometry/equations-of-parallel-and-perpendicular-lines){: target="_blank"}

---

## Slope

If you remember from Algebra, slope is used to measure the steepness of a line. Usually displayed as a fraction, it is the ratio of the vertical climb of a line versus its horizontal run. More simply put, it's rise over run.

Numerically, a positive slope means it goes up when looking at it left-to-right, and a negative slope means it's going down. Small slopes (close to zero) mean the line has a shallow slope, while larger ones mean a steep slope. For example, a slope of $5/1$ means the line is steep and going up. A slope of $-1/2$ indicates a shallow slope that is decreasing.

A slope of $0$ tells you the line isn't going up or down, so it's horizontal.

Given two points on a line, you can calculate its slope through subtraction.

<!-- prettier-ignore -->
> ### Calculating Slope
>
> Given two points on a line, its slope $m$ can be expressed as a ratio using the difference between the $y$-values and $x$-values.
>
> $$\begin{align}
> m = \frac{y_1 - y_2}{x_1 - x_2}
> \end{align}$$
{: .definition}

Vertical lines don't have a slope, sometimes listed as "undefined". If you try to use the equation above for a vertical line, you'll end up dividing by zero.

## Parallel Lines

**If two lines have the exact same slope, then they are parallel**. They climb (or fall) at the exact same rate, so they will never intersect. Given that knowledge, you can check if lines are parallel by comparing their slopes.

<!-- prettier-ignore -->
> ## Example: Check Parallelism
>
> Line $j$ passes through the points $(-2,2)$ and $(2,-3)$. Line $k$ passes through $(1,2)$ and $(4,-2)$. Are lines $j$ and $k$ parallel?>
{: .example}

**SOLUTION** We need the slope of both lines to see if they are parallel

$$\begin{align}
m_j &= \frac{2-(-3)}{-2-2} \\
    &= \frac{5}{-4} \\
    &= -\frac{5}{4}\\[2em]
m_k &= \frac{2-(-2)}{1-4} \\
    &= \frac{4}{-3} \\
    &= -\frac{4}{3}
\end{align}$$

Since $-\frac{5}{4}\neq-\frac{4}{3}$ the lines are not parallel to each other.

$\blacksquare$
{: .qed}

This works for vertical lines, too. If two lines both have an undefined slope then they are parallel.

## Perpendicular Lines

Perpendicular lines form a right angle when the intersect, and you can also spot these based on their slopes. **Perpendicular lines have slopes that are negative reciprocals of each other**. That means their sign is flipped *and* the fraction. For example, $2/3$ and $-2/3$ are negative reciprocals.

If you aren't sure by just looking at the number, you can always multiply them. The result will be $-1$ if they are negative reciprocals.

<!-- prettier-ignore -->
> ## Example: Check Perpendicularity
>
> Line $p$ goes through the points $(-1,5)$ and $(1,2)$. Line $q$ goes through $(-3,2)$ and $(0,4)$. Are $p$ and $q$ perpendicular?
{: .example}

**SOLUTION** Like before we need to determine slopes and then compare them.

$$\begin{align}
m_p &= \frac{5-2}{-1-1} \\
    &= -\frac{3}{2}\\[2em]
m_q &= \frac{2-4}{-3-0} \\
    &= \frac{2}{3}
\end{align}$$

Our fraction is flipped, making them reciprocals, and so is the sign, so they are indeed perpendicular. Just to be sure, if we multiply the two slopes, we should get $-1$

$$\begin{align}
-\frac{3}{2} \cdot \frac{2}{3} = -1
\end{align}$$

$\blacksquare$
{: .qed}

## Point-Slope Form

Before we get into the next part, we need to take a slight detour and revisit **point-slope form**.

You can probably rattle off slope-intercept form by memory at this point (it's $y=mx+b$ in case you did forget), and it's really good at telling you what a line looks like. However, slope-intercept is not very helpful when you need to write an equation. More helpful is point-slope form, which is just a rewritten form of the slope formula.

<!-- prettier-ignore -->
> #### Point-Slope Form
>
> Given a line's slope $m$ and a point that line crosses $(x_1,y_1)$ the equation for that line is …
>
> $$\begin{align}
> y-y_1 = m(x-x_1)
> \end{align}$$
{: .definition}

If you need your equation to start with $y=$ then you can move the one term over to get …

$$\begin{align}
y = m(x-x_1) + y_1
\end{align}$$

This is usually helpful when graphing on the yellow TI-84 calculators.

<!-- prettier-ignore -->
> ## Example: Point-Slope Form
>
> Write the equation of the line that passes through the point $(7,3)$ and has a slope of $3/5$.
{: .example}

**SOLUTION** Using point-slope form, and its alternative, we get …

$$\begin{align}
y-3=\frac{3}{5}(x-7) \\
y=\frac{3}{5}(x-7)+3
\end{align}$$

For me, this is fine. Both are valid equations for the line. However, the book's answers, along with IXL, expect your answer in slope-intercept form. So, let's finish the example by converting the above to slope-intercept form, or ${y=mx+b}$.

$$\begin{align}
y &= \frac{3}{5}(x-7)+3 \\
y &= \frac{3}{5}x - \frac{21}{5} + 3 \\
  &= \frac{3}{5}x - \frac{21}{5} + \frac{15}{5} \\
  &= \frac{3}{5}x - \frac{6}{5} \\
\end{align}$$

$\blacksquare$
{: .qed}

## Writing Equations of Parallel and Perpendicular

Now that we reviewed equation writing, we can write them when parallel and perpendicular lines are in the mix.

<!-- prettier-ignore -->
> ## Example: Write the Equation for a Parallel Line
>
> Write the equation for the line that passes through the point $(4,1)$ and is parallel to ${y=\frac{1}{2}x-3}$. Then write the equation for the line perpendicular to it, also passing through $(4,1)$.
{: .example}

**SOLUTION** The only difference between this example and the one immediately before is that our slope is "hidden" in the equation. Luckily, it's in slope-intercept form so we can immediately see the slope is $\frac{1}{2}$.

$$\begin{align}
y - 1 &= \frac{1}{2}(x - 4)  \\
    y &= \frac{1}{2}(x - 4) +1 \\
    y &= \frac{1}{2}x - 3
\end{align}$$

All three of the above are valid answers. Just remember that IXL *requires* slope-intercept form.

For the perpendicular line, nothing changes except the slope. $1/2$ was the original, so the negative reciprocal would be $-2$.

$$\begin{align}
y - 1 &= -2(x - 4)  \\
    y &= -2(x - 4) +1 \\
    y &= -2x + 9
\end{align}$$

$\blacksquare$
{: .qed}

I encourage you to graph your lines on either the yellow TI-84s, or in [Desmos](https://www.desmos.com/calculator){: target="_blank"}.
