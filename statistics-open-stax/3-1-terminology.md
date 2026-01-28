---
title: 3.1 Terminology
layout: page
course: Probability & Statistics
prev-link: ./2-7-measures-of-the-spread-of-the-data.html
next-link: ./3-2-independent-and-mutually-exclusive-events.html
---

## Chapter Objectives

- Understand and use the terminology of probability
- Determine whether two events are mutually exclusive and whether two events are independent
- Calculate probabilities using the addition rules and multiplication rules
- Construct and interpret contingency tables
- Construct and interpret Venn diagrams
- Construct and interpret tree diagrams

## Assignment

- All **vocabulary** (see [Key Terms](https://openstax.org/books/statistics/pages/3-key-terms) for definitions)
- [3.1 Homework](https://openstax.org/books/statistics/pages/3-homework#fs-idm3746928){: target="_blank"} 66–67
  - [Solutions](https://manville.instructure.com/courses/5045/files?preview=811475){: target="_blank"}
- Read the next section in the book

---

- {: .document}[PowerPoint slides](https://1drv.ms/p/c/c4097c61e06a2b97/Ec1FuLGvWFROowR3mhK_AroBn8dt3Tt3Xjn7M7sWlE-fgQ?e=bxM9nE){: target="_blank"}
{: .icon-list}

## The Basics

- The likelihood of an event is its **probability**
- **‌Experiments** are used to test the probability of events
- When the experiment is attempted, it's called a **trial**
- The result of the trial is the **outcome**
- All the possible results of an experiment is the **sample space**
- In the case of flipping a coin ...
  - Flipping the coin is the experiment
  - Each flip is a trial
  - The result of each flip is the outcome
  - The possible results are heads or tails, which is the sample space

## Notation and Numbers

- $P(A)$ means the probability of event $A$
- For heads on a coin, $P(H)$ or $P(\text{heads})$
- Probability is given as a percentage (typically in decimal form)
- A probability of 0 means it definitely won't happen
- A probability of 1 means it definitely will happen
- A probability of 0.5 means just as likely to happen as not

## Theoretical vs Experimental Probability

- ‌Theoretical is what you think will happen

$$\begin{align}
P(A) &= \frac{\text{Number of outcomes with event }A}{\text{Total number of possible outcomes}}
\end{align}$$

- ‌Experimental is what actually happens, but only reliable after a large number of trials

$$\begin{align}
P(A) &= \frac{\text{Number of times event } 𝐴 \text{ occurs}}{\text{Total number of trials}}
\end{align}$$

## AND vs OR

- Roll a six-sided dice and $S=\\{1, 2, 3, 4, 5, 6\\}$
- Let $A=\\{2, 4, 6\\}, 𝐵=\\{4, 5, 6\\}$

- $P(A \text{ or } B)$ would be rolling anything from either $A$ or $B$
- $P(A \text{ or } B)=\\{2, 4, 5, 6\\}=4/6$

- $P(A \text{ and } B)$ means outcome must exist in both A and B
- $P(A \text{ and } B)=\\{4, 6\\}=2/6$

## Complements and Conditionals

- A complement is what's not in the set
- $A=\\{2, 4, 6\\}$ so $A'=\\{1, 3, 5\\}$

- $P(A\|B)$ is conditional probability; the probability of A given B
- $P(A\|B)$ asks the probability of rolling an even, given that you rolled a number over 3
- There are three numbers over 3, and two are even, so $P(A\|B) = 2/3$

> ### Mutual Exclusion
>
> To find the probability of event $A$ given that event $B$ has already happened,
>
> $$\begin{align}
> P(A | B) &= \frac{P(A \text{ and } B)}{P(B)}
> \end{align}$$
{: .definition}
