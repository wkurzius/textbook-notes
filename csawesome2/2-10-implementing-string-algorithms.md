---
title: 2.10 Implementing String Algorithms
layout: page
course: AP CSA
prev-link: 
next-link: 
---

- Develop code for standard and original algorithms that involve strings and determine the result of these algorithms

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [2.10 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-2-10-strings-loops.html){: target="_blank"}
- [Loops Coding Practice (2.7-2.12)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/loops-practice-coding.html){: target="_blank"}

---

Much like last section, there are a few `String`-related algorithms you need to be able to recreate.

- find if one or more substrings have a particular property
- determine the number of substrings that meet specific criteria
- create a new string with the characters reversed

To get you started with these, you need to create loops that can traverse a `String`. Remember that each character has an index and the first one is `0`.

```java
String s = "verisimilitude";

for (int i = 0; i < s.length(); i++) {
    System.out.println(s.substring(i, i+1));
}
```

The loop above prints each character on a new line. `for` loops are helpful here since they have the built-in counter, but a `while` loop works just as well.

With that basic structure, you can expand into the algorithms listed. This section is about getting your hands dirty, but here's one loop not in the book I think should be pointed out, because the strategy here is helpful.

```java
public static int vowelCounter(String s) {
    int vowelCount = 0;

    for (int i = 0; i < s.length(); i++) {
        String currentChar = s.substring(i, i + 1);
        int vowelIndex = "aeiou".indexOf(currentChar);
        if (vowelIndex != -1)
            vowelCount++;
    }

    return vowelCount;
}
```

We have a `String` with all the characters we're interested in finding, and then use that for comparisons with the current character. If it's found, the counter is incremented.
