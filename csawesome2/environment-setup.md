---
title: Setting up a Local Java Environment
layout: page
course: AP CSA
---

Recommended when working on the labs and anytime you feel like the CSAwesome interface just isn't doing it for you.

## Software

_Short version: You need a text editor and a JDK._

1. Get [VS Code](https://code.visualstudio.com/download) (already installed in room 31)
2. Get [JDK provided by Adoptium](https://adoptium.net/ ) (also installed). Don't sweat the version, but 21 if you are facing choice paralysis.

If you want that Linux feel on a Windows machine, use `winget` to install software. The two commands below will get you VS Code and a JDK.

```
winget install Microsoft.VisualStudioCode
winget install EclipseAdoptium.Temurin.21.JDK
```

VS Code will recommend some extensions, but I advise against using them. Muscle memory is an important tool, so the code completion tools that come with those extensions might hurt you in the long run.

## Environment

_Short version: Create a folder and put your `.java` files in that folder. File names need to match the Class names._

The computers in room 31 erase all local documents every time they power down, but you each have a network drive mapped to `Z:\` so you have a safe place for files. You can find it by going to _This PC_ in Windows Explorer.

In that network drive ...

1. Create a folder for your Java project
2. Open that folder in VS Code
3. Create a new file and name it `ClassName.java`

> <video controls><source src="./img/new-file.mp4" type="video/mp4"></video>
>
> The built-in screen recording tool in Windows has a frame rate in the single digits, but it's enough to show you how to make a new file in VS Code.
{: .figure}

## Running

_Short version: `javac` to compile your `.java` file and `java ClassName` to run it._

The keyboard shortcut `` Ctrl + ` `` (that's a backtick and next to the 1 in the top-left of the keyboard) will swap to a terminal in that folder, and hitting it again will bring you back to your editor. While in the terminal window, you can execute commands that will compile and run your code. The two you need are

`javac ClassName.java`

`java ClassName`

The first will compile your Java file into something that can be run on that machine. The second command will actually run it.

If you want to work a little quicker, you can do both at the same time with

`javac ClassName.java; java ClassName`

and then hit the up arrow key to rerun a previous command.
