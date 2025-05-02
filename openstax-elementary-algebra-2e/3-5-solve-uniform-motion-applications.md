---
title: 3.5 Solve Uniform Motion Applications
layout: notes
course: College Prep Math
---

- Solve uniform motion applications

## Assignment

- [#285–305 1-5-9s](https://openstax.org/books/elementary-algebra-2e/pages/3-5-solve-uniform-motion-applications#fs-id1168345435650)

---

## Solve Uniform Motion Applications

Problems in this section revolve around the formula involving distance, speed (rate), and time.

$$\begin{align}
D = rt
\end{align}$$

### Example 1

> An express train and a local train leave Pittsburgh to travel to Washington, D.C. The express train can make the trip in 4 hours and the local train takes 5 hours for the trip. The speed of the express train is 12 miles per hour faster than the speed of the local train. Find the speed of both trains.
{: .example}

Organization will be your best friend with problems like these. Try making a table and filling in information from the problem. Here are four pieces, but make sure you can trace where each comes from in the problem.

|         | Rate (mph) | Time (hr) | Distance (mi) |
| ------- | :--------: | :-------: | :-----------: |
| Express |   $r+12$   |    $4$    |               |
| Local   |    $r$     |    $5$    |               |

Using our formula for distance, we can fill in the last column.

|         | Rate (mph) | Time (hr) | Distance (mi) |
| ------- | :--------: | :-------: | :-----------: |
| Express |   $r+12$   |    $4$    |   $4(r+12)$   |
| Local   |    $r$     |    $5$    |     $5r$      |

Both trains are making the same trip, so the distances will be equal. We can use that fact to create an equation to solve

$$\begin{align}
4(r+12) &= 5r \\
4r + 48 &= 5r \\
48 &= 4 \\
\end{align}$$

The local train travels at $48$ mph, while the express at $12$ mph faster, travels at a rate of $60$ mph.

$\blacksquare$
{: .qed}

### Example 2

> Christopher and his parents live 115 miles apart. They met at a restaurant between their homes to celebrate his mother’s birthday. Christopher drove 1.5 hours while his parents drove 1 hour to get to the restaurant. Christopher’s average speed was 10 miles per hour faster than his parents’ average speed. What were the average speeds of Christopher and of his parents as they drove to the restaurant?
{: .example}

Let's make a table again. Again, distance will come from the formula. It is is *not* $115$.

|         | Rate (mph) | Time (hr) | Distance (mi) |
| ------- | :--------: | :-------: | :-----------: |
| Chris   |   $r+10$   |   $1.5$   |  $1.5(r+10)$   |
| Parents |    $r$     |    $1$    |      $r$      |

Chris and parents met in the middle, driving from opposite directions. They live $115$ miles apart, so that means *combined* they drove $115$ miles.

$$\begin{align}
1.5(r+10) + r &= 115 \\
1.5r + 15 + r &= 115 \\
2.5r &= 100 \\
r &= 40
\end{align}$$

Chris's parents drove at an average speed of $40$ mph while Chris's trip averaged a speed of $50$.

$\blacksquare$
{: .qed}

### Example 3

> Two truck drivers leave a rest area on the interstate at the same time. One truck travels east and the other one travels west. The truck traveling west travels at 70 mph and the truck traveling east has an average speed of 60 mph. How long will they travel before they are 325 miles apart?

{: .example}

Table time. We aren't given a time, but its implied it will be the same for both because of the question being asked: they are looking for a specific point in the future.

|         | Rate (mph) | Time (hr) | Distance (mi) |
| ------- | :--------: | :-------: | :-----------: |
| Truck 1 |    $70$    |    $t$    |     $70t$     |
| Truck 2 |    $60$    |    $t$    |     $60t$     |

Both trucks left from the same spot, and the question is about how long until they are $325$ miles apart. That is another way of asking how long until they've driven a combined $325$ miles.

$$\begin{align}
70t + 60t &= 325 \\
130t &= 325 \\
t &= 2.5
\end{align}$$

After $2.5$ hours they will be $325$ miles apart.

$\blacksquare$
{: .qed}

### Example 4

> When Katie Mae walks to school, it takes her 30 minutes. If she rides her bike, it takes her 15 minutes. Her speed is three miles per hour faster when she rides her bike than when she walks. What are her walking speed and her speed riding her bike?
{: .example}

Watch your units. Our speed is in miles per hour, but time is given in minutes.

|      | Rate (mph) | Time (hr) | Distance (mi) |
| ---- | :--------: | :-------: | :-----------: |
| Walk |    $r$     |   $0.5$   |    $0.5r$     |
| Bike |   $r+3$    |  $0.25$   |  $0.25(r+3)$  |

This is another where the distances are the same since the trip is identical.

$$\begin{align}
0.5t &= 0.25(r+3) \\
0.5r &= 0.25r + 0.75 \\
0.25r &= 0.75 \\
r &= 3
\end{align}$$

She walks at a rate of a $3$ mph while she bikes at $6$.

$\blacksquare$
{: .qed}

### Example 5

> Hamilton loves to travel to Las Vegas, 255 miles from his home in Orange County. On his last trip, he left his house at 2:00 pm. The first part of his trip was on congested city freeways. At 4:00 pm, the traffic cleared and he was able to drive through the desert at a speed 1.75 times as fast as when he drove in the congested area. He arrived in Las Vegas at 6:30 pm. How fast was he driving during each part of his trip?
{: .example}

You'll have to get times from the clock in this problem.

|        | Rate (mph) | Time (hr) | Distance (mi) |
| ------ | :--------: | :-------: | :-----------: |
| Part 1 |    $r$     |    $2$    |     $2r$      |
| Part 2 |  $1.75r$   |   $2.5$   |   $4.375r$    |

The total distance he covered was $255$ miles, and the two legs of the trip will combine to that amount.

$$\begin{align}
2r + 4.375r &= 255 \\
6.375r &= 255 \\
r &= 40
\end{align}$$

The first two hours he drove at an average speed of $40$ mph, then managed to get that up to $70$ mph for the remainder of the trip.

$\blacksquare$
{: .qed}
