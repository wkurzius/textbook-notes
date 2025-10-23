---
title: 3.4 Contingency Tables
layout: notes
course: Probability & Statistics
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
- [3.4 Homework](https://openstax.org/books/statistics/pages/3-homework#fs-idp18062160){: target="_blank"} 101–110
  - [Solutions](https://manville.instructure.com/courses/5660/files?preview=780645){: target="_blank"}
- Read the next section in the book

---

This lesson is applying the probability rules you've learned to two-way tables, which you saw first in [section 1.2](./1-2-data-sampling-and-variation-in-data-and-sampling.md). So, no slides this time. Instead, we'll do an example from the book.

|                                         | Speeding Violation<br>in the Last Year | No Speeding Violation<br>in the Last Year | Total |
| :-------------------------------------- | :------------------------------------: | :---------------------------------------: | :---: |
| Uses a cell phone while driving         |                   25                   |                    280                    |  305  |
| Does not use a cell phone while driving |                   45                   |                    405                    |  450  |
| Total                                   |                   70                   |                    685                    |  755  |

1. Find _P_(Person uses a cell phone while driving).

    Out of the 755 people in the survey, 305 used a cell phone while driving, so $305/755\approx0.4$.

2. Find _P_(Person had no violation in the last year).

    Again, 755 people in the survey, but this time 685 has no violations. $685/755\approx0.91$.

3. Find _P_(Person had no violation in the last year AND uses a cell phone while driving).

    You can do this with the formula for "and" events $P(A)P(B\|A)$. The probability of no violations we found already, and using a cell phone while also not getting a violation is $280/685$. Multiplying the two you get about $0.37$.

    But the nice thing about contingency tables is that "and" events can be found directly. Out of the 755 people, 280 fall into both categories. $280/755\approx0.37$.

4. Find _P_(Person uses a cell phone while driving OR person had no violation in the last year).

    Here, you can't get away from the formula $P(A)+P(B)-P(A \text{ and } B)$. Add up the two categories and subtract the overlap. Luckily, the conditional probability is easy to get since we are dealing with a contingency table.

    $305/755 + 685/755 - 280/755\approx0.94$

