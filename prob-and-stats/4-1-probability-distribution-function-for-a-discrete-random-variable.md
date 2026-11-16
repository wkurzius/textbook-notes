---
title: 4.1 Probability Distribution Function (PDF) for a Discrete Random Variable
layout: page
course: Prob & Stats
prev-link: ./3-5-tree-and-venn-diagrams.html
next-link: ./4-2-mean-or-expected-value-and-standard-deviation.html
---

## Chapter Objectives

- Interpret probabilities in a discrete probability distribution.
- Construct a probability distribution table from contextual data or probability information.
- Use probability distribution tables to answer questions and make predictions about likely outcomes.

## Assignment

**!! You're not going to the HW section this time !!**

- All **vocabulary** (see [Key Terms](https://openstax.org/books/statistics/pages/1-key-terms) for definitions)
- [4 Practice](https://openstax.org/books/statistics/pages/4-practice){: target="\_blank"} 1–3, 5–8, 10–17
- Read the next section in the book

---

Before we get into new stuff, a refresher on discrete variables.

## Discrete Random Variables

We talked about discrete versus continuous way back in [1.2](./1-2-data-sampling-and-variation-in-data-and-sampling.md), so I'll be lazy and copy and paste my slide bullets.

- Discrete quantitative data means only certain numbers, typically whole numbers
- e.g., number of people in a household
- Continuous quantitative data is data where all numbers in a range are valid
- e.g., height, weight, time

The same applies to discrete and continuous random variables. We're dealing with discrete random variables today, so we'll be looking at the probability of one trial being exactly 5, or greater than 10, and so on.

When dealing with discrete probability distribution functions, there are two other key points:

1. Each probability is between zero and one, inclusive.
2. The sum of the probabilities is one.

## Probability Distribution Functions

You might remember function notation from Algebra class, where you had a function like $f(x) = 4x + 5$ and if you plugged in a number for $x$ it would produce an output. For example, $f(2)=13$ because $4(2)+5=13$. The ${4x+5}$ is the "rule" part of the function, but we aren't limited to using equations as rules. Sometimes function rules come in the form of tables.

| $x$ | $g(x)$ |
| :-: | :----: |
| $0$ |  $2$   |
| $1$ |  $3$   |
| $2$ |  $6$   |
| $3$ |  $11$  |

The table above represents a function rule for a function named $g(x)$. We don't have an equation to work with, so we are limited to just the values given. That means we can talk about $g(1)$ but not $g(4)$.

Probability distribution functions (or PDFs because that's too long to type out repeatedly) work the same way. They are functions that use tables as their rules, rather than equations. Here is an example of that in action.

| $x$ |     $P(x)$      |
| :-: | :-------------: |
| $0$ | $\frac{2}{50}$  |
| $1$ | $\frac{11}{50}$ |
| $2$ | $\frac{23}{50}$ |
| $3$ | $\frac{9}{50}$  |
| $4$ | $\frac{4}{50}$  |
| $5$ | $\frac{1}{50}$  |

This is a PDF for the number of times a newborn baby's crying wakes a mother after midnight. A sample of 50 mothers was used to collect the data above. We have our input $x$ and our output $P(x)$, which is all we need to do some simple statistical analysis.

- What is ${P(x=2)}$? That's just $\frac{23}{50}$.
- What about ${P(x\le2)}$? That's $\frac{23}{50} + \frac{11}{50} + \frac{2}{50} = \frac{36}{50}$.
- What is the average number of times a mother will be woken by their crying child? Refer back to [frequency tables](./2-5-measures-of-the-center-of-the-data.md) in case you forgot.
