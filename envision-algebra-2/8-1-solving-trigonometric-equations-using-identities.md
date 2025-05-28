---
title: 8.1 Solving Trigonometric Equations Using Identities
layout: notes
course: Algebra 2 and Trig
---

- Define and evaluate inverse trigonometric functions.
- Solve trigonometric equations using inverse functions, and interpret the solutions within a modeling context.

## Assignment

- p421 11–22, 24–39 ([pdf](./pdf/alg2-practice-0801.pdf))
  - Answers to [odd questions](../misc/alg2-odd-answers.pdf) / [even questions](../misc/alg2-even-answers.pdf)

## Additional Resources

- [Additional practice worksheet](./pdf/alg2-add-practice-0801.pdf)

---

## Defining Inverse Trig Functions

Being able to pull ratios from angles is neat, but like anything else in algebra, being able to go in the reverse direction would be even better. Enter the inverse trigonometric functions, which depending on who you talk to, is either in the form $\arcsin x$ or $\sin^{-1} x$. The book does the latter, but [ISO 80000-2](https://en.wikipedia.org/wiki/International_Organization_for_Standardization) says you should only use the former, so the book continues to be wrong.

So, $\arcsin$ and the others will give you an angle if you provide it a ratio, but there is a problem: trig functions are not one-to-one, so their inverses are not functions.

> ![Sine and inverted sine](./img/8-1-inverted-sin.png)
>
> **Figure 8.1.1** Graphs of $y=\sin x$ and $x=\sin y$.
{: .figure}

That's OK, [we've dealt with this before](./5-6-inverse-relations-and-functions.md). All we need to do is restrict the domain of $\sin x$ so that we have a one-to-one and invert that. With $\sin x$, that restricted domain is $-\frac{\pi}{2}\le x \le \frac{\pi}{2}$.

> ![Restricted sine](./img/8-1-restricted-sine.png)
>
> **Figure 8.1.2** Graph of $y=\sin x$ with a restricted domain.
{: .figure}

That means the inverted version, $\arcsin x$, looks like this.

> ![Graph of arcsin](./img/8-1-arcsin.png)
>
> **Figure 8.1.3** Graph of $y=\arcsin x$.
{: .figure}

This is going to lead to some problems later, but for now here are the restrictions for $\arccos x$ and $\arctan x$. We won't be dealing with the other three.

- $\arccos$ uses cosine with a restriction of $0 \le x \le \pi$
- $\arctan$ uses tangent with a restriction of $-\frac{\pi}{2}\le x \le \frac{\pi}{2}$, which is the same as $\arcsin$

## Evaluate Inverse Trig Functions

So, what is $\arcsin \frac{1}{2}$? Evaluating expressions like these boil down to either knowing the unit circle or using a calculator. Like anything else we've covered, calculator should be a last resort. In this case its $\frac{\pi}{6}$.

What about $\arctan\sqrt{3}$? This is trickier without just resorting to a calculator, but you if you remember that $\tan\theta = \frac{\sin\theta}{\cos\theta}$ then you can likely find the the angle with the right pairing that divides to $\sqrt{3}$. In this case it's $\frac{\pi}{3}$ since it's coordinates are $\left(\frac{1}{2},\frac{\sqrt{3}}{2}\right)$, which divide out to $\sqrt{3}$.

### The Other Solutions

OK, but there are other angles besides $\frac{\pi}{6}$ that satisfy $\arcsin\frac{1}{2}$. $\frac{5\pi}{6}$ also works. So does $\frac{13\pi}{6}$, and $-\frac{7\pi}{6}$.

This is the problem I referred to earlier. Inverse trig functions only produce one answer, but the reality is that there are infinitely more possible answers. This is similar to the square root problem: the function only produces one answer, the positive one, but the negative one is just as viable.

With inverse trig functions, the issue is a bit more complicated. You have the angle that the function produces, and all of it's coterminal angles. Then you have the angle from the *other* quadrant that would also work, and all of it's coterminal angles.

Here's the breakdown.

- When $x>0$:
  - $\arcsin x$ gives an angle in Quadrant I, but the other solution is in Quadrant II
  - $\arccos x$ gives an angle in Quadrant I, but the other solution is in Quadrant IV
  - $\arctan x$ gives an angle in Quadrant I, but the other solution is in Quadrant III
- When $x<0$
  - $\arcsin x$ gives an angle in Quadrant IV, but the other solution is in Quadrant III
  - $\arccos x$ gives an angle in Quadrant II, but the other solution is in Quadrant III
  - $\arctan x$ gives an angle in Quadrant IV, but the other solution is in Quadrant II