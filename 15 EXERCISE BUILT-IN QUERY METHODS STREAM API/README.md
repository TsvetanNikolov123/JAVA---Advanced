15 Exercises: Stream API
========================

---
---

This document defines the exercises for ["Java Advanced" course \@ Software
University](https://softuni.bg/courses/java-advanced). Please submit your
solutions (source code) of all below described problems in
[Judge](https://judge.softuni.bg/Contests/1041/Stream-API-Exercises).

---

15.01 Students by Group
-----------------------

Print all students from group number 2. Use a Stream query. Order the students
by **First Name**.

### Examples

| **Input**                                                                                                  | **Output**                                          |
|------------------------------------------------------------------------------------------------------------|-----------------------------------------------------|
| Sara Mills 1 <br/> Andrew Gibson 2 <br/> Craig Ellis 1 <br/> Steven Cole 2 <br/> Andrew Carter 2 <br/> END | Andrew Gibson <br/> Andrew Carter <br/> Steven Cole |

<br/>

### Solution: <a title="01 Students by Group" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/15%20EXERCISE%20BUILT-IN%20QUERY%20METHODS%20STREAM%20API/p01_StudentsByGroup/StudentsByGroup.java">01 Students by Group</a>

---

15.02 Students by First and Last Name
-------------------------------------

Using the same input as above print all students whose first name is before
their last name lexicographically. Use a Stream query. Print them in order of
appearance.

### Examples

| **Input**                                                                                        | **Output**                                          |
|--------------------------------------------------------------------------------------------------|-----------------------------------------------------|
| Sara Mills <br/> Andrew Gibson <br/> Craig Ellis <br/> Steven Cole <br/> Andrew Carter <br/> END | Andrew Gibson <br/> Craig Ellis <br/> Andrew Carter |

<br/>

### Solution: <a title="02 Students by First and Last Name" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/15%20EXERCISE%20BUILT-IN%20QUERY%20METHODS%20STREAM%20API/p02_StudentsByFirstAndLastName/StudentsByFirstAndLastName.java">02 Students by First and Last Name</a>

---

15.03 Students by Age
---------------------

Write a Stream query that finds the first name and last name of all students
with age between 18 and 24. The query should return the **first name**, **last
name** and **age**. Print them in order of appearance.

### Examples

| **Input**                                                                                                       | **Output**                                                |
|-----------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------|
| Sara Mills 24 <br/> Andrew Gibson 21 <br/> Craig Ellis 19 <br/> Steven Cole 35 <br/> Andrew Carter 15 <br/> END | Sara Mills 24 <br/> Andrew Gibson 21 <br/> Craig Ellis 19 |

<br/>

### Solution: <a title="03 Students by Age" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/15%20EXERCISE%20BUILT-IN%20QUERY%20METHODS%20STREAM%20API/p03_StudentsByAge/StudentsByAge.java">03 Students by Age</a>

---

15.04 Sort Students
-------------------

Using the lambda expressions with Stream query syntax sort the students first by
**last name** in **ascending** order and then by **first name** in
**descending** order.

### Examples

| **Input**                                                                                        | **Output**                                                                             |
|--------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------|
| Sara Gibson <br/> Andrew Gibson <br/> Craig Ellis <br/> Steven Cole <br/> Andrew Ellis <br/> END | Steven Cole <br/> Craig Ellis <br/> Andrew Ellis <br/> Sara Gibson <br/> Andrew Gibson |

<br/>

### Solution: <a title="04 Sort Students" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/15%20EXERCISE%20BUILT-IN%20QUERY%20METHODS%20STREAM%20API/p04_SortStudents/SortStudents.java">04 Sort Students</a>

---

15.05 Filter Students by Email Domain
-------------------------------------

Print all students that have email **\@gmail.com**. Use Stream API. Print the in
order of appearance.

### Examples

| **Input**                                                                                                                                                                                  | **Output**                     |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------|
| Sara Mills smills\@gmail.com <br/> Andrew Gibson agibson\@abv.bg <br/> Craig Ellis cellis\@cs.edu.gov <br/> Steven Cole themachine\@abv.bg <br/> Andrew Carter <ac147@gmail.com> <br/> END | Sara Mills <br/> Andrew Carter |

<br/>

### Solution: <a title="05 Filter Students by Email Domain" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/15%20EXERCISE%20BUILT-IN%20QUERY%20METHODS%20STREAM%20API/p05_FilterStudentsByEmailDomain/FilterStudentsByEmailDomain.java">05 Filter Students by Email Domain</a>

---

15.06 Filter Students by Phone
------------------------------

Print all students with phones in Sofia (starting with **02** / **+3592**). Use
a Stream.

### Examples

| **Input**                                                                                                                                              | **Output**                   |
|--------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------|
| Sara Mills 02435521 <br/> Andrew Gibson 0895223344 <br/> Craig Ellis +3592667710 <br/> Steven Cole 3242133312 <br/> Andrew Carter +001234532 <br/> END | Sara Mills <br/> Craig Ellis |

<br/>

### Solution: <a title="06 Filter Students by Phone" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/15%20EXERCISE%20BUILT-IN%20QUERY%20METHODS%20STREAM%20API/p06_FilterStudentsByPhone/FilterStudentsByPhone.java">06 Filter Students by Phone</a>

---

15.07 Excellent Students
------------------------

Print all students that have **at least one mark Excellent (6)**. Use a Stream.

### Examples

| **Input**                                                                                                                                | **Output**                                       |
|------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------|
| Sara Mills 6 6 6 5 <br/> Andrew Gibson 3 4 5 6 <br/> Craig Ellis 4 2 3 4 <br/> Steven Cole 5 6 5 5 <br/> Andrew Carter 5 3 4 2 <br/> END | Sara Mills <br/> Andrew Gibson <br/> Steven Cole |

<br/>

### Solution: <a title="07 Excellent Students" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/15%20EXERCISE%20BUILT-IN%20QUERY%20METHODS%20STREAM%20API/p07_ExcellentStudents/ExcellentStudents.java">07 Excellent Students</a>

---

15.08 Weak Students
-------------------

Write a similar program to the previous one to extract the **students with at
least 2 marks under or equal to "3"**. Use a Stream.

### Examples

| **Input**                                                                                                                                | **Output**                      |
|------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------|
| Sara Mills 6 6 6 5 <br/> Andrew Gibson 3 4 5 6 <br/> Craig Ellis 4 2 3 4 <br/> Steven Cole 5 6 5 5 <br/> Andrew Carter 5 3 4 2 <br/> END | Craig Ellis <br/> Andrew Carter |

<br/>

### Solution: <a title="08 Weak Students" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/15%20EXERCISE%20BUILT-IN%20QUERY%20METHODS%20STREAM%20API/p08_WeakStudents/WeakStudents.java">08 Weak Students</a>

---

15.09 Students Enrolled in 2014 or 2015
---------------------------------------

Extract and print the **Marks** of the students that **enrolled in 2014 or
2015** (the students from 2014 have 14 as their 5-th and 6-th digit in the
**FacultyNumber**, those from 2015 have 15).

### Examples

| **Input**                                                                                                    | **Output**                          |
|--------------------------------------------------------------------------------------------------------------|-------------------------------------|
| 554214 6 6 6 5 <br/> 653215 3 4 5 6 <br/> 156212 4 2 3 4 <br/> 324413 5 6 5 5 <br/> 134014 5 3 4 2 <br/> END | 6 6 6 5 <br/> 3 4 5 6 <br/> 5 3 4 2 |

<br/>

### Solution: <a title="09 Students Enrolled in 2014 or 2015" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/15%20EXERCISE%20BUILT-IN%20QUERY%20METHODS%20STREAM%20API/p09_StudentsByEnrollmentYear/StudentsByEnrollmentYear.java">09 Students Enrolled in 2014 or 2015</a>

---

15.10 \* Group by Group
-----------------------

Create a class **Person**. It should consists of **properties** : **name** and
**group** (String, Integer). Write a program that extracts all persons
(students), **grouped by GroupName** and then prints them on the console. Print
all group names along with the students in each group. Use the **group by**
Stream operations. You will be given an input on the console.

**Output format** : **{group} - {name1}, {name2}, {name3}, ...**

### Examples

| **Input**                                                                                             | **Output**                                                                                 |
|-------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| Ivaylo Petrov 10 <br/> Stanimir Svilianov 3 <br/> Indje Kromidov 3 <br/> Irina Balabanova 4 <br/> END | 3 - Stanimir Svilianov, Indje Kromidov <br/> 4 - Irina Balabanova <br/> 10 - Ivaylo Petrov |

<br/>

### Solution: <a title="10 \* Group by Group" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/15%20EXERCISE%20BUILT-IN%20QUERY%20METHODS%20STREAM%20API/p10_GroupByGroup/GroupByGroup.java">10 \* Group by Group</a>

---

15.11 \* Students Joined to Specialties
---------------------------------------

Create a new class **StudentSpecialty** that holds **specialty name** and
**faculty number**. Create a **Student** class that holds **student name** and
**faculty number**. Create a list of **student specialties,** where each
specialty corresponds to a certain student (via the faculty number). Print all
student names alphabetically along with their faculty number and specialty name.

You will recieve several specialties in format :

{specialty name} {specialty name} {faculty number}

Until you reach "Students:" , you should add specialties to the collection.
After you reach "Students:", you should start reading students in format :

{faculty number} {student's first name} {student's second name}

You should add the students untill you recieve "END" command.

### Examples

<img src="https://user-images.githubusercontent.com/32310938/64477326-ddf15a80-d1a2-11e9-8369-40f1bdaeace3.png" alt="alt text" width="900" height="">

<br/>

### Solution: <a title="11 \* Students Joined to Specialties" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/15%20EXERCISE%20BUILT-IN%20QUERY%20METHODS%20STREAM%20API/p11_StudentsJoinedToSpecialties/StudentsJoinedToSpecialties.java">11 \* Students Joined to Specialties</a>

---

15.12 \* Little John
--------------------

**This problem is originally from the PHP Basics Exam (3 May 2015). You may
check your solution**
[here](https://judge.softuni.bg/Contests/Practice/Index/84#10)**.**

As you probably know Little John is the right hand of the famous English hero -
Robin Hood. A little known fact is that Little John can't handle Math very well.
Before Robin Hood left to see Marry Ann, he asked John to **count** his hay of
arrows and send him an **encrypted** message containing the arrow's count**.**
The message should be encrypted since it can be intercepted by the Nottingham’s
evil Sheriff. Your task is to help Little John before it is too late (0.10 sec).

You are given **4 input** strings (hay). Those strings **may or may not**
contain arrows. The arrows can be of different type as follows:

-   "\>-----\>" – a small arrow

-   "\>\>-----\>" – a medium arrow

-   "\>\>\>-----\>\>" – a large arrow

Note that the **body** of each arrow will always be **5 dashes long**. The
**difference** between the arrows is in their **tip** and **tail**. The given 3
types are the only ones you should count, the **rest should be ignored** (Robin
Hood does not like them). You should start searching the hays **from the
largest** arrow type down **to the smallest** arrow type.

After you find the **count** of each arrow type you should **concatenate** them
into one number in order: small, medium, large arrow (even if the arrow count is
0). Then you **convert** the number in **binary** representation, **reverse** it
and **concatenate it again** with the initial binary representation of the
number. You **convert** the final binary number again **back to decimal**. This
is the encrypted message you should send to Robin Hood.

### Input

The input will be read from the console. The **data** will be received from 4
input **lines containing strings**.

### Output

The output should be a decimal number, representing the encrypted count of
arrows.

### Constraints

-   The input strings will contain any ASCII character.

-   Allowed working time: 0.1 seconds. Allowed memory: 16 MB.

### Examples

| **Input**                                                                            | **Output**                                                                                                                                                 |
|--------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|
| \>\>\>-----\>\>abc\>\>\>-----\>\><br/>\>\>\>-----\>\><br/>\>-----\>s<br/>\>\>-----\> | 14535<br/><br/> *The count is: 1 small, 1 medium and 3 large arrows 113(dec) = 1110001(bin) -\> reversed is 1000111(bin) 11100011000111(bin) = 14535(dec)* |

<br/>

### Solution: <a title="12 \* Little John" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/15%20EXERCISE%20BUILT-IN%20QUERY%20METHODS%20STREAM%20API/p12_LittleJohn/LittleJohn.java">12 \* Little John</a>

---

15.13 \* Office Stuff
----------------

**This problem is from the Java Basics Exam (21 Sept 2014 Evening). You can test
your solution**
[here](https://judge.softuni.bg/Contests/Practice/Index/34#3)**.**

You are given a sequence of **n** companies in format \|**\<company\> -
\<amount\> - \<product\>\|**. Example:

-   \|SoftUni - 600 - paper\|

-   \|Vivacom - 600 - pen\|

-   \|XS - 20 - chair\|

-   \|Vivacom - 200 - chair\|

-   \|SoftUni - 40 - chair\|

-   \|XS - 40 - chair\|

-   \|SoftUni - 1 - printer\|

Write a program that prints **all companies** in **alphabetical** order. For
each company print the product type and their aggregated ordered amounts. Order
the products by **order of appearance**. **Print** the result in the following
format: **\<company\>: \<product\>-\<amount\>, \<product\>-\<amount\>,…** For
the orders above the output should be:

-   SoftUni: paper-600, chair-40, printer-1

-   Vivacom: pen-600, chair-200

-   XS: chair-60

### Input

The input comes from the console. At the first line the number **n** stays
alone. At the next **n** lines, we have **n** orders in format \|**\<company\> -
\<amount\> - \<product\>\|**.

The input data will always be valid and in the format described. There is no
need to check it explicitly.

### Output

Print **one line for each company**. Company lines should be ordered in
**alphabetical order**. For each company print the **products** ordered by this
company in **order** of **appearance**, along with the total amount for the
given product. Each line should be in format **\<company\>:
\<product\>-\<amount\>, \<product\>-\<amount\>, … \<product\>-\<amount\>**

### Constraints

-   The **count** of the lines **n** will be in the range [1 … 100].

-   The **\<company\>** and **\<product\>** will consist of only of **Latin
    characters**, with length of [1 … 20].

-   The **\<amount\>** will be an integer number in the range [1 … 1000].

-   Time limit: 0.1 sec. Memory limit: 16 MB.

### Examples

<img src="https://user-images.githubusercontent.com/32310938/64477384-9c14e400-d1a3-11e9-9b4a-91074d0c819d.png" alt="alt text" width="900" height="">

<br/>

### Solution: <a title="13 \* Office Stuff" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/15%20EXERCISE%20BUILT-IN%20QUERY%20METHODS%20STREAM%20API/p13_OfficeStuff/OfficeStuff.java">13 \* Office Stuff</a>

---

15.14 \*\* Export to Excel
--------------------------

Write a program to create an Excel file like the one below using an external
library. Such as [Apache
POI](http://howtodoinjava.com/apache-commons/readingwriting-excel-files-in-java-poi-tutorial/)
for Java.

You are given as **input** course data about **1000 students** in a **.txt**
file (tab-separated values). Each line in the input holds **ID**, **first
name**, **last name**, **email**, **gender**, **student type**, **exam result**,
**homework sent**, **homework evaluated**, **teamwork score**, **attendances
count**, **bonus**.

<img src="https://user-images.githubusercontent.com/32310938/64477401-d41c2700-d1a3-11e9-9194-c28990a644e2.png" alt="alt text" width="950" height="">

<br/>

### Solution: <a title="" href=""></a>

---