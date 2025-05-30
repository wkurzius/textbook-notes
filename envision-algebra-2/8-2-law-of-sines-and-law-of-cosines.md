---
title: 8.2 Law of Sines and Law of Cosines
layout: notes
course: Algebra 2 and Trig
---

- Derive the Law of Sines and the Law of Cosines.
- Use the Law of Cosines and the Law of Sines to find unknown angles and sides of non-right triangles.

## Assignment

- All **vocabulary** copied into notes
  - law of cosines, law of sines
- p431 12–17, 19–37 ([pdf](./pdf/alg2-practice-0802.pdf))
  - Answers to [odd questions](../misc/alg2-odd-answers.pdf) / [even questions](../misc/alg2-even-answers.pdf)

## Additional Resources

- [Additional practice worksheet](./pdf/alg2-add-practice-0802.pdf)

---

## Trig and Non-Right Triangles

I am going to unceremoniously drop two rules for non-right triangles on you. Yes, you have to memorize them.

> ### Law of Sines
>
> $$\begin{align}
> \frac{\sin A}{a}=\frac{\sin B}{b}=\frac{\sin C}{c}
> \end{align}$$
{: .definition}

> ### Law of Cosines
>
> $$\begin{align}
> a^2 &= b^2 + c^2 - 2bc\cos A \\
> b^2 &= a^2 + c^2 - 2ac\cos B \\
> c^2 &= a^2 + b^2 - 2ab\cos C \\
> \end{align}$$
{: .definition}

I'm not going to repeat the proofs for these here. The book has both of them, but I prefer [this one](https://math.libretexts.org/Bookshelves/Precalculus/Elementary_Trigonometry_(Corral)/02%3A_General_Triangles/2.02%3A_The_Law_of_Cosines) for the Law of Cosines. I recommended you read through them.

As for when you use these, the law of sines is helpful when you know an angle-side pair. So, you have a measure for $\angle A$ and also the length of side $a$. With one ratio down, you can solve for the rest (assuming you have one more piece of info).

The law of cosines is for when you have two sides and the angle between them.

When using either of them, drawing pictures is essential as problems aren't going to be nice and tell you which angle is $A$, which side is $b$, and so on. Besides that—and one special case we'll get to—these are just formulas, so plug in and solve. You'll need to use inverse trig functions in addition to your other algebra tools.

## Example: Ambiguous Law of Sines Problem

> Let $\angle A=30^{\circ}$, $b=8$, and $a=6$. Solve the triangle (find the rest of the sides and angles).
{: .example}

Draw a picture, and no, I'm not doing it for you.

We have an angle and its corresponding side, so this is a perfect candidate for the law of sines. We'll find $\angle B$ first and work from there.

$$\begin{align}
\frac{\sin 30^{\circ}}{6} &= \frac{\sin B}{8} \\
\frac{8\sin 30^{\circ}}{6} &= \sin B \\
\arcsin \left(\frac{8\sin 30^{\circ}}{6}\right) &= B \\
B &\approx 41.8 \label{B}
\end{align}$$

There's $180^{\circ}$ in a triangle, so $\angle C\approx 108.2$, leaving us with just $c$ to find.

$$\begin{align}
\frac{\sin 30^{\circ}}{6} &= \frac{\sin 108.2^{\circ}}{c} \\
c &\approx 11.4
\end{align}$$

Did you actually draw that triangle? If you didn't yet, do it now. Then draw it the other way, because there's two ways to solve this problem. At $\ref{B}$, we just assumed the angle was acute because that's what the calculator gave us. But $\angle B$ could also be $138.2^{\circ}$, meaning $\angle C \approx 11.8$, and we have a whole different triangle.

So, when performing $\arcsin$, make sure you check the obtuse angle. It won't always work out that there is a second valid triangle (the angles still have to add up to $180^{\circ}$), but it still needs to be checked.

$\blacksquare$
{: .qed}
