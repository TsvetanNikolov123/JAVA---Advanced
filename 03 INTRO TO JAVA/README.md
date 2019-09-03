03 Lab: Intro to Java
=====================

---
---

This document defines the exercises for ["Java Advanced" course \@ Software
University](https://softuni.bg/courses/java-advanced). Please submit your
solutions (source code) of all below described problems in
[Judge](https://judge.softuni.bg/Contests/382/).

---

03.01 Read Input
----------------

Write a program that reads:

-   **Two strings** from the first line

-   **Three Integers** which may be on multiple lines

-   A **string** from the next line

Print the output in the following format **{firstWord} {secondWord} {thirdWord}
{sumOfNumbers}.**

**The sum of numbers should be an integer.**

### Examples

| **Input**                           | **Output**          |
|-------------------------------------|---------------------|
| Java Rocks <br/> 5 12 -7 <br/> End  | Java Rocks End 10   |
| scanner system <br/> 1 2 3 <br/> in | scanner system in 6 |

### Hints

-   Use the Scanner class

-   Use the methods **next()**, **nextInt()**, **nextLine()**

<br/>

### Solution: <a title="01 Read Input" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/03%20INTRO%20TO%20JAVA/p01_ReadInput/ReadInput.java">01 Read Input</a>

---

03.02 Average of Three Numbers
------------------------------

Write program that **reads three numbers**. Print the **average of the three**,
formatted to the **second digit after the decimal point.**

### Examples

| **Input** | **Output** |
|-----------|------------|
| 2 4.5 3   | 3.17       |
| 3.1 4 15  | 7.37       |

### Hints

-   You might use Scanner class

-   To read the next double use the method **nextDouble()**:

>   double first = sc.nextDouble();

<br/>

### Solution: <a title="02 Average of Three Numbers" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/03%20INTRO%20TO%20JAVA/p02_AverageOfThreeNumbers/AverageOfThreeNumbers.java">02 Average of Three Numbers</a>

---

03.03 Euro Trip
---------------

You need to calculate the price of a given quantity of "wurst" in Deutsche
Marks. Read the quantity as a double value and print the price in marks, given
the following:

-   The price of 1 kg wurst is 1.20 BGN

-   The exchange rate is 4210500000000 DM : 1 BGN

Print the price, **rounded to the second digit** after the decimal separator.

### Examples

| **Input** | **Output**              |
|-----------|-------------------------|
| 2.35      | 11873610000000.00 marks |
| 1         | 5052600000000.00 marks  |
| 15        | 75789000000000.00 marks |

### Hints

-   Use the BigDecimal class to handle calculations involving money

-   Don’t forget to format the output by using the method of the System class
    **printf()**.
    
<br/>

### Solution: <a title="03 Euro Trip" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/03%20INTRO%20TO%20JAVA/p03_EuroTrip/EuroTrip.java">03 Euro Trip</a>

---

03.04 Greeting
--------------

Read two strings as an input – the first and last name of a person. Print a
greeting in the following format:

**"Hello, " + {firstName} {lastName} + "!"** , where if a name is missing,
replace it with five stars "\*":

### Examples

| **Input**   | **Output**              |
|-------------|-------------------------|
| Robert Ford | Hello, Robert Ford!     |
| Ford        | Hello, \*\*\*\*\* Ford! |

### Hints

-   Use the Scanner method **nextLine()**

-   Use the String static method **isEmpty()** as in the example below:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64199507-29e68b80-ce93-11e9-8ffb-1a03391a30f0.png" alt="alt text" width="400" height=""></kbd>

<br/>

### Solution: <a title="04 Greeting" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/03%20INTRO%20TO%20JAVA/p04_Greeting/Greeting.java">04 Greeting</a>

---

03.05 Transport Price
---------------------

A student travels **n** kilometers using only **one type of transport** based on
the **distance that he will travel**:

-   **Taxi**: Initial tax: **0.70 USD**. Daytime cost: **0.79 USD/km**. Night
    time cost: **0.90 USD/km**.

-   **Bus**: Day / Night tariff: **0.09 USD/km**. For **at least 20
    kilometers**.

-   **Train**: Day / Night tariff: **0.06 USD/km**. For **at least 100
    kilometers**.

Write a program that calculates the price of the trip by a given distance and
time of day.

Format the output to the second digit after the decimal separator.

### Examples

| **Input**       | **Output** |
|-----------------|------------|
| 5 <br/> day     | 4.65       |
| 7 <br/> night   | 7.00       |
| 25 <br/> day    | 2.25       |
| 180 <br/> night | 10.80      |

<br/>

### Solution: <a title="05 Transport Price" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/03%20INTRO%20TO%20JAVA/p05_TransportPrice/TransportPrice.java">05 Transport Price</a>

---

03.06 Numbers 0..9
------------------

Using a **while loop**, print the numbers from 0 to 9 inclusive.

### Examples

| **Input** | **Output**                                                                                          |
|-----------|-----------------------------------------------------------------------------------------------------|
|           | Number: 0 <br/> Number: 1 <br/> Number: 2 <br/> Number: 3 <br/> Number: 4 <br/> Number: 5 <br/> <br/> Number: 6 <br/> Number: 7 <br/> Number: 8 <br/> Number: 9 |

<br/>

### Solution: <a title="06 Numbers 0..9" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/03%20INTRO%20TO%20JAVA/p06_Numbers0To9/Numbers0To9.java">06 Numbers 0..9</a>

---

03.07 Product of Numbers [N..M]
-------------------------------

Write a program that calculates the product of all numbers in the interval
[**n**..**m**] by given **n** and **m**:

### Examples

| **Input** | **Output**                           |
|-----------|--------------------------------------|
| 1 5       | product[1..5] = 120                  |
| 3 20      | product[3..20] = 1216451004088320000 |

### Hints

-   Use the **BigInteger** class to handle big numbers and a do-while loop.

<br/>

### Solution: <a title="07 Product of Numbers From N To M" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/03%20INTRO%20TO%20JAVA/p07_ProductOfNumbersNtoM/ProductOfNumbersNtoM.java">07 Product of Numbers \[N..M]</a>

---

03.08 Lottery
-------------

Print all combinations from TOTO 3/10 lottery (like 6/49 but with less
combinations):

### Examples

| **Input** | **Output**                   |
|-----------|------------------------------|
|           | ... ... 7 8 10 7 9 10 8 9 10 |

### Hints

-   Use 3 nested loops.

<br/>

### Solution: <a title="08 Lottery" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/03%20INTRO%20TO%20JAVA/p08_Lottery/Lottery.java">08 Lottery</a>

---

03.09 Extract Bit from Integer
------------------------------

Write a program that extracts from given positive integer **n** the value of
given **bit at index p.** The bits are counted from **right to left**, starting
from bit 0.

### Examples

| **Input** | **Output** | **Comments**                                                           |
|-----------|------------|------------------------------------------------------------------------|
| 5 2       | 1          | **n**=5, **p**=2 binary representation of **5**: 00000000 00000**1**01 |
| 0 9       | 0          | **n**=0, **p**=9 binary representation of **0**: 000000**0**0 00000000 |

<br/>

### Solution: <a title="09 Extract Bit from Integer" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/03%20INTRO%20TO%20JAVA/p09_ExtractABitFromInteger/ExtractABitFromInteger.java">09 Extract Bit from Integer</a>

---

03.10 Modify a Bit 
------------------

We are given a positive integer number **n**, a position **p** and a bit value
**v** (v=**0** or **1**). Write a program that modifies **n** to hold the value
**v** at the position **p** from the binary representation of **n** while
preserving all other bits in **n**.

Print the decimal representation of the resulting number.

### Examples

| **Input** | **Output** | **Comments**                                                                                                                                         |
|-----------|------------|------------------------------------------------------------------------------------------------------------------------------------------------------|
| 5 2 0     | 1          | **n**=5, **p**=2, **v**=0 binary representation of **5**: 00000000 00000**1**01 binary representation of the result (**1**): 00000000 00000**0**01   |
| 0 9 1     | 512        | **n**=0, **p**=9, **v**=1 binary representation of **0**: 000000**0**0 00000000 binary representation of the result (**512**): 000000**1**0 00000000 |

<br/>

### Solution: <a title="10 Modify a Bit" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/03%20INTRO%20TO%20JAVA/p10_ModifyABit/ModifyABit.java">10 Modify a Bit</a>

---