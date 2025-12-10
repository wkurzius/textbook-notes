---
title: Certification Project General Guidelines

course: Certification Projects
---

Each project has specific details about content and style, but there is some information that applies to all the projects., which includes how to validate your code and publishing your finished project. I've also included some starter code along with some general advice.

## Rubric

| Criteria                                            | Weight |
| --------------------------------------------------- | :----: |
| Published to GitHub                                 |   20   |
| Appropriate content and passed all user story tests |   20   |
| Validated HTML/CSS                                  |   20   |
| Used external and varied CSS                        |   20   |
| Page is readable and visually appealing             |   20   |

The first two are simple objective checks: you either published it or you didn't, and you passed the tests or didn't.

For validated code, a few errors mean high marks, while a lot means a lower grade. The nature of the error matters as well. Completely omitting the `<head>` is not good, but forgetting to close a `<p>` block isn't nearly as critical.

External CSS is usually an automatic pass. Varied CSS means you used multiple rules and properties to design your page. Colors and fonts are the obvious ones, so try doing the less obvious. Mess with margins and borders, or alter how your text is displayed with letter-spacing. Treat your headings different from your paragraphs, or do something creative with your links. Here's [a complete list of properties from MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/Reference/Properties){: target="_blank"}. Pick one out and see what it does.

And lastly, being readable and visually appealing is subjective, but this boils down to "did you put any effort into designing your page?" A lot goes into this, and it's not purely CSS that effects it. Did you use headings? Did you break content up with an appropriate amount of line breaks? Does it hurt my eyes to read it?

## HTML Boilerplate

Here is starter code to help you get going, and to make sure your page renders properly on phones.

```html
<!DOCTYPE html>
<html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Page Title Here</title>
    <link rel="stylesheet" href="styles.css">
  </head>

  <body></body>

</html>
```

## Code Validation

You should frequently verify that your code is acceptable by using the HTML and CSS validators (links below). Just because your page looks OK, that doesn’t mean everything is working well under the hood.

- [HTML validator](https://validator.w3.org/){: target="_blank"}
- [CSS validator](https://jigsaw.w3.org/css-validator/){: target="_blank"}

## Publishing to GitHub Pages

When you're done, it'll be time to publish. Your GitHub account gives you access to GitHub Pages, a place to host your own website. To access your Pages website, you can visit `your-username.github.io`. For example, my username on GitHub is `wkurzius`, so `wkurzius.github.io` is the URL for my Pages site. Your site will only return a 404 error until you publish a page.

The exact process is going to vary a bit depending on if you're using a Windows, macOS or a Chrome device, but here are the steps.

For your first project and your firth project only:

1. **Create a repository** in GitHub
2. **Name it** `your-username.github.io` and leave the other options alone (though double-check that public is selected)

For every project:

1. **Create a new file** in your github.io repository
2. **Name the file** `project-name/index.html` (e.g., `survey/index.html` or `tribute/index.html`)
3. **Paste your `index.html`** code into the new file
4. **Commit changes** by clicking the green button at the bottom of the page
5. **Repeat** the four steps above for your `styles.css` file

Once you are done, and after a bit of a wait, your new page should be accessible at `your-username.github.io/project-name`.

## Miscellaneous Tips

- !! Your work does not save automatically, so make sure you hit the save button.
- Work through the user stories one by one to create a basic page, then add on to it as you see fit
- Verify your code at least once every couple of days (see above)