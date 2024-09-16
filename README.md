# LinkedQueue and Ticket Counter Simulation
This simulation program is modifed from the example in chapter 5 of "Jave Software Structure 4th Edition".

## Step 1: Implement LinkedQueue
Finish implementing the "stubbed in" methods in the `LinkedQueue` class. Study the test cases provided in the `main` method of `LinkedQueue` and use them to test your implementation. Because `LinkedQueue` is defined in a package you need to compile and run the class from the project root directory as follows:
```
javac jsjf/LinkedQueue.java
javac LinkedQueueTester.java
java LinkedQueueTester  
```

## Step 2: Ticket Counter Simulation
This simulation uses your `LinkedQueue` class to study how the number of cashiers affect the average wait time of the customers.

Consider the situation in which you are waiting in line to purchase tickets at a movie theater. In general, the more cashiers there are, the faster the line moves. The theater manager wants to keep the customers happy, but he/she doesn't want to employ any more cashiers than necessary. Suppose the manager wants to keep the total time needed by a customer to less than seven minutes. Being able to simulate the effect of adding more cashiers during peak business hours enables the manager to plan more effectively. A queue is the perfect collection for representing a waiting line:

Our simulated ticket counter will use the following assumptions:
* There is only one line and it is first come, first served (a queue).
* Customers arrive on average every 15 seconds.
* If there is a cashier available, processing begins immediately upon arrival.
* Processing a customer request takes on average two minutes (120 seconds) from the time the customer reaches a cashier.

Our `Customer` class keeps track of the time the customer arrives and the time the customer departs after purchasing a ticket. The total time spent by the customer is therefore the departure time minus the arrival time. To keep things simple, our simulation will measure time in elapsed seconds, so a time value can be stored as a single integer. Our simulation will begin at time 0.

Our simulation will create a queue of customers and then see how long it takes to process those customers if there is only one cashier. Then we will process the same queue of customers with two cashiers. Then we will do it again with three cashiers. We continue this process for up to then cashiers. At the end we compare the average times that it takes to process a customer.

In the `main` method of the `TicketCounter` class, the outer loop determines how many cashiers are used in each pass of the simulation. For each pass, the customers are taken from the queue in turn and processed by a cashier. The total elapsed time is tracked, and at the end each pass the average time is computed. The results of the simulation are printed to the console for analysis.

You should be able to compile and run the simulation as follows:
```
javac TicketCounter.java
java TicketCounter
```

Please create a `result.txt` with your test results from `LinkedQueueTester` and the result from your simulation runs. Additionally, write a single-paragraph analysis of the result to reason why the result makes sense.
