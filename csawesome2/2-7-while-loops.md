---
title: 2.7 While Loops

course: AP CSA
---

- Identify when an iterative process is required to achieve a desired result
- Develop code to represent iterative processes using `while` loops and determine the result of these processes

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [2.7 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-2-7-while-loops.html){: target="_blank"}
- [Loops Coding Practice (2.7-2.12)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/loops-practice-coding.html){: target="_blank"}

---

Now that we have selection down, it's time to move to iteration, or looping. The initial jump is straightforward.

```java
// simple selection block
if (condition) {
    statements;
}

// simple iteration block
while (condition) {
    statements;
}
```

A selection block runs once if the condition is true. An iteration will run continuously as long as the condition is true, which presents our first problem: getting it to stop. Regardless of what gets repeated, something in there must flip the condition at some point so that the loop ends.

For the moment, loops will commonly be set up with counters. The condition will check if the counter is below some threshold, the loop will increment the counter, and eventually triggering its own demise.

```java
int counter = 0;

while (counter < 10) {
    statements;
    counter++;
}
```

You can of course decrease your counter and use greater than instead, or count by different numbers, or only count under certain conditions, or whatever else you might need for the situation at hand.

What will definitely happen is **off-by-one errors**. The loop above will run 10 times because I started at 0 and the condition is less than 10. Sometimes you'll want/need to start at 1, so to get 10 iterations you'll need `counter <= 10` or `counter < 11`.

> Also worth mentioning is that loops can be skipped entirely if the condition is false before it even starts. Whether or not that's the desired outcome is up to the program's goal.

## Loop Debugging

Most debugging you've done so far is digging around for syntax errors. Selection introduced some wrinkles with conditions, but fixes we're likely straightforward. Loops complicate things further since they are really a large number of selection statements running one after the other. In some cases, you might accidentally produce an **infinite loop**  that won't end until the program is forcibly stopped. _CSAwesome_ will error out if that happens, but you won't be treated so well if you're running it locally.

One of the best ways of seeing what a loop is doing is to put a `println` statement in it, and make sure to have it print the variable being tested in the condition.

```java
int counter = 0;

while (counter < 10) {
    statements;
    System.out.println(counter);
    counter++;
}
```

If you want to get fancy (and make it easier to read), put the variable name in the output as well.

```java
int counter = 0;

while (counter < 10) {
    statements;
    System.out.println("Counter: " + counter);
    counter++;
}
```
