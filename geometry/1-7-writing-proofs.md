---
title: 1.7 Writing Proofs
layout: page
course: Geometry
prev-link: ./1-6-deductive-reasoning.html
next-link: ./1-8-indirect-proof.html
draft: true
---

<!-- prettier-ignore -->
> Reminder: Full online book available through<br>_ClassLink > Savvas EasyBridge_
{: .call-out}

- Use deductive reasoning to prove geometric theorems about lines and angles

## Assignment

- Four **vocabulary**{: .envision-vocab-purple} definitions
- **p56**{: .envision-hw-blue} 9–10, 14–17, 18–20\*, 21–22, 25 ([PDF link](./pdf/aga_gm_0107_pps.pdf){: target="\_blank"})

  \* _For 18–20, write either a paragraph or two-column proof for each. Do not be discouraged if yours does not match the answer key._

## Additional Resources

- [Proofs involving angles](https://www.ixl.com/math/geometry/proofs-involving-angles){: target="\_blank"}
- [Find measures of complementary, supplementary, vertical, and adjacent angles](https://www.ixl.com/math/geometry/find-measures-of-complementary-supplementary-vertical-and-adjacent-angles){: target="\_blank"}

---

Now that we've looked at deductive reasoning, we're going to use that look at and construct **proofs**. This is just deductive reasoning, expect there are usually more steps involved to get a conclusion. Before we get into proofs, we need something to prove.

<!-- prettier-ignore -->
> ### Vertical Angles Theorem
>
> Vertical angles are congruent.
>
> > ![Vertical angles](./img/1-7-vertical-angles.png)
> >
> > **Figure 1.7.1** In the figure above, $\angle 1 \cong \angle 3$ and $\angle 2 \cong \angle 4$.
> {: .figure}
{: .definition}

Let's see what a proof of this looks like. We'll look at a two-column proof which will give a series of statements and reasons to go along with each.

**Given**: $\angle 1$ and $\angle 3$ are vertical angles

**Prove**: $\angle 1 \cong \angle 3$

| Statements                                                                     | Reasons                          |
| ------------------------------------------------------------------------------ | -------------------------------- |
| 1) $\angle 1$ and $\angle 3$ are vertical angles                               | Given                            |
| 2) $m\angle 1 + m\angle 2 = 180^\circ$ and $m\angle 2 + m\angle 3 = 180^\circ$ | Supplementary angles             |
| 3) $m\angle 1 + m\angle 2 = m\angle 2 + m\angle 3$                             | Transitive property of equality  |
| 4) $m\angle 1 = m\angle 3$                                                     | Subtraction property of equality |
| 5) $\angle 1 \cong \angle3$                                                    | Definition of congruent angles   |

The aim of any proof is to have a self-contained set of steps that lead you from what's given to the conclusion. This means our given (or givens if multiple) is stated first.

After that, the chain of logic begins. The statements themselves might be enough for you, but the reasons are equally important. They refer to already proven facts you can reference if there is any doubt. Number 2 for instance, where $m\angle 1 + m\angle 2 = 180^\circ$, might be a leap of logic depending on the person. With the reason, they can look up supplementary angles and see that the statement works.

Now, if you were to create this yourself from scratch it would involve some planning first. It's the equivalent to preparing an argumentative essay, or a defense if you were a lawyer, or lesson prepping as a teacher. It can be difficult and you might not be able to do it on your own. Don't worry if that's the case. Get the help you need to get over what part of a proof is tripping you up.

And if you are already dreading a test on this, most of the proof will be given to you. You will just need to fill in the blanks.

## Theorem Bank

Constructing a proof requires you know a _lot_ of theorems. Luckily, I have a list to help out: [Properties Cheat Sheet](./pdf/properties-quick-reference.pdf){: target="_blank"}. Along with that, there are a few more introduced in this section.

<!-- prettier-ignore -->
> ### Congruent Supplements Theorem
>
> If two angles are supplementary to congruent angles, then the two angles are also congruent.
>
> **In symbols**: If $m\angle 1 + m\angle 2 = 180^\circ$, $m\angle 3 + m\angle 4 = 180^\circ$, and $\angle 2 \cong m\angle 4$, then $m\angle 1 \cong m\angle 3$.
{: .definition}

<!-- prettier-ignore -->
> ### Congruent Complements Theorem
>
> If two angles are complementary to congruent angles, then the two angles are also congruent.
>
> **In symbols**: If $m\angle 1 + m\angle 2 = 90^\circ$, $m\angle 3 + m\angle 4 = 90^\circ$, and $\angle 2 \cong m\angle 4$, then $m\angle 1 \cong m\angle 3$.
{: .definition}

<!-- prettier-ignore -->
> ### Linear Pairs Theorem
>
> The sum of the measures of a linear pair is $180^\circ$.
>
> **In symbols**: If $\angle 1$ and $\angle 2$ form a linear pair, then $m\angle 1 + m\angle 2 = 180^\circ$.
{: .definition}

