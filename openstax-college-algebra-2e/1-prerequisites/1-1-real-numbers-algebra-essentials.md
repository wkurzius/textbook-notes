---
title: "1.1 Real Numbers: Algebra Essentials"
---

- Classify a real number as a natural, whole, integer, rational, or irrational number.
- Perform calculations using order of operations.
- Use the following properties of real numbers: commutative, associative, distributive, inverse, and identity.
- Evaluate algebraic expressions.
- Simplify algebraic expressions.

#### Assignment

- 1–3, 5–59 odd
- *Recommended*: all **vocabulary** and copied and defined in notes

---

> ## How to Use this Book
>
> Reading each section is strongly recommended, along with taking notes. A good place to start is defining any **bolded vocabulary** and copying any asides that sum up information. The first one of those you will run into is called "Sets of Numbers".
>
> You should also work through the examples, only looking at the solution steps if you are unsure of the next step. The "Try It" problems are there for you to test if you understood the examples, and the answers for them are found at the end of the book, along with answers to the odd exercises.

## Classifying a Real Number

**Natural numbers** are your counting numbers, so $\{1, 2, 3, \dots\}$ **Whole numbers** include 0 so we end up with $\{0, 1, 2, 3, \dots \}$. It a minor distinction and it doesn't come up much, but if it does we'll be sure to be extra clear if zero is included or not.

**Integers** are the whole numbers and their opposites, so $\{\dots, -3, -2, -1, 0, 1, 2, 3 , \dots\}$. Integers tend to be talked about as positive or negative, but keep in mind that zero is neither positive or negative.

**Rational numbers** are any number that can be written as the quotient of any two integers, with the one exception being that you can't divide by 0.

$$\left\{\tfrac{m}{n}∣m\text{ and } n \text{ are integers and } n\neq 0\right\}$$

Any integer can be written as a rational number by putting it over 1.

Rational numbers also have the property, that when written in decimal form, either terminate or have a repeating pattern. So, $4.2$ is the rational number $\frac{21}{5}$ and $3.\overline{23}$ is the number $\frac{320}{99}$.

### Irrational Numbers

**Irrational numbers** are all the numbers that don't fit the above definitions, so they cannot be expressed as a fraction. And when written as a decimal they don't terminate and also don't repeat. We don't deal with them too often because of their strange behavior, but common ones are $\pi$ and $\sqrt{2}$.

### Real Numbers

Together, the rational and irrational numbers make up the set of **real numbers**. Each real number can be placed in a unique spot on the real number line, and conversely each spot on the number line corresponds to a unique real number.

The rational numbers is a larger set including integers, which in turn includes whole numbers, which include the natural numbers. You can see those relationship below with $N$ being the natural numbers, $W$ whole, $I$ integer, $Q$ the rationals, and $Q'$ the irrational numbers.

![](./img/real-numbers.jpg)

## Performing Calculations Using the Order of Operations

When evaluating a mathematical expression, there is an order of operations that must be followed. After any grouping symbols, the rule is to do the most powerful operations first, from left to right. That means exponents (repeated multiplication), then multiplication (repeated addition), and finally addition.

> Radicals (square roots), division, and subtraction were not included above because they are essentially the same operations as their counterparts. A square root is just a fractional exponent, division is the same as multiplying by the inverse, and subtraction is just adding the negative version of a number. We'll be frequently switching from one operation to the other where it makes our life easier.

This system is typically presented as PEMDAS, which stands for Parentheses, Exponents, Multiplication, Division, Addition, Subtraction. The issue with this acronym is that radicals are skipped and it misses the fact that multiplication and division happen on the same step, as does addition and subtraction. Be careful using this if it's what you were taught.

Let's try one or two out.

$$\begin{align}
24 + 6 \cdot \frac{2}{3} - 4^2 &= 24 + 6 \cdot \frac{2}{3} - 16 && \text{Exponents first} \\
                               &= 24 + 4 - 16 && \text{Multiplication and division from left to right} \\
                               &= 12 && \text{Addition and subtraction from left to right}
\end{align}$$

Let's look at one with grouping symbols, except none of them are actually parentheses. The numerator of our fraction is grouped together, as is what's under the radical symbol.

$$\begin{align}
\frac{5^2-4}{7}-\sqrt{11-2} &= \frac{25-4}{7}-\sqrt{9} && \text{First pass on the groups} \\
                            &= \frac{21}{7}-\sqrt{9} && \text{Second pass} \\
                            &= \frac{21}{7}-3 && \text{Radicals (exponents)} \\
                            &= 3 - 3 && \text{Division} \\
                            &= 0 && \text{Subtraction}
\end{align}$$

## Using Properties of Real Numbers

Our real numbers have some properties that are useful to keep in mind when working with expressions and equations.

### Commutative Properties

Order doesnt matter, but *only* when dealing with addition or multiplication.

$$\begin{align*}
a + b &= b + a \\
a\cdot b &= b \cdot a
\end{align*}$$

Even though subtraction and division are technically just modified versions of addition and multiplication, they are different enough that this property won't work with them.

### Associative Properties

The associative properties tell us that we can freely change the grouping of an addition or multiplication problem, like below.

$$\begin{align*}
a + (b + c) &= (a + b) + c \\
a(bc)&= (ab)c
\end{align*}$$

Again, this only applies to addition and multiplication. As soon as another operation is in play, this will not work.

> The commutative and associative properties might seem very similar, but that's only because they both happen to work with the operations we've looked at. Depending on how far you go in your math education, you will run into operations were only one of the properties works, hence the need to differentiate the two.

### Distributive Property

The product of a factor and a sum is the same as the sum of the factor times each term in the sum. Hard to parse in words, so here it is in symbols.

$$ a(b+c) = ab + bc $$

Watch out for situations like below.

$$ - (a + b) = -a - b$$

Just because there is no number