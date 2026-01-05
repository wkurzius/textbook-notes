---
title: "3.5 Methods: How to Write Them"
layout: page
course: AP CSA
prev-link: ./3-4-writing-constructors.html
next-link: ./3-6-methods-passing-and-returning-references-of-an-object.html
---

- Develop code to define behaviors of an object through methods written in a class using primitive values and determine the result of calling these methods

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [3.5 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-3-5-methods.html){: target="_blank"}
- [3.12 Write Code Practice](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/classes-write-code.html){: target="_blank"}

---

## Void and Not Void

Methods always need a return type associated with them. You can see this right before the method's name in the signature.

```java
public int getNum() {
    ...
}

public static void printName() {
    ...
}
```

The return types for the methods above are `int` and `void` and these inform what type of data will be returned when the method is called, except for `void` which means nothing at all will be returned. What this means for you, the programmer, is that you need to ensure your non-`void` methods include a return statement. And that return statement must return the appropriate data type.

## Return Statements

A `return` statement is the end of the line for a method. When a `return` statement runs, the method ends and the program picks up where it left off. This means the next line after the one that called the method.

> Worth noting is that loops will not finish either. This can be helpful optimization if you want a loop to end as soon as it's found what it was looking for.

With that in mind, see if you can trace the execution of the code below (shamelessly borrowed from [_ThinkJava_](https://greenteapress.com/thinkjava6/html/thinkjava6007.html)).

```java
public static void main(String[] args) {
    boolean flag1 = isHoopy(202);
    boolean flag2 = isFrabjuous(202);
    System.out.println(flag1);
    System.out.println(flag2);
    if (flag1 && flag2) {
        System.out.println("ping!");
    }
    if (flag1 || flag2) {
        System.out.println("pong!");
    }
}

public static boolean isHoopy(int x) {
    boolean hoopyFlag;
    if (x % 2 == 0) {
        hoopyFlag = true;
    } else {
        hoopyFlag = false;
    }
    return hoopyFlag;
}

public static boolean isFrabjuous(int x) {
    boolean frabjuousFlag;
    if (x > 0) {
        frabjuousFlag = true;
    } else {
        frabjuousFlag = false;
    }
    return frabjuousFlag;
}
```

### Void return

A `void` method can also have a return statement, which is useful for ending execution of a method prematurely, like when the provided argument is bad.

```java
public void aMethod(int num) {
    if (num == 0) {
        System.out.println("Can't divide by 0.");
        return;
    }

    // ...
    // Normal execution code
}
```

## Getters and Setters

Or accessor methods and mutator methods (or even modifier methods), but that's not nearly as catchy. These are used to grant access to your better-be-private instance/class variables (fields). This gives you control over how that data is accessed and set, whether it be as simple as blocking access or data validation to ensure proper values are set.

```java
public 