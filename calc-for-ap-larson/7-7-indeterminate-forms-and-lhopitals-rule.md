---
title: 7.7 Indeterminate Forms and L'Hôpital's Rule
layout: page
course: AP Calc
last-reviewed: 2025-12-08 10:09:00
---

- Recognize limits that produce indeterminate forms.
- Apply L'Hôpital's Rule to evaluate a limit.

## Assignment

- **Vocabulary** and **teal boxes**{: .teal-box}
- p513 1, 4, 5, 8–11, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 65 *69–72, 80–82, 101, 102, 113–115*{: .ap-problems}

## Additional Resources

- AP Topics: 4.7
- After this section, you can complete **Unit 4 Progress Checks MCQ, and FRQ Parts A and B**
- Khan Academy
  - [Using L’Hôpital’s rule for finding limits of indeterminate forms](https://www.khanacademy.org/math/ap-calculus-ab/ab-diff-contextual-applications-new/ab-4-7/v/introduction-to-l-hopital-s-rule){: target="_blank"}

---

We're going to head back to limits for a little since we have some new tools to play with.

## Indeterminate Forms

Many of the limit problems you've seen involved dividing by $0$. A limit that involved dividing by $0$ would force to you to find another way to evaluate it besides direct substitution. Typically this was algebraic manipulation, but there were also tables and graphing calculators.

Something we glossed over was the fact that direct substitution in most limit problems actually led to $\frac{0}{0}$. Limits that led to this form were leaned on as exercises since they are unpredictable and always require extra work.

In contrast, something like $\lim_{x\to 0} \frac{x+1}{x}$ would yield $\frac{1}{0}$ with direct substitution. Some constant over $0$ means the limit is infinity and you have a vertical asymptote. Yes, dividing by $0$ is present, but the results are consistent and predictable.

So, $\frac{0}{0}$ is an example of an **indeterminate form**, meaning extra steps must be taken to determine the limit. Along with that, $\frac{\infty}{\infty}$ is also an indeterminate form. There are others, but those are the only two you need to be aware of for the AP exam.

## L'Hôpital's Rule

Now that we've recontexulized why limit problems were problems to be begin with, we can look at a new way to evaluate them. Also helpful is that we know how to differentiate a function.

> ### L'Hôpital's Rule (abbreviated)
>
> If the limit of $f(x)/g(x)$ as $x$ approaches $c$ produces the indeterminate form $0/0$ or $\infty/\infty$, then
>
> $$\begin{align}
> \lim_{x\to c} \frac{f(x)}{g(x)} = \lim_{x\to c} \frac{f'(x)}{g'(x)}
> \end{align}$$
>
> provided that the limit exists or is infinity.
{: .definition}

Make you aware of the caveats of this rule: indeterminate form only and the limits must exist. If you have non-indeterminate (determinate?) form, you shouldn't need it anyway. For a limit not existing, see the last example.

A word of warning: do _not_ use the quotient rule. You are not differentiating the entire function, just the numerator and denominator separately.

> ## Example 1
>
> Evaluate $\displaystyle \lim_{x\to0}\frac{e^{2x}-1}{x}$.
{: .example}

Direct substitution yields $\frac{0}{0}$, so we can use the rule.

$$\begin{align}
\lim_{x\to0}\frac{e^{2x}-1}{x} &= \lim_{x\to0}\frac{\frac{d}{dx}[e^{2x}-1]}{\frac{d}{dx}[x]}\\[1em]
&=\lim_{x\to0}\frac{2e^{2x}}{1} \\
&= 2
\end{align}$$

$\blacksquare$
{: .qed}

> ## Example 2
>
> Evaluate $\displaystyle \lim_{x\to\infty}\frac{\ln x}{x}$.
{: .example}

This time we get $\frac{\infty}{\infty}$. Rule time again.

$$\begin{align}
\lim_{x\to\infty}\frac{\ln x}{x} &= \lim_{x\to\infty}\frac{\frac{1}{x}}{1} \\
&= \lim_{x\to\infty} \frac{1}{x} \\
&= 0
\end{align}$$

$\blacksquare$
{: .qed}

> ## Example 3
>
> Evaluate $\displaystyle \lim_{x\to-\infty}\frac{x^2}{e^{-x}}$.
{: .example}

We get $\frac{\infty}{\infty}$, so rule time.

$$\begin{align}
\lim_{x\to-\infty}\frac{x^2}{e^{-x}} &= \lim_{x\to-\infty}\frac{2x}{-e^{-x}}
\end{align}$$

The result is an indeterminate form again, $\frac{-\infty}{-\infty}$. The good news is that you can just apply the rule again.

$$\begin{align}
\lim_{x\to-\infty}\frac{2x}{-e^{-x}} &= \lim_{x\to-\infty}\frac{2}{e^{-x}} \\
&= 0
\end{align}$$

$\blacksquare$
{: .qed}

> ## Example 4
>
> Find the limit.
>
> $$\begin{align}
> \lim_{x\to\infty}\frac{x+\cos x}{x}
> \end{align}$$
{: .example}

Direct substitution yields $\frac{\infty}{\infty}$, but using rule gets us to this point.

$$\begin{align}
\lim_{x\to\infty}\frac{x+\cos x}{x} &= \lim_{x\to\infty}\frac{1-\sin x}{1}
\end{align}$$

The limit does not exist according to this work, but a rewrite might be warranted. See if splitting the original quotient reveals something new.

$$\begin{align}
\lim_{x\to\infty}\frac{x+\cos x}{x} &= \lim_{x\to\infty}\frac{x}{x} + \lim_{x\to\infty}\frac{\cos x}{x}
\end{align}$$

$\frac{x}{x}$ is just $1$, and $\frac{\cos x}{x}$ is $0$. So, we really didn't need the rule and could've arrived at $1$ from the beginning.

$\blacksquare$
{: .qed}
