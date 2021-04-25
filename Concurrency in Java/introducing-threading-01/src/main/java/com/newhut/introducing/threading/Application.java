package com.newhut.introducing.threading;

/**
 *
 * @author Ummu Hanisah
 * @since Apr 25, 2021 | 3:48:02 PM
 *
 * @title 44. Lecture 35: Introducing Threading
 * @source Udemy - The Complete Java Certification Course
 */
/* Note #1 
**********
    Example
    1. Opening Google chrome browser while running music player - many process running at the same time
    2. Opening many tab in a browser - child processes can be refer as a thread.

    Example thread in a Java application (2 or more run of code can run at the same time)
    i. 1 thread that downloading a file from Internet
    ii. 1 thread performing statistical operation at that data
    iii. 1 thread loading data from database
    
    Thread
    - multiple line of code that run simultaneously
 */
public class Application {

    public static void main(String[] args) { // main method start a thread!
        
        Task1 taskRunner = new Task1();
        taskRunner.start(); // call this method to invoke method in Task class
        
        System.out.println("Hello there...");
    }
}

/* Note #2
**********
Thread
- is a class.
- Thread implements Runnable.

Runnable
- is an interface.
- it has 1 abstract method -> run()
 */
class Task1 extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Number: " + i);
            }
        } catch (Exception ex) {

        }
    }
}
