---
title: AP Computer Science A Scoring Guidelines
layout: page
course: AP CSA
---

> The [source document can be found here](../pdfs/ap24-sg-computer-science-a.pdf) and includes answers to FRQs, but not the questions themselves. The general guidelines that accompany each answer set is reproduced below.

## Applying the Scoring Criteria

Apply the question scoring criteria first, which always takes precedence. Penalty points can only be
deducted in a part of the question that has earned credit via the question rubric. No part of a question (a, b,
c) may have a negative point total. A given penalty can be assessed only once for a question, even if it occurs
multiple times or in multiple parts of that question. A maximum of 3 penalty points may be assessed per
question.

### 1-Point Penalty

- Array/collection access confusion (`[] get`)
- Extraneous code that causes side-effect (e.g., printing to output, incorrect precondition check)
- Local variables used but none declared
- Destruction of persistent data (e.g., changing value referenced by parameter)
- Void method or constructor that returns a value

### No Penalty

- Extraneous code with no side-effect (e.g., valid precondition check, no-op)
- Spelling/case discrepancies where there is no ambiguity[^1]
- Local variable not declared provided other variables are declared in some part
- `private` or `public` qualifier on a local variable
- Missing `public` qualifier on class or constructor header
- Keyword used as an identifier
- Common mathematical symbols used for operators (× • ÷ ≤ ≥ <> ≠)
- `[]` vs. `()` vs. `<>`
- `=` instead of `==` and vice versa
- `length`/`size` confusion for array, `String`, `List`, or `ArrayList`; with or without `( )`
- Extraneous `[]` when referencing entire array
- `[i,j]` instead of `[i][j]`
- Extraneous size in array declaration, e.g., `int[size] nums = new int[size];`
- Missing `;` where structure clearly conveys intent
- Missing `{ }` where indentation clearly conveys intent
- Missing `( )` on parameter-less method or constructor invocations
- Missing `( )` around `if` or `while` conditions

[^1]: Spelling and case discrepancies for identifiers fall under the “No Penalty” category only if the correction can be **unambiguously** inferred from context, for example, `ArayList` instead of `ArrayList`. As a counterexample, note that if the code declares `int G=99, g=0;`, then uses `while (G < 10)` instead of `while (g < 10)`, the context does **not** allow for the reader to assume the use of the lower-case variable.
