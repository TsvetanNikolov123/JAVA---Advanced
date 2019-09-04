10 Lab: String Processing
=========================

---
---

This document defines the exercises for ["Java Advanced" course \@ Software
University](https://softuni.bg/courses/java-advanced). Please submit your
solutions (source code) of all below described problems in
[Judge](https://judge.softuni.bg/Contests/1035/String-Processing-Lab).

---

10.01 Student’s Results
-----------------------

Write a program that reads one line, containing a student’s name and his results
in format **{name} - {firstResult}, {secondResult}, {thirdResult}**

Print a table on the console. Each row must contain:

-   JAdv - first result, aligned right, rounded to a **precision of 2**

-   OOP - second result, aligned right, rounded to a **precision of 2**

-   AdvOOP - third result, aligned right, rounded to a **precision of 2**

-   Average – average result, rounded to a **precision of 4**

-   Columns have a **width** of **7 characters** and must be separated with
    **"\|"**

-   Don't forget the heading row

### Examples

<img src="https://user-images.githubusercontent.com/32310938/64282630-88c50700-cf5e-11e9-89f5-95389523e6af.png" alt="alt text" width="800" height="">

### Hints

It is up to you what type of data structures you will use to solve this problem

-   The first row is **easy**, but long.

<kbd><img src="https://user-images.githubusercontent.com/32310938/64282707-abefb680-cf5e-11e9-83f1-ee137ffbe388.png" alt="alt text" width="600" height=""></kbd>

-   Data rows are just a little bit more complicated:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64282715-af833d80-cf5e-11e9-9a8d-9f68c57f82fd.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="01 Student’s Results" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/10%20STRING%20PROCESSING/p01_StudentsResults/StudentsResults.java">01 Student’s Results</a>

---

10.02 Parse URL
---------------

Write a program that parses an URL address given in the format:
**[protocol]://[server]/[resource]** and extracts from it the **[protocol]**,
**[server]** and **[resource]** elements.

If the URL is not in a correct format, print “Invalid URL” on the console.

### Examples

<img src="https://user-images.githubusercontent.com/32310938/64282826-e5282680-cf5e-11e9-9f4c-5afa7ad910ff.png" alt="alt text" width="900" height="">

### Hints

-   **"://"** is used to show where a protocol name ends. If you have it more
    than once, the URL will be **invalid**.

-   Server name ends with **"/"**, but it is **not** part of **resourses**.

-   Resources use the same symbol **"/"** to show that we go deeper in the
    **folders tree**, so be careful.

Think about the proper operations over the input:

-   .split()

-   .substring()

-   .indexOf()

<br/>

### Solution: <a title="02 Parse URL" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/10%20STRING%20PROCESSING/p02_ParseURL/ParseURL.java">02 Parse URL</a>

---

10.03 Parse Tags
----------------

You are given a text. Write a program that changes the text in all regions
surrounded by the tags \<**upcase**\> and \</**upcase**\> to upper-case. The
tags won’t be nested.

### Examples

| **Input**                                                                                                   | **Output**                                                        |
|-------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------|
| We are living in a \<upcase\>yellow submarine\</upcase\>. We don't have \<upcase\>anything\</upcase\> else. | We are living in a YELLOW SUBMARINE. We don't have ANYTHING else. |
| \<upcase\>StringBuilder\</upcase\> is \<upcase\>awesome\</upcase\>                                          | STRINGBUILDER is AWESOME                                          |

### Hints

-   Be careful when **replacing tags** with **empty** strings.

-   Consider that, after replacing a tag, the **indexes** in the string are
    **not** the **same**.

<br/>

### Solution: <a title="03 Parse Tags" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/10%20STRING%20PROCESSING/p03_ParseTags/ParseTags.java">03 Parse Tags</a>

---

10.04 Series of Letters
-----------------------

**Read a string** from the console and **replace** all series of **consecutive
identical letters** with a **single one**.

### Examples

| **Input**               | **Output** |
|-------------------------|------------|
| aabb                    | ab         |
| abc                     | abc        |
| aaaaabbbbbcdddeeeedssaa | abcdedsa   |

### Hints

-   Grouping **()** and a backreference construct

<br/>

### Solution: <a title="04 Series of Letters" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/10%20STRING%20PROCESSING/p04_SeriesOfLetters/SeriesOfLetters.java">04 Series of Letters</a>

---

10.05 Vowel Count
-----------------

Find the **count** of **all vowels** in a given **text** using a regex.

The vowels that you should be looking for are **upper** and **lower** case:
**a**, **e**, **i**, **o**, **u** and **y**.

### Examples

| **Input**                                        | **Output** |
|--------------------------------------------------|------------|
| Abraham Lincoln                                  | Vowels: 5  |
| In 1519 Leonardo da Vinci died at the age of 67. | Vowels: 15 |
| n vwls.                                          | Vowels: 0  |

### Hints

-   Read the input using

-   Compile the pattern and create a **Matcher** object:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64283055-62539b80-cf5f-11e9-9dd8-d2656781826e.png" alt="alt text" width="600" height=""></kbd>

-   Count the occurrences:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64283079-6b446d00-cf5f-11e9-8d60-a560659c628e.png" alt="alt text" width="400" height=""></kbd>

-   Finally, print the result:

<br/>

### Solution: <a title="05 Vowel Count" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/10%20STRING%20PROCESSING/p05_VowelCount/VowelCount.java">05 Vowel Count</a>

---

10.06 Extract Tags
------------------

Read lines until you get the **"END"** command. Extract all **tags** from the
given HTML using **RegEx**. If there are **no tags**, don’t print anything.

### Examples

<img src="https://user-images.githubusercontent.com/32310938/64283298-db52f300-cf5f-11e9-9d19-4bbf7391b7f1.png" alt="alt text" width="600" height="">

### Hints

-   Use the special character dot "." and one of the regex quantifiers **made
    lazy**:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64283353-f4f43a80-cf5f-11e9-9696-bc7fcfb6bad8.png" alt="alt text" width="200" height=""></kbd>

-   Design your own regex to get a complete solution

<br/>

### Solution: <a title="06 Extract Tags" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/10%20STRING%20PROCESSING/p06_ExtractTags/ExtractTags.java">06 Extract Tags</a>

---

10.07 Valid Usernames
---------------------

**Scan** through the lines for **valid usernames**.

A valid username:

-   Has **length** between 3 and 16 characters

-   **Contains** only letters, numbers, hyphens and underscores

-   Has **no redundant symbols** before, after or in between

Read the lines until you get the **"END"** command. If there are **no valid
usernames**, don’t print anything.

### Examples

| **Input**                                                                  | **Output**                                      |
|----------------------------------------------------------------------------|-------------------------------------------------|
| sh <br/> too_long_username <br/> !lleg\@l ch\@rs <br/> jeff_butt <br/> END | invalid <br/> invalid <br/> invalid <br/> valid |
| END                                                                        | *(no output)*                                   |

### Hints

-   Use character classes **[]**, quantifiers **{}** and anchors **\^** and **\$**

<br/>

### Solution: <a title="07 Valid Usernames" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/10%20STRING%20PROCESSING/p07_ValidUsernames/ValidUsernames.java">07 Valid Usernames</a>

---