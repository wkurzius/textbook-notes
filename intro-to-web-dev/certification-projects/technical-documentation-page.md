---
title: Technical Documentation Page
layout: notes
course: Certification Projects
---

[Link to project on freeCodeCamp](https://www.freecodecamp.org/learn/2022/responsive-web-design/build-a-technical-documentation-page-project/build-a-technical-documentation-page){: target="_blank"}

For your third project, you'll build a technical documentation page, again while satisfying user stories. Here's [freeCodeCamp's example](https://technical-documentation-page.freecodecamp.rocks/){: target="_blank"} and [my own version](https://wkurzius.github.io/technical-doc/){: target="_blank"}.

Like the other projects, you will

1. Work towards passing all the tests, which are based on the listed User Stories
2. Style your page using CSS
3. Publish your project
4. Submit the URL to your published project

## Content

Rather than have you write a significant amount of text on some topic, you'll use placeholder text to fill out your page. Lorem ipsum is typically used for this, and tools exist that will generate it for you. I can recommend [lipsum.com](https://lipsum.com/){: target="_blank"}, but use whatever you see fit.

Also, make sure to use proper `h1`–`h6` elements. The user stories only require header elements for your section titles, but this will end up failing validation. I suggest using html code like below so you pass both the user stories and code validation.

```html
<header><h2>Section Title</h2></header>
```

## Style

Like before, you can design your page however you want, but there is one exception: your navigation must be styled/structured in a way that avoids excessive scrolling and allows for a long list of items. The standard way of doing this is a vertical nav bar like in the examples above, but if you think of another way, feel free to try it out.

## Everything Else

Make sure you read this page at least once: [Certification Project General Information](./general-guidelines.md). The information in there applies to each project, not just this one.
