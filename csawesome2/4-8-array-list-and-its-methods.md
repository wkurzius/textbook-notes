---
title: 4.8 ArrayList and its Methods
layout: page
course: AP CSA
prev-link: ./4-7-wrapper-classes-integer-and-double.html
next-link: ./4-9-array-list-traversals.html
---

- Develop code for collections of related objects using `ArrayList` objects and determine the result of calling methods on these objects

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.8 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-8-arraylists.html){: target="_blank"}
- [4.33 Code Practice with ArrayLists](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/ArrayListPractice.html){: target="_blank"}

---

When we covered arrays, something we avoided talking about was changing the size of the array. Because you can't. The underlying design of arrays means their size is static, set at creation and never changing. So, for something more flexible we use an `ArrayList`. These can be resized, but the catch is that they can only hold object references. This is the big reason wrapper classes would be preferred to primitives.

## Creation

First, you need to import. We need the `ArrayList` class, but it's not part of the `java.lang` package, but instead `java.util`. Either statement below will grant access, but the first is preferred as the other imports *everything* from the package. If your project ends up with a lot of these bulk imports, you might end up with multiple classes with the same name.

```java
import java.util.ArrayList;
import java.util.*;
```

Once imported, you can create similar to other objects, save for the angle brackets `<>` to specify the type of object it will hold.

```java
ArrayList<Double> someDoubles = new ArrayList<Double>();
```

## `ArrayList` Methods

There are five you need to worry about, plus one to just be aware of. None of them are static so they require the use of dot notation.

### `String toString()`

Unlike arrays, an `ArrayList` has a built-in `toString` method making output easy to deal with. Since elements are always objects, each will in turn call it's own `toString()` method.

```java
System.out.println(someDoubles);
```

### `size()`

The equivalent of the `length` field for arrays, except it's a method. Mixing them up—including the `length()` method for `String`—is not penalized on the exam's FRQs.

```java
someDoubles.size(); // returns 0 since we haven't put anything in it yet
```

### `boolean add(E element)` and `void add(int index, E element)`

> Time for a quick detour into **generic types** (or just "generics"). Since `ArrayLists` work with any object, that technically means there are infinite number of types of `ArrayLists`. That would make it difficult to define methods, but generics allow definitions to cover all objects.
>
> With `ArrayList`, you will see `E` used as a catch-all for any element type. So, `add()` is defined to accept any object, but in reality the type has to match what's in the `ArrayList`.
>
> It's unlikely you'll have to write a method that makes use of generics, but I can't rule it out. The only examples I've seen were specifically one type, like `ArrayList<String>`.

These two methods add items to the `ArrayList`, and it will grow to accommodate the new element. In the case of `add(int index, E element)`, the new element is placed at `index` and the indices of the other elements are increased by one (i.e., shifted to the right). Like with array, counting starts at zero.

> Oh, and one returns `boolean` while the other is `void`. Digging into this requires understanding the hierarchy of classes (and also wrapping your head around interfaces). The shortest answer I can give you is that `add(E element)` was designed for broader use, like when duplicates are not allowed, so a `boolean` return is helpful. The overloaded version was not designed for that, so there is no need to return anything. A simple exception for a bad index is enough.

### `E get(int index)`

Gone are the square brackets, now we have a method. No funny business here, just returns the element at the stated position.

### `E set(int index, E element)`

Not only do we have methods for adding elements to an `ArrayList`, we also have one for replacing one. Provide an index and the new element, and this will very handily both replace it and return the old one to you.

### `E remove(int index)`

Removes the element from the provided index and returns it. Like with adding an element, indices are adjusted accordingly, this time decreasing their indices (i.e., left shift).

### Others

You'll find lots more if you head over to [Java's official documentation](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html), including overloaded versions of ones listed above. You are only required to know how to use the ones I listed above, but they also appear on the reference sheet.
