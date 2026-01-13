---
title: 3.6 Optimization Problems
layout: page
course: AP Calc
last-reviewed: 2026-01-13 08:42:36
prev-link: "./3-5-a-summary-of-curve-sketching.html"
next-link: "./4-1-antiderivatives.html"
---

- Solve applied minimum and maximum problems.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p262 2, 5, 9–23 odd, 29, 31 *37, 41, 48, 54–56*{: .ap-problems}

## Additional Resources

- AP Topics: 5.10, 5.11
- After this section, you can complete **Unit 5 Progress Checks MCQ Part C and FRQ Part B**
- Khan Academy
  - [Solving optimization problems](https://www.khanacademy.org/math/ap-calculus-ab/ab-diff-analytical-applications-new/ab-5-11/v/minimizing-sum-of-squares){: target="_blank"}

---

## Applied Minimum and Maximum Problems

Unsurprisingly, now that we can find extrema on a function we'll do the same thing with applied problems. Given a situation, you'll be asked to create a mathematical model (i.e. an equation) and then determine the optimal point.

Aside from guidelines on how to go about solving optimization problems, there is nothing new in this section. You'll be exposed to a variety of different problems that will seem difficult to solve at first, but eventually you will pick up on the patterns and they will become easier.

As for those guidelines, here's the boiled down version:

1. Outline the problem
2. Develop an equation
3. Get the equation down to a single independent variable
4. Determine the domain
5. Use calculus to find the extrema

> ## Optimization Example
>
> A manufacturer wants to design an open box having a square base and a surface area of 108 square inches. What dimensions will produce a box with maximum volume?
{: .example}

Boxes have three dimensions, but since the base is a square we can get away with using just two variables. Let $x$ be the base dimensions and $h$ be the height of the box.

We also know that the surface area has to be 108 square inches, and that it's open box. Our formula for surface area has to include our square base and the four sides.

$$\begin{align}
SA &= x^2 + 4(xh) \\
108 &= x^2 + 4(xh)
\end{align}$$

Since the question is concerned about the volume, we also need to set that up. Don't forget to account for the square base.

$$\begin{align}
V &= x^2h
\end{align}$$

Since the end-game is to maximize volume, we'll rearrange our surface area formula so it can be plugged into the volume one. To goal is a single independent variable, so I will solve and substitute for $h$.

$$\begin{align}
108 &= x^2 + 4(xh) \\
h &= \frac{108- x^2}{4x} \\[1em]

V &= x^2\left(\frac{108- x^2}{4x}\right) \\
  &= \frac{108x - x^3}{4}
\end{align}$$

Now we can look for the maximum volume, or where this function will peak.

$$\begin{align}
V' &= \frac{1}{4} \cdot \frac{d}{dx}[108x-x^3] \\
   &= \frac{1}{4} (108 - 3x^2) \\
   &= \frac{3}{4} (36 - x^2)
\end{align}$$

We get critical points at $x=\pm6$, but only the positive version makes sense in this problem. This is likely where our volume will be maximized, but double check by looking at the intervals before and after. When $x=0$ we get a positive and when $x=100$ we get a negative, so it is a maximum.

We have the dimensions of the square base, but still need the height. Go back to the surface area equation to find that.

$$\begin{align}
108 &= (6)^2 + 4(6)h \\
108 &= 36 + 24h \\
18 &= 6 + 4h \\
3 &=h
\end{align}$$

So, we have the dimensions $(6 \times 6 \times 3)$, but what's the volume of this optimized box?

$$\begin{align}
V &= (6)^2(3) \\
V &= 108
\end{align}$$

Annoyingly, the volume and the surface area are the same number.

> The decision to solve for $h$ at the beginning was just the path of least resistance. You could have also solved for $x$, though the algebra involved there would be _much_ more difficult.
>
> Just as a taste, to solve for $x$ you would need to use the quadratic formula on $x^2+4hx -108=0$. That would yield
>
> $$\begin{align}
> x &= -2h\pm2\sqrt{h^2+27}
> \end{align}$$
>
> which would then need to be plugged into your volume formula, which would then need to be differentiated.
>
> So, try different ways to solve problems if what you started with isn't working out.

$\blacksquare$
{: .qed}
