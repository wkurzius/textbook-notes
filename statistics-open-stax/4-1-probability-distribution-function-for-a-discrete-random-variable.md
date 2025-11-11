---
title: 4.1 Probability Distribution Function (PDF) for a Discrete Random Variable
layout: notes
course: Probability & Statistics
---

## Chapter Objectives

- 

## Assignment

> **!! You're not going to the HW section this time !!**

- All **vocabulary** (see [Key Terms](https://openstax.org/books/statistics/pages/1-key-terms) for definitions)
- [4 Practice](https://openstax.org/books/statistics/pages/4-practice){: target="_blank"} 1–3, 5–8, 10–17
  - Or if you prefer, 1–17 and skip 4 and 9
  - [Solutions](https://manville.instructure.com/courses/5660/files?preview=780645){: target="_blank"}
- Read the next section in the book

---

## Probability distribution functions

You might remember function notation from Algebra class, where you had a function like $f(x) = 4x + 5$ and if you plugged in a number for $x$ it would produce an output. For example $f(2)=13$ because $4(2)+5=13$.

Probability distribution functions (or PDFs because that's too long to type out repeatedly) work the same way, except we are going to only focus on the $f(2)=13$ part. We will completely ignore how we got from $f(2)$ to $13$. Here is an example of that in action.

|  $x$  |     $P(x)$      |
| :---: | :-------------: |
|  $0$  | $\frac{2}{50}$  |
|  $1$  | $\frac{11}{50}$ |
|  $2$  | $\frac{23}{50}$ |
|  $3$  | $\frac{9}{50}$  |
|  $4$  | $\frac{4}{50}$  |
|  $5$  | $\frac{1}{50}$  |

This is a PDF for for the number of times a newborn baby's crying wakes a mother after midnight. A sample of 50 mothers was used to collect the data above. We have our input $x$ and our output $P(x)$, which is all we need to do some simple statistical analysis. What is ${P(x=2)}$? That's just $\frac{23}{50}$. What about ${P(x\le2)}$? That's $\frac{23}{50} + \frac{11}{50} + \frac{2}{50} = \frac{36}{50}$.

## Discrete random variables

We talked about discrete versus continuous way back in [1.2](./1-2-data-sampling-and-variation-in-data-and-sampling.md), so I'll be lazy and copy and paste my slide bullets.

- Discrete quantitative data means only certain numbers, typically whole numbers
- e.g., number of people in a household
- Continuous quantitative data is data where all numbers in a range are valid
- e.g., height, weight, time

The same applies to discrete and continuous random variables. The values are countable for a discrete one, and uncountable for a continuous. The table above is for a discrete variable since we can count the number of times each mother was torn from a peaceful slumber.

When dealing with discrete probability distribution functions, there are two other key points:

1. Each probability is between zero and one, inclusive.
2. The sum of the probabilities is one.
