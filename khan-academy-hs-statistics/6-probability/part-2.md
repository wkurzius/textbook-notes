---
title: Probability Part 2
---

## Permutations

A **permutation** is an ordered arrangement of objects. If you take the numbers letters A and B, you can make two different permutations with them: AB and BA. With the letters A, B, and C you can make six permutations: ABC, ACB, BAC, BCA, CAB, and CBA.

Determining the number of permutations uses something called the fundamental counting principle. If something can happen $m$ ways and something else $n$ ways, then in total there are $m\cdot n$ ways the two can happen together. If you have three different choices for ice cream flavor and two cone choices, then you would have six total options for what to order.

With our three letters, we had three options for the first spot, then two for the second, and one for the last spot. $3\cdot2\cdot1=6$. This kind of multiplication appears often enough that it has a name, **factorial**, and is written as $3!$.

With that in mind, we can jump to 5 letters. Five choices for the first spot, four for the next, then three, two, and finally one.

$$ 5! = 5 \cdot 4 \cdot 3 \cdot 2 \cdot 1 = 120 $$

### Bigger pools and notation

In the event you have more options than spaces to fill, then take care to use the correct numbers when multiplying. It's not as straightforward as using factorial.

If we wanted to choose three letters from the first five, then we have 5 options for the first spot, 4 for the second, and 3 for the third, for 60 different permutations. This situtation can be expressed as $_5P_3$ meaning the number of permutations when you have five items and need to choose only three.

There is also a formula, though some calculators have dedicated $_nP_r$ functions.

$$ _nP_r = \frac{n!}{(n-r)!}$$

## Combinations

Combinations are similar to permutations, except that here order does not matter. ABC and BCA are technically the same here. Determining when you are dealing with combinations rather than permutations can sometimes be the trickiest part of a problem.

Let's elect some officers to highlight that difference. If five people are running with only three spots available, does the order in which they are elected matter? No, there's no difference between Alice, Bob and Carol being elected versus Carol, Bob, and Alice.

Now, if there were named positions, like president, vice president, and secretary, then order would matter.

### Determining combinations

To determine the number of combinations, you actually start with the number of permutations, but then you have to eliminate the duplicates.

Let's take our five letters where we only used three. We had 120 different permutations. Six of those permutations were ABC, ACB, BAC, BCA, CAB, and CBA. Six because that's how many ways you can arrange three items ($3!$). In fact, every different combination of three letters can be arranged six different ways, but should only count once. If we divide by six, we get our number of combinations which is 20.

The formula and notation is similar to the one for permutations.

$$ _nC_r = \frac{n!}{r!(n-r)!}$$
