# Ch. 5 Challenge 2: G-Force Test

## Mission Briefing

Mission Control needs to know how many G's each astronaut candidate can handle. In the centrifuge, a candidate's score is the G-force applied at the moment they pass out, and each candidate does 5 test runs. Your program reads the 5 scores, gives each one a grade, then reports the average score and an overall grade. Any score over 9.0 G's is dangerous, so it gets a "Warning" grade so staff can correct the problem.

## What You'll Practice

- A value-returning method that sends back a `double` (Day 2 notes, R2)
- A method that sends back a `String` (Day 2 notes, S1)
- Using a return value directly inside `println` (Day 2 notes, R2)
- An `if`/`else if` chain to pick one grade (Chapter 3)

## Starter Code

Edit `src/GForceTest.java`. The class is `GForceTest`. Do not rename the file or the class.

The headers and documentation comments for `calcAverage` and `determineGrade` are already written; write the body of each. The end of `main` already prints the results by calling `determineGrade`. You add the Scanner, the five score variables, the call to `calcAverage`, and `System.exit(0);`. The starter won't compile until both methods return a value and the variables exist.

## Inputs

| Order | What it is | Java type |
|---|---|---|
| 1 to 5 | The candidate's five scores, in G's, one per prompt | `double` |

## Rules

### 1. The grade for a score

`determineGrade` returns exactly one grade for any score:

| Score | Grade |
|---|---|
| Over 9.0 | `Warning` |
| Over 6.0, up to and including 9.0 | `Excel` |
| Over 3.0, up to and including 6.0 | `Pass` |
| 3.0 or below | `Fail` |

Check the boundaries:

| Score | Grade |
|---|---|
| `3.0` | `Fail` |
| `3.1` | `Pass` |
| `6.0` | `Pass` |
| `6.1` | `Excel` |
| `9.0` | `Excel` |
| `9.1` | `Warning` |

### 2. The average

`calcAverage` returns the five scores added together, divided by 5. The average is printed with exactly 2 decimal places, and it gets its own grade from the same table, so an average over 9.0 is also a `Warning`.

### 3. The order of the results

Grade each of the five scores with `determineGrade`, in the order they were entered, then show the average and its grade.

## What to Use

These are suggestions. Any approach that produces the correct output earns full credit, as long as it passes the source checks (see How It's Checked).

- `determineGrade`: an `if`/`else if` chain that checks the highest range first (`score > 9.0`, then `score > 6.0`, then `score > 3.0`), with `else` for `Fail`. Store the grade in a `String` variable, then `return` it (S1 pattern).
- `calcAverage`: `return (score1 + score2 + score3 + score4 + score5) / 5;` (R2 pattern).
- In `main`: `double average = calcAverage(score1, score2, score3, score4, score5);`, then the print statements already in the starter.

## Exact Output

Spelling, capitalization, and punctuation must match, and the grader compares the whole output, so print nothing extra. Each prompt is printed on its own line; the user types on the next line.

The five prompts, in order:

```
Enter the first score:
Enter the second score:
Enter the third score:
Enter the fourth score:
Enter the fifth score:
```

The results, after all five scores are entered:

```
Here are the grades and the average:
Score 1: [grade1]
Score 2: [grade2]
Score 3: [grade3]
Score 4: [grade4]
Score 5: [grade5]
Average score: [average]
Average Grade: [averageGrade]
```

`[average]` has exactly 2 decimal places, for example `7.62`.

## Sample Runs

```text
Enter the first score:
7.1
Enter the second score:
7.3
Enter the third score:
7.2
Enter the fourth score:
8.1
Enter the fifth score:
8.4
Here are the grades and the average:
Score 1: Excel
Score 2: Excel
Score 3: Excel
Score 4: Excel
Score 5: Excel
Average score: 7.62
Average Grade: Excel
```

Mixed grades, with one score over 9.0:

```text
Enter the first score:
2.2
Enter the second score:
4.5
Enter the third score:
7.0
Enter the fourth score:
9.5
Enter the fifth score:
6.0
Here are the grades and the average:
Score 1: Fail
Score 2: Pass
Score 3: Excel
Score 4: Warning
Score 5: Pass
Average score: 5.84
Average Grade: Pass
```

## Test Your Program

Run each test before you submit. The autograder uses these and other values.

| Scores entered | Grades, in order | Average line | Average Grade line |
|---|---|---|---|
| `7.1 7.3 7.2 8.1 8.4` | Excel, Excel, Excel, Excel, Excel | `Average score: 7.62` | `Average Grade: Excel` |
| `2.2 4.5 7.0 9.5 6.0` | Fail, Pass, Excel, Warning, Pass | `Average score: 5.84` | `Average Grade: Pass` |
| `2.2 2.4 2.6 2.2 2.8` | Fail, Fail, Fail, Fail, Fail | `Average score: 2.44` | `Average Grade: Fail` |
| `9.9 9.4 9.2 9.4 9.9` | Warning, Warning, Warning, Warning, Warning | `Average score: 9.56` | `Average Grade: Warning` |
| `3.0 3.1 6.0 6.1 9.0` | Fail, Pass, Pass, Excel, Excel | `Average score: 5.44` | `Average Grade: Pass` |

## How It's Checked

| Check | What it looks for | Points |
|---|---|---|
| All Excel scores | The exact output for `7.1 7.3 7.2 8.1 8.4` | 4 |
| Mixed grades | The exact output for `2.2 4.5 7.0 9.5 6.0` | 4 |
| All Fail scores | The exact output for `2.2 2.4 2.6 2.2 2.8` | 4 |
| All Warning scores | The exact output for `9.9 9.4 9.2 9.4 9.9` | 4 |
| Boundary values | The exact output for `3.0 3.1 6.0 6.1 9.0` | 4 |
| Uses a `Scanner` | The source code creates a `Scanner` with `System.in` | 2 |
| Uses `calcAverage` | The source code calls `calcAverage` | 1 |
| Uses `determineGrade` | The source code calls `determineGrade` | 1 |
| Closes the program | The source code calls `System.exit` | 1 |
| **Total** | | **25** |

Each test compares your whole output, prompts included, so the prompts must match too. Capital letters and spacing don't count against you. Results must come from the user's input; the grader may use other scores.

## Where to Look

- Day 2 notes, R2 (Using a return value): storing a return value, and using it inside `println`.
- Day 2 notes, S1 (Returning a String): building a `String` and returning it.
- Day 2 notes, B1 (A boolean return as a condition): a comparison inside a method.
- Rule 1 above: the grade table and its boundaries.
