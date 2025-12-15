---
title: 3.3 Anatomy of a Java Class
layout: page
course: AP CSA
---

- Develop code to designate access and visibility constraints to classes, data, constructors, and methods

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [3.3 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-3-3-anatomy-of-class.html){: target="_blank"}
- [3.12 Write Code Practice](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/classes-write-code.html){: target="_blank"}

---

With this section, you'll start designing and writing your own classes. Classes are made up of three main parts: instance variables, constructors, and methods.

Methods you've seen before, and instance variables at least in passing. Classes typically represent objects, so methods are the actions the objects can take (or have done to them) and instance variables are their properties.

In the class below, a `Person` object would have three properties/instance variables with their name, email and phone number. They also have one action, where their details will be printed out to the console.

```java
public class Person {
    
    // instance variables
    private String name;
    private String email;
    private String phoneNumber;

    // constructor: construct a Person copying in the data into the instance
    // variables
    public Person(String initName, String initEmail, String initPhone) {
        name = initName;
        email = initEmail;
        phoneNumber = initPhone;
    }

    // Print all the data for a person
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

}
```

The new part is the constructor. This is more of a topic for 3.4, but these are special methods responsible for creating the object when `new` is called during object creation.

```java
Person p1 = new Person("Bob", "bob@bob.bob", "(262) 555-2626");
```

The constructor calls for three arguments, so we need to provide them when the object is created.

Missing from the class is `main` method. These are not required, but can always be included. They are points of entry for a program, so not every class needs one.

## Public vs. Private

Up until this point, you've seen `public` as the **access modifier** for nearly everything, but another option is `private`. These can be applied to classes, methods, instance variables, and your constructors, and they control what part of a program has access to that data or method.

`public` allows for any part of the program to access it, while `private` restricts access to inside the class itself. When to use each depends on the design, but some quick rules are that your `main` methods always needs to be public or else they won't run, and instance variables should be `private`. You can always write public methods to grant access to them if needed, which we'll cover in 3.5.
