19 Retake Exam
==============

19.01 Agency
------------

….After the agency have choose their new agents, they have to get their ID
numbers.

Every ID number is on a **separate card** o n the desk in a stack.

The agents enter at the registation in queue **one by one.** Each agent **take
topmost ID**.

Your task is to write a program that can handle the registration process. On the
**first line** you will receive ID numbers available for the registration,
**separated by white space.** On the **second** - agents who enter the
registration room, also **separated by white space.** After this you start to
receive **commands, until** you get the word **"stop",** that you should process
to make sure, that every agent get the intended ID number. **Commands,** that
you can receive is :

-   **"add-ID {ID Number}"-** after the command you will receive an **ID
    number**, that you should add on the top of the stack with ID's. *Example:*
    "add-ID 2312".

-   **"add-agent {Agent Name}" –** You should add an **agent** at the end of the
    queue. *Example:* "add-agent Johnson"

-   **"remove-ID" –** you have to remove first **ID number** from the stack, and
    print the message **"{ID Number} has been removed. "**

-   **"remove-agent"-** remove the **last agent** from the queue and print the
    message**"{Agent Name} has left the queue."**

-   **"sort-ID"-** if you receive sort command you have to sort the stack of ID
    numbers in **descending order.**

### Input


The input data should be read from the console.

-   **First line** – ID numbers (as string), separated by **whitespace**.

-   **Second line** – agent's names, separated by **whitespace.**

-   Strings with commands until the **“stop”** command.

The input will always be valid and in the format described. There is no need to
check it explicitly.

### Output


When you receive **"stop"** command you should print at the console:

-   for every agent:

**"{Agent Name} takes ID number: {ID Number}"**

-   If there are **NO** more agents:

Print message **- "No more agents left."**

And then print every ID numbers left in the stack in following format:

**"ID number: {ID Number}"**

-   If there are **NO** ID's left:

Print for every agent left in the queue: **"{Agent Name} does not have an ID."**

### Constraints


-   The **input text** will be in the range [1 … 100 chars]

-   The **input numbers** will be a 32-bit integer in the range [0 … 2 147 483
    647].

-   Allowed working time for your program: 0.1 seconds.

-   Allowed memory: 16 MB.

### Examples

| **Input**                                                                                                          | **Output**                                                                                                                                                             | **Comments**                                                                                                                                                                        |
|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 111 222 333 <br/> Alpha Bravo Charlie <br/> add-ID 444 <br/> add-agent Delta <br/> stop                            | Alpha takes ID number: 444 <br/> Bravo takes ID number: 333 <br/> Charlie takes ID number: 222 <br/> Delta takes ID number: 111                                        | Agent Alpha takes the topmost <br/> id,which is 444 because it has been <br/> added last. Agent Delta was also <br/> added to the queue, so he receive <br/> an ID as well.         |
| 223 8275 9223 <br/> Delta India Foxtrot <br/> remove-ID <br/> stop                                                 | 9223 has been removed. <br/> Delta takes ID number: 8275 <br/> India takes ID number: 223 <br/> Foxtrot does not have an ID.                                           | After the "remove-ID", we remove <br/> 9223,from the stack, and print the <br/> message.Now we have three <br/> agents and only two ID's, so we <br/> print the appropriate message |
| 008 003 002 001 <br/> Widow Delta <br/> sort-ID <br/> add-agent Zulu <br/> remove-ID <br/> remove-agent <br/> stop | 008 has been removed. <br/> Zulu has left the queue. <br/> Widow takes ID number: 003 <br/> Delta takes ID number: 002 <br/> No more agents left. <br/> ID number: 001 |                                                                                                                                                                                     |

<br/>

### Solution: <a title="01 Agency" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/19%20Retake%20Exam/p01_Agency/p01_Agency.java">01 Agency</a>

---

19.02 Bomb Field
----------------

One of the mission that new agents have to complete is called BombField. Your
task is to implement the mission into a simple program.

We get as input **the size** of the **field** in which our sapper moves. The
field is **always a square**. After that we receive the commands wich represent
the directions in wich the sapper should move.The sapper **starts** from
**s**-position The commands will be: **left/right/up/down.** If the sapper
reaches the side edge of the field (left, right,up or down), it **remains on his
current possition**. The possible characters that may appear on the screeen are:

-   **+** – regular position on the field.

-   **e** – end of the route.

-   **B** – bomb

-   **s** - the place where the **sapper starts**

Each time when sapper finds a bomb, he deactivates it, and **replace "B" with
"+"**. Keep track of the **count of the bombs**. Each time you find a bomb, you
have to print the following message: **"You found a bomb!".** If sapper **steps
at the end of the route game is over (the program stops)** and you have to print
the output as shown in the output section. After executing all of the commands
there are only 2 possible outcomes (there are not going to be more cases):

-   if you found all bombs – you win and the game ends

-   if you reach the end point ("e"), you have to stop

Print the corresponding output depending on the case.

### Input

-   **Field size** – an integer number.

-   **Commands to move** the sapper – an array of strings separated by **","**.

-   **The field: some of the following characters (+, e, B, s),** separated by
    whitespace (" ");

### Output


-   There are three types of output:

    -   If all of the bombs have cleared print the following output:
        "**Congratulations! You found all bombs!**"

    -   If you reached the end, you have to stop moving and print the following
        line: **"END! {bombs left} bombs left on the field"**

    -   If there are no more commands and none of the above cases happens, you
        have to print the following message: **"{bombs left} bombs left on the
        field. Sapper position: ({row},{col})"**

### Constraints


-   The **input numbers** will be a 32-bit integer in the range [0 … 2 147 483
    647].

-   Allowed working time for your program: 0.1 seconds.

-   Allowed memory: 16 MB.

### Examples

| **Input**                                                                                                                                                            | **Output**                                                                                        | **Comments**                                                                                                                                                                                                                                          |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 5 <br/> up,right,right,up,right <br/> + + + B + <br/> + + + e + <br/> + + B + + <br/> s + + B + <br/> + + B + +                                                      | You found a bomb! <br/> END! 3 bombs left on the field                                            | After executing all of <br/> the commands,sapper <br/> move to the end <br/> point.But there are <br/> some boms left, so we <br/> print the information.                                                                                             |
| 4 <br/> up,right,right,right,down <br/> + + + e <br/> + + B + <br/> + s + B <br/> + + + +                                                                            | You found a bomb! <br/> You found a bomb! <br/> Congratulations! You found all bombs!             | The sapper reached the <br/> end of the field, so he <br/> remains hes position <br/> and we print the <br/> message. After all the <br/> bombs are found, we <br/> should stop the <br/> program and print the <br/> appropriate message.            |
| 6 <br/> left,left,down,right,up,left,left,down,down,down <br/> + + + + + + <br/> e + + + B + <br/> + + B s + + <br/> + + + + + + <br/> B + + + B + <br/> + + B + + + | You found a bomb! <br/> You found a bomb! <br/> 3 bombs left on the field. Sapper position: (5,0) | The sapper finds a <br/> bomb, then he steps on <br/> it again, but it does not <br/> count. After executing <br/> all comands sapper did <br/> not reach the end and <br/> did not found all <br/> bombs, so we print the <br/> appropriate message. |

<br/>

### Solution: <a title="02 Bomb Field" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/19%20Retake%20Exam/p02_Bomb_Field/p02_Bomb_Field.java">02 Bomb Field</a>

--- 

19.03 MISSION
-------------

*One of the task for the agent candidates is to decrypt the intercepted list of
missions and their ratings.*

