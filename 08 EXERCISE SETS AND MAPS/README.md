08 Exercises: Sets and Maps
===========================

---
---

This document defines the exercises for ["Java Advanced" course \@ Software
University](https://softuni.bg/trainings/1975/java-advanced-may-2018). Please
submit your solutions (source code) of all below described problems in
[Judge](https://judge.softuni.bg/Contests/1030/Sets-And-Maps-Exercises).

---

08.01 Unique Usernames
----------------------

Write a simple program that reads from the console a sequence of usernames and
keeps a collection with only the unique ones. Print the collection on the
console in order of insertion:

### Examples

| **Input**                                                                                                                   | **Output**                                             |
|-----------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------|
| 6 <br/> Ivan <br/> Ivan <br/> Ivan <br/> SemoMastikata <br/> Ivan <br/> Hubaviq1234                                         | Ivan <br/> SemoMastikata <br/> Hubaviq1234             |
| 10 <br/> Pesho <br/> Mara <br/> Pesho <br/> Gosho <br/> Stamat <br/> Mara <br/> Sashka <br/> Pesho <br/> Stamat <br/> Gosho | Pesho <br/> Mara <br/> Gosho <br/> Stamat <br/> Sashka |

<br/>

### Solution: <a title="01 Unique Usernames" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p01_UniqueUsernames/UniqueUsernames.java">01 Unique Usernames</a>

---

08.02 Sets of Elements
----------------------

On the first line you are given the length of two sets n and m. On the next n +
m lines there are n numbers that are in the first set and m numbers that are in
the second one. Find all non-repeating element that appears in both of them, and
print them in same order at the console:

Set with length n = 4: {1, **3**, **5**, 7}

Set with length m = 3: {**3**, 4, **5**}

Set that contains all repeating elements -\> {**3**, **5**}

### Examples

| **Input**                                                   | **Output** |
|-------------------------------------------------------------|------------|
| 4 3 <br/> 1 <br/> 3 <br/> 5 <br/> 7 <br/> 3 <br/> 4 <br/> 5 | 3 5        |
| 2 2 <br/> 1 <br/> 3 <br/> 1 <br/> 5                         | 1          |

<br/>

### Solution: <a title="02 Sets of Elements" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p02_SetsOfElements/SetsOfElements.java">02 Sets of Elements</a>

---

08.03 Periodic Table
--------------------

You are given an n number of chemical compounds. You need to keep track of all
chemical elements used in the compounds and at the end print all unique ones in
ascending order:

### Examples

| **Input**                                          | **Output**          |
|----------------------------------------------------|---------------------|
| 4 <br/> Ce O <br/> Mo O Ce <br/> Ee <br/> Mo       | Ce Ee Mo O          |
| 3 <br/> Ge Ch O Ne <br/> Nb Mo Tc <br/> O Ne       | Ch Ge Mo Nb Ne O Tc |

<br/>

### Solution: <a title="03 Periodic Table" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p03_PeriodicTable/PeriodicTable.java">03 Periodic Table</a>

---

08.04 Count Symbols
-------------------

Write a program that reads some text from the console and counts the occurrences
of each character in it. Print the results in **alphabetical** (lexicographical)
order.

### Examples

| **Input**     | **Output**                                                                                                                                                                                                       |   | **Input**                                                   | **Output**                                                                                                                                                                                                                                                                                                                                                                                           |
|---------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---|-------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| SoftUni rocks | : 1 time/s <br/> S: 1 time/s <br/> U: 1 time/s <br/> c: 1 time/s <br/> f: 1 time/s <br/> i: 1 time/s <br/> k: 1 time/s <br/> n: 1 time/s <br/> o: 2 time/s <br/> r: 1 time/s <br/> s: 1 time/s <br/> t: 1 time/s |   | Did you know Math.Round rounds to the nearest even integer? | : 9 time/s <br/> .: 1 time/s <br/> ?: 1 time/s <br/> D: 1 time/s <br/> M: 1 time/s <br/> R: 1 time/s <br/> a: 2 time/s <br/> d: 3 time/s <br/> e: 7 time/s <br/> g: 1 time/s <br/> h: 2 time/s <br/> i: 2 time/s <br/> k: 1 time/s <br/> n: 6 time/s <br/> o: 5 time/s <br/> r: 3 time/s <br/> s: 2 time/s <br/> t: 5 time/s <br/> u: 3 time/s <br/> v: 1 time/s <br/> w: 1 time/s <br/> y: 1 time/s |

<br/>

### Solution: <a title="04 Count Symbols" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p04_CountSymbols/CountSymbols.java">04 Count Symbols</a>

---

08.05 Phonebook
---------------

Write a program that receives some info from the console about **people** and
their **phone numbers**.

You are free to choose the manner in which the data is entered; each **entry**
should have just **one name** and **one number** (both of them strings). If you
receive a name that **already exists** in the phonebook, simply update its
number.

After filling this simple phonebook, upon receiving the **command**
"**search**", your program should be able to perform a search of a contact by
name and print her details in format "**{name} -\> {number}**". In case the
contact isn't found, print "**Contact {name} does not exist.**" Examples:

### Examples

| **Input**                                                                                                                                                            | **Output**                                                                                                             |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|
| Nakov-0888080808 <br/> **search** <br/> Mariika Nakov <br/> stop                                                                                                     | Contact Mariika does not exist. <br/> Nakov -\> 0888080808                                                             |
| Nakov-+359888001122 <br/> RoYaL(Ivan)-666 <br/> Gero-5559393 <br/> Simo-02/987665544 <br/> **search** <br/> Simo <br/> simo <br/> RoYaL <br/> RoYaL(Ivan) <br/> stop | Simo -\> 02/987665544 <br/> Contact simo does not exist. <br/> Contact RoYaL does not exist. <br/> RoYaL(Ivan) -\> 666 |

<br/>

### Solution: <a title="05 Phonebook" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p05_Phonebook/Phonebook.java">05 Phonebook</a>

---

08.06 A Miner Task
------------------

You are given a sequence of strings, each on a new line. Every odd line on the
console is representing a resource (e.g. Gold, Silver, Copper, and so on) , and
every even – quantity. Your task is to collect the resources and print them each
on a new line.

**Print the resources and their quantities in format:**

**{resource} –\> {quantity}**

The quantities inputs will be in the range [1 … 2 000 000 000]

### Examples

| **Input**                                                             | **Output**                                           |
|-----------------------------------------------------------------------|------------------------------------------------------|
| Gold <br/> 155 <br/> Silver <br/> 10 <br/> Copper <br/> 17 <br/> stop | Gold -\> 155 <br/> Silver -\> 10 <br/> Copper -\> 17 |

<br/>

### Solution: <a title="06 A Miner Task" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p06_AMinerTask/AMinerTask.java">06 A Miner Task</a>

---

08.07 Fix Emails
----------------

You are given a sequence of strings, each on a new line, **unitll you receive
“stop” command**. First string is a name of a person. On the second line you
receive his email. Your task is to collect their names and emails, and remove
emails whose domain ends with "us", "uk" or “com” (case insensitive). Print:

**{name} – \> {email}**

### Examples

| **Input**                                                                                                                          | **Output**                                                              |
|------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------|
| Ivan <br/> ivanivan@abv.bg <br/> Petar Ivanov <br/> petartudjarov\@abv.bg <br/> Mike Tyson <br/> myke@gmail.us <br/> stop      | Ivan -\> ivanivan@abv.bg <br/> Petar Ivanov -\> petartudjarov\@abv.bg |
| Ivan <br/> ivanivan@gmail.com <br/> Petar Ivanov <br/> petartudjarov@yahoo.com <br/> Mike Tyson <br/> myke@abv.bg <br/> stop | Mike Tyson -\> myke@abv.bg                                            |

<br/>

### Solution: <a title="07 Fix Emails" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p07_FixEmails/FixEmails.java">07 Fix Emails</a>

---

08.08 Hands Of Cards
--------------------

You are given a sequence of people and for every person what cards he draws from
the deck. The input will be separate lines in the format:

**{personName}: {PT, PT, PT,… PT}**

Where P (2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A) is the power of the card and T
(S, H, D, C) is the type. The input ends when a **"JOKER"** is drawn. The name
can contain any ASCII symbol except **':'**. The input will always be valid and
in the format described, there is no need to check it.

A single person *cannot have more than one* card with the same power and type,
if he draws such a card he discards it. The people are playing with *multiple
decks*. Each card has a value that is calculated by the power multiplied by the
type. Powers **2 to 10** have the same value and **J to A** are **11 to 14**.
Types are mapped to multipliers the following way (**S -\> 4, H-\> 3, D -\> 2, C
-\> 1**).

Finally print out the total value each player has in his hand in the format:

**{personName}: {value}**

### Examples

| **Input**                                                                                                                                                                                                  | **Output**                                      |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------|
| Pesho: 2C, 4H, 9H, AS, QS Slav: 3H, 10S, JC, KD, 5S, 10S <br/> Peshoslav: QH, QC, QS, QD Slav: 6H, 7S, KC, KD, 5S, 10C <br/> Peshoslav: QH, QC, JS, JD, JC  <br/>Pesho: JD, JD, JD, JD, JD, JD <br/> JOKER | Pesho: 167 <br/> Slav: 175 <br/> Peshoslav: 197 |

<br/>

### Solution: <a title="08 Hands Of Cards" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p08_HandsOfCards/HandsOfCards.java">08 Hands Of Cards</a>

---

08.09 \* User Logs
------------------

Marian is a famous system administrator. The person to overcome the security of
his servers has not yet been born. However, there is a new type of threat where
users flood the server with messages and are hard to be detected since they
change their IP address all the time. Well, Marian is a system administrator and
is not so into programming. Therefore, he needs a skillful programmer to track
the user logs of his servers. You are the chosen one to help him!

You are given an input in the format:

**IP=(IP.Address) message=(A&sample&message) user=(username)**

Your task is to parse the ip and the username from the input and for **every
user**, you have to display **every ip** from which the corresponding user has
sent a message and the **count of the messages** sent with the corresponding ip.
In the output, the usernames must be **sorted alphabetically** while their IP
addresses should be displayed in the **order of their first appearance.** The
output should be in the following format:

**username:**

**IP =\> count, IP =\> count.**

For example, given the following input - **IP=192.23.30.40
message='Hello&derps.' user=destroyer**, you have to get the username
**destroyer** and the IP **192.23.30.40** and display it in the following
format:

**destroyer:**

**192.23.30.40 =\> 1.**

The username destroyer has sent a message from ip 192.23.30.40 once.

Check the examples below. They will further clarify the assignment.

### Input

The input comes from the console as **varying number** of lines. You have to
parse every command until the command that follows is **end.** The input will be
in the format displayed above, there is no need to check it explicitly.

### Output

For every user found, you have to display each log in the format:

**username:**

**IP =\> count, IP =\> count…**

The IP addresses must be split with a comma, and each line of IP addresses must
end with a dot.

### Constraints

-   The number of commands will be in the range [1..50]

-   The IP addresses will be in the format of either **IPv4** or **IPv6.**

-   The messages will be in the format: **This&is&a&message**

-   The username will be a string with length in the range [3..50]

-   Time limit: 0.3 sec. Memory limit: 16 MB.

### Examples

| **Input**                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | **Output**                                                                                                                                                                                                                                                                      |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| IP=192.23.30.40 message='Hello&derps.' <br/> user=destroyer <br/> IP=192.23.30.41 message='Hello&yall.' <br/> user=destroyer <br/> IP=192.23.30.40 message='Hello&hi.' <br/> user=destroyer <br/> IP=192.23.30.42 message='Hello&Dudes.' <br/> user=destroyer <br/> end                                                                                                                                                                                                           | destroyer: <br/> 192.23.30.40 =\> 2, 192.23.30.41 =\> 1, 192.23.30.42 =\> 1.                                                                                                                                                                                                    |
| IP=FE80:0000:0000:0000:0202:B3FF:FE1E:8329 message='Hey&son' user=mother <br/> IP=192.23.33.40 message='Hi&mom!' user=child0 <br/> IP=192.23.30.40 message='Hi&from&me&too' user=child1 <br/> IP=192.23.30.42 message='spam' user=destroyer <br/> IP=192.23.30.42 message='spam' user=destroyer <br/> IP=192.23.50.40 message='' user=yetAnotherUsername <br/> IP=192.23.50.40 message='comment' user=yetAnotherUsername <br/> IP=192.23.155.40 message='Hello.' user=unknown end | child0: <br/> 192.23.33.40 =\> 1. <br/> child1: <br/> 192.23.30.40 =\> 1. <br/> destroyer: <br/> 192.23.30.42 =\> 2. <br/> mother: FE80:0000:0000:0000:0202:B3FF:FE1E:8329 =\> 1. <br/> unknown: <br/> 192.23.155.40 =\> 1. <br/> yetAnotherUsername: <br/> 192.23.50.40 =\> 2. |

<br/>

### Solution: <a title="09 \* User Logs" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p09_UserLogs/UserLogs.java">09 \* User Logs</a>

---

08.10 \* Population Counter
---------------------------

So many people! It’s hard to count them all. But that’s your job as a
statistician. You get raw data for a given city and you need to aggregate it.

On each input line you’ll be given data in format:
**"city\|country\|population"**. There will be **no redundant whitespaces
anywhere** in the input. Aggregate the data **by country and by city** and print
it on the console. For each country, print its **total population** and on
separate lines the data for each of its cities. **Countries should be ordered by
their total population in descending order** and within each country, the
**cities should be ordered by the same criterion**. If two countries/cities have
the same population, keep them **in the order in which they were entered.**
Check out the examples; follow the output format strictly!

### Input

-   The input data should be read from the console.

-   It consists of a variable number of lines and ends when the command
    "**report**" is received.

-   The input data will always be valid and in the format described. There is no
    need to check it explicitly.

### Output

-   The output should be printed on the console.

-   Print the aggregated data for each country and city in the format shown
    below.

### Constraints

-   The name of the city, country and the population count will be separated
    from each other by **a pipe ('\|')**.

-   The **number of input lines** will be in the range [2 … 50].

-   A city-country pair will not be repeated.

-   The **population count** of each city will be an integer in the range [0 … 2
    000 000 000].

-   Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64248393-9efca400-cf19-11e9-86a5-6eeb441cb205.png" alt="alt text" width="900" height=""></kbd>

<br/>

### Solution: <a title="10 \* Population Counter" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p10_PopulationCounter/PopulationCounter.java">10 \* Population Counter</a>

---

08.11 \* Logs Aggregator
------------------------

You are given a sequence of access logs in format **\<IP\> \<user\>
\<duration\>**. For example:

-   192.168.0.11 peter 33

-   10.10.17.33 alex 12

-   10.10.17.35 peter 30

-   10.10.17.34 peter 120

-   10.10.17.34 peter 120

-   212.50.118.81 alex 46

-   212.50.118.81 alex 4

Write a program to aggregate the logs data and print **for each user** the
**total duration** of his sessions and a **list of unique IP addresses** in
format "**\<user\>: \<duration\> [\<IP1\>, \<IP2\>, …]**". Order the **users
alphabetically**. Order the **IPs alphabetically**. In our example, the output
should be the following:

-   alex: 62 [10.10.17.33, 212.50.118.81]

-   peter: 303 [10.10.17.34, 10.10.17.35, 192.168.0.11]

### Input

The input comes from the console. At the first line a number **n** stays which
says how many log lines will follow. Each of the next n lines holds a log
information in format **\<IP\> \<user\> \<duration\>**. The input data will
always be valid and in the format described. There is no need to check it
explicitly.

### Output

Print **one line for each user** (order users alphabetically). For each user
print its sum of durations and all of his sessions' IPs, ordered alphabetically
in format **\<user\>: \<duration\> [\<IP1\>, \<IP2\>, …]**. Remove any
duplicated values in the IP addresses and order them alphabetically (like we
order strings).

### Constraints

-   The **count** of the order lines **n** is in the range [1…1000].

-   The **\<IP\>** is a standard IP address in format **a.b.c.d** where **a**,
    **b**, **c** and **d** are integers in the range [0…255].

-   The **\<user\>** consists of only of **Latin characters**, with length of
    [1…20].

-   The **\<duration\>** is an integer number in the range [1…1000].

-   Time limit: 0.3 sec. Memory limit: 16 MB.

### Examples

| **Input**                                                                                                                                                                                         | **Output**                                                                                      |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|
| 7 <br/> 192.168.0.11 peter 33 <br/> 10.10.17.33 alex 12 <br/> 10.10.17.35 peter 30 <br/> 10.10.17.34 peter 120 <br/> 10.10.17.34 peter 120 <br/> 212.50.118.81 alex 46 <br/> 212.50.118.81 alex 4 | alex: 62 [10.10.17.33, 212.50.118.81] <br/> peter: 303 [10.10.17.34, 10.10.17.35, 192.168.0.11] |
| 2 84.238.140.178 nakov 25 <br/> 84.238.140.178 nakov 35                                                                                                                                           | nakov: 60 [84.238.140.178]                                                                      |

<br/>

### Solution: <a title="11 \* Logs Aggregator" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p11_LogsAggregator/LogsAggregator.java">11 \* Logs Aggregator</a>

---

08.12 \* Legendary Farming
--------------------------

You’ve beaten all the content and the last thing left to accomplish is own a
legendary item. However, it’s a tedious process and requires quite a bit of
farming. Anyway, you are not too pretentious – any legendary will do. The
possible items are:

-   **Shadowmourne** – requires **250 Shards**;

-   **Valanyr** – requires **250 Fragments**;

-   **Dragonwrath** – requires **250 Motes**;

**Shards, Fragments** and **Motes** are the **key materials**, all else is
**junk.** You will be given lines of input, such as  
**2 motes 3 ores 15 stones.** Keep track of the **key materials -** the
**first** that reaches the **250 mark wins** the **race**. At that point, print
the corresponding legendary obtained. Then, print the **remaining** shards,
fragments, motes, ordered by **quantity** in **descending** order, each on a new
line. Finally, print the collected **junk** items, in **alphabetical** order.

### Input

-   Each line of input is in format **{quantity} {material} {quantity}
    {material} … {quantity} {material}**

### Output

-   On the first line, print the obtained item in format **{Legendary item}
    obtained!**

-   On the next three lines, print the remaining key materials in descending
    order by quantity

    -   If two key materials have the same quantity, print them in alphabetical
        order

-   On the final several lines, print the junk items in alphabetical order

    -   All materials are printed in format **{material}: {quantity}**

    -   All output should be **lowercase**, except the first letter of the
        legendary

### Constraints

-   The quantity-material pairs are between 1 and 25 per line.

-   The number of lines is in range [1..10]

-   All materials are case-insensitive.

-   Allowed working time: 0.25s

-   Allowed memory: 16 MB

### Examples

| **Input**                                                                                                      | **Output**                                                                                            |
|----------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| 3 Motes 5 stones 5 Shards <br/> 6 leathers 255 fragments 7 Shards                                              | Valanyr obtained!<br/> fragments: 5<br/> shards: 5<br/> motes: 3<br/> leathers: 6<br/> stones: 5      |
| **Input**                                                                                                      | **Output**                                                                                            |
| 123 silver 6 shards 8 shards 5 motes<br/> 9 fangs 75 motes 103 MOTES 8 Shards<br/> 86 Motes 7 stones 19 silver | Dragonwrath obtained!<br/> shards: 22<br/> motes: 19<br/> fragments: 0<br/> fangs: 9<br/> silver: 123 |

<br/>

### Solution: <a title="12 \* Legendary Farming" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p12_LegendaryFarming/LegendaryFarming.java">12 \* Legendary Farming</a>

---

08.13 \*\* Сръбско Unleashed
----------------------------

Admit it – the СРЪБСКО is your favorite sort of music. You never miss a concert
and you have become quite the geek concerning everything involved with СРЪБСКО.
You can’t decide between all the singers you know who your favorite one is. One
way to find out is to keep a statistics of how much money their concerts make.
Write a program that does all the boring calculations for you.

On each input line you’ll be given data in format: **"singer \@venue
ticketsPrice ticketsCount"**. There will be **no redundant whitespaces
anywhere** in the input. Aggregate the data **by venue and by singer**. For each
venue, print the singer and the total amount of money his/her concerts have made
on a separate line. **Venues** should be kept in the **same order** they were
entered, the **singers** should be **sorted by how much money** they have made
in **descending order**. If two singers have made the same amount of money, keep
them **in the order** in which **they were entered.**

Keep in mind that if a line is in incorrect format, it should be skipped and its
data should not be added to the output. Each of the four tokens must be
separated by **a space**, everything else is invalid. The venue should be
denoted with **\@** in front of it, such as \@Sunny Beach

**SKIP THOSE**: Ceca\@Belgrade125 12378, Ceca \@Belgrade12312 123

The singer and town name may consist of one to three words.

### Input

-   The input data should be read from the console.

-   It consists of a variable number of lines and ends when the command
    “**End**" is received.

-   The input data will always be valid and in the format described. There is no
    need to check it explicitly.

### Output

-   The output should be printed on the console.

-   Print the aggregated data for each venue and singer in the format shown
    below.

-   Format for singer lines is **\#{2\*space}{singer}{space}-\>{space}{total
    money}**

### Constraints

-   The **number of input lines** will be in the range [2 … 50].

-   The **ticket price** will be an integer in the range [0 … 200].

-   The **ticket count** will be an integer in the range [0 … 100 000]

-   **Singers** and **venues** are case sensitive

-   Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64248821-dc156600-cf1a-11e9-80fb-8b2d310182b3.png" alt="alt text" width="900" height=""></kbd>

<br/>

### Solution: <a title="13 \*\* Сръбско Unleashed" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p13_SerbianUnleashed/SerbianUnleashed.java">13 \*\* Сръбско Unleashed</a>

---

08.14 \*\*\* Dragon Army
------------------------

Heroes III is the best game ever. Everyone loves it and everyone plays it all
the time. Stamat is no exclusion to this rule. His favorite units in the game
are all **types** of dragons – black, red, gold, azure etc… He likes them so
much that he gives them **names** and keeps logs of their **stats**: **damage,
health** and **armor**. The process of aggregating all the data is quite
tedious, so he would like to have a program doing it. Since he is no programmer,
it’s your task to help him

You need to categorize dragons by their **type**. For each dragon, identified by
**name,** keep information about his **stats.** Type is **preserved** as in the
order of input, but dragons are **sorted** alphabetically by name. For each
type, you should also print the average **damage**, **health** and **armor** of
the dragons. For each dragon, print his own stats.

There **may** be **missing** stats in the input, though. If a stat is missing
you should assign it default values. Default values are as follows: health
**250**, damage **45**, and armor **10**. Missing stat will be marked by
**null**.

The input is in the following format **{type} {name} {damage} {health}
{armor}.** Any of the integers may be assigned null value. See the examples
below for better understanding of your task.

If the same dragon is added a second time, the new stats should **overwrite**
the previous ones. Two dragons are considered **equal** if they match by
**both** name and type.

### Input

-   On the first line, you are given number N -\> the number of dragons to
    follow

-   On the next N lines you are given input in the above described format. There
    will be single space separating each element.

### Output

-   Print the aggregated data on the console

-   For each type, print average stats of its dragons in format
    **{Type}::({damage}/{health}/{armor})**

-   Damage, health and armor should be rounded to two digits after the decimal
    separator

-   For each dragon, print its stats in format **-{Name} -\> damage: {damage},
    health: {health}, armor: {armor}**

### Constraints

-   N is in range [1…100]

-   The dragon type and name are one word only, starting with capital letter.

-   Damage health and armor are integers in range [0 … 100000] or **null**

### Examples

<kbd><img src="https://user-images.githubusercontent.com/32310938/64248835-e899be80-cf1a-11e9-8c10-5f9917a99f39.png" alt="alt text" width="900" height=""></kbd>

<br/>

### Solution: <a title="14 \*\*\* Dragon Army" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/08%20EXERCISE%20SETS%20AND%20MAPS/p14_DragonArmy/DragonArmy.java">14 \*\*\* Dragon Army</a>

---