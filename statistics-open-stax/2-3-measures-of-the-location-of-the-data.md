---
title: 2.3 Measures of the Location of the Data
layout: page
course: Probability & Statistics
prev-link: ./2-2-histograms-frequency-polygons-and-time-series-graphs.html
next-link: ./2-4-box-plots.html
---

## Chapter Objectives

- Display data graphically and interpret the following graphs: stem-and-leaf plots, line graphs, bar graphs, frequency polygons, time series graphs, histograms, box plots, and dot plots
- Recognize, describe, and calculate the measures of location of data with quartiles and percentiles
- Recognize, describe, and calculate the measures of the center of data with mean, median, and mode
- Recognize, describe, and calculate the measures of the spread of data with variance, standard deviation, and range

## Assignment

- All **vocabulary** (see [Key Terms](https://openstax.org/books/statistics/pages/2-key-terms){: target="_blank"} for definitions)
- [2.3 Homework](https://openstax.org/books/statistics/pages/2-homework#fs-idm1839472){: target="_blank"} 86–89
  - [Solutions](https://manville.instructure.com/courses/5660/files?preview=780645){: target="_blank"}
- Read the next section in the book

---

- {: .document}[PowerPoint version](https://1drv.ms/p/c/c4097c61e06a2b97/ET-8znfDPpNFtGYQW5wKTW8BLZ1cWnHOgo3nHEXMRrI7lA?e=MZ9yhF){: target="_blank"}
{: .icon-list}

## Percentiles

- Used to measure location of data
- Values themselves don't matter, just as long as they are in order
- 𝑥th percentile means 𝑥% of data is equal to or lower
- A value at the 90th percentile means 90% of the data is equal to or below that value

> ### Percentile Equation
>
> Where $k$ is the percentile, $i$ the index (ranking position) of the value in question, and $n$ the total number of values,
>
> $$\begin{align}
> i &= k(n+1)
> \end{align}$$
{: .definition}

## Quartiles

- Quartiles are percentiles that represent quarters
- $𝑄_1$ is quartile 1 and is equivalent to the 25th percentile
- $𝑄_2$ is also know as the median and represents the 50th percentile
- $𝑄_3$ is the same as the 75th percentile

## IQR and Outliers

- Interquartile Range measures spread of the data
- Found by subtracting 𝑄_1 from 𝑄_3

> ### Inner Quartile Range
>
> $$\begin{align}
> \text{IQR} &= Q_3 - Q_1
> \end{align}$$
{: .definition}

- Outliers are data points well outside the data set
- Can determine if an outlier using IQR

> ### Determining Outliers through IQR
>
> An data point is considered an outlier if it is outside the IQR by an amount greater than 1.5 times the IQR.
>
> $$\begin{align}
> [𝑄_1−1.5⋅\text{IQR},𝑄_3+1.5⋅\text{IQR}]
> \end{align}$$
{: .definition}
