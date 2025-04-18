[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=19237771)
# unit-7-1-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main.java
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

Write a Java program that allows a user to input multiple words.  Your program should stop accepting words when the user enters "STOP".  Store the words in an `ArrayList`.  The word STOP should not be stored in the list.

Next, print the size of the list, followed by the list itself.

Then, replace the last index with the first one and remove the value from the first index, but only if the list has a length greater than two.  Finally, reprint the list.

Sample Run:
```
Please enter words, enter STOP to stop the loop.
phone
computer
laptop
television
newspaper
STOP

5
[phone, computer, laptop, television, newspaper]
[computer, laptop, television, phone]
```

Hint: use a while loop to take the user input - remember that this type of loop runs until the condition you specify is no longer met so you can base this off the user input.
