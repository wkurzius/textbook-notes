---
title: 1.2 Exponents and Scientific Notation
---

{: .lesson-dates}
Lesson date: February 4, 2025.

- Use the product rule of exponents.
- Use the quotient rule of exponents.
- Use the power rule of exponents.
- Use the zero exponent rule of exponents.
- Use the negative rule of exponents.
- Find the power of a product and a quotient.
- Simplify exponential expressions.
- Use scientific notation.

## Assignment

- 1–4, 5–49 odd
- *Recommended*: all **vocabulary** and concept blocks copied into notes

---

## Exponent Rules

### The Product Rule

An exponent just means repeated multiplication, so $x^3 = x \cdot x \cdot x$. That means if we have a expression like $x^3 \cdot x^2$, then it would be the same thing as $(x \cdot x \cdot x)\cdot(x \cdot x)=x^5$.

The product rule of exponents formalizes this as

$$\begin{align}
a^m \cdot a^n = a^{m + n}
\end{align}$$

### The Quotient Rule

The quotient rule, maybe predictably, subtracts your exponents rather than add them. If you had the expression $\frac{x^3}{x^2}$, that would be equivalent to $\frac{x \cdot x \cdot x}{x \cdot x}$. Common factors in the numerator and denominator reduce to 1, meaning two $x$ factors can be removed from both, leaving us with just $x$. So, $\frac{x^3}{x^2}=x$.

$$\begin{align}
\frac{a^m}{a^n}=a^{m-n}
\end{align}$$

### The Power Rule

Raising an exponent to a power would look like this.

$$\begin{align}
(x^2)^3 = (x \cdot x)\, (x \cdot x)\, (x \cdot x) = x^6
\end{align}$$

Meaning our power rule is

$$\begin{align}
(a^m)^n = a^{mn}
\end{align}$$

### The Zero Rule

This one might be counterintuitive at first: anything to the zero power is one.

$$\begin{align}
a^0 = 1
\end{align}$$

A clearer ay of writing this rule would be $1\cdot a^0 = 1$. There is always a $1$ in front of any term, so even when removing all of them, it's still there. Here's another way to think of it using the quotient rule.

$$\begin{align}
\frac{a^n}{a^n} &= 1 \\[1em]
\frac{a^n}{a^n} &= a^{n-n} = a^0 \\[1em]
a^0 &= 1
\end{align}$$

### The Negative Rule

What happens if we use the quotient rule and we end up with negative numbers?

$$\begin{align}
\frac{h^3}{h^5} &= h^{-2}\\[1em]
\frac{h^3}{h^5} &= \frac{h\cdot h \cdot h}{h \cdot h \cdot h \cdot h \cdot h}=\frac{1}{h^2}\\[1em]
h^{-2} &= \frac{1}{h^2}
\end{align}$$

A factor with a negative exponent becomes the same factor with a positive exponent if it is moved across the fraction bar.

$$\begin{align}
a^{-n} &= \frac{1}{a^n} \\[1em]
a^n    &= \frac{1}{a^{-n}}
\end{align}$$

### Powers of Product and Quotient Rules

These are straightforward if you remember that raising something to a power means repeated multiplication. So, $(xy)^2=(xy)(xy) = x^2y^2$.

$$\begin{align}
(ab)^n &= a^nb^n \\[1em]
\left(\frac{a}{b}\right)^n &= \frac{a^n}{b^n}
\end{align}$$

## Using Scientific Notation

Our number system is known as the decimal system, meaning that each place value in a number is worth ten times more than the one before it. If you mutliplied a number by 10, then you only need to move the decimal place out one and fill in a zero. So, $23\times 10=230$. Likewise, dividing by 10 moves the decimal to the left. $23 \div 10 = 2.3$.

We use this idea to write really large or small numbers more concisely in our mathematical expressions. Rather than writing the number of bits of information in a digital image as $13\, 000\, 000\, 000\, 000$, we put $1.3\times10^{13}$. The number $1.3$ with the decimal place moved to the right thirteen times.

Really small numbers work the same way, but you need to remember the rule about negative powers . Dividing by 10 is the same as multiplying by $\frac{1}{10}$ which is the same as multiplying by $10^{-1}$. The radius of an electron is about $0.000\, 000\, 000\, 000\, 47$ meters, but it's much easier to write $4.7\times 10^{-13}$.

One other thing to keep in mind is that there is always one non-zero digit before the decimal, and only one. So, when you converting into scientific notation, make sure you move the decimal appropriately. $3.7\times10^7$ is good. $37\times 10^6$ is not.

### Multiplying and Dividing

The associative property says you can rearrange the grouping of an expression without changing its value. This mean when multiplying two numbers in scientific notation, we can make our lives easier by multiplying the pairs of similar numbers.

$$\begin{align}
(1.32 \times 10^{21}) \cdot (1.22 \times 10^4) &= (1.32 \cdot 1.22)\times(10^{21} \cdot 10^{4}) \\
    &\approx 4.83 \times 10^{25}
\end{align}$$

Dividing work out in a similar manner.

$$\begin{align}
(4 \times 10^{5}) \cdot (-1.52 \times 10^9) &= \frac{4 \times 10^{5}}{-1.52 \times 10^9} \\[1em]
                                            &= \frac{4}{-1.52}\times\frac{10^5}{10^9} \\[1em]
                                            &\approx -2.63 \times 10^{-4}
\end{align}$$
