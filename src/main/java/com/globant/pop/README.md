- see: https://anupharbade.com/2018/01/15/pop-protocol-oriented-programming-an-introduction/

## Preface

A computer is a complex machine made up of several hardware components. Then there is a software layer which efficiently makes use of these components to perform the desired task. These complex machines, many of the times, talk to each other to share the information or to delegate some tasks. All these tasks, at some point in time, deal with the data. The study of this whole ecosystem is widely known as Computer Science. A field of science where the entire focus is to automate a set of tasks. We keep on evolving and improving the existing ecosystem and expect it to do more for us. Every now and then there are commendable improvements in the hardware components. Subsequently, we evolve our software methodologies to fully utilize these hunky components. We invent Operating systems, Kernels, Compilers and gradually improve them to match up with the hardware. To build these powerful pieces of software,  new programming languages evolve, with more features and more capabilities. Every programming language exists for the set of purposes and supports one or more programming paradigms.

One such paradigm is an Object-Oriented Programming (OOP), introduced in the early 1960s and has been widely used since then. This paradigm demanded us to think everything in terms of the objects. OOP has a tremendous capability of solving real-world problems through its core principles – Abstraction, Encapsulation, Inheritance & Polymorphism. Due to this, many programming languages have topped OOP as a prime paradigm. OOP languages like C++, JAVA, Objective-C etc. have supported the core principles through Classing, Subclassing, Method overloading, Abstracting (protocols) etc.

There are some caveats though –

1.  All of these features are solely available to the objects (reference types). Value types like structs and enums cannot utilize these features and hence they remain nothing much but just a data store.
2.  We lose a big advantage of value types being a thread-safe. Resultantly, we relentlessly focus on to tackle thread safety with objects(references).
3.  Also, most of the OOP languages do not support multiple-inheritance due to the complexity of its nature which causes irrelevant subclassing. For example: Suppose, a _Singer_ and an _Actor_ inherit from their parent, _Artist_, they both get the common functionality implemented by the _Artist_ for free.

![Class Diagram for Artist.png](https://anuph.files.wordpress.com/2018/01/class-diagram-for-artist.png)

But if the requirement says that some singers could be an actor too then the inheritance tree would look something like –

![Class Diagram for Artist - Page 2.png](https://anuph.files.wordpress.com/2018/01/class-diagram-for-artist-page-2.png)

Here, we are making every _Singer_ an _Actor_ too, which forces irrelevant functionality when a _Singer_ is not an _Actor_.

## Expectations

There should be a way for these amazing OOP features to be available for value types too so that we do not have to worry about the cost of tackling the thread safety. Also, if we could bring the multiple-inheritance without much complexity for our types, then we could totally avoid the problem mentioned above.

## Solution – A Protocol-Oriented approach

Time demands a different thinking approach. Thinking beyond OO way. A Protocol-Oriented approach. But first, What is Protocol? A protocol is a set of rules and requirements (methods and properties), which a type(value or reference) needs to fulfill. Consider protocol as an abstract blueprint of its requirements. A type can implement these requirements accordingly and said to _conform_ to a protocol. Additionally, a type can conform to multiple protocols.

Let’s try to solve the above problem through a protocol-oriented approach –

![Protocol Diagram for Artist.png](https://anuph.files.wordpress.com/2018/01/protocol-diagram-for-artist.png)

We declared three protocols, _Artist_, _Actor_ and _Singer_. _Actor_ and _Singer_ inherit from _Artist_ protocol. Each protocol has declared their requirements. For example, a type conforming to _Artist_ protocol needs to define name and age in its implementation. Similarly, a type conforming to _Singer_ protocol needs to provide the implementation for _name_, _age_, _songs_ and _addSong()._

![Protocol Diagram for Artist - Page 2.png](https://anuph.files.wordpress.com/2018/01/protocol-diagram-for-artist-page-2.png)

Next, we defined a class named _OnlySinger_ which conforms to _Singer_ protocol. We defined another class _SingerActor_ which inherits from _OnlySinger_ such that it gets all the implemented functionality of _Singer_ protocol and also made it conform to _Actor_ protocol so that it can implement the required functionality of it.

This is how it looks in Swift –

```
protocol Artist {
        var name: String {get set}
        var age: Int {get set}
    }
    
    protocol Actor: Artist {
        var movies: [String] {get set}
        func addMovie(movie: String)
    }
    
    protocol Singer: Artist {
        var songs: [String] {get set}
        func addSong(song: String)
    }
    
    class OnlySinger: Singer {
        //OnlySinger conforms to Singer protocol
        //Hence it needs to implement its requirements
        var songs: [String] = []
        var name: String = ""
        var age: Int = 0
        
        func addSong(song: String) {
            //Add song to singer's song list
        }
    }
```

This approach looks much cleaner as against to the subclassing approach. We are not leaking any extra functionality. This is a Protocol-Oriented approach where the major things are driven by the protocols. They set the rules and requirements and types need to implement those as per their need.

An advantage with protocols is that they can be extended to provide a default implementation of its requirements. For example, if some requirements of the protocol have common implementation across all of its conforming types, those requirements can be implemented by the protocol itself. All the conforming types get the default implementation for free and they do not need to implement it again.

A protocol is a language construct available in Swift and Objective-C programming language. Not all the features of it are available in Objective-C though. Though Swift supports OOP and Functional programming paradigms, it is a Protocol-Oriented language at its heart. Most of the value types in Swift like Array, Dictionary, String etc are based on protocols and built upon this paradigm.