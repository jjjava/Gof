Hudson Schumaker - 2014

Design Patterns - Gof, No Gof and Concurrency Patterns

This code will be a part of Book.

Hudson Schumaker - Desgin Pattners Quick Reference Guide 2014

-Intro
	Type of pattners
		-Creational 
		-Structural
		-Behavioral
	Gof
		[]Creational
			-Singleton
			-AbstractFactoy
		[]Structural
			-Flyweight
		[]Behavioral
			-Command
			-Memento
			-Visitor
			-Observer
		
	No Gof
		[]Creational
			-Multion
			-Object Pool
		[]Structural
		[]Behavioral
			-Null Object
		
	Concurrency patterns
		-Active Object
	
-Chapter I
	[]Singleton
	-Description
	{}Purpose: Allow the creation of a single instance of a class and provide a way to retrieve it.	
	
-Chapter II 
	[]AbstractFactory
	-Description
	{}Purpose: Encapsulating the choice of concrete classes to be used in the creation of objects from different families.

-Chapter III
	[]Memento
	-Description
	{}Purpose: Provides the ability to restore an object to its previous state (undo via rollback).
	
-Chapter IV
	[]Visitor
	-Description
	{}Purpose: Allow specific updates on a collection of objects according to the particular type of each updated object.

-Chapter V
	[]Observer
	-Description
	{}Purpose: Defines a one-to-many dependency between objects so that when one object changes state, 
	all of its dependents are notified and updated automatically.
	
-Chapter VI
	[]Command
	-Description
	{}Purpose: To control the calls to a particular component, modeling each request as an object. Allow operations can be undone, 
	queued or registered.
	
-Chapater VII
	[]Flyweight
	-Description
	{}Purpose: Share efficiently, objects that are used in large quantities.

-Chapter VIII
	[]Multion
	-Description
	{}Purpose: Allow the creation of a limited amount of instances of a particular class and provide a way to retrieve them.
	
-Chapter IX
	[]Object Pool
	-Description
	{}Purpose: To allow the reuse of objects.

-Chapter X
	[]Null Object
	-Description
	{}Purpose: Avoid null references by providing a default object.

-Chapter XI
	[]Active Object
	-Description
	{}Purpose: The active object design pattern decouples method execution from method invocation for objects that each reside 
	in their own thread of control. The goal is to introduce concurrency, by using asynchronous method invocation
	and a scheduler for handling requests.
	
-Chapter XII
	[]Using Singleton and Memento
	-Description
	{}Purpose: Create a simple text processor using Sigleton and Menento parttners.

-Chapter XIII
	[]Using Singleton, Memento and Flyweight
	-Description
	{}Purpose: Create a simple presentation application using Sigleton and Menento parttners.
	
-Chapter XIV
	[]Using Observer and Visitor 
	
-Bibliografy
http://en.wikipedia.org/wiki/Concurrency_pattern
http://en.wikipedia.org/wiki/Design_Patterns
http://en.wikipedia.org/wiki/Behavioral_pattern
http://en.wikipedia.org/wiki/Creational_pattern
http://en.wikipedia.org/wiki/Structural_pattern
