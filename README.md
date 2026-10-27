# Ch. 5 Challenge 2: G-Force Test

## Mission Briefing

Mission Control needs to know how many G's each astronaut candidate can handle. In the centrifuge, a candidate's score is the G-force at the moment they pass out, and each candidate does 5 test runs. `main` is already written: it reads the 5 scores and prints the report. Your job is to write the three methods that do the work: one finds the average, one grades a score, and one flags any score that's dangerous so staff can step in.

## What You'll Practice

- Reading a documentation comment to work out a method's header (Day 2 notes, R2)
- Writing a value-returning method and its `return` statement (Day 2 notes, R1)
- Returning a `String` (Day 2 notes, S1)
- Returning a `boolean` that main uses as an `if` condition (Day 2 notes, B1)
- A local variable inside a method (Day 2 notes, L1)

## How This Challenge Works

Edit `src/GForceTest.java`. The class is `GForceTest`. Do not rename the file or the class.

The comments in the code are tagged:

| Tag | Meaning |
|---|---|
| `INFO:` | Background information. Nothing to do. |
| `GIVEN:` | Code that is already written. Don't change it. |
| `TODO n:` | Your work. Each TODO has two parts: `(method)` below `main`, and `(call)` inside `main`. |

This time the calls are already written for you, but they're commented out. Work one TODO at a time, in order:

