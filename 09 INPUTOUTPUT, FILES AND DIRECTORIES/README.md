09 Lab: Files and Streams
=========================

---
---

Problems for exercises and homework for the [“Java Advanced” course \@
SoftUni](https://softuni.bg/courses/java-advanced).

You can check your solutions here:
<https://judge.softuni.bg/Contests/1032/Files-And-Directories-Lab>.

For this lab exercises you are given a zipped folder with resources, that you
will need to use. For each exercise submit the output of the program, not the
code.

---

Stream Basics
=============

09.01 Read File
---------------

You are given a file named "input.txt". Read and print all of its contents as a
sequence of bytes (the binary representation of the ASCII code for each
character) separated by a single comma.

Submit in Judge only the output of the program.

### Examples

| **Input**                                                                     | **Output**                                                                         |
|-------------------------------------------------------------------------------|------------------------------------------------------------------------------------|
| On January 1 , 1533 , Michael Angelo, then fifty-seven years old, writes…     | 11101111 10111011 10111111 1001111 1101110 100000 1001010 1100001 1101110 1110101… |
| Two households, both alike in dignity,                                        | 1010100 1110111 1101111 100000 1101000 1101111 1110101 1110011 1100101 1101000…    |
| In fair Verona, where we lay our scene…                                       |                                                                                    |

### Hints

-   Create a string variable holding the path to the file. If, for example, the
    file is located in "D:\\"

<kbd><img src="https://user-images.githubusercontent.com/32310938/64257404-fad12800-cf2d-11e9-823e-63832fa14781.png" alt="alt text" width="600" height=""></kbd>

-   Use try-with-resources to open the file and to be sure that it will be
    closed after you are done with it

<kbd><img src="https://user-images.githubusercontent.com/32310938/64257446-0ae90780-cf2e-11e9-992a-3e8ef09d8278.png" alt="alt text" width="600" height=""></kbd>

-   Use the **read()** method to read each byte of the file until it returns -1

<kbd><img src="https://user-images.githubusercontent.com/32310938/64257465-150b0600-cf2e-11e9-910c-3d346fa5fd4e.png" alt="alt text" width="600" height=""></kbd>

-   Select the output of the program and copy it [Ctrl + C]

<kbd><img src="https://user-images.githubusercontent.com/32310938/64257471-189e8d00-cf2e-11e9-8283-0c0cad728e77.png" alt="alt text" width="600" height=""></kbd>

-   Paste the output in Judge

<kbd><img src="https://user-images.githubusercontent.com/32310938/64257481-1ccaaa80-cf2e-11e9-8489-4c4729acbd02.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="01 Read File" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/09%20INPUTOUTPUT%2C%20FILES%20AND%20DIRECTORIES/p01_ReadFile/ReadFile.java">01 Read File</a>

---

09.02 Writ to File
------------------

Read the file named "input.txt" that is provided for this exercise and write all
its content to a file while skipping any punctuation. Skip the following
symbols: **','**, **'.'**, **'!'**, **'?'**.

Submit in Judge only the output of the program.

### Examples

| **Input**                                                                      | **Output**                                                                 |
|--------------------------------------------------------------------------------|----------------------------------------------------------------------------|
| On January 1 , 1533 , Michael Angelo, then fifty-seven years old, writes       | On January 1 1533 Michael Angelo then fifty-seven years old writes         |
| Two households, both alike in dignity. In fair Verona, where we lay our scene. | Two households both alike in dignity In fair Verona where we lay our scene |

### Hints

-   Create a **FileInputStream** to read the file

-   Create a **FileOutputStream** to write to a file

-   Create a list, containing all characters that you need to skip and check if
    the current char is contained in it

<kbd><img src="https://user-images.githubusercontent.com/32310938/64260476-9add8000-cf33-11e9-95dc-8470bba6c7a8.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="02 Writ to File" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/09%20INPUTOUTPUT%2C%20FILES%20AND%20DIRECTORIES/p02_WriteToFile/WriteToFile.java">02 Writ to File</a>

---

09.03 Copy Bytes
----------------

Read the file named "input.txt" and write to another file every character's
ASCII representation.

Write every space or new line as it is, e.g. as a space or a new line.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64260529-b5aff480-cf33-11e9-8cd7-8ba48d49d65b.png" alt="alt text" width="900" height=""></kbd>

### Hints

-   Get the value of every byte as string and then write its every digit one by
    one

<kbd><img src="https://user-images.githubusercontent.com/32310938/64260660-f27beb80-cf33-11e9-8ae8-a828f8d04f40.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="03 Copy Bytes" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/09%20INPUTOUTPUT%2C%20FILES%20AND%20DIRECTORIES/p03_CopyBytes/CopyBytes.java">03 Copy Bytes</a>

---

09.04 Extract Integers
----------------------

Read the file provided, named "input.txt" and extracts all integers that are not
a part of a word in a separate file. A valid integer is surrounded with white
spaces.

Submit in Judge only the output of the program.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64260824-37a01d80-cf34-11e9-8b3d-d85aafea7c1f.png" alt="alt text" width="900" height=""></kbd>

### Hints

-   Wrap a **FileInputStream** in a Scanner and use the methods, **hasNext()**,
    **hasNextInt()** and **nextInt()**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64260900-5a323680-cf34-11e9-8411-4431248552b6.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="04 Extract Integers" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/09%20INPUTOUTPUT%2C%20FILES%20AND%20DIRECTORIES/p04_ExtractIntegers/ExtractIntegers.java">04 Extract Integers</a>

---

09.05 Write Every Third Line
----------------------

Read the file provided, named "input.txt" and write to another file all lines
which number is divisible by 3. Line numbers start from one.

Submit in Judge only the output of the program.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64280718-603b0e00-cf5a-11e9-966e-b4bbec732314.png" alt="alt text" width="900" height=""></kbd>

### Hints

-   To get the functionality to read and write lines use **BufferedReader** and
    **PrintWriter**

-   Wrap streams appropriately

<kbd><img src="https://user-images.githubusercontent.com/32310938/64280800-895b9e80-cf5a-11e9-99cb-f3025b17fb95.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="05 Write Every Third Line" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/09%20INPUTOUTPUT%2C%20FILES%20AND%20DIRECTORIES/p05_WriteEveryThirdLine/WriteEveryThirdLine.java">05 Write Every Third Line</a>

---

09.06 Sort Lines
----------------

Read the file provided, named "input.txt" and sort all lines. Write text to
another text file. Use Path and Files Classes.

Submit in Judge only the output of the program.

### Examples

| **Input**                   | **Output**                   |
|-----------------------------|------------------------------|
| C <br/> A <br/> B <br/> D   | A <br/> B <br/> C <br/> D    |

### Hints

-   To read all lines together use **Files.readAllLines()**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64280946-cc1d7680-cf5a-11e9-9a15-3438d2c0ced1.png" alt="alt text" width="600" height=""></kbd>

-   To sort the list of strings use **Collections.sort()**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64280951-cf186700-cf5a-11e9-8e4b-5a4a405ae189.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="06 Sort Lines" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/09%20INPUTOUTPUT%2C%20FILES%20AND%20DIRECTORIES/p06_SortLines/SortLines.java">06 Sort Lines</a>

---

09.07 List Files
----------------

You are provided a folder named "Files-and-Streams". Create a program that lists
the names and file sizes (in bytes) of all files that are placed directly in it
(do not include files in nested folders).

Submit in Judge only the output of the program.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64281074-04bd5000-cf5b-11e9-8331-684249b33471.png" alt="alt text" width="800" height=""></kbd>

### Hints

-   Use the **File** class and its method **listFiles()**

<br/>

### Solution: <a title="07 List Files" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/09%20INPUTOUTPUT%2C%20FILES%20AND%20DIRECTORIES/p07_ListFiles/ListFiles.java">07 List Files</a>

---

09.08 Nested Folders
--------------------

You are provided a folder named "Files-and-Streams". Create a program that lists
the names of all directories in it (including all nested directories).

On the last line, print the count of all folders, including the root folder.

Submit in Judge only the output of the program.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64281148-2f0f0d80-cf5b-11e9-8f69-6fedefa3a76d.png" alt="alt text" width="800" height=""></kbd>

### Hints

-   Use the **File** class and its method **listFiles()**

<br/>

---

09.09 Serialize Custom Object
-----------------------------

Create a class called "Cube". It should have properties for color, width, height
and depth.

Create an instance of the class with the following values:

-   Color: "green"

-   Width: 15.3

-   Height: 12.4

-   Depth: 3.0

Serialize and deserilalize the instance created. When saved to a file the object
should look like something like the example below.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64281720-6cc06600-cf5c-11e9-9300-fad5f4ca6d1e.png" alt="alt text" width="500" height=""></kbd>

### Hints

-   Create a class called Cube, which should implement the Serializable
    interface:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64281933-f112e900-cf5c-11e9-91a1-23f59681ef27.png" alt="alt text" width="600" height=""></kbd>

-   Create a new instance of the Cube class and set its properties:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64281937-f2dcac80-cf5c-11e9-890c-271ac9d60d43.png" alt="alt text" width="600" height=""></kbd>

-   Use **ObjectOutputStream** to serialize the object:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64281940-f4a67000-cf5c-11e9-8111-430b58f0d585.png" alt="alt text" width="600" height=""></kbd>

<br/>

### Solution: <a title="09 Serialize Custom Object" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/09%20INPUTOUTPUT%2C%20FILES%20AND%20DIRECTORIES/p09_SerializeCustomObject/SerializeCistomObject.java">09 Serialize Custom Object</a>

---
