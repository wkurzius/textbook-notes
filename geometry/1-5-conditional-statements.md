---
title: 1.5 Conditional Statements
layout: page
course: Geometry
prev-link: ./1-4-inductive-reasoning.html
next-link: ./1-6-deductive-reasoning.html
---

- Write conditional and biconditional statements
- Find the contrapositive, converse and inverse of a conditional statement
- Find truth values for conditional statements and complete truth tables

## Assignment

- Ten **vocabulary**{: .envision-vocab-purple} definitions
- **p42**{: .envision-hw-blue} 11–31, 33–38 (27 problems, [PDF link](./pdf/aga_gm_0105_pps.pdf){: target="_blank"})

---

Last section, we took our first steps towards formalizing our thought process with defining inductive reasoning, or looking for patterns to come up with a conjecture. Today we look at **conditional** statements, sentences you have read and heard throughout your life.

> If your teacher is absent, go to sub study.

The statement above is a conditional, which relates a **hypothesis** to a **conclusion**. The hypothesis (or condition) is with the word "if" and what is being tested. In this case, we are testing if a teacher is absent. The conclusion is associated with the word "then" and is what happens if the hypothesis happens.

Shorthand is preferred in math, so you will often see conditionals written as "if $p$, then $q$", or even shorter as ${p \to q}$. In the example above, the hypothesis $p$ is the teacher being absent, and the conclusion $q$ going to sub study.

But conditional statements written in plain English don't always follow the "if-then" form.

> ## Example: Write a Conditional
>
> Rewrite the statement below as a conditional.
>
> > A square must have four congruent sides.
{: .example}

**SOLUTION** Since one thing is dependent on another, we can rewrite this once we determine the hypothesis.

> If a shape is a square, then it has four congruent sides.

Be careful of which you choose to the hypothesis. The other way around gets you "if a shape has four congruent sides, then it is a square", which is incorrect since we can provide a counterexample: a [rhombus](https://en.wikipedia.org/wiki/Rhombus){: target="_blank"}.

$\blacksquare$
{: .qed}

## The Other Conditional Statements

There are three variations of the conditional statement that you should be aware of. The most prominent one is the **converse** where we reverse a conditional to $q \to p$.

> If you go to sub study, then your teacher is absent.

The other two variations involve **negation**, which means just throwing a "not" on either the hypothesis or conclusion. The first one of these is the **inverse**, which is $\neg p \to \neg q$ (the book uses $\sim$ instead of $\neg$, but they mean the same thing).

> If your teacher is not absent, do not go to sub study.

And the last version is the **contrapositive**, or $\neg q \to \neg p$. It's a combo of the other two alternatives, so it's reversed and negated.

> If you do not have to go to sub study hall, then your teacher is not absent.

## Verisimilitude

What you don't want to lose in all this rearranging and negating of $p$ and $q$ is whether or not the statement itself makes any sense. After writing your statements, take the time to determine it's truth value.

> ## Example: Related Conditional and Truth Values.
>
> Write the converse, inverse, and contrapositive of the statement below and determine the truth value of each.
>
> > If two whole numbers are both even, then their sum is even
{: .example}

**SOLUTION** Converse if up first, which is reversing the hypothesis and conclusion ($\q \to \neg p$)

> If the sum of two whole numbers is even, then the numbers are both even.

Counterexample will be helpful here. Let's start with an even number and see if we can split it into two odd numbers.

$$\begin{align}
8 = 5 + 3
\end{align}$$

So the converse is false.

Next is the inverse when we negate both parts ($\neg p \to \neg q$).

> If two whole numbers are not both even, then their sum is not even.

We can use the same counterexample here. Five and three are both not even, but they still add up to an even number. It's a false a statement.

Last is contrapositive, reversed and negated ($\neg q \to \neg p$).

> If the sum of two whole numbers is not even, then the numbers are both not even.



$\blacksquare$
{: .qed}


## Biconditional Statements

The last type of conditional is the **biconditional**. They are when you can reverse the conditional (converse) and it still makes sense. These typically have the phrase "if an only if" in them.

> A number is even if and only if it is evenly divisible by two.
>
> A number is divisible evenly by two if and only if it is even.