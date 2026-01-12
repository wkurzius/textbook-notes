---
title: 3.9 `this` Keyword
layout: page
course: AP CSA
prev-link: ./3-8-scope-and-access.html
next-link: ./4-1-ethical-and-social-issues-around-data-collection.html
---

- Develop code for expressions that are self-referencing and determine the result of these expressions

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [3.9 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-3-9-this.html){: target="_blank"}
- [3.12 Write Code Practice](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/classes-write-code.html){: target="_blank"}

---

Last section we introduced a problem where a local variable would be used in lieu of the instance variable.

```java
public int getWidth() {
    int width = 999;
    return width;   // 999 is returned
}

public static void main(String args[]) {
    Rectangle r1 = new Rectangle(100, 200);
    System.out.println(r1.getWidth());
}
```

There is a very easy fix for this where you use the keyword `this` to represent the current object.

```java
public int getWidth() {
    int width = 999;
    return this.width;  // 100 is returned
}

public static void main(String args[]) {
    Rectangle r1 = new Rectangle(100, 200);
    System.out.println(r1.getWidth());
}
```

Using `this` is always advised because is removes the ambiguity of what is being called. `width` looks like a local variable, but `this.width` is clearly an instance variable.

Also, `this` can also be used as an argument.

```java
public class Rectangle {
    private int width;
    private int height;

    // ... methods and constructors ...

    public static int area(Rectangle r) {
        return r.width * r.height;
    }

    public String toString() {
        return this.width + " x " + this.height + "\n" +
                "Area: " + area(this);
    }

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
    }
}
```
