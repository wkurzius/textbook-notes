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

So, this is going to lead to some problems later, but for now here are the restrictions for $\arccos x$ and $\arctan x$. We won't be dealing with the other three.

- $\arccos$ uses cosine with a restriction of $0 \le x \le \pi$
- $\arctan$ uses tangent with a restriction of $-\frac{\pi}{2}\le x \le \frac{\pi}{2}$, which is the same as $\arcsin$
