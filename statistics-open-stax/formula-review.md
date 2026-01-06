---
title: Formula Summary
layout: page
course: Probability & Statistics
---

Assume all percentages are decimals unless stated otherwise.

## 2 Descriptive Statistics

> ### Percentiles
>
> Where $k$ is the percentile, $i$ the index (ranking position) of the value in question, and $n$ the total number of values,
>
> $$\begin{align}
> i &= k(n+1)
> \end{align}$$
{: .definition}

> ### Mean of a Frequency Table
>
> Sum your midpoints multiplied by their frequency, then divide by the total frequency.
>
> $$\begin{align}
>\mu &= \frac{\sum fm}{\sum f}
> \end{align}$$
{: .definition}

> ### _Z_-scores
>
> Where $x$ is the value, $\mu$ the mean, and $\sigma$ the standard deviation,
>
> $$\begin{align}
> z &= \frac{x - \mu}{\sigma}
> \end{align}$$
{: .definition}

> ### Standard Deviation
>
> Where $x$ represent each data value, $\mu$ the mean, and $n$ the total number of values,
>
> $$\begin{align}
> \sigma &= \sqrt{\frac{\sum (x - \mu)^2}{n}}
> \end{align}$$
>
> In other words,
>
> 1. Find the differences between each data point and the mean
> 2. Square each one
> 3. Add them all up
> 4. Divide by the number of data points
> 5. Square root that quotient
{: .definition}

## 3 Probability Topics

> ### Mutual Exclusion
>
> To find the probability of event $A$ given that event $B$ has already happened,
>
> $$\begin{align}
> P(A | B) &= \frac{P(A \text{ and } B)}{P(B)}
> \end{align}$$
{: .definition}

> ### Basic Rules of probability
>
> The multiplication rule for AND events.
>
> $$\begin{align}
> P(A \text{ and } B) &= P(A|B)\cdot P(B) \\
> \end{align}$$
>
> The addition rule for OR events.
>
> $$\begin{align}
> P(A \text{ or } B)  &= P(A) + P(B) - P(A \text{ and } B)
> \end{align}$$
{: .definition}

## 4 Discrete Random Values

> ### Expected Value or Mean of a Discrete Probability Distribution
>
> Where $x$ is the value and $P(x)$ the probability of that value occurring, sum all the products of the two.
>
> $$\begin{align}
> \mu &= \sum xP(x)
> \end{align}$$
{: .definition}

> ### Standard Deviation of a Discrete Probability Distribution
>
> Where $x$ is the value, $P(x)$ the probability of that value occurring, and $\mu$ the mean,
>
> $$\begin{align}
> \sigma &= \sqrt{\sum P(x)(x-\mu)^2 }
> \end{align}$$
>
> 1. Find the differences between each data point and the mean
> 2. Square each one
> 3. Multiply the squares by the probability of each data value occurring
> 4. Add them all up
> 5. Square root that quotient
{: .definition}

## 5 Continuous Random Variables

> ### Mean of a Uniform Distribution
>
> Where $a$ and $b$ are the smallest and largest values,
>
> $$\begin{align}
> \mu &= \frac{a + b}{2}
> \end{align}$$
{: .definition}

> ### Standard Deviation of a Uniform Distribution
>
> Where $a$ and $b$ are the smallest and largest values,
>
> $$\begin{align}
> \sigma &= \sqrt{\frac{(b-a)^2}{12}}
> \end{align}$$
{: .definition}
