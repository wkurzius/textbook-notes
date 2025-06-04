---
title: 8.3 Trigonometric Identities
layout: notes
course: Algebra 2 and Trig
---

- Verify trigonometric identities using the unit circle.
- Use trigonometric identities to rewrite expressions.
- Prove sum and difference formulas for sine, cosine, and tangent, and use them to solve real-world problems.

## Assignment

- All **vocabulary** copied into notes
  - trigonometric identity
- p439 12–19, 21–38 ([pdf](./pdf/alg2-practice-0803.pdf))
  - Answers to [odd questions](../misc/alg2-odd-answers.pdf) / [even questions](../misc/alg2-even-answers.pdf)

## Additional Resources

- [Additional practice worksheet](./pdf/alg2-add-practice-0803.pdf)

---

This is the last section. It's a lot of memorization that I don't expect you to memorize. There are some exceptions to this, ones that you should absolutely know, but I will note them below. Usually they are simpler, if not also intuitive.

And since these are all formulas and equations, I'm going to pass on writing out proofs. They are available in the book to read.

## Trig Identities to Know

> ### Quotient Identity
>
> $$\begin{align}
> \tan\theta =\frac{\sin\theta}{\cos\theta}
> \end{align}$$
{: .definition}

> ### Pythagorean Identity
>
> $$\begin{align}
> \sin^2\theta + \cos^2\theta = 1
> \end{align}$$
{: .definition}

If you want to make sense of that last one, look at a unit circle and draw a right triangle in there somewhere.

> ### Odd-Even Identities
>
> $$\begin{align}
> \sin(-x) &= -\sin x \\
> \cos(-x) &= \cos x \\
> \tan(-x) &= -\tan x
> \end{align}$$
{: .definition}

We went over odd and even functions way back in [section 3.7](./3.7-transformations-of-polynomial-functions.md), so this is really a refresher of those rules. Sine and tangent are odd functions, so symmetrical about the origin. Cosine is even since it's symmetrical across the $y$-axis.

## Trig Identities that Exist

You should be aware of the following identities, as in "I wonder if there's a trig identity that will help this problem, so let's look them up". I won't make you memorize them for this class, and I can attest to them being absent on the AP Calc AB exam, as can these random people on reddit [here](https://www.reddit.com/r/apcalculus/comments/u48bmp/what_are_the_most_important_trig_identities_to/) and [here](https://www.reddit.com/r/APStudents/comments/ru3chu/what_trig_identities_do_i_need_for_the_calculus/).

> ### Cofunction Identities
>
> $$\begin{align}
> \sin \left( \frac{\pi}{2} - x \right) &= \cos x \\
> \cos \left( \frac{\pi}{2} - x \right) &= \sin x \\
> \tan \left( \frac{\pi}{2} - x \right) &= \cot x \\
> \end{align}$$
{: .definition}

> ### Sum Formulas
>
> $$\begin{align}
> \sin ( \alpha + \beta) &= \sin\alpha\cos\beta + \cos\alpha\sin\beta \\
> \cos ( \alpha + \beta) &= \cos\alpha\cos\beta - \sin\alpha\sin\beta \\
> \tan ( \alpha + \beta) &= \frac{\tan\alpha+\tan\beta}{1-\tan\alpha\tan\beta}
> \end{align}$$
{: .definition}

> ### Difference Formulas
>
> $$\begin{align}
> \sin ( \alpha - \beta) &= \sin\alpha\cos\beta - \cos\alpha\sin\beta \\
> \cos ( \alpha - \beta) &= \cos\alpha\cos\beta + \sin\alpha\sin\beta \\
> \tan ( \alpha - \beta) &= \frac{\tan\alpha-\tan\beta}{1+\tan\alpha\tan\beta}
> \end{align}$$
{: .definition}

## Using the Identities

Depending on the problem, one or more of the identities should be useful. As for general strategies, you can try rewriting everything in terms of sine and cosine, but otherwise, keep plugging away. Sometimes the path you need to take will be obvious, but sometimes not.

### Example 1

> Verify that $\sec\theta\cot\theta = \csc\theta$.
{: .example}

Rewriting everything in terms of sine and cosine will be helpful here.

$$\begin{align}
\sec\theta\cot\theta &= \csc\theta \\
\frac{1}{\cos\theta}\cdot\frac{\cos\theta}{\sin\theta}&=\frac{1}{\sin\theta} \\
\frac{1}{\sin\theta}&=\frac{1}{\sin\theta}
\end{align}$$

$\blacksquare$
{: .qed}

### Example 2

> Write a simplified form of $\frac{\sec\theta}{\sin\theta}(1-\cos^2\theta)$
{: .example}

Again, rewriting with sine and cosine will be helpful, and that $\cos^2$ hints at the Pythagorean identity being useful.

$$\begin{align}
\frac{\sec\theta}{\sin\theta}(1-\cos^2\theta)
  &= \frac{\sec\theta}{1}\cdot\frac{1}{\sin\theta}\cdot (\sin^2\theta) \\
  &= \frac{1}{\cos\theta}\cdot\frac{1}{\sin\theta}\cdot (\sin^2\theta) \\
  &= \frac{\sin^2\theta}{\cos\theta\sin\theta} \\
  &= \frac{\sin\theta}{\cos\theta} \\
  &= \tan\theta
\end{align}$$

$\blacksquare$
{: .qed}

## Example 3

> Find the exact value of $\cos105^{\circ}$.
{: .example}

When they ask for the exact value, you have to keep in mind that using the calculator gives an approximate answer. Most trigonometric ratios are irrational numbers, so an exact answer would be something like $\sqrt{2}$, not the decimal approximation given by a calculator.

With that in mind, the only exact values you know are from the unit circle. Use your sum and difference formulas to tackle these.

$$\begin{align}
\cos105^{\circ} &= \cos(60^{\circ}+45^{\circ}) \\
                &= \cos60^{\circ}\cos45^{\circ} - \sin60^{\circ}\sin45^{\circ} \\
                &= \frac{1}{2}\cdot\frac{\sqrt{2}}{2} - \frac{\sqrt{3}}{2}\cdot\frac{\sqrt{2}}{2} \\
                &= \frac{\sqrt{2}}{4} - \frac{\sqrt{6}}{4} \\
                &= \frac{\sqrt{2}-\sqrt{6}}{4}
\end{align}$$

$\blacksquare$
{: .qed}
