---
title: 6.5 Properties of Logarithms
layout: notes
course: Algebra 2 and Trig
---

- Use Properties of Logarithms to rewrite logarithmic expressions.
- Use the Change of Base Formula to evaluate logarithmic expressions and solve equations.

## Assignment

- All **vocabulary** copied into notes
  - change of base formula
- p331 7–15, 20–40 ([pdf](./pdf/alg2-practice-0605.pdf))
  - Answers to [odd questions](../misc/alg2-odd-answers.pdf) / [even questions](../misc/alg2-even-answers.pdf)

## Additional Resources

- [Additional practice worksheet](./pdf/alg2-add-practice-0605.pdf)

---

## The Properties of Logarithms

This section is really just a list of identities and rules, and then practicing with those rules. I'll try to show you where each comes from, but as long you remember the identity, you'll be in good shape.

> ### The Product Property
>
> $$\begin{align}
> \log_b mn = \log_b m + \log_b n
> \end{align}$$
{: .definition}

To see where this comes from, let's start with just $mn$. Remember that ${b^{\log_b x}=x}$

$$\begin{align}
mn &= b^{\log_b m} b^{\log_b n} = b^{\log_b m + \log_b n} \\
\log_b{mn} &= \log_b b^{\log_b m + \log_b n} = \log_b m + \log_b n
\end{align}$$