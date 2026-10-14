# Student Grade Management System

A small Java program that uses arrays to store and process student marks.

## Features
- Stores names and scores in parallel arrays (`String[]`, `double[]`)
- Computes the average, highest and lowest marks with a single loop (O(n))
- Updates a mark by index (O(1))
- Sorts a copy of the marks for ranking with `Arrays.sort()` (O(n log n))

## Run
```bash
javac GradeSystem.java
java GradeSystem
```

## Sample output
```
Average: 71.75
Highest: Esi (91.0)
Lowest: 55.5
Sorted marks (low to high): [55.5, 68.0, 78.5, 91.0]
```

## Author
Duke Owusu-Kwakye, Level 200 Information Technology, University of Cape Coast
