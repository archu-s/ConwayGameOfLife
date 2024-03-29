Conway Game of Life
=========

>`Conway Game of Life` is a solution of (https://github.com/careernowbrands/full-stack-engineer/blob/master/challenges/coding-challenge-1.md) with console output.
>It takes size of Grid(row column) and generation count as input.
>Example:
>Input
>4 5
>5

## Usage

>Run below commands inside the project directory

>`> java -cp target\ConwayGameOfLife-0.0.1-SNAPSHOT.jar com.archana.conway.ConwayGameOfLife`

>Then provide row column count in a line seperate by space
>and in another line provide genreation count.
```
>Example:
>4 5
>5
```
## Examples
```
> java -cp target\ConwayGameOfLife-0.0.1-SNAPSHOT.jar com.archana.conway.ConwayGameOfLife
4 5
5
+----------+
|  1   1   |
|1   1   1 |
|1 1     1 |
|1 1 1 1   |
+----------+
+----------+
|  1 1 1   |
|1   1   1 |
|        1 |
|1   1 1   |
+----------+
+----------+
|  1 1 1   |
|    1   1 |
|    1   1 |
|      1   |
+----------+
+----------+
|  1 1 1   |
|        1 |
|    1   1 |
|      1   |
+----------+
+----------+
|    1 1   |
|  1     1 |
|        1 |
|      1   |
+----------+
+----------+
|    1 1   |
|    1   1 |
|      1 1 |
|          |
+----------+
```

## Requirements
```
 Java 8
 maven
```

## Running the Tests
>To run unit tests, just execute `mvn test`
