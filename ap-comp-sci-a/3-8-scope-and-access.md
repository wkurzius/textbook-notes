---
title: 3.8 Scope and Access
layout: page
course: AP CSA
prev-link: ./3-7-class-variables-and-methods.html
next-link: ./3-9-this-keyword.html
---

- Explain where variables can be used in the code

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [3.8 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-3-8-scope-access.html){: target="_blank"}
- [3.12 Write Code Practice](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/classes-write-code.html){: target="_blank"}

---

## Scope

Let's go back to our old-fashioned local variables for a little. These are the one declared inside methods, or loop and selection blocks. This might have come up before, but they variables are not accessible outside the block that created them.

If there's a block inside that block, that can get to it, but not the other way around.

```java
public static void someMethod() {
    int i = 2;

    if (i > 0) {
        System.out.println(i);  // ok
    }
}

public static void someOtherMethod() {
    System.out.println(i);      // not gonna work
}
```

### The One Weird Thing

It is a terrible idea to reuse variable names. You have enough letters and numbers to work with, so just make a new one. But, in the event you declare a local variable when a instance variable of the same name exists, Java will completely ignore the instance variable.

```java
public int getWidth() {
    int width = 999;
    return width;
}

public static void main(String args[]) {
    Rectangle r1 = new Rectangle(100, 200);
    System.out.println(r1.getWidth());  // output is 999

}
```

It's a strange edge case, and easily avoided by using unique names, but expect a question about this on the exam. You'll at least see one in the Progress Check.
