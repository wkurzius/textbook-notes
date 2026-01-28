---
title: 7.3 Using the Central Limit Theorem
layout: page
course: Probability & Statistics
prev-link: ./7-1-the-central-limit-theorem-for-sample-means.html
next-link: 
---

## Chapter Objectives

- Recognize central limit theorem problems
- Classify continuous word problems by their distributions
- Apply and interpret the central limit theorem for means
- Apply and interpret the central limit theorem for sums

## Assignment

- All **vocabulary** (see [Key Terms](https://openstax.org/books/statistics/pages/1-key-terms) for definitions)
- [7.3 Homework](fs-idm47834016){: target="_blank"} 76–84, 91, 93
  - [Solutions](https://manville.instructure.com/courses/5045/files?preview=811475){: target="_blank"}
- Read the next section in the book

---

For this section, we'll just work through an example.

> ## Central Limit Theorem Example
>
> A study involving stress is conducted among the students on a college campus. The stress scores follow a uniform distribution with the lowest stress score equal to one and the highest equal to five. Using a sample of 75 students, find the following.
>
> 1. The probability that the mean stress score for the 75 students is less than 2.75
> 2. The 90th percentile for the mean stress score for the 75 students
{: .example}

Before getting into the questions and sampling distributions, let's determine the mean and standard deviation of our original distribution. Since it's uniform (a rectangle), we use the formulas associated with a uniform distribution.

> Now's a good time to mention the [formula review](./formula-review.md) for the final exam.

$$\begin{align}
\mu &= \frac{a+b}{2} \\
    &= \frac{1+5}{2} \\
    &= 3 
\end{align}$$

$$\begin{align}
\sigma &= \sqrt{\frac{(b-a)^2}{12}} \\
       &= \sqrt{\frac{(5-1)^2}{12}} \\
       &= \sqrt{\frac{16}{12}} \\
       &\approx 1.15
\end{align}$$

With those out of the way, we can now determine the mean and standard deviation of the sampling distribution of the mean. The means will be the same, however the standard deviation is different. We'll need to use the original standard deviation along with the sample size to calculate it.

$$\begin{align}
\sigma_{\bar{x}} &= \frac{\sigma}{\sqrt{n}} \\
                 &= \frac{1.15}{\sqrt{75}} \\
                 &\approx 0.13
\end{align}$$

Now we can tackle the questions, which will go like any other _z_-score problem. We've already got the new standard deviation, so they'll be calculated like normal.

For the first one, we want to know the likelihood of a sample mean being below 2.75. Let's find the _z_-score for a 2.75 in our sampling distribution. Remember that $\bar{x}$ represent the sample mean.

$$\begin{align}
z &= \frac{\bar{x} - \mu}{\sigma_{\bar{x}}} \\
  &= \frac{2.75-3}{0.13} \\
  &\approx -1.88
\end{align}$$

Since we want below that score, we just need to look at what's listed on the [table](../pdfs/standard-normal-probabilities.pdf) which is 0.0301, or about a 3\% chance to get a sample with a mean below 2.75. That might seem low, but with a sample size that large, we're very likely to get a mean close to 3.

For the second one, where we need the 90th percentile, find an area close to 0.9 on the table, and then the associated _z_-score. A score of 1.28 is about as close as you can get to 0.9.

Now we rearrange the equation.

$$\begin{align}
z &= \frac{\bar{x} - \mu}{\sigma_{\bar{x}}} \\
1.28 &= \frac{\bar{x} - 3}{0.13} \\
1.28(0.13) + 3 &= \bar{x} \\
3.17 &\approx \bar{x}
\end{align}$$

Getting a mean of 3.17 from a sample of 75 puts it in the 90th percentile of means. Again, that mean might not seem that high, but that large sample size means you really should get something really close to 3 every time.

$\blacksquare$
{: .qed}
