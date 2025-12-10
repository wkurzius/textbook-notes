---
title:  1.14 Calling Instance Methods
layout: page
course: AP CSA
---

- Develop code to call instance methods and determine the result of these calls

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [1.14 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-1-14-calling-instance-methods.html){: target="_blank"}

---

They really jumped the gun when they introduced yertle back in [1.7](./1-7-apis-and-libraries.md). This section is another repeat of things you've seen already, with only slightly more depth.

The `Math` methods you ran in [1.11](./1-11-using-the-math-class.md) are referred to as class methods since we needed to invoke the class name before the method name. The methods that move yertle around are example of object methods since the object's name comes before the method.

Class methods are always static, and objects methods are non-static. Although not technically part of the signature, the documentation will list if a method is static or not.

Fields can also be static, though it's  bit rarer to see attributes that apply to the whole class. One case is a field/variable to keep track of how many instances of that class were created.

There's a bit in the book about getters and setters, but I'm ignoring that for now. When you start writing your classes in unit 3, it will become much more relevant.
