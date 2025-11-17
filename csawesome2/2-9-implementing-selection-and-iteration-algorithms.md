---
title: 2.9 Implementing Selection and Iteration Algorithms
layout: notes
course: AP CSA
---

- Develop code for standard and original algorithms (without data structures) and determine the result of these algorithms

## Assignment

- All **vocabulary**{: .apcsa-vocab}
- All [2.9 activities](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/topic-2-9-loop-algorithms.html){: target="_blank"}
- [Loops Coding Practice (2.7-2.12)](https://runestone.academy/ns/books/published/manvillehighschool_csawesome2_2526/loops-practice-coding.html){: target="_blank"}

---

We're at one of those points where you need to dive in an get your hands dirty. There are a few general algorithms that you need be able to create yourself, which what you'll be doing here. From the AP course description, they are

- identify if an integer is or is not evenly divisible by another integer
- identify the individual digits in an integer
- determine the frequency with which a specific criterion is met
- determine a minimum or maximum value
- compute a sum or average

Rather than show how to do all of these, this is a good time to start setting up a local environment, if only to prepare for your first lab after this unit. With a local environment, you can also push your machine to some limits rather than be restricted by the web interface.

## Software

I'll modify these directions as needed, but I am writing them from home and they haven't been tested yet. And these are just recommendations for the Windows machines in the lab. If you want to go about it a different way, that's fine and I'm more than happy to help you out.

1. Get [VS Code](https://code.visualstudio.com/download) (already installed). Use winget if you want to feel like a hacker. In a terminal window `winget install Microsoft.VisualStudioCode`.
2. Get [JDK provided by Adoptium](https://adoptium.net/ ) (also installed). Don't sweat the version. In winget use `winget install EclipseAdoptium.Temurin.21.JDK`

That's really enough to get you started. VS Code will recommend extensions, but I advise against doing that. They save some typing, but muscle memory is important so skipping things might hurt you in the long run. Strictly a judgement call on your part.

## Environment

The computers erase every time they power down, which is a problem. I will see if I can get you permanent network folders, but in the meantime I wouldn't do any serious programming on the machines.

Once we do get you permanent directories

1. Create a folder for your Java projects
2. Open that folder in VS Code
3. Create a new file and name it `ClassName.java`

## Running

The keyboard shortcut `` Ctrl + ` `` will swap to a terminal in that folder, and hitting it again will bring you back to your editor. While in the terminal window, you can execute commands that will compile and run your code. The two you need are

`javac ClassName.java`

`java ClassName`

The first will compile your Java file into something that can be run on that machine. The second command will actually run it.

If you want to work a little quicker, you can do both at the same time with

`javac ClassName.java; java ClassName`

and then hit the up arrow key to rerun a previous command.

Now you can enjoy running loops with millions of iterations without a website yelling at you. I suggest a loop that will generate random integers ranging from zero to `Integer.MAX_VALUE`, and have it spit out the lowest it generated. See how many iterations are needed before you can reliably get minimums under a hundred.
