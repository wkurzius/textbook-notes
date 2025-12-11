---
title: Grade Sync
layout: page
---

[Link to Canvas’s guide on the topic](https://community.canvaslms.com/t5/Data-Sync-and-Canvas/How-do-I-sync-my-Canvas-assignment-groups-with-SIS-grading/ta-p/636603)

You can now automatically sync the Canvas grade book with Genesis. But before you consider using this:

> ⚠️ You must use Canvas as your primary grade book
>
> ⚠️ Merging grade books in Genesis is not advised
>
> ⚠️ Expect this to be a lot of work up front
>
> ⚠️ Other issues will likely appear as the year progresses
{: .grade-sync-warnings}

If you are not prepared to deal with all of that, _**do not use this**_.

## The Merge Issue

Grade Sync will work regardless of whether your grade books are merged or not, but there are issues you need to be aware of.

1. **A Genesis grade book with two merged grade books will have two copies of every assignment**. Three merges mean three copies, and so on. Grade calculation-wise, this is fine. One copy is for students in one section, and the other for the other section.

    The issue is that parents will see every copy in Genesis, and all the extras will be blank. This will lead to questions and confusion on their end, so best to avoid.

2. **Unmerged is better for the parents, but worse for you**. At the very least, Genesis attendance will be more difficult, and you’ll have to do your seating charts somewhere else.

If you’ve already merged your grade books and want to use this, you will have to trash every assignment you’ve created and break those merges. Or be prepared to explain to your parents why there are multiple copies of every assignment.

## Other Things To Be Aware Of

**"Sync" is a misnomer.** It’s more of a "copy" since anything you do in Genesis will not make it over to Canvas. So, do everything in Canvas and peek at Genesis occasionally to make sure everything looks OK.

**Comments won’t sync.** Grades, points and due dates will copy over, but any comments you make in Canvas will not.

**Removing a grade in Canvas will not remove it in Genesis.** Grades are copied over to Genesis during a sync, but blanks do not. If you delete a student’s grade in Canvas, you will also have to delete it in Genesis.

**Due dates might show as a day later.** Canvas due dates include a time, and the default is 11:59 p.m. Genesis doesn’t do times, so it handles this extra information … uniquely.

An assignment in Canvas set as due on Sep. 18 at 11:59 p.m. will appear as due Sep. 19 in Genesis. Times earlier in the day seem to be OK, but I’m not sure what the cut-off is.

> Added 10/27/25: The above is a huge problem with items due on the last day of the marking period. I recommend changing the default due time to 3:00 p.m., which seems to preserve the actual date. You can change this in Canvas by going to **Settings** in each of your courses.

**Syncs can take a while, be patient.** Sometimes just a couple of minutes, other times a couple of hours. Usually best to let the overnight sync do its thing and only force one when needed.

## Getting Started

For the four of you that made it this far, here’s how to actually use this.

1. **Set up categories in both grade books**. They should be identical. Same names are helpful, and weighting should be the same if you want calculations to make sense.

2. **Sync categories in Canvas**. Head over to _Assignments_ and open the ellipses menu (the three vertical dots) in the top-right corner and select _Sync SIS Categories_. For each Canvas category, select the appropriate Genesis category, the confirm by hitting _Sync Categories_.

3. **Select assignments to sync**. In Canvas, all your published assignments should have one of these two icons:

    > ![Sync yes](./img/sync-yes.svg)![Sync no](./img/sync-no.svg)
    {: .grade-sync-icons}

    For any assignment you want to appear in Genesis, click the black icons to turn them green.

4. **Turn on nightly sync**. While still in your Canvas course, find and open _Grade Sync_ in the long navigation list on the left. Then go to _Utilities_ and activate _Sync the eligible assignments of this course every night_.

5. **(Optional) Start a sync**. On that same screen, you can select Remaster Grades to force a sync to happen now. You can also do this under Grades using the button in the top-right corner.

## Troubleshooting

If something went wrong with a sync, delete the assignment in Genesis so a fresh copy can be created.

The catch is that you have to delete it twice. When you delete an assignment in Genesis, it goes to a trash can where it can still be seen—and synced—by Canvas. Go to _Gradebook > Assignments > Trash Can_ to permanently purge it.
