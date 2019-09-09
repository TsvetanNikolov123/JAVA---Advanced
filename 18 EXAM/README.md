18 EXAM
=======

---
---

18.01 Internship
----------------

A software company is looking for its next star programmer, so they organize an
interview in several rounds. In the first part, the candidates have to solve a
few **Problems, ordered in a stack,** one after another, reading them from the
console.

The number of Candidates may **not be the same** as the number of Problems
prepared. The Candidates are solving the problems in a queue **one by one**, but
only **if their name is valid**. A valid Candidate name consists of **First and
Last name in proper casing** (e.g. Ivan Ivanov - is valid name; invalid names -
ivan IVanov, Ivan ivanov...).

Each Candidate **takes the topmost** Problem to solve. If the sum of
**Candidate\`s name** letters (ASCII value) **is greater** from the sum of the
**Problem\`s letters** (ASCII value) =\> the **Problem is solved**. Otherwise,
the Problem is **unsolved**. Don’t forget to include space characters.

If a **Problem is solved,** it is **removed** from the stack with problems, and
the Candidate who solved it goes to the end of the queue. You should write on
the console: **"{candidate} solved {problem}."**

If a **Problem is unsolved**, it goes to the bottom of the stack and the
**candidate fails the interview**, so he leaves in tears. You should write on
the console: **"{candidate} failed {problem}."**

If there is **only one candidate left**, the program ends and you should write
on the console: **"{candidate} gets the job!"**

**In case there are no more tasks** to solve you should print on the console the
names of the candidates, separate by comma.

### Input / Constraints

The input data should be read from the console.

-   **First line** – **n** – Problems count – a 32-bit integer in the range [0 …
    100].

-   **Second line** – **m** – Candidates count – a 32-bit integer in the range
    [0 … 100].

-   **Next n-lines** – a Problem – text in the range [1 … 100 chars].

-   **Next m-lines** – a Candidate name – text in the range [1 … 100 chars].

-   Allowed working time for your program: 0.1 seconds.

-   Allowed memory: 16 MB.

### Output

Print on the console each message in the above specified format.

### Examples

| **Input**                                                                                                                                                                                                        | **Output**                                                                                                                                                                                                                                                                                                          | **Comments**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 5 <be/> 5 <be/> Sum Bytes <be/> Word Count <be/> Text Filter <be/> Palindromes <be/> Hot Potato <be/> Filip Yordanov <be/> Vladimir Georgiev <be/> Borislava Pesheva <be/> Maria Mileva <be/> Stanislav Stoyanov | Filip Yordanov solved Hot Potato. <be/> Vladimir Georgiev solved Palindromes. <be/> Borislava Pesheva solved Text Filter. <be/> Maria Mileva solved Word Count. <be/> Stanislav Stoyanov solved Sum Bytes. <be/> Filip Yordanov, Vladimir Georgiev, <be/> Borislava Pesheva, Maria Mileva, <be/> Stanislav Stoyanov | Filip Yordanov take the Problem – <be/> “Hot Potato”. The sum of his <be/> name letters is 1382, the sum of <be/> Problem’s name letters is – 962 <be/> -\> the Problem is solved. Filip <be/> Yordanov goes to the end of the <be/> queue and the Problem is <be/> removed from the stack. Print – <be/> “Filip Yordanov solved Hot <be/> Potato.” <be/> Vladimir Georgiev take the <be/> Problem – “Palindomes”….etc. <be/> Finally, there are no tasks left and <be/> we print the name of Candidates. |
| 4 <be/> 5 <be/> Greeting <be/> Snake <be/> Array <be/> Sum of All Elements of Matrix <be/> Pesho Goshov <be/> Georgi Ivanov <be/> Petyr Petrov <be/> Ivan ivanov <be/> Simo Simov                                | Pesho Goshov failed Sum of All Elements <be/> of Matrix. <be/> Georgi Ivanov solved Array. <be/> Petyr Petrov solved Snake. <be/> Simo Simov solved Greeting. <be/> Georgi Ivanov failed Sum of All Elements of Matrix. <be/> Petyr Petrov failed Sum of All Elements of Matrix. <be/> Simo Simov gets the job!     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |

<br/>

### Solution: <a title="01 Internship" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/18%20EXAM/p01_Internship/Internship.java">01 Internship</a>

---

18.02 Snake
-----------

One of the candidates-intern must solve the task - "Snake". He must write a Java
code that calculates wheater the snake wins or loses the game.

Here are the rules of the game:

The game starts with a **snake length of 1**.

We get as input **the size** of the **screen** in which our snake moves. The
screen is **always a square**. After that we receive the commands wich represent
the directions in wich the snake should move.The snake **starts** from
**s**-position The commands will be: **left/right/up/down.** If the snake
reaches the side edge of the screen (left or right), it goes to the **opposite
side of the same row**. If the snake reaches the top/bottom edge of the screen
it goes on the **opposite site of the same column** . The possible characters
that may appear on the screeen are:

-   **\***– that is a regular square; it does nothing

-   **e** – represents an enemy.

-   **f** – this is the food

-   **s** - the place where the **game starts**

Each time when you eat a piece of food your **length increases by one**. Keep
thrack of the length, because **in case you win you have to print it**. If you
**step on an enemy the game is over (the snake stops moving)** and you have to
print the output as shown in the output section. After executing all of the
commands there are 3 possible outcomes:

-   you have eaten all the food and you win

-   you get killed by an enemy

-   there is still some food to be eaten

Print the corresponding output depending on the case.

### Input

-   **Length** of the screen side – an integer number.

-   **Commands to move** the snake – an array of strings separated by **“, ”**.

### Output

-   There are three types of output:

    -   If all of the food is eaten print the following output: “**You win!
        Final snake length is {length}**”

    -   If there are no left commands and there is still some food to be eaten:
        “**You lose! There is still {left food} food to be eaten.**”

    -   If you step on the enemy the game is over and you print “**You lose!
        Killed by an enemy!**”

### Constraints


-   The **input numbers** will be a 32-bit integer in the range [0 … 2 147 483
    647].

-   Allowed working time for your program: 0.1 seconds.

-   Allowed memory: 16 MB.

### Examples

| **Input**                                                                                                                                                                                                      | **Output**                                   | **Comments**                                                                                                                                                                           |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **5 <br/> up, right, right, right, up** <br/> \* \* e \* \* <br/> \* \* \* f \* <br/> \* f \* \* \* <br/> s \* \* \* \* <br/> \* \* e \* \*                                                                    | You win! Final snake length is 3             | After executing all of the <br/> commands the snake has <br/> eaten all of the food and it it <br/> still alive.                                                                                         |
| **4 <br/> right, right, right, right, right, down, right** <br/> \* s \* \* <br/> \* \* e \* <br/> \* f \* f <br/> \* \* \* f                                                                                  | You lose! Killed by an enemy!                | The snake moves 2 times to <br/> the right, then it goes off <br/> screen and appears on left <br/> side. Then it makes 2 more <br/> moves to the right, it goes <br/> down, steps on an enemy <br/> and the game is over. |
| **6 <br/> down, left, left, down, right, right, right, right, right** <br/> \* \* \* \* s \* <br/> \* e f \* \* \* <br/> f \* \* \* \* \* <br/> \* \* \* f e \* <br/> \* e \* \* \* \* <br/> \* \* \* \* \* \* | You lose! There is still 1 food to be eaten. | The snake survived <br/> but there <br/> is still 1 piece of food that <br/> the snake could not eat.                                                                                                    |

<br/>

### Solution: <a title="02 Snake" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/18%20EXAM/p02_Snake/Snake.java">02 Snake</a>

---

18.03 Genome
------------

*Every living creature on Earth has genomes in it body. The genome is the total
genetic material of an organism and includes both the genes and non-coding
sequences. The genome size, and the number of genes it encodes varies widely
between organisms (e.g. viruses and viroids have the smallest amount of
genomes).*

The next task of candidate-intern Tanya is called „Genome“ and you have to help.
You will receive different amount of **encrypted** genes each on a separate
line. Until you receive a line “**Stop!**” you have to decrypt the information
given and save some data that you will need later on. Each valid information
about a gene should consist of:

-   **Name of the gene** may contain some of the following characters between
    its letters (!\@\#\$?). Example for valid names: “!\@pro?\#line!\#”
    (proline)

-   **Length of the name** with a “=” before it. (e.g. =12; =5…)

-   **Count of genes** with a “--” before it. (e.g. --800; --142)

-   **Organism that it belongs to with** “\<\<” before it. (e.g. \<\<cat;
    \<\<dog)

**Note: the info will be in that exact order. If something is missing the input
is invalid and you should ignore it. If the length of the name does not match
with the actual name given, the input is considered invalid and you should
ignore it.**

Examples for **valid** input:

“!cad\$\$he!rins!\@=9--30229\<\<human”

“!\@leu?\#cine!\#=7--800\<\<cat”

Examples of **invalid** input:

“bx!=4--421\<\<bison” – the length 4 does not match with the actual length

“\#nms!n--126\<\<dog” – the length is missing

**Store** the information about the genes and print all the organisms you have
encountered with their **total** amount of genes.

### Input

-   You will receive encrypted lines of input storing information about a gene
    until you receive “**Stop!**”

-   all names will always be **lower-case** characters, **only Latin letters**

-   the input will always be **valid** (no whitespaces)

### Output

-   Print every organism with their total amount of genes (genome) in
    **descending order**

-   For every organism print “**{organism name} has genome size of {genes
    count}**”

-   If genes count equal -\> **save the order** of the input

### Constraints

-   all numbers will be in range [1 - 10000]

-   name will be string [1 - 1000]

### Examples

| **Input**                                                                                                                                                                                                    | **Output**                                                                                       |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|
| !\@ab?si?di!a\@=7--152\<\<human <br/> b!etu?la\@=6--321\<\<dog <br/> !curtob\@acter\#\#ium\$=14--230\<\<dog <br/> !some\@thin\@g\#\#=9\<\<human <br/> Stop!                                                  | dog has genome size of 551 <br/> human has genome size of 152                                    |
| =12\<\<cat <br/> !vi\@rus?=2--142 <br/> ?!cur\#\#viba\@cter!!=11--800\<\<cat <br/> !fre?esia\#=7--450\<\<mouse <br/> \@pa!rcuba\@cteria\$=13--351\<\<mouse <br/> !richel\#ia??=8--900\<\<human <br/> Stop!   | human has genome size of 900 <br/> mouse has genome size of 801 <br/> cat has genome size of 800 |
| !\@ру?би\#=4--57\<\<polecat <br/> ?do?\@\#ri\#=4--89\<\<polecat <br/> =12\<\<cat <br/> !vi\@rus?=2--142 <br/> \@pa!rcu\>ba\@cteria\$=13--234\<\<mouse <br/> ?!cur\#\#viba\@cter!!=11--680\<\<cat <br/> Stop! | cat has genome size of 680 <br/> polecat has genome size of 89                                   |

<br/>

### Solution: <a title="03 Genome" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/18%20EXAM/p03_Genome/Genome.java">03 Genome</a>

<br/>

### Solution: <a title="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/18%20EXAM/p03_Genome/Genome.java" href=""></a>

---

18.04 Ranking
-------------

Here comes the final and the most interesting part – the Final ranking of the
candidate-interns. The final ranking is determined by the points of the
interview tasks and from the exams in SoftUni. Here is your final task. You will
receive some lines of input in the format **“{contest}:{password for contest}”**
until you receive **“end of contests”**. Save that data because **you will need
it later**. After that you will receive other type of inputs in format
**“{contest}=\>{password}=\>{username}=\>{points}”** until you receive **“end of
submissions”**. Here is what you need to do.

-   Check if the **contest is valid (if you received it in the first type of
    input)**

-   Check if the **password is correct for the given contest**

-   Save the user with the contest they take part in **(a user can take part in
    many contests)** and the points the user has in the given contest. If you
    receive the **same contest and the same user update the points only if the
    new ones are more than the older ones.**

At the end you have to print the info for the user with the **most points** in
the format **“Best candidate is {user} with total {total points} points.”**.
After that print **all students ordered by their names**. **For each user print
each contest with the points in descending order**. See the examples.

### Input

-   strings in format **“{contest}:{password for contest}”** until the **“end of
    contests”** command. There will be no case with two equal contests

-   strings in format **“{contest}=\>{password}=\>{username}=\>{points}”** until
    the **“end of submissions”** command.

-   **There will be no case with 2 or more users with same total points!**

### Output

-   On the first line print the best user in format **“Best candidate is {user}
    with total {total points} points.”.**

-   Then print all students ordered as mentioned above in format:

>   **{user1 name}**

>   **\# {contest1} -\> {points}**

>   **\# {contest2} -\> {points}**

>   **{user2 name}**

>   **…**

### Constraints

-   the strings may contain any ASCII character except from **(:, =, \>)**

-   the numbers will be in range **[0 - 10000]**

-   second input is always valid

### Examples

| **Input**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | **Output**                                                                                                                                                                                                                                                                                                                           |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Part One Interview:success <br/> Js Fundamentals:Pesho <br/> C\# Fundamentals:fundPass <br/> Algorithms:fun <br/> end of contests <br/> C\# Fundamentals=\>fundPass=\>Tanya=\>350 <br/> Algorithms=\>fun=\>Tanya=\>380 <br/> Part One Interview=\>success=\>Nikola=\>120 <br/> Java Basics Exam=\>pesho=\>Petkan=\>400 <br/> Part One Interview=\>success=\>Tanya=\>220 <br/> OOP Advanced=\>password123=\>BaiIvan=\>231 <br/> C\# Fundamentals=\>fundPass=\>Tanya=\>250 <br/> C\# Fundamentals=\>fundPass=\>Nikola=\>200 <br/> Js Fundamentals=\>Pesho=\>Tanya=\>400 <br/> end of submissions | Best candidate is Tanya with total 1350 points. <br/> Ranking: <br/> Nikola <br/> \# C\# Fundamentals -\> 200 <br/> \# Part One Interview -\> 120 <br/> Tanya <br/> \# Js Fundamentals -\> 400 <br/> \# Algorithms -\> 380 <br/> \# C\# Fundamentals -\> 350 <br/> \# Part One Interview -\> 220                                     |
| Java Advanced:funpass <br/> Part Two Interview:success <br/> Math Concept:asdasd <br/> Java Web Basics:forrF <br/> end of contests <br/> Math Concept=\>ispass=\>Monika=\>290 <br/> Java Advanced=\>funpass=\>Simona=\>400 <br/> Part Two Interview=\>success=\>Drago=\>120 <br/> Java Advanced=\>funpass=\>Petyr=\>90 <br/> Java Web Basics=\>forrF=\>Simona=\>280 <br/> Part Two Interview=\>success=\>Petyr=\>0 <br/> Math Concept=\>asdasd=\>Drago=\>250 <br/> Part Two Interview=\>success=\>Simona=\>200 <br/> end of submissions                                                        | Best candidate is Simona with total 880 points. <br/> Ranking: <br/> Drago <br/> \# Math Concept -\> 250v \# Part Two Interview -\> 120 <br/> Petyr <br/> \# Java Advanced -\> 90 <br/> \# Part Two Interview -\> 0 <br/> Simona <br/> \# Java Advanced -\> 400 <br/> \# Java Web Basics -\> 280 <br/> \# Part Two Interview -\> 200 |

<br/>

### Solution: <a title="04 Ranking" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/18%20EXAM/p04_Ranking/Ranking.java">04 Ranking</a>

---
