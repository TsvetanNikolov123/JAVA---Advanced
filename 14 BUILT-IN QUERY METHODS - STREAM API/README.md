14 Lab: Stream API
==================

---
---

Problems for exercises and homework for the ["Java Advanced" course \@
SoftUni](https://softuni.bg/courses/java-fundamentals).

You can check your solutions here:
<https://judge.softuni.bg/Contests/1040/Stream-API-Lab>.

---

Part I: Stream\<T\> and Types of Streams
========================================

14.01 Take Two
--------------

Read a **sequence of integers**, given on a single line separated by a space.

Finds all **unique** elements, such that **10 ≤ n ≤ 20** and print only **the
first 2 elements**.

If there are **fewer than 2 elements**, print as much as there are. If there are
**no elements**, print nothing.

### Examples

| **Input**     | **Output**    |
|---------------|---------------|
| 15 2 15 14 12 | 15 14         |
| 17 -2 3       | 17            |
| \-2 3         | (*no output)* |

### Hints

-   Read the input using a **Scanner** or a **BufferedReader** and parse the
    strings to a list of numbers:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64347228-3a664580-cffc-11e9-91cd-82320146a827.png" alt="alt text" width="600" height=""></kbd>

-   Filter the numbers with **filter()**, take the unique ones with
    **distinct()**, take only two from the stream with **limit()** and iterate
    over them while printing with **forEach()**:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64347275-4e11ac00-cffc-11e9-8cf7-4b676e7ba182.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="01 Take Two" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/14%20BUILT-IN%20QUERY%20METHODS%20-%20STREAM%20API/p01_TakeTwo/TakeTwo.java">01 Take Two</a>

---

14.02 Upper Strings
-------------------

Read a sequence of strings, given on a single line separated with a space.

Map each to upper case and print them, using the Stream API.

### Examples

| **Input**          | **Output**         |
|--------------------|--------------------|
| Pesho Gosho Stefan | PESHO GOSHO STEFAN |
| Soft Uni Rocks     | SOFT UNI ROCKS     |
| *(empty line)*     | *(no output)*      |

### Hints

-   Read the input using a **Scanner** or a **BufferedReader** into a list of
    strings **List\<String\>**:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64347412-8dd89380-cffc-11e9-8c64-0d32141d3580.png" alt="alt text" width="800" height=""></kbd>

-   Call a stream over the list and map every element to upper case. Iterate
    over the stream and print the result:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64347397-874a1c00-cffc-11e9-8e6c-27199dc23305.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="02 Upper Strings" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/14%20BUILT-IN%20QUERY%20METHODS%20-%20STREAM%20API/p02_UpperStrings/UpperStrings.java">02 Upper Strings</a>

---

14.03 First Name
----------------

Read a **sequence of names**, given on a single line, separated by a space.

Read a **sequence of letters**, given on the next line, separated by a space.

Find the **names that start with one of the given letters** and print the first
of them (**ordered lexicographically**).

If there is **no name** that conforms to the requirement, **print "No match"**.

### Examples

| **Input**                   | **Output** |
|-----------------------------|------------|
| Rado Plamen Gosho <br/> p r | Plamen     |
| Plamen Gosho Rado <br/> s c | No match   |

### Hints

-   You can use a hash set to store letter, for efficient searching

-   Make sure you are comparing letter with the same casing (lower or upper)

-   Use **filter()**, **sorted()** and **findFirst()**

-   Use **Optional\<T\>**

<br/>

### Solution: <a title="03 First Name" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/14%20BUILT-IN%20QUERY%20METHODS%20-%20STREAM%20API/p03_FirstName/FirstName.java">03 First Name</a>

---

14.04 Average of Doubles
------------------------

Read a **sequence of double numbers**, given on a single line, separated by a
space.

Find the **average of all elements**, using the Stream API.

**Round** the output to the second digit after the decimal separator.

If there are **no numbers** in the sequence, **print "No match"**.

### Examples

| **Input**      | **Output** |
|----------------|------------|
| 3 4 5 6        | 4.50       |
| 3.14 5.2 6.18  | 4.84       |
| *(empty list)* | No match   |

### Hints

-   Use a primitive stream **DoubleStream**

-   Use **OptionalDouble**

-   Make sure to filter empty strings before transforming the stream

<br/>

### Solution: <a title="04 Average of Doubles" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/14%20BUILT-IN%20QUERY%20METHODS%20-%20STREAM%20API/p04_AverageOfDoubles/AverageOfDoubles.java">04 Average of Doubles</a>

---

Part II: Types of Operations
============================

14.05 Min Even Number
---------------------

Read a sequence of numbers, given on a single line, separated by a space.

Find the smallest number of all even numbers, using the Stream API.

If there are **no numbers** in the sequence, **print "No match"**.

### Examples

| **Input**       | **Output** |
|-----------------|------------|
| 1 2 3 4 5 6     | 2.00       |
| 3.14 -2.00 1.33 | \-2.00     |
| *(empty list)*  | No match   |

### Hints

-   Use map function to map the objects to **Double**

-   Make sure to filter empty strings

-   Filter the even numbers

-   Get the smallest number using **Double.compare(x1, x2)**

<br/>

### Solution: <a title="05 Min Even Number" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/14%20BUILT-IN%20QUERY%20METHODS%20-%20STREAM%20API/p05_MinEvenNumber/MinEvenNumber.java">05 Min Even Number</a>

---

14.06 Find and Sum Integers
---------------------------

Read a sequence of elements, given on a single line, separated by a space.

Filter all elements that are integers and calculate their sum, using the Stream
API.

If there are **no numbers** in the sequence, **print "No match"**.

### Examples

| **Input**          | **Output** |
|--------------------|------------|
| Sum 3 and 4        | 7          |
| Sum -3 and -4      | \-7        |
| Sum three and four | No match   |

### Hints

-   Use **filter map reduce** pattern

-   Check if element's char at index 0 is a sign (+ or -)

-   Check if all else element's chars are digits

<br/>

### Solution: <a title="06 Find and Sum Integers" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/14%20BUILT-IN%20QUERY%20METHODS%20-%20STREAM%20API/p06_FindAndSumIntegers/FindAndSumIntegers.java">06 Find and Sum Integers</a>

---

14.07 \*Map Districts
---------------------

On the first line, you are given the population count of districts in different
cities, separated by a single space in the format **"city:district
population"**.

On the second line, you are given the minimum population for filtering of the
towns. The **population of a town** is the **sum of populations of all of its
districts**.

**Print** all **cities** with population greater than a given. **Sort cities and
districts** by descending population and **print top 5 districts for a given
city**.

For a better understanding, see the examples below.

### Examples

| **Input**                                        | **Output**                    |
|--------------------------------------------------|-------------------------------|
| Pld:9 Pld:13 Has:7 Sof:20 Sof:10 Sof:15 <br/> 10 | Sof: 20 15 10 <br/> Pld: 13 9 |
| Sof:10 Sof:12 Sof:15 <br/> 10                    | Sof: 15 12 10                 |
| Sof:5 <br/> 15                                   | *(no output)*                 |

### Hints

-   Read the input into a **proper collection**:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64348098-443c7880-cffd-11e9-9688-a6a88284447f.png" alt="alt text" width="800" height=""></kbd>

-   Read the population bound

<kbd><img src="https://user-images.githubusercontent.com/32310938/64348107-47376900-cffd-11e9-90cf-ed4a8c7d2fb4.png" alt="alt text" width="800" height=""></kbd>

-   **Filter**, **sort** and **print** the cities:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64348113-4d2d4a00-cffd-11e9-8647-ab73f745e319.png" alt="alt text" width="800" height=""></kbd>

-   Crete methods for generating **labda expressions**, stored in **functional
    interfaces**

-   Crete a method that returns a **predicate for filtering**:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64348142-58807580-cffd-11e9-92a7-db6e93b1168f.png" alt="alt text" width="800" height=""></kbd>

-   Create a method that returns a **comparator for sorting:**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64348172-646c3780-cffd-11e9-8f19-be624a5a295c.png" alt="alt text" width="800" height=""></kbd>

-   Create a method that returns a **consumer for printing a map entry:**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64348191-69c98200-cffd-11e9-8c67-bf2fbac8556b.png" alt="alt text" width="800" height=""></kbd>

<br/>

### Solution: <a title="07 \*Map Districts" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/14%20BUILT-IN%20QUERY%20METHODS%20-%20STREAM%20API/p07_MapDistricts/MapDistricts.java">07 \*Map Districts</a>

---

14.08 Bounded Numbers
---------------------

On the first line, read two numbers, a **lower** and **an upper bound**,
separated by a space.

On the second line, read a sequence of numbers, separated by a space.

Print all numbers, such that [**lower bound] ≤ n ≤ [upper bound]**.

### Examples

| **Input**                   | **Output**    |
|-----------------------------|---------------|
| 5 7 <br/> 1 2 3 4 5 6 7 8 9 | 5 6 7         |
| 7 5 <br/> 9 5 7 2 6 8       | 5 7 6         |
| 3 4 <br/> 5 6 7 8           | *(no output)* |

### Hints

-   Use **collect(Collectors.toList())**

<br/>

### Solution: <a title="08 Bounded Numbers" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/14%20BUILT-IN%20QUERY%20METHODS%20-%20STREAM%20API/p08_BoundedNumbers/BoundedNumbers.java">08 Bounded Numbers</a>

---