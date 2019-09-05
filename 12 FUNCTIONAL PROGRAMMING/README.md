12 Lab: Functional Programming
==============================

---
---

This document defines the exercises for ["Java Advanced" course \@ Software
University](https://softuni.bg/courses/java-advanced). Please submit your
solutions (source code) of all below described problems in
[Judge](https://judge.softuni.bg/Contests/1038/Functional-Programming-Lab).

---

12.01 Sort Even Numbers
-----------------------

Write a program that reads one line of **Integers** separated by **", "**.

-   Print the **even** numbers

-   **Sort** them in ascending order

-   Print them again.

Use 2 **Lambda Expresions** to do so.

### Examples

| **Input**                     | **Output**                          |
|-------------------------------|-------------------------------------|
| 4, 2, 1, 3, 5, 7, 1, 4, 2, 12 | 4, 2, 4, 2, 12 <br/> 2, 2, 4, 4, 12 |
| 1, 3, 5                       | *(no output)*                       |
| 2, 4, 6                       | 2, 4, 6 <br/> 2, 4, 6               |

<br/>

### Solution: <a title="01 Sort Even Numbers" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/12%20FUNCTIONAL%20PROGRAMMING/p01_SortEvenNumbers/SortEvenNumbers.java">01 Sort Even Numbers</a>

---

12.02 Sum Numbers
-----------------

Write a program that reads one line of **Integers** separated by **", "**. Print
the **count** of the numbers and their **sum.**

Use a **Function\<String, Integer\>**

### Examples

| **Input**                     | **Output**                |
|-------------------------------|---------------------------|
| 4, 2, 1, 3, 5, 7, 1, 4, 2, 12 | Count = 10 <br/> Sum = 41 |
| 2, 4, 6                       | Count = 3 <br/> Sum = 12  |

### Hints

-   Use Function\<String, Integer\> for parsing integers after you split them to
    a String array
    
<br/>

### Solution: <a title="02 Sum Numbers" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/12%20FUNCTIONAL%20PROGRAMMING/p02_SumNumbers/SumNumbers.java">02 Sum Numbers</a>

---

12.03 Count Uppercase Words
---------------------------

Write a program that reads one line of **text** from the console. Print the
**count** of words that start with a **Uppercase letter**, after that print all
these **words** in the **same order,** like you found them in the text.

Use a **Predicate\<String\>**

### Examples

| **Input**                                                                                                                                                                                | **Output**                                 |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------|
| The following example shows how to use Predicate                                                                                                                                         | 2 <br/> The <br/> Predicate                |
| Write a program that reads one line of text from console. Print count of words that start with Uppercase, after that print all those words in the same order like you find them in text. | 3 <br/> Write <br/> Print <br/> Uppercase, |

### Hints

-   Use a **Predicate\<String\>** like an **if-condition**

<br/>

### Solution: <a title="03 Count Uppercase Words" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/12%20FUNCTIONAL%20PROGRAMMING/p03_CountUppercaseWords/CountUppercaseWords.java">03 Count Uppercase Words</a>

---

12.04 Add VAT
-------------

Write a program that reads one line of **Double** prices separated by **", "**.
Print the prices with added VATs for all of them. Format them to the **2nd**
digit after the decimal point. The order of the prices must remain the same.

Use an **UnaryOperator\<Double\>**

### Examples

| **Input**       | **Output**                                                   |
|-----------------|--------------------------------------------------------------|
| 1.38, 2.56, 4.4 | Prices with VAT: <br/> 1.66 <br/> 3.07 <br/> 5.28            |
| 1, 3, 5, 7      | Prices with VAT: <br/> 1.20 <br/> 3.60 <br/> 6.00 <br/> 8.40 |

<br/>

### Solution: <a title="04 Add VAT" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/12%20FUNCTIONAL%20PROGRAMMING/p04_AddVAT/AddVAT.java">04 Add VAT</a>

---

12.05 Filter by Age
-------------------

Write a program that reads an integer **N** on the first line. And on next **N**
lines read pairs of **"[name], [age]".** Then read three more lines with:

-   Condition - "younger" or "older"

-   Age - Integer

-   Format - "name", "age" or "name age"

Depending on the **condition,** print the **pairs** in the right **format**.

**Don’t use any build-in functionality. Write your own methods.**

### Examples

<img src="https://user-images.githubusercontent.com/32310938/64328568-58b94a80-cfd6-11e9-8c77-0d1f75ebfda6.png" alt="alt text" width="800" height="">

<br/>

### Solution: <a title="05 Filter by Age" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/12%20FUNCTIONAL%20PROGRAMMING/p05_FilterByAge/FilterByAge.java">05 Filter by Age</a>

---