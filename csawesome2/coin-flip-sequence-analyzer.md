---
title: Coin Flip Sequence Analyzer
layout: page
---

Your task is to write a program that will analyze a series of about 10,000[^1] coin flips from a CSV file. Specifically, you are looking for sequences where the number of heads is greater than the number of tails. 

As an example, the results of 16 coin flips are below, along with the sequences where the number of heads is greater than the number of tails.

$$\begin{align*}
\text{T H H T H T H H H T H T H T H H} \\
\text{\color{red}{T H H} \color{blue}{T H T H H} \color{red}{H} \color{blue}{T H T H T H H}} \\
\end{align*}$$

You must also compute the ratio of "heads to flips" for each sequence and then average them. For the example above, it would yield the following.

$$\begin{align*}
\left(\frac{2}{3} + \frac{3}{5} + \frac{1}{1} + \frac{4}{7}\right) \cdot \frac{1}{4} \approx 0.7095
\end{align*}$$

The file for analysis is here: [coinflip-stats.csv](./coinflip-stats.csv).

[^1]:The actual number is 9,986 because I removed the 14 times it landed on its edge.
