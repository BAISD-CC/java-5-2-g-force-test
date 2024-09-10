We need to figure out how many G's our astronauts can handle and apply a grade of, "Excel, Pass, or Fail" depending on what those scores are when we put them in the centrifuge. Write a program that asks the user to enter the G's applied when the astronaut candidate passes out. The program should display a grade for each test. It should then get the average score and display it in G's and give a total grade.

If somehow, the astronaut makes it past 9.0 G's, the centrifuge should shut down automatically as it is dangerous for the astronaut to endure more than 9.0 G's and you should output a warning notification so that our staff can correct the problem.

Use the following methods in the program.
- calcAverage - This method should accept the five scores as arguments and return the average of the scores.
- determineGrade - This method should accept a score as an argument and return a grade for the score based on the following score:

| Score    | Grade    |
|--------- |----------|
| Over 9.1 | Warning  |
| 6.1-9.0  | Excel    |
| 3.1-6.0  | Pass     |
| 1.0-3.0  | Fail     |


Things you will need to pass the tests:

> Input 1 - "Enter the first score: "
> Input 2 - "Enter the second score: "
> Input 3 - "Enter the third score: "
> Input 4 - "Enter the fourth score: "
> Input 5 - "Enter the fifth score: "
> Output 1 - "Here are the grades and the average:
>             Score 1: `[grade1]`
>             Score 2: `[grade2]`
>             Score 3: `[grade3]`
>             Score 4: `[grade4]`
>             Score 5: `[grade5]`
>             Average score: `[averageScore]`
>             Average Grade: `[averageGrade]`

All calculations should round to the second decimal.
