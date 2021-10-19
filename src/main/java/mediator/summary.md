# Mediator in Java

Mediator is a behavioral design pattern that reduces coupling between components of a program by making them communicate indirectly, through a special mediator object.


## Usage of the pattern in Java

Usage examples: The most popular usage of the Mediator pattern in Java code is facilitating communications between GUI components of an app. The synonym of the Mediator is the Controller part of MVC pattern.

Here are some examples of the pattern in core Java libraries:

- java.util.Timer (all scheduleXXX() methods)
- java.util.concurrent.Executor#execute()
- java.util.concurrent.ExecutorService (invokeXXX() and submit() methods)
- java.util.concurrent.ScheduledExecutorService (all scheduleXXX() methods)
- java.lang.reflect.Method#invoke()