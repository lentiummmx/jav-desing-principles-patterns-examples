- see: https://www.baeldung.com/solid-principles

## **1\. Introduction**[](https://www.baeldung.com/solid-principles#intro)

In this tutorial, we'll be discussing **the SOLID principles of Object-Oriented Design.**

First, we'll start by **exploring the reasons they came about and why we should consider them** when designing software. Then, we'll outline each principle alongside some example code to emphasize the point.

## **2\. The Reason for SOLID Principles**[](https://www.baeldung.com/solid-principles#why)

The SOLID principles were first conceptualized by Robert C. Martin in his 2000 paper, _[Design Principles and Design Patterns](https://fi.ort.edu.uy/innovaportal/file/2032/1/design_principles.pdf)._ These concepts were later built upon by Michael Feathers, who introduced us to the SOLID acronym. And in the last 20 years, these 5 principles have revolutionized the world of object-oriented programming, changing the way that we write software.

So, what is SOLID and how does it help us write better code? Simply put, Martin's and Feathers' **design principles encourage us to create more maintainable, understandable, and flexible software**. Consequently, **as our applications grow in size, we can reduce their complexity** and save ourselves a lot of headaches further down the road!

The following 5 concepts make up our SOLID principles:

1.  **S**ingle Responsibility
2.  **O**pen/Closed
3.  **L**iskov Substitution
4.  **I**nterface Segregation
5.  **D**ependency Inversion

While some of these words may sound daunting, they can be easily understood with some simple code examples. In the following sections, we'll take a deep dive into what each of these principles means, along with a quick Java example to illustrate each one.

## **3\. Single Responsibility**[](https://www.baeldung.com/solid-principles#s)

Let's kick things off with the single responsibility principle. As we might expect, this principle states that **a class should only have one responsibility. Furthermore, it should only have one reason to change.**

**How does this principle help us to build better software?** Let's see a few of its benefits:

1.  **Testing** – A class with one responsibility will have far fewer test cases
2.  **Lower coupling** – Less functionality in a single class will have fewer dependencies
3.  **Organization** – Smaller, well-organized classes are easier to search than monolithic ones

Take, for example, a class to represent a simple book:

```
public class Book {

    private String name;
    private String author;
    private String text;

    
}
```

In this code, we store the name, author, and text associated with an instance of a _Book_.

Let's now add a couple of methods to query the text:

```
public class Book {

    private String name;
    private String author;
    private String text;

    

    
    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }
}
```

Now, our _Book_ class works well, and we can store as many books as we like in our application. But, what good is storing the information if we can't output the text to our console and read it?

Let's throw caution to the wind and add a print method:

```
public class Book {
    

    void printTextToConsole(){
        
    }
}
```

This code does, however, violate the single responsibility principle we outlined earlier. To fix our mess, we should implement a separate class that is concerned only with printing our texts:

```
public class BookPrinter {

    
    void printTextToConsole(String text){
        
    }

    void printTextToAnotherMedium(String text){
        
    }
}
```

Awesome. Not only have we developed a class that relieves the _Book_ of its printing duties, but we can also leverage our _BookPrinter_ class to send our text to other media.

Whether it's email, logging, or anything else, we have a separate class dedicated to this one concern.

## **4\. Open for Extension, Closed for Modification**[](https://www.baeldung.com/solid-principles#o)

Now, time for the ‘O' – more formally known as the **open-closed principle**. Simply put, **classes should be open for extension, but closed for modification.** **In doing so, we** **stop ourselves from modifying existing code and causing potential new bugs** in an otherwise happy application.

Of course, the **one exception to the rule is when fixing bugs in existing code.**

Let's explore the concept further with a quick code example. As part of a new project, imagine we've implemented a _Guitar_ class.

It's fully fledged and even has a volume knob:

```
public class Guitar {

    private String make;
    private String model;
    private int volume;

    
}
```

We launch the application, and everyone loves it. However, after a few months, we decide the _Guitar_ is a little bit boring and could do with an awesome flame pattern to make it look a bit more ‘rock and roll'.

At this point, it might be tempting to just open up the _Guitar_ class and add a flame pattern – but who knows what errors that might throw up in our application.

Instead, let's **stick to the open-closed principle and simply extend our _Guitar_ class**:

```
public class SuperCoolGuitarWithFlames extends Guitar {

    private String flameColor;

    
}
```

By extending the _Guitar_ class we can be sure that our existing application won't be affected.

## **5\. Liskov Substitution**[](https://www.baeldung.com/solid-principles#l)

Next up on our list is [Liskov substitution](https://www.baeldung.com/cs/liskov-substitution-principle), which is arguably the most complex of the 5 principles. Simply put, **if class _A_ is a subtype of class _B_, then we should be able to replace _B_ with _A_ without disrupting the behavior of our program.**

Let's just jump straight to the code to help wrap our heads around this concept:

```
public interface Car {

    void turnOnEngine();
    void accelerate();
}
```

Above, we define a simple _Car_ interface with a couple of methods that all cars should be able to fulfill – turning on the engine, and accelerating forward.

Let's implement our interface and provide some code for the methods:

```
public class MotorCar implements Car {

    private Engine engine;

    

    public void turnOnEngine() {
        
        engine.on();
    }

    public void accelerate() {
        
        engine.powerOn(1000);
    }
}
```

As our code describes, we have an engine that we can turn on, and we can increase the power. But wait, its 2019, and Elon Musk has been a busy man.

We are now living in the era of electric cars:

```
public class ElectricCar implements Car {

    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");
    }

    public void accelerate() {
        
    }
}
```

By throwing a car without an engine into the mix, we are inherently changing the behavior of our program. This is **a blatant violation of Liskov substitution and is a bit harder to fix than our previous 2 principles**.

One possible solution would be to rework our model into interfaces that take into account the engine-less state of our _Car_.

## **6\. Interface Segregation**[](https://www.baeldung.com/solid-principles#i)

The ‘I ‘ in SOLID stands for interface segregation, and it simply means that **larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.**

For this example, we're going to try our hands as zookeepers. And more specifically, we'll be working in the bear enclosure.

Let's start with an interface that outlines our roles as a bear keeper:

```
public interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
}
```

As avid zookeepers, we're more than happy to wash and feed our beloved bears. However, we're all too aware of the dangers of petting them. Unfortunately, our interface is rather large, and we have no choice than to implement the code to pet the bear.

Let's **fix this by splitting our large interface into 3 separate ones:**

```
public interface BearCleaner {
    void washTheBear();
}

public interface BearFeeder {
    void feedTheBear();
}

public interface BearPetter {
    void petTheBear();
}
```

Now, thanks to interface segregation, we're free to implement only the methods that matter to us:

```
public class BearCarer implements BearCleaner, BearFeeder {

    public void washTheBear() {
        
    }

    public void feedTheBear() {
        
    }
}
```

And finally, we can leave the dangerous stuff to the crazy people:

```
public class CrazyPerson implements BearPetter {

    public void petTheBear() {
        
    }
}
```

Going further, we could even split our _[BookPrinter](https://www.baeldung.com/solid-principles#s)_ class from our example earlier to use interface segregation in the same way. By implementing a _Printer_ interface with a single _print_ method, we could instantiate separate _ConsoleBookPrinter_ and _OtherMediaBookPrinter_ classes.

## **7\. Dependency Inversion**[](https://www.baeldung.com/solid-principles#d)

**The principle of Dependency Inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.**

To demonstrate this, let's go old-school and bring to life a Windows 98 computer with code:

```
public class Windows98Machine {}
```

But what good is a computer without a monitor and keyboard? Let's add one of each to our constructor so that every _Windows98Computer_ we instantiate comes pre-packed with a _Monitor_ and a _StandardKeyboard_:

```
public class Windows98Machine {

    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
    }

}
```

This code will work, and we'll be able to use the _StandardKeyboard_ and _Monitor_ freely within our _Windows98Computer_ class. Problem solved? Not quite. **By declaring the _StandardKeyboard_ and _Monitor_ with the _new_ keyword, we've tightly coupled these 3 classes together.**

Not only does this make our _Windows98Computer_ hard to test, but we've also lost the ability to switch out our _StandardKeyboard_ class with a different one should the need arise. And we're stuck with our _Monitor_ class, too.

Let's decouple our machine from the _StandardKeyboard_ by adding a more general _Keyboard_ interface and using this in our class:

```
public interface Keyboard { }
```

```
public class Windows98Machine{

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
```

Here, we're using the dependency injection pattern here to facilitate adding the _Keyboard_ dependency into the _Windows98Machine_ class.

Let's also modify our _StandardKeyboard_ class to implement the _Keyboard_ interface so that it's suitable for injecting into the _Windows98Machine_ class:

```
public class StandardKeyboard implements Keyboard { }
```

Now our classes are decoupled and communicate through the _Keyboard_ abstraction. If we want, we can easily switch out the type of keyboard in our machine with a different implementation of the interface. We can follow the same principle for the _Monitor_ class.

Excellent! We've decoupled the dependencies and are free to test our _Windows98Machine_ with whichever testing framework we choose.

## **8\. Conclusion**[](https://www.baeldung.com/solid-principles#conclusion)

In this tutorial, we've taken a **deep dive into the SOLID principles of object-oriented design.**

We **started with a quick bit of SOLID history and the reasons these principles exist.**

Letter by letter, we've **broken down the meaning of each principle with a quick code example that violates it. We then saw how to fix our code** and make it adhere to the SOLID principles.

As always, the code is available over on [GitHub](https://github.com/eugenp/tutorials/tree/master/patterns/solid).