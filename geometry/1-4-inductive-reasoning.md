---
title: 1.4 Inductive Reasoning
layout: page
course: Geometry
prev-link: ./1-3-midpoint-and-distance.html
next-link: ./1-5-conditional-statements.html
---

- Use inductive reasoning to identify patterns and make predictions based on data
- Use inductive reasoning to provide evidence that conjectures are true or provide counterexamples to disprove them

## Assignment

- Three **vocabulary**{: .envision-vocab-purple} definitions
- **p33**{: .envision-hw-blue} 7–23 (17 problems, [PDF link](./pdf/aga_gm_0104_pps.pdf){: target="_blank"})

---

The remaining sections in the chapter deal with logic and going about proving things to be true (or proving them to be false). The first one covers **inductive reasoning**. Simply put, it's looking for patterns and coming up with a conclusion based on that pattern. For example, take the first few numbers in a sequence.

$$\begin{align}
88, 82, 76, 70, 64, ...
\end{align}$$

It appears that each term is six less than the one before. We can now write a **conjecture**, or a statement based on our inductive reasoning. *Each term is six less than the one before it.*

The catch with a conjecture is that it is unproven, and there is a good chance you are missing information. For example, some of you haven't missed a day of school yet. Based on that pattern, I could conjecture that you have never missed a day of school. That's likely untrue, and you can easily prove me wrong with a single **counterexample**. Just one day—one example—of where you did not make it to school.

A more "mathier" example of a counterexample is for the conjecture that all numbers are either positive or negative. This is a common thought since it is true for every single number, except for zero. We can then amend it so that it reads *all numbers are positive or negative, aside from zero which has no sign*.

> ## Example: Statistics
>
> Based on the table, how many residents can be expected to vote in year 7?
> 
> | Year | Total Residents | Voters |
> |:----:|:---------------:|:------:|
> | 1    | 3511            | 386    |
> | 2    | 3790            | 414    |
> | 3    | 4085            | 451    |
> | 4    | 4907            | 544    |
> | 5    | 5562            | 623    |
> | 6    | 7014            | 767    |
> | 7    | 7786            | ?      |
{: .example}

**SOLUTION** Some trial and error might be necessary in problems like these. You can try using just the voter column, seeing if there is a pattern to the increase, but the results will be inconsistent.

Instead, if you look at the voters as a percentage of the total residents you can something you can work with.

$$\begin{align}
\frac{386}{3511} &\approx 0.110 \\[1em]
\frac{414}{3790} &\approx 0.109 \\[1em]
\frac{451}{4085} &\approx 0.110 \\[1em]
\frac{544}{4907} &\approx 0.111 \\[1em]
\frac{623}{5562} &\approx 0.112 \\[1em]
\frac{767}{7014} &\approx 0.109
\end{align}$$

Voter turnout seems to be about 11%, meaning we can now make a guess at the number of voters in year 7.

$$\begin{align}
0.11 \cdot 7786 &\approx 856
\end{align}$$

$\blacksquare$
{: .qed}
