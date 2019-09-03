04 Exercise: Intro to Java
==========================

---
---

This document defines the exercises for ["Java Advanced" course \@ Software
University](https://softuni.bg/courses/java-advanced). Please submit your
solutions (source code) of all below described problems in
[Judge](https://judge.softuni.bg/Contests/383).

---

04.01 Rectangle Area
--------------------

Write a program that reads the **sides of a rectangle** (two integers **a** and
**b**), calculates and prints the rectangle's **area**. Format the result to the
**second digit** after the decimal separator.

### Examples

| **Input** | **Output** |
|-----------|------------|
| 7 20      | 140.00     |
| 5 12      | 60.00      |

<br/>

### Solution: <a title="01 Rectangle Area" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p01_RectangleArea/RectangleArea.java">01 Rectangle Area</a>

---

04.02 Triangle Area
-------------------

Write a program that reads **3 points** in the plane (with integer **x** and
**y** as coordinates), calculates and prints the **area of the triangle**
composed by these 3 points. Round the result to a whole number. In case the
three points do not form a triangle, print "**0**" as result.

### Examples

| **Input**                      | **Output** |   | **Input**                     | **Output** |   | **Input**               | **Output** |
|--------------------------------|------------|---|-------------------------------|------------|---|-------------------------|------------|
| \-5 10 <br/> 25 30 <br/> 60 15 | 575        |   | 53 18 <br/> 56 23 <br/> 24 27 | 86         |   | 1 1 <br/> 2 2 <br/> 3 3 | 0          |

This resource could help you:
<http://www.mathopenref.com/coordtrianglearea.html>.

<br/>

### Solution: <a title="02 Triangle Area" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p02_TriangleArea/TriangleArea.java">02 Triangle Area</a>

---

04.03 Formatting Numbers
------------------------

Write a program that reads **3 numbers**:

-   an integer **a** (0 ≤ **a** ≤ 500)

-   a floating-point **b**

-   a floating-point **c**

**Print them in 4 virtual columns** on the console, separated with a pipe
'**\|**'. Each column should have a width of 10 characters.

-   First, the number **a** should be printed in **hexadecimal, left aligned**

-   Second, the number **a** should be printed in binary form, padded with
    zeroes

-   Third, the number **b** should be **printed with 2 digits after the decimal
    point, right aligned**

-   Lastly, the number **c** should be **printed with 3 digits after the decimal
    point, left aligned**

You will receive **a**, **b** and **c** on a **single line**, separated by **one
or more white spaces**.

### Examples

| **Input**         | **Output**                               |
|-------------------|------------------------------------------|
| 254 11.6 0.5      | &#124;FE &#124;0011111110&#124; 11.60&#124;0.500 &#124;      |
| 499 -0.5559 10000 | &#124;1F3 &#124;0111110011&#124; -0.56&#124;10000.000 &#124; |

<br/>

### Solution: <a title="03 Formatting Numbers" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p03_FormattingNumbers/FormattingNumbers.java">03 Formatting Numbers</a>

---

04.04 Calculate Expression
--------------------------

Write a program that reads three floating point numbers **a**, **b**, and **c**
from the console and calculates the following expressions:

**f1 = ((a2 + b2) / (a2 – b2))(a + b + c) / √c f2 = (a2 + b2 - c3)(a – b)**

Then the program calculates the **absolute value** of the **difference between**
the average of the three numbers and the average of the two expressions.

**Abs (Avg (a, b, c) – Avg (f1, f2))**

You will receive **a**, **b** and **c** on a **single line**, separated by **one
or more white spaces**.

### Examples

| **Input**   | **Output**                                        |
|-------------|---------------------------------------------------|
| 5 2 3       | F1 result: 6.45; F2 result: 8.00; Diff: 3.89      |
| 3.8 2.5 1.2 | F1 result: 569.60; F2 result: 45.84; Diff: 305.22 |

<br/>

### Solution: <a title="04 Calculate Expression" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p04_CalculateExpression/CalculateExpression.java">04 Calculate Expression</a>

---

04.05 \*Odd and Even Pairs
--------------------------

You are given an **array of integers** as a single line, separated by a
**space**. Write a program that checks consecutive pairs and prints if **both
are odd/even or not**.

Note that the array length should also be an **even** number.

### Examples

| **Input**     | **Output**                                                                    |
|---------------|-------------------------------------------------------------------------------|
| 1 2 3 4       | 1, 2 -\> different <br/> 3, 4 -\> different                                   |
| 2 8 11 15 3 2 | 2, 8 -\> both are even <br/> 11, 15 -\> both are odd <br/> 3, 2 -\> different |
| 1 8 11 1 2    | invalid length                                                                |

<br/>

### Solution: <a title="05 Odd and Even Pairs" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p05_OddAndEvenPairs/OddAndEvenPairs.java">05 \*Odd and Even Pairs</a>

---

04.06 \*Hit the Target
----------------------

Write a program that takes as input an **integer** – the **target** – and
outputs to the console **all pairs of numbers** between **1** and **20**, which,
if **added** or **subtracted**, **result in the target**.

### Examples

| **Target** | **Output**                                                                                                  |
|------------|-------------------------------------------------------------------------------------------------------------|
| 5          | 1 + 4 = 5 <br/> 2 + 3 = 5 <br/> 3 + 2 = 5<br/>  … <br/> 19 - 14 = 5 <br/> 20 - 15 = 5                       |
| 35         | 15 + 20 = 35 <br/> 16 + 19 = 35 <br/> 17 + 18 = 35 <br/> 18 + 17 = 35 <br/> 19 + 16 = 35 <br/> 20 + 15 = 35 |
| 0          | 1 - 1 = 0 <br/> 2 - 2 = 0 <br/> … <br/> 19 - 19 = 0 <br/> 20 - 20 = 0                                       |

<br/>

### Solution: <a title="06 Hit the Target" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p06_HitTheTarget/HitTheTarget.java">06 \*Hit the Target</a>

---

04.07 Character Multiplier
--------------------------

Create a program that takes **two strings** as arguments and returns the **sum**
of their **character codes multiplied** in pairs. (multiply str1.charAt (0) with
str2.charAt (0) and add to the total sum, then continue with the next two
characters). If one of the strings is longer than the other, **add** the
remaining character codes to the total sum **without** multiplication.

### Examples

| **Input**   | **Output** |
|-------------|------------|
| Gosho Pesho | 53253      |
| 123 522     | 7647       |
| a aaaa      | 9700       |

<br/>

### Solution: <a title="07 Character Multiplier" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p07_CharacterMultiplier/CharacterMultiplier.java">07 Character Multiplier</a>

---

 04.08 Get First Odd or Even Elements
-------------------------------------

Write a program that returns the first **N** odd/even elements from a
collection. Return as many as you can.

Format of the input: **Get {number of elements} {odd/even}**

### Examples

| **Input**                     | **Output** |
|-------------------------------|------------|
| 1 2 3 4 5 <br/> Get 3 odd     | 1 3 5      |
| 11 6 2 8 1 0 <br/> Get 8 even | 6 2 8 0    |

<br/>

### Solution: <a title="08 Get First Odd or Even Elements" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p08_GetFirstOddOrEvenElements/GetFirstOddOrEvenElements.java">08 Get First Odd or Even Elements</a>

---

04.09 Byte Party
----------------

You will be given an integer number **N** and on each of the next N lines - a
**positive 8-bit integer**. On the next lines you will be given a series of
commands, one of the following:

-   **"-1 [position]"** – Upon receiving this command you should **flip** the
    bits at the specified **position** in **all** numbers you received. Flipping
    a bit means turning its value **from 1 to 0 or the other way around**.

-   **"0 [position]"** – upon receiving this command you should **unset** the
    bits at the specified **position** for **all** numbers, i.e. turn all bits
    to **0** regardless of their current value.

-   **"1 [position]"** – upon receiving this command you should **set** the bits
    at the specified **position** for **all** numbers, i.e. turn all bits to
    **1** regardless of their current value.

-   **"party over"** – when you receive this command **print** back the numbers
    after all changes have been made; each number stays on a separate line.

Input
-----

-   The input data should be read from the console.

-   The first input line holds **the number N – the count of integers** you'll
    receive.

-   On each of the next **N lines** you'll receive a positive 8-bit integer
    number. Input ends with **the string "party over".**

-   The input data will always be valid and in the format described. There is no
    need to check it explicitly.

Output
------

-   You should **print N lines, each containing a number** – the numbers **after
    all manipulations**.

Constraints
-----------

-   All **input numbers** are in the range [0 … 255].

-   **[position]** will be between [0 … 7].

-   Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.

Examples
--------

| **Input**                           | **Output** | **Comments**                                                                                                                                                                                                           |
|-------------------------------------|------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 3 <br/> 44 <br/> 106 <br/> 12 <br/> -1 0 <br/> 0 1 <br/> 1 2 <br/> party over | 45 <br/> 109 <br/> 13  | <kbd><img src="https://user-images.githubusercontent.com/32310938/64207368-2956f080-cea5-11e9-83e2-7ac31d65a174.png" alt="alt text" width="300" height=""></kbd> |

<br/>

### Solution 1: <a title="09 Byte Party" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p09_1_ByteParty/ByteParty.java">09 Byte Party</a>
### Solution 2: <a title="09 Byte Party" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p09_2_ByteParty/ByteParty.java">09 Byte Party</a>

---

04.10 X-Bits
-------

<kbd><img src="https://user-images.githubusercontent.com/32310938/64207530-82bf1f80-cea5-11e9-893d-ffb724c629d5.png" alt="alt text" width="400" height=""></kbd>

You are given **8 positive 32-bit integer numbers**. Write a program to
**count** all **X-bits**.

X-bits are groups of **9** bits (3 rows x 3 columns) forming the letter "**X**".
Your task is to count all **X-bits** and print their count on the console.
**Valid** X-bits consist of 3 numbers where their corresponding bit indexes are
**exactly {"101", "010", "101"}.** All other combinations like: **{"111", "010",
"101"}** or **{"111", "111", "111"}** are **invalid.** All valid X-bits can be
part of **multiple** X-bits (with **overlapping**). Check the example **on the
right** to understand your task better.

### Input

The input data should be read from the console.

-   On the first **8 lines**, you will be given **8 32-bit positive** integers.

The input data will always be valid and in the format described. There is no
need to check it explicitly.

### Output

The output should be printed on the console. It should consist of exactly **1**
line:

-   At the **first line** print the count of the **X-bits**.

### Constraints

-   The 8 input **integers** will be in the range [0 … 2 147 483 647].

-   Allowed working time: 0.2 seconds. Allowed memory: 16 MB.

### Examples

| **Input**                  | **Output** | **Comments**                                                                                                                                                     |   | **Input**                                  | **Output** |   | **Input**                       | **Output** |   |
|----------------------------|------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------|---|--------------------------------------------|------------|---|---------------------------------|------------|---|
| 160 64 170 4 90 167 82 165 | 4          | <kbd><img src="https://user-images.githubusercontent.com/32310938/64207677-cc0f6f00-cea5-11e9-9d3e-f29e03a3a849.png" alt="alt text" width="400" height=""></kbd> |   | 7583 1374 12345 8888 91834 1234 1852 24912 | 0          |   | 365 146 365 365 658 365 640 160 | 7          |   |

<br/>

### Solution 1: <a title="10 X-Bits" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p10_1_XBits/XBits.java">10 X-Bits</a>
### Solution 2: <a title="10 X-Bits" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p10_2_XBits/XBits.java">10 X-Bits</a>

---

04.11 \*Game of Names
---------------------

Write a program to **calculate points for all players** and **find who the
winner is**. You will be given **the count of the players**, **their names** and
**initial scores**. Score for every player depends on their name. To the
**player score add** or **subtract** the **ASCII code of each letter**. If
**ASCII code** is **even, add** it to the score. If is **odd** – **subtract** it
from the score.

Find **the one with highest score** and print his name and score on the console.
If **two or more players** are with **same points** – **the winner is the first
one**.

### Input

On the **first input line,** you will be given **number N - the count of
players**.

On the **next 2\*N lines** you will be given player name and his initial score.

### Output

**The output** should be printed on the console and consists of **the name of
the winner** and **his score** in the following format:

“The winner is {name} - {points} points”

### Constraints

-   **N – the count of players** will be a **positive integer** in the range
    **[1...100]**

-   **Names** will be **strings** with **length between 3 and 30**

-   **The score for each player** will be an **integer** in the range
    **[-100,000...100,000]**

### Examples

| **Input**                                                               | **Output**                         | **Comments**                                                                                                                                                                                                                                                                                                                                                                                                           |
|-------------------------------------------------------------------------|------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 3 <br/> Bojidar <br/> 123 <br/> Preslav <br/> 123 <br/> Pesho <br/> 123 | The winner is Preslav - 230 points | B(66)o(111)j(106)i(105)d(100)a(97)r(114) Initial points 123 scores <br/> 123 +66 -111 +106 -105 +100 -97 +114 = 196 <br/> <br/> P(80)r(114)e(101)s(115)l(108)a(97)v(118) Initial points 123 scores <br/> 123 +80 +114 -101 -115 +108 -97 +118 = 230 <br/> <br/> P(80)e(101)s(115)h(104)o(111) Initial points 123 scores <br/> 123 +80 -101 -115 +104 -111 = -20 <br/> <br/> Preslav(230) \> Bojidar(196) \> Pesho(-20) |

<br/>

### Solution: <a title="11 Game of Names" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p11_GameOfNames/GameOfNames.java">11 \*Game of Names</a>

---

04.12 \*Vehicle Park
--------------------

You are manager on a vehicle park. Your job is to sell cars and give reports to
the accounting. You will be given all vehicles that are available for selling in
**format** like the example below:

**c2 c4 v10 v20 b50**

Each car is described by **vehicle type** (single character ‘**b**’, ‘**c**’ or
‘**v**’) and **number of seats** in the vehicle (natural number).

For example, **“c4”** means **car with 4 seats**, “**b50**” means **bus with 50
seats** and “**v10**” means **van with 10 seats**.

Then you need to **process** a sequence of **incoming requests**. Each request
holds **type of vehicle** and **number of seats** in the following format:

**Car with 4 seats**

**Bus with 20 seats**

**…**

If you have **vehicle** that **matches** the description of the **desired
vehicle**, you should **sell it**, otherwise print “**No**”. The **price** is
calculated as а **product** of the **character ASCII code** and the **number of
seats**. For example, the **price** for “**c4**” (**car with 4 seats**), will be
calculated as **99(‘c’) \* 4 = 396**. If there are **2 or more matching
vehicles** you should **sell the leftmost** one.

After you **run out of customers**, you need to **print the vehicles** that you
**didn’t sell** and the **count of sold vehicles**.

### Input

The input data should be read from the console.

-   On the **first input line,** you will receive **all vehicles** in the park,
    separated with **single whitespace**.

-   On the next lines, you will receive **requests for vehicles** in the
    following format:

    “**{Vehicle Type} with {Number of seats} seats**”

    until you receive **“End of customers!”**

The input data will always be **valid** and in the format described. There is no
need to check it explicitly.

### Output

The output should consist of:

-   For **each vehicle request** you either need to **print**:

    -   “Yes, sold for {price}\$” – if the **wanted vehicle** is **available**
        in the park.

    -   “No” – if there is no such vehicle in the vehicle park.

-   After you **stop receiving request**, you need to **print two lines**:

    -   On the first line, you need to print the remaining vehicles in the
        format:

        “Vehicles left: x1, x2, x3…”

    -   On the second line, you need to print the total number of vehicles sold
        in the following format: “Vehicles sold: x1, x2, x3…”

### Constraints

-   The **number of vehicles** will be in range [**0 – 10,000**].

-   The **amount of request** for vehicles will be in range [**0 – 10,000**].

-   The **number of seats** for **each vehicle** will be in range [**1 –
    10,000**].

-   The **vehicle type** can only be one of the following **Car – c**; **Bus –
    b**; **Van – v;**

-   Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64208028-95862400-cea6-11e9-9248-635db83f5c3d.png" alt="alt text" width="900" height=""></kbd>

<br/>

### Solution: <a title="12 Vehicle Park" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p12_VehiclePark/VehiclePark.java">12 \*Vehicle Park</a>

---

04.13 \*\*Blur Filter
---------------------

Bojo is a bad photo editor, but he wants to do some amazing pictures for his
Facebook page. He can’t do it alone, so he needs your help. For each picture,
you will be given a **matrix** with pixels. Each pixel has **weight**. The
**blur filter** is applied to a certain cell (pixel) and **all cells around**
it. **The blur** has **amount**, which needs to be **added to the weight of the
pixel** that it blurs. Print the matrix after the blur applied as output.

**Example:** on the picture on the left **apply blur** with amount **2** over
the **pixel** at position **[2, 2]**.

<kbd><img src="https://user-images.githubusercontent.com/32310938/64208152-e269fa80-cea6-11e9-968d-3134ecc62f50.png" alt="alt text" width="600" height=""></kbd>

### Input

The input data should be read from the console.

-   The **first line** holds the **blur amount**.

-   The **second line** holds the number of rows **r** and columns **c**
    separated by a space.

-   The **next r lines** hold the matrix numbers. Each line holds **c**
    integers, separated by space.

-   The **last line** holds the **coordinates of the blur** – **row** and
    **column**, separated by space.

The input data will always be valid and in the format described. There is no
need to check it explicitly.

### Output

The output should consist of the matrix after the blur filter is applied.

### Constraints

-   The **blur amount** will be an integer number in the range
    [-2,147,483,648...2,147,483,647].

-   The **pixel weight** will be an integer number in range
    [-2,147,483,648...2,147,483,647].

-   The number of **rows** and **columns** will be an integer number in the
    range [1...20].

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64208951-0712a200-cea8-11e9-8a6f-f435d45a7425.png" alt="alt text" width="800" height=""></kbd>

<br/>

### Solution: <a title="13 Blur Filter" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/04%20EXERCISE%20INTRO%20TO%20JAVA/p13_BlurFilter/BlurFilter.java">13 \*\*Blur Filter</a>

---