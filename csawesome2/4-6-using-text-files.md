---
title: 4.6 Using Text Files
layout: page
course: AP CSA
prev-link: ./4-5-implementing-array-algorithms.html
next-link: ./4-7-wrapper-classes-integer-and-double.html
---

- Develop code to read data from a text file

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [4.6 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-4-6-input-files.html){: target="_blank"}
- [4.33 Code Practice with ArrayLists](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/ArrayListPractice.html){: target="_blank"}

---

## Trying to Catch Exceptions

Exceptions in Java are a type of run-time error. You've seen them before. They start off with something like this

```sh
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
```

and follow with a stack-trace, which tell you what lines of code triggered the problem.

There are a bunch of different exceptions, but they fall into two larger categories: checked and unchecked. So far, you've dealt exclusively with the latter. When compiling your code, Java will not look for these and you can end up with code that will potentially break when run.

> ```java
> int[] a = new int[5];
> System.out.println(a[5]);
> ```
>
> **Codeblock 4.6.1** Java will let you compile and run this, despite it producing an exception.
{: .figure}

If those are unchecked, then that means a **checked exception** is actively looked for by the Java compiler. If it sees the potential for one of these, it will not compile your code unless that exception is handled.

> This topic of handling exceptions is being covered so the code you write for this section will actually function. Though oddly enough, it is not on the AP exam.

Enter the `try-catch` block. How this works is that in the `try` portion of the block, some potentially program-ruining code will execute. If an exception occurs during that execution, code in the `catch` portion will run and the program will continue on.

As an example, the code in 4.6.1 will compile, but throw an exception and cease running. The code below will still break, but the program keeps going because the exception was handled.

> ```java
> try {
>     int[] a = new int[5];
>     System.out.println(a[5]);
> } catch (Exception e) {
>     e.printStackTrace();
> }
>
> System.out.println("We didn't crash!");
> ```
>
> **Codeblock 4.6.2** A `try-catch` allowing a program to keep running, despite the `ArrayIndexOutOfBoundsException`.
{: .figure}

These `try-catch` blocks must be used with what is covered in this section. You'll be writing code designed to read text files, which means there's a potential for a `FileNotFoundException`, which is a checked exception.

> The book highlights an easy way to handle checked exceptions: append `throws NameOfTheException` to your method declaration. There is nothing wrong with this, but the authors leave out a lot of context about why this is done.
>
> The keyword `throws` indicates to the calling method that there is an exception that needs to be handled. Except their example is the `main` method, so there's nothing to handle it and the program crashes anyway. In this case, we want the program to crash. A crash and a full stack trace allow for easier debugging and is perfect for what we are doing.

## Files and Scanners

We're going to utilize two classes we haven't looked at before: `File` and `Scanner`. The first is for accessing the filesystem and latter for reading text. Neither are loaded by default, so they need to be imported. Then instances can be created like any other object.

> ```java
> import java.io.File;
> import java.util.Scanner;
> 
> ...
> 
> File f = new File("filename.txt");
> Scanner s = new Scanner(f);
> 
> ...
> 
> s.close();
> ```
>
> **Codeblock 4.6.3** Basic structure for opening a Java file for reading in Java.
{: .figure}

When creating a `File` object, you need to indicate which file you are opening, and just as important, where it is. If your text file is in the same folder as your Java file, then you can just put the file name.

> If it's not, then things can get complicated quickly. You'll need to prepend the filename with the path, which is the directories (i.e., folders) that must be traversed to get there. You can choose to start at the system root (e.g., the C drive in Windows) or from the folder where your program resides, and then move to next directory with a slash.
>
> So `C:/Users/wkurzius/Downloads/someFile.txt` would be for a file sitting in my Downloads folder on my work PC. This is an example of an absolute path, because it will work no matter where the program exists in the filesystem.
>
> A relative path starts with where the program sits. `res/somefile.txt` is for a file in a subfolder. If it's in a parent directory, meaning you have to go up a level then `../someFile.txt`.
>
> And that's as far as I'm going here. This should be enough to get you started on paths when you need them. And to be clear, you don't need them here. Put the text file in the same folder so you just have to put the name. And don't put spaces in the file name.

A `Scanner` object is then used to read the file, with a call to `close()` to free up system resources. Omitting a `close()` won't trigger any errors, but is good practice and is specifically mentioned in the AP Comp Sci A course guide.

> One of the exercises in the book uses a `Scanner` object to read `System.in` instead of a file. This is done to read text input, like giving commands to a program that is already running. Since this is also not on the AP exam, we're going to gloss over it.

## Reading the File

A `Scanner` object reads a text file like you would: left to right and top to bottom. It always starts at the beginning of the file and does not work backwards. You control how it reads through a series of methods that all involve the word `next`, each of which read characters until it hits whitespace.

Depending on what is read, you have options. The `next()` method always works and returns whatever is read as a `String`. If you know you are dealing with other data types, you have `nextInt()`, `nextDouble()`, and `nextBoolean()`. Each time any of these are called, the scanner moves forward. So three calls to `next()` will read the next three "words", which are separated by whitespace. This includes spaces, tabs, and newlines.

> ```java
> System.out.println(s.next());
> System.out.println(s.next());
> String wordThree = s.next();
> ```
>
> **Codeblock 4.6.4** Reads the next three "words" in the file. The first two are printed, while the third is stored in a variable.
{: .figure}

The other functions only work if the data type matches, else you'll get more exceptions (unchecked at least).

There is also the `nextLine()` method which returns from the current character up until the next newline. The newline is read, but returned.

> ```java
> System.out.print(s.nextLine());
> System.out.println(s.nextLine());
> ```
>
> **Codeblock 4.6.5** Note the use of `print` instead of `println`. The next two lines will be printed out, but on the same line since newline characters are not returned.
{: .figure}

## And Now Loops

Given you likely won't know how long a file is, loops are necessary. And the trick to seeing if your scanner can even continue looping is `hasNext()`. This will return `true` as long as there is something else to read in the file.

> ```java
> while (s.hasNext()) {
>     System.out.println(s.next());
> }
> ```
>
> **Codeblock 4.6.6** Prints every word in the file on a new line.
{: .figure}

## Split a String

Something I bet you knew about earlier is the `split()` method. It will take a string, look for the provided argument, and split it into array, omitting the argument itself.

> ```java
> String str = "Quick brown foxes.";
> String[] spl = str.split(" ");
> 
> for (String s : spl) {
>     System.out.println(s);
> }
> ```
>
> **Codeblock 4.6.7** The original string is split by its spaces, creating an array with length of three, each element having one of the words.
{: .figure}

This is useful for processing text files, but can also be applied to earlier problems you've had, like Magpie.

> The `split()` method technically takes a regular expression as an argument, which is a way of expressing patterns. For example, `str.split("\\s|\\.")` would split at any whitespace or any period. `str.split("[aeiou]")` splits it by vowels.
>
> They are tough to wrap your head around at first, but are incredibly useful when needing process lots of items at once.
