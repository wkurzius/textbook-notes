---
title: 4.2 Mean or Expected Value and Standard Deviation
layout: page
course: Probability & Statistics
prev-link: ./4-1-probability-distribution-function-for-a-discrete-random-variable.html
next-link: ./5-1-continuous-probability-functions.html
---

## Chapter Objectives

- 

## Assignment

- All **vocabulary** (see [Key Terms](https://openstax.org/books/statistics/pages/1-key-terms) for definitions)
- [4.2 Homework](https://openstax.org/books/statistics/pages/4-homework#fs-idm60120304){: target="_blank"} 70–81
  - [Solutions](https://manville.instructure.com/courses/5660/files?preview=780645){: target="_blank"}
- Read the next section in the book

---

## Expected value

Suppose you do some gambling (not advised) and the game is simple: flip a coin and you lose a dollar if the result is tails, but you win a dollar if it's heads. Would you make money over time? Or would you lose money, or maybe even break even?

Hopefully intuition brought you to a "break even" conclusion. Flipping a coin means an equal chance of heads or tails, meaning you're just as likely to lose a dollar than make one. This is a pretty straightforward situation, so let's make it more complicated. What if it's no longer a 50/50 chance and the loss vs win amount is also different?

Now the game is \\$2 to play and you're awarded \\$100,000 if you win, but winning means picking the correct 5-digit number. Any reputable lottery game will give you the odds of winning, but we can figure this out ourselves.

Each of the 5 digits can be any digit from 0–9, meaning we have a $\frac{1}{10}$ chance of guessing correctly for each one. We need to guess all correctly, so this is an AND situation that calls for the multiplication rule. The events are independent, so we can just multiply all the probabilities together.

$$ \frac{1}{10} \cdot \frac{1}{10} \cdot \frac{1}{10} \cdot\frac{1}{10} \cdot \frac{1}{10} = \frac{1}{100\,000}=0.00001$$

So we have $0.00001$ chance to win \\$100,000, and a $0.99999$ chance to lose the \\$2 we spent on playing. Is this a smart bet? Since our probabilities are out of $100\,000$, let's pretend we played that many times. In theory, we would have won once and lost $99\,999$ times.

$$\begin{align*}
\$100\,000 - (\$2)(99\,999) &= \$100\,000 - \$199\,998\\
                            &= -\$99\,998
\end{align*}$$

Not a good bet. In fact, since we played the game $100\,000$ times, on average we "lost" about $1 each time we played.

$$ \frac{-99\,998}{100\,000}=-0.99998 $$

This is called **expected value** and is used to predict an average outcome for a situation while taking into account the different probabilities of each. Let's look at our new mothers from last section.

|  $x$  |     $P(x)$      |
| :---: | :-------------: |
|  $0$  | $\frac{2}{50}$  |
|  $1$  | $\frac{11}{50}$ |
|  $2$  | $\frac{23}{50}$ |
|  $3$  | $\frac{9}{50}$  |
|  $4$  | $\frac{4}{50}$  |
|  $5$  | $\frac{1}{50}$  |

On average, how often would you expect a baby to wake their mother after midnight based on the data above? We'll take a more straightforward approach this time.

In the gambling game, we played the game $100\,000$ times then ended up dividing by $100\,000$ anyway. So to save ourselves some time, we will just multiply each outcome by it's probability.

|  $x$  |     $P(x)$      |     $xP(x)$     |
| :---: | :-------------: | :-------------: |
|  $0$  | $\frac{2}{50}$  |       $0$       |
|  $1$  | $\frac{11}{50}$ | $\frac{11}{50}$ |
|  $2$  | $\frac{23}{50}$ | $\frac{46}{50}$ |
|  $3$  | $\frac{9}{50}$  | $\frac{27}{50}$ |
|  $4$  | $\frac{4}{50}$  | $\frac{16}{50}$ |
|  $5$  | $\frac{1}{50}$  | $\frac{5}{50}$  |

By itself, these products don't mean much. But add them together and we get our expected value, or the average number of times a mother will be woken after midnight by their newborn baby.

$$\begin{align*}
0 +\frac{11}{50} + \frac{46}{50} + \frac{27}{50} + \frac{16}{50} + \frac{5}{50} &= \frac{105}{50} \\[0.5em]
             &= 2.1
\end{align*}$$

So, to get the expected value, sum up the products of each outcome multiplied by its probability.

$$E(X)=\Sigma xP(x)$$

## Standard deviation and probability distributions

Last time we saw standard deviation, we got dealt with this formula.

$$ \sigma = \sqrt{\frac{\Sigma(x-\mu)^2}{n}} $$

It comprised of finding the difference between each value and the mean, squaring each of those differences, summing them, dividing by how many there were, and finally square rooting all of that. It was a lot, but it's essentially just finding the average distance from the mean.

With probability distributions, we can still find the standard deviation, though the process is a bit different. Like with expected value, we want to account for how often each outcome can occur. The more likely outcomes should be weighted more than the less frequent ones.

Let's rewrite the original formula slightly.

$$ \sigma = \sqrt{\Sigma(x-\mu)^2\frac{1}{n}} $$

This way shows us that each squared difference is multiplied by $\frac{1}{n}$. If there were four items in the set, each would be multiplied by $\frac{1}{4}$. If there were $20$, then it would $\frac{1}{20}$. Each item gets an equal share of the whole.

Outcomes in a probability distribution shouldn't have equal shares, but instead a share based on the likelihood of it occuring. That means we get this instead.

$$ \sigma = \sqrt{\Sigma(x-\mu)^2P(x)} $$

Now, each squared difference is multiplied by it's probability, and then all of it is summed and rooted. Also, the mean in these situations is the expected value.

|  $x$  |     $P(x)$      |    $(x-\mu)^2$    | $(x-\mu)^2P(x)$ |
| :---: | :-------------: | :---------------: | :-------------: |
|  $0$  | $\frac{2}{50}$  | $(0-2.1)^2= 4.41$ |    $0.1764$     |
|  $1$  | $\frac{11}{50}$ | $(1-2.1)^2= 1.21$ |    $0.2662$     |
|  $2$  | $\frac{23}{50}$ | $(2-2.1)^2= 0.01$ |    $0.0046$     |
|  $3$  | $\frac{9}{50}$  | $(3-2.1)^2= 0.81$ |    $0.1458$     |
|  $4$  | $\frac{4}{50}$  | $(4-2.1)^2= 3.61$ |    $0.2888$     |
|  $5$  | $\frac{1}{50}$  | $(5-2.1)^2= 8.41$ |    $0.1682$     |

$$ \sqrt{0.1764 + 0.2662 + 0.0046 + 0.1458 + 0.2888 + 0.1682} = 1.0247$$

The standard deviation of our distribution of mothers and their sleeping habits is $1.0247$.
