---
title: Setting up a Local Java Environment
---

With a local environment, you can also push your machine to its limits rather than be restricted by the web interface provided by CSAwesome or any other online IDE.

## Software

_TLDR: You need a text editor and a JDK._

1. Get [VS Code](https://code.visualstudio.com/download) (already installed in room 31)
2. Get [JDK provided by Adoptium](https://adoptium.net/ ) (also installed). Don't sweat the version, but 21 if you are facing choice paralysis.

If you want that Linux feel on a Windows machine, use `winget` to install software. The two commands below will get you VSCode and a JDK.

```
winget install Microsoft.VisualStudioCode
winget install EclipseAdoptium.Temurin.21.JDK
```

That's really enough to get you started. VS Code will recommend extensions, but I advise against doing that. They save some typing, but muscle memory is important so skipping things might hurt you in the long run. Strictly a judgement call on your part.

## Environment

_TLDR: Create a folder and put your `.java` files in that folder. File names need to match the Class names._

The computers erase every time they power down, but you each have a network drive mapped to `Z:\`. You can also find this by going to _This PC_ in Windows Explorer.

In that network drive ...

1. Create a folder for your Java projects
2. Open that folder in VS Code
3. Create a new file and name it `ClassName.java`

> <video controls><source src="./img/new-file.mp4" type="video/mp4"></video>
>
> Windows built-in screen recording tool has a frame rate in the single digits, but it's enough to show you how to make a new file in VS Code.
{: .figure}

## Running

_TLDR: `javac` to compile your `.java` file. `java ClassName` to run it._

The keyboard shortcut `` Ctrl + ` `` will swap to a terminal in that folder, and hitting it again will bring you back to your editor. While in the terminal window, you can execute commands that will compile and run your code. The two you need are

`javac ClassName.java`

`java ClassName`

The first will compile your Java file into something that can be run on that machine. The second command will actually run it.

If you want to work a little quicker, you can do both at the same time with

`javac ClassName.java; java ClassName`

and then hit the up arrow key to rerun a previous command.