1. Read the documentation comment under `TODO n (method)`.
2. Write the method right below it: header and body.
3. Uncomment the block under `TODO n (call)`. To uncomment several lines, select them and press **Ctrl + /**.
4. Run the program and compare your output to this README.

The program runs at every step, so you can test each method as soon as it's written. IntelliJ lists every TODO in its TODO window (**View > Tool Windows > TODO**).

## Reading a Documentation Comment

The documentation comment tells you everything the header needs. All methods in this chapter are `public static`.

| In the comment | Tells you |
|---|---|
| Each `@param` line | One parameter: its name and its type |
| The `@return` line | The return type |
| The `TODO n (method)` line above it | The method's name |

## Inputs

The GIVEN code reads these. You don't need to write any input code.

| Order | What it is | Java type |
|---|---|---|
| 1 to 5 | The candidate's five scores, in G's, one per prompt | `double` |

## Your TODOs

### TODO 1: calcAverage

- **Header:** work it out from the documentation comment
- **Body:** adds the five scores, divides by 5, and returns the result
- **Call:** uncomment the two lines under `TODO 1 (call)`

<details>
<summary>Hint for TODO 1</summary>

Every parameter needs its own type, even when there are five of them. A value-returning method ends with a `return` statement (Day 2 notes, R1). In R2, `sum` stores its answer in a local variable and returns it. You can also return the whole expression in one line. Watch your parentheses: the five scores have to be added before you divide.

</details>

### TODO 2: determineGrade

- **Header:** work it out from the documentation comment
- **Body:** returns exactly one grade for the score:

  | Score | Grade |
  |---|---|
  | Over 9.0 | `Warning` |
  | Over 6.0, up to and including 9.0 | `Excel` |
  | Over 3.0, up to and including 6.0 | `Pass` |
  | 3.0 or below | `Fail` |

- **Call:** uncomment the six lines under `TODO 2 (call)`. They use `average`, so TODO 1 must be done first.

Check the boundaries:

| Score | Grade |
|---|---|
| `3.0` | `Fail` |
| `3.1` | `Pass` |
| `6.0` | `Pass` |
| `6.1` | `Excel` |
| `9.0` | `Excel` |
| `9.1` | `Warning` |

<details>
<summary>Hint for TODO 2</summary>

Use an `if`/`else if` chain that checks the highest range first, with `else` for `Fail`. Each range starts just above its number, so the checks use `>`, not `>=`. In S1, `fullName` sends back a `String` the same way a method sends back a number. You can store the grade in a local `String` variable and return it at the end.

</details>

### TODO 3: isDangerous

- **Header:** work it out from the documentation comment
- **Body:** returns `true` if the score is over 9.0, and `false` if it isn't
- **Call:** uncomment the `if`/`else` under `TODO 3 (call)`. It calls `isDangerous` once for each score.

<details>
<summary>Hint for TODO 3</summary>

Look at `isSafeAltitude` in Day 2 notes, B1. A comparison like `feet >= 500` is already `true` or `false`, so the method can return it directly. In `main`, the call goes right inside the `if` condition. Remember that 9.0 itself is not dangerous.

</details>

## Exact Output

Spelling, capitalization, and punctuation must match. Extra spaces don't count against you, but missing spaces do.

The grades your `determineGrade` method sends back must be spelled exactly:

```
Warning
Excel
Pass
Fail
```

Everything else in the output is printed by GIVEN code. The average prints with exactly 2 decimal places.

## Sample Runs

All three TODOs finished:

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
Test results:
Average score: 7.62
Score 1: Excel
Score 2: Excel
Score 3: Excel
Score 4: Excel
Score 5: Excel
Average grade: Excel
Safety check:
Cleared for flight.
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
Test results:
Average score: 5.84
Score 1: Fail
Score 2: Pass
Score 3: Excel
Score 4: Warning
Score 5: Pass
Average grade: Pass
Safety check:
Medical review required.
```

Only TODO 1 finished. The program still runs; the grades and the safety result are just missing:

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
Test results:
Average score: 7.62
Safety check:
```

## Test Your Program

Run each test before you submit. The autograder uses these and other values.

| Scores entered | Average | Grades, in order | Average grade | Safety check |
|---|---|---|---|---|
| `7.1 7.3 7.2 8.1 8.4` | `7.62` | Excel, Excel, Excel, Excel, Excel | Excel | Cleared for flight. |
| `2.2 4.5 7.0 9.5 6.0` | `5.84` | Fail, Pass, Excel, Warning, Pass | Pass | Medical review required. |
| `3.0 3.1 6.0 6.1 9.0` | `5.44` | Fail, Pass, Pass, Excel, Excel | Pass | Cleared for flight. |
| `9.9 9.4 9.2 9.4 9.9` | `9.56` | Warning, Warning, Warning, Warning, Warning | Warning | Medical review required. |
| `2.2 2.4 2.6 2.2 2.8` | `2.44` | Fail, Fail, Fail, Fail, Fail | Fail | Cleared for flight. |

## How It's Checked

| Check | What it looks for | Points |
|---|---|---|
| TODO 1: calcAverage header | A method named `calcAverage` with five `double` parameters that returns a `double` | 2 |
| TODO 1: Average for 7.1, 7.3, 7.2, 8.1, 8.4 | `Average score: 7.62` | 2 |
| TODO 1: Average for 2.2, 4.5, 7.0, 9.5, 6.0 | `Average score: 5.84` | 2 |
| TODO 1: Average for hidden scores | The average for scores you haven't seen | 2 |
| TODO 2: determineGrade header | A method named `determineGrade` with one `double` parameter that returns a `String` | 2 |
| TODO 2: Mixed grades | The grades for `2.2 4.5 7.0 9.5 6.0` | 2 |
| TODO 2: Boundary values | The grades for `3.0 3.1 6.0 6.1 9.0` | 3 |
| TODO 2: Grades for hidden scores | The grades for scores you haven't seen | 2 |
| TODO 3: isDangerous header | A method named `isDangerous` with one `double` parameter that returns a `boolean` | 2 |
| TODO 3: A score over 9.0 | `Medical review required.` for `2.2 4.5 7.0 9.5 6.0` | 2 |
| TODO 3: 9.0 is not dangerous | `Cleared for flight.` for `3.0 3.1 6.0 6.1 9.0` | 2 |
| TODO 3: Hidden scores | The safety check for scores you haven't seen | 2 |
| **Total** | | **25** |

- Header checks score even if your program doesn't compile. Output checks need it to compile.
- Hidden tests run when you submit, not in the Iteryx window.

## Where to Look

- Day 2 notes, R1 (Sending the value back) and R2 (Using a return value): writing a value-returning method.
- Day 2 notes, S1 (Returning a String): sending back a `String`.
- Day 2 notes, B1 (A boolean return as a condition): returning `true` or `false`, and using the call in an `if`.
- Day 2 notes, L1 (The same name in two methods): a local variable belongs only to its method.
