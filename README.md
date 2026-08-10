# Ch. 5 Challenge 2: G-Force Test

We need to figure out how many G's our astronaut candidates can handle and apply a grade of "Excel", "Pass", "Fail", or "Warning" depending on their results in the centrifuge.

Write a program that asks the user to enter 5 G-force scores, one at a time: the G's applied to an astronaut candidate at the moment they pass out, repeated for 5 separate test runs. The program should display a grade for each of the 5 scores. It should then calculate the average score, and display it in G's along with an overall grade.

If a candidate is subjected to more than 9.0 G's, that is dangerous, so the program should display a "Warning" grade for that score so staff know to correct the problem.

## What You Will Use

This challenge builds on what you have learned about:

- **Scanner** — to read the 5 scores entered by the user
- **Methods** — you must write and call two methods, described below
- **Conditionals** — to determine the correct grade for a score
- **`System.exit(0)`** — call this as the last statement in `main` to close the program after the results are displayed

## Methods

Write and use the following two methods:

- `calcAverage` — accepts the five scores (as `double` values) as arguments and returns their average (as a `double`).
- `determineGrade` — accepts a single score (as a `double`) as an argument and returns the grade for that score (as a `String`), based on the table below.

| Score Range | Grade   |
|-------------|---------|
| Over 9.0    | Warning |
| 6.1 - 9.0   | Excel   |
| 3.1 - 6.0   | Pass    |
| 1.0 - 3.0   | Fail    |

Call `determineGrade` on each of the 5 individual scores, and again on the average score, to get the overall grade.

## Input

Prompt for the 5 scores in this order:

```
Enter the first score: 
Enter the second score: 
Enter the third score: 
Enter the fourth score: 
Enter the fifth score: 
```

## Output

After all 5 scores have been entered, display the grades and the average using this exact format:

```
Here are the grades and the average:
Score 1: [grade1]
Score 2: [grade2]
Score 3: [grade3]
Score 4: [grade4]
Score 5: [grade5]
Average score: [averageScore]
Average Grade: [averageGrade]
```

The average score must be rounded to 2 decimal places (for example, `7.62`).

### Example

If the user enters `7.1`, `7.3`, `7.2`, `8.1`, and `8.4`, the output should be:

```
Here are the grades and the average:
Score 1: Excel
Score 2: Excel
Score 3: Excel
Score 4: Excel
Score 5: Excel
Average score: 7.62
Average Grade: Excel
```
