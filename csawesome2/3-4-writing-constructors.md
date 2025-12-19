---
title: 3.4 Writing Constructors
layout: page
course: AP CSA
prev-link: 
next-link: 
---

- Develop code to declare instance variables for the attributes to be initialized in the body of the constructors of a class

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [3.4 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-3-4-constructors.html){: target="_blank"}
- [3.12 Write Code Practice](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/classes-write-code.html){: target="_blank"}

---

## The Signature

Constructors are methods ([debatable](https://stackoverflow.com/questions/3646461/can-i-say-a-constructor-is-a-method)) with a very specific function, so their signatures look a little different than other methods: there is no return type, not even `void`; and the constructors name is identical to the class name.

## The Job

Their function is to create an instance of the object in question, which as far as you are concerned, is setting the values for the instance variables. With the `Person` class from last section, that means `name`, `email`, and `phoneNumber`.

The simplest constructor is one that takes no arguments, and sets default values for the object. One of these wasn't included in the `Person` class from last section, so here's one now.

```java
public Person() {
    name = "Anonymous";
    email = "unknown";
    phoneNumber = "unknown";
}
```

Beyond the no-arguments version, you can create constructors as you see fit. Maybe you have one that sets all the fields based on provided arguments, like you saw last section, or maybe just some are set that way and the rest through other means like calculations. This all depends on the object and how the program is designed.

Having multiple constructors is called **overloading**, which you may remember from back in unit 1. This when there are different versions of the same method/constructor, but each has different parameters.

### The Default Constructor

OK, I lied. The simplest constructor is one that isn't even written. Omitting constructors completely will lead to the compiler just writing one for you. In their version,any instance variables would be set to predefined default values (think zeroes and `null` pointers) in the event an instance is created.