Your task is to decrypt the list and print the missions and their ratings. You
will be given decrypted lines, which will contain the name of the mission and
it\`s rating. You will also receive whether the mission is a complete or failed.
After you receive a command **Decrypt**, you have to print the information about
the **completed mission with biggest rating and the failed mission with biggest
rating.** To be valid, a line should contain the following:

-   Contain the word **“MISSION”** in it. Between each character, there might be
    some other characters. **If the line does not contain that word, it is
    considered invalid.**

-   All the **lower-case letters** will be **the name of the mission**.

-   The **sum of all digits** will be **mission\`s rating.**

-   If the string contains **“C”** the mission is considered completed, if it
    contains **“X”,** it is considered failed. (the input will **always contain
    one** of the characters)

**Example: “MbIS2omSb68fIiO468Ce9ldN” –** this is a valid example; it contains
the word **MISSION,** the name of the mission is **bombfield,** and the rating
is: **2 + 6 + 8 + 4 + 6 + 8 + 9= 43;** it also contains the letter **“C”**,
which makes it a completed mission.

### Input / Constrains

-   You will receive encrypted lines of input until you receive **“Decrypt”**

-   the input will always be **valid** (no whitespaces)

-   there will always be at least **one complete** and **one failed mission**

###  Output

-   On the first line print **“Completed mission {mission name} with rating:
    {rating}”**

-   On the second line print **“Failed mission {mission name} with rating:
    {rating}”**

### Examples

| **Input**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | **Output**                                                                                |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------|
| MbIS2omSb68fIiO468Ce9ldN <br/> 59Mmy\#c4oS\^p12C%3XlaIs\$4mO!a <br/> Mt56rIa\#12ck\$SXiSnIg%ON463 <br/> ro7Mck4IetS561VlauSInO\$c\#h24N\^ <br/> Decrypt                                                                                                                                                                                                                                                                                                                                                                                       | Completed mission bombfield with rating: 43 <br/> Failed mission tracking with rating: 27 |
| **Comment**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |                                                                                           |
| The first line is valid and the mission is completed (**bombfield**). The mission's rating is **43**. The **second line is invalid** since it **does not contain the word “MISSION”.** The **third line is also valid**: failed mission (**tracking**) with rating **27**. The **last line is also valid**: completed mission with rating **29**. We print the **bombfield for our completed mission since it has biggest rating of all completed mission that we encountered**. The **tracking is our only failed mission,** so we print it. |                                                                                           |
|                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |                                                                                           |
| **Input**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | **Output**                                                                                |
| aM\#\@n%aXpIla4554sSmaS%\#1N <br/> M\#Is5S6CpS%&IO655\#\^321\*Ny <br/> 143cMIlo\^4CsStr\@Si\$4I6dRi\*O(9)uNm <br/> Mp%rX\@eIsiS&\*dentSguIaOrdNi76n3g <br/> M(\*8I234C\^\$\#53ToEVlRiI64I <br/> Mho\@\#I4sS\^6CtS\*ag\^IO12)3N(%9es <br/> MbIo5\*+S3\$4-7mS\@bIf\^iOe\#X4l\*8N!d <br/> M24I2\^45kCle%bTsi\#E\$elRl\^I\*XIa <br/> 34MmyI6cCoT3bE45aR2ctXer4Ii3A12um Decrypt                                                                                                                                                                    | Completed mission spy with rating: 33 <br/> Failed mission bombfield with rating: 31      |

<br/>

### Solution: <a title="03 MISSION" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/19%20Retake%20Exam/p03_Mission/p03_Mission.java">03 MISSION</a>

---

19.04 Agents
------------

After the agents had joined the agency, it is time to get their missions. Your
task is to write a program that store every agent, missions that he has assigned
for and rating for every mission. First you will receive receive information
about the agents, missions and rating until you get the word **"registration".**
This is called "the registration phase" and it may contains two type of
information – **mission (String) with rating (floating point number)** or
**agent name (String).**

-   If it starts with **"\#",** it's a mission. Missions are in the following
    format: **"\#{missionName}:{missionRating}".**

-   If **last 3 characters** starts with **"0",** then it's an agent.

When the registration phase is over, the operation phase starts. In this phase
you will get commands that you have to implement to your program. Format and
commands are shown below:

**{command}-\>{commandArguments}**, until the word **"operate".
CommandArguments** will vary, depend on command. Commands that you can receive
in this phase are:

-   If command is **"assign" – line format will be:
    assign-\>{agentName}-\>{missionName}.** Your task is to assign a mission
    with its rating to a given agent. **(One agent cannot assign a mission
    twice, but one mission can be assigned to many agents.) ONLY REGISTERED
    MISSION CAN BE ASSIGNED.**

-   If command is **"abort" – line format will be: abort-\>{missionName}.**
    Remove a mission from every agent that is assigned to it **(one or many).**

-   If command is **"change" – line format will be:
    change-\>{agentName}-\>{agentName}.** Swap the missions with their ratings,
    of the two given agents **(they are always be valid)**.

    **After all the commands are executed, if some agent has no missions, he has
    to be deleted.**

At the end you have to print the info for the agents with the **missions,** in
**descending order by their total missions rating** in following format:
**"Agent: {agentName} - Total Rating: {totalRating}"**, and then for each agent
print their missions and ratings in **descending order by mission rating** in
format : **"- {missionName} -\> {missionRating}"** . If you have equal sum of
ratings, **keep the order of the assignment**. See the examples.

### Input

-   Strings in format format: **"\#{missionName}:{missionRating}",** or
    "**{agentName}"** until the **"registration"** command.

-   Strings in format **"{command}-\>{commandArguments} ",** until the
    "**operate"** command.

### Output

-   Print all agents and their missions ordered as mentioned above in format:

>   Agent: {agentName} - Total Rating: {totalRating}

>   \- {missionName} -\> {missionRating}

>   **…**

### Constraints

-   the strings may contain any ASCII character except from **(:, -, \>)**

-   the floating point numbers will be in range **[0 - 10000]**

### Examples

| **Input**                                                                                                                                                                                                                                                                                                                                          | **Output**                                                                                                                                                                                                     |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| \#BombField:10.45 <br/> Alpha005 <br/> Delta008 <br/> \#Hostages:9.65 <br/> \#Spying:8.35 <br/> Zulu011 <br/> registration <br/> assign-\>Delta008-\>\#BombField <br/> assign-\>Alpha005-\>\#Hostages <br/> assign-\>Zulu011-\>\#Spying <br/> operate                                                                                              | Agent: Delta008 - Total Rating: 10.45 <br/> - \#BombField -\> 10.45 <br/> Agent: Alpha005 - Total Rating: 9.65 <br/> - \#Hostages -\> 9.65 <br/> Agent: Zulu011 - Total Rating: 8.35 <br/> - \#Spying -\> 8.35 |
| \#BombField:10.45 <br/> Alpha005 <br/> Delta008 <br/> \#Hostages:9.65 <br/> \#Spying:8.35 <br/> Zulu011 <br/> registration <br/> assign-\>Alpha005-\>\#Hostages <br/> assign-\>Zulu011-\>\#Spying <br/> assign-\>Delta008-\>\#BombField <br/> abort-\>\#Spying <br/> assign-\>Delta008-\>\#Spying <br/> assign-\>Alpha005-\>\#Spying <br/> operate | Agent: Delta008 - Total Rating: 18.80 <br/> - \#BombField -\> 10.45 <br/> - \#Spying -\> 8.35 <br/> Agent: Alpha005 - Total Rating: 18.00 <br/> - \#Hostages -\> 9.65 <br/> - \#Spying -\> 8.35                |
| \#Guarding:13.54 <br/> \#Undercover:18.85 <br/> \#Spying:8.35 <br/> \#BombField:10.45 <br/> Bond007 <br/> K001 <br/> registration <br/> assign-\>Bond007-\>\#Undercover <br/> assign-\>Bond007-\>\#BombField <br/> assign-\>K001-\>\#Guarding <br/> assign-\>K001-\>\#Spying <br/> abort-\>\#Guarding <br/> change-\>Bond007-\>K001 <br/> operate  | Agent: K001 - Total Rating: 29.30 <br/> - \#Undercover -\> 18.85 <br/> - \#BombField -\> 10.45 <br/> Agent: Bond007 - Total Rating: 8.35 <br/> - \#Spying -\> 8.35                                             |

<br/>

### Solution: <a title="04 Agents" href="https://github.com/TsvetanNikolov123/JAVA---Advanced/blob/master/19%20Retake%20Exam/p04_Agents/p04_Agents.java">04 Agents</a>

---