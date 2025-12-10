---
title: 5.2 The Uniform Distribution
layout: page
course: Probability & Statistics
---

## Chapter Objectives

- Recognize and understand continuous probability density functions in general
- Recognize the uniform probability distribution and apply it appropriately
- Recognize the exponential probability distribution and apply it appropriately

## Assignment

- All **vocabulary** (see [Key Terms](https://openstax.org/books/statistics/pages/1-key-terms) for definitions)
- [5.2 Homework](https://openstax.org/books/statistics/pages/5-homework#fs-idp64788688){: target="_blank"} 74–85
  - [Solutions](https://manville.instructure.com/courses/5660/files?preview=780645){: target="_blank"}
- Read the next section in the book

---

A uniform distribution means each event is equally likely to occur. Graphed, this looks like a rectangle since each event is just as high as every other one. We'll look an example of uniform distribution, but I suggest you look through the others in the book as well.

## Smiling Babies

The smiling times of babies follow a uniform distribution between zero and 23 seconds, inclusive. This means that any smiling time from zero to and including 23 seconds is equally likely.

### Notation and Graph

The notation to describe this distribution is $X \sim U(0,23)$. Our variable $X$ (which is for the length of a baby's smile) can be represented by a uniform distribution $U$ from values $(0,23)$.

Graphed, this will look like a rectangle because of its uniformity. The height (and likelihood) of each event is consistent, but we need to determine that height. Remember that the total area of the distribution must be equal to $1$, so since our values range from $0$ to $23$, our height is $\frac{1}{23-0}$.

> The height is also referred to as $f(x)$. Remember that function notation from Algebra showed us that $y=f(x)$.

### Mean and Standard Deviation

Next we'll look to find the mean of the distribution and its standard deviation. Mean is straightforward since each event is just as likely as another.

$$\begin{align}
\mu &= \frac{a+b}{2} \\
    &= 11.5 \text{ seconds}
\end{align}$$

For standard deviation, the formula is a bit stranger.

$$\begin{align}
\sigma &= \sqrt{\frac{(b-a)^2}{12}}
\end{align}$$

Just so there's no confusion, that $12$ is part of the formula. It has nothing to do with the situation, but a constant. Regardless of the uniform distribution in question, finding standard deviation involves dividing by $12$.

$$\begin{align}
\sigma &= \sqrt{\frac{(23-0)^2}{12}} \\
       &\approx 6.64 \text{ seconds}
\end{align}$$

### Some Probabilities

In continuous distributions, area is probability. Finding any probability means finding the area that's covered by the situation in question.

First is the probability that a smile lasts longer than $10$ seconds. On our rectangle, which remember has a height of $\frac{1}{23}$, that means a smaller rectangle ranging from $10$ to $23$.

$$\begin{align}
P(x>10) &= \frac{23-10}{23} \\
        &\approx 0.56
\end{align}$$

How about a smile between $3$ and $7$ seconds? Same idea: height is still $\frac{1}{23}$, but now the rectangle ranges from $3$ to $7$.

$$\begin{align}
P(3<x<7) &= \frac{7-3}{23} \\
        &\approx 0.17
\end{align}$$

#### Probabilities of Exact Values on a Continuous Distribution

What about a smile of _exactly_ $13$ seconds?

$$\begin{align}
P(13) &= \frac{13-13}{23} \\
        &= 0
\end{align}$$

That answer will likely sound strange, but keep in mind that this is a continuous distribution and there are an uncountable number of numbers ranging from $0$ to $23$. We are dealing with infinity.

Now try to picture your graph sliced into an infinite number of smaller rectangles, one for each exact value. How wide are those rectangles?

This is why we get a probability of $0$ for exact numbers. There are an infinite number of exact numbers on a continuous distribution, so guessing the correct one is just not going to happen. In order to get something we can work with, probabilities in continuous distributions always look at a range of values.

(Also, congratulations on learning a little calculus.)
