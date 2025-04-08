---
title: 1.6 Rational Expressions
layout: notes
course: College Prep Math
---

{: .lesson-dates}
Lesson date: February 27, 2025.

- Simplify rational expressions.
- Multiply rational expressions.
- Divide rational expressions.
- Add and subtract rational expressions.
- Simplify complex rational expressions.

## Assignment

- 1–3, 5–53 odd
- *Recommended*: all **vocabulary** and concept blocks copied into notes

---

## Simplifying Rational Expressions

A rational expressions is the quotient of two polynomials.

$$\begin{align}
\frac{x^2+8x+16}{x^2+11x+28}
\end{align}$$

We'll be working with these in this section, but the underlying mechanic in all of these problems is simplifying them. In most cases, this will make them easier to work with. And the key to simplifying them is to factor each polynomial. So, here is the one above fully factored.

$$\begin{align}
\frac{(x+4)^2}{(x+7)(x+4)}
\end{align}$$

With the rational expression factored, we can look for common factors between the numerator and denominator. They have an $(x+4)^2$ in common, so we can divide those to be $1$ and rewrite the expression.

$$\begin{align}
\frac{(x+4)^2}{(x+7)(x+4)} = \frac{x+4}{x+7}
\end{align}$$

## Multiplying Rational Expressions

$$\begin{align}
\frac{x^2+4x-5}{3x+18}\cdot\frac{2x-1}{x+5}
\end{align}$$

The rules for multiplying fractions still apply here: just multiply straight across. But our goal is still to simplify these expressions, so its best to factor first.

$$\begin{align}
\frac{x^2+4x-5}{3x+18}\cdot\frac{2x-1}{x+5} = \frac{(x+5)(x-1)}{3(x+6)}\cdot\frac{2x-1}{x+5}
\end{align}$$

Now we can look for common factors just like before and combine the two.

$$\begin{align}
\frac{(x+5)(x-1)}{3(x+6)}\cdot\frac{2x-1}{x+5} &= \frac{(x-1)(2x-1)}{3(x+5)}
\end{align}$$

And that's it. There is no need to distribute and expand those binomials at this point. Certain problems may require that, but here we just want to simplify so this form is perfectly acceptable.

## Dividing Rational Expressions

Dividing is the same multiplying by the reciprocal of a number.

$$\begin{align}
2\div3 = 2 \cdot \frac{1}{3} = \frac{2}{3}
\end{align}$$

So, when you run into division with rational expressions, but just flip the second one and multiply like normal.

$$\begin{align}
\frac{1}{x}\div\frac{x^2}{3} = \frac{1}{x}\cdot\frac{3}{x^2} = \frac{3}{x^3}
\end{align}$$

## Adding and Subtracting Rational Expressions

Adding or subtracting fractions requires a common denominator, and that holds true here. Luckily, a factored denominator makes it easy to generate. Let's a try a simple one first.

$$\begin{align}
\frac{5}{x} + \frac{6}{y}
\end{align}$$

The left one has only an $x$ as a factor in the denominator, while the right one only has a $y$. That means the common denominator would have to be $xy$. So, we'll multiply each term by what it's missing, then add them once they share a denominator.

$$\begin{align}
\frac{5}{x} \cdot \frac{y}{y} + \frac{6}{y} \cdot \frac{x}{x} &= \frac{5y}{xy} + \frac{6x}{xy} \\[1em]
&= \frac{6x+5y}{xy}
\end{align}$$

Here's one where they already have something in common. The left fraction already has the $x$ covered, but needs a $y$. The right one is short an $x$ to match the $x^2$ in the other one.

$$\begin{align}
\frac{2}{x^2} - \frac{7}{xy} &= \frac{2}{x^2} \cdot \frac{y}{y}- \frac{7}{xy} \cdot \frac{x}{x} \\[1em]
&= \frac{2y}{x^2y} - \frac{7x}{x^2y} \\[1em]
&= \frac{-7x + 2y}{x^2y}
\end{align}$$

Now let's tacked one with longer polynomials. The first step, like before, is factoring.

$$\begin{align}
\frac{x+3}{x^2-1} + \frac{2}{x^2-3x+2} &= \frac{x+3}{(x-1)(x+1)} + \frac{2}{(x-2)(x-1)} \\[1em]
&= \frac{x+3}{(x-1)(x+1)} \cdot \frac{x-2}{x-2} +
   \frac{2}{(x-2)(x-1)} \cdot \frac{x+1}{x+1} \\[1em]
\end{align}$$

From here, leave your denominator factored and only simplify your numerator. Then you can refactor and divide out what you can.

$$\begin{align}
\frac{x+3}{(x-1)(x+1)} \cdot {\frac{x-2}{x-2}} +
   \frac{2}{(x-2)(x-1)} \cdot {\frac{x+1}{x+1}}
   &= \frac{(x^2+x-6)+(2x+2)}{(x-1)(x+1)(x-2)} \\[1em]
   &= \frac{x^2+3x-4}{(x-1)(x+1)(x-2)} \\[1em]
   &= \frac{(x+4)(x-1)}{(x-1)(x+1)(x-2)} \\[1em]
   &= \frac{x+4}{(x+1)(x-2)}
\end{align}$$

## Simplifying Complex Rational Expressions

More complex rational expressions can look like this.

$$\begin{align}
\frac{a}{\frac{1}{b}+c}
\end{align}$$

Each problem might benefit from different strategies, but the recommended first step is to simplify the numerator and denominator separately. This means adding or subtracting any expressions, then dividing out any common factors.

$$\begin{align}
\frac{a}{\frac{1}{b}+c} = \frac{a}{\frac{1+bc}{b}}
\end{align}$$

With everything simplified, we can move on to this just being a division problem in disguise.

$$\begin{align}
\frac{a}{\frac{1+bc}{b}} &= a \div \frac{1+bc}{b} \\[1em]
&= a \cdot \frac{b}{1+bc} \\[1em]
&= \frac{ab}{1+bc}
\end{align}$$
