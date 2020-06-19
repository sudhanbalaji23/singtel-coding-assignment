# singtel
SingTel Code Assignment

# Project Title

Singtel Code Assignment

## A. Let’s start with the basics:

### 1. Can you implement the sing() method for the bird? 

a. How did you unit test it?  

Solution: Refer the test class - SingtelAssignmentApplicationTests

b. How did you optimize the code for maintainability? (Ask yourself the same question for all following exercises) 

Solution: Firstly, the animal class is made abstract (Abstract class or interface) and have method signatures. And Bird class will implement the methods


### 2. Now, we have 2 special kinds of birds: the Duck and the Chicken... 
Can you implement them to make their own special sound? 

a. A duck says: “Quack, quack” 

b. A duck can swim 

c. A chicken says: “Cluck, cluck” 

d. A chicken cannot fly (assumption: its wings are clipped but ignore that) 

Solution: Done. Added Chicken & Duck classes as sub-classes of bird and its own method variations.


### 3. Now how would you model a rooster? 

a. A rooster says: “Cock-a-doodle-doo” 

Solution: Done. 

b. How is the rooster related to the chicken? 

Solution: Rooster class extends Chicken class and has its own implementation for the sing() method. 

c. Can you think of other ways to model a rooster without using inheritance? 

Solution: Without inheritance, the RoosterAlternate class is done using Chicken object as an instance variable and initialize using default constructor in the RoosterAlternate class.


### 4. Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.  

a. A parrot living with dogs says: “Woof, woof” 

b. A parrot living with cats says: “Meow” 

c. A parrot living near the rooster says: “Cock-a-doodle-doo” 

d. How do you keep the parrot maintainable? What if we need another parrot lives near a Duck? Or near a phone that rings frequently?

Solution: Introduced an interface Objects (that only sings.. assuming a phone sings) as the parent of all. Added a Parrot class with a parameterized constructor taking objects as parameter. 



## B. Model fish as well as other swimming animals 

### 1. In addition to the birds, can you model a fish? 

a. Fishes don’t sing 

b. Fishes don’t walk 

c. Fishes can swim 

Solution: Added an class Fish which implements Animal and added its specific characteristic methods

### 2. Can you specialize the fish as a Shark and as a Clownfish? 

a. Sharks are large and grey 

b. Clownfish are small and colourful (orange) 

c. Clownfish make jokes d. Sharks eat other fish  

Solution: Shark & ClownFish extending Fish and has its own specific characteristic method implementations

### 3. Dolphins are not exactly fish, yet, they are good swimmers 

a. Can you model a dolphin that swims without inheriting from a fish class? 

b. How do you avoid duplicating code or introducing unneeded overhead? 

Solution: Added an instance variable of Fish and call the fish methods when required. 

## D. Model animals that change their behaviour over time 

### 1. Can you model a butterfly? 

a. A butterfly can fly 

b. A butterfly does not make a sound 

Solution: Done

### 2. Can you optimize your model to account for the metamorphosis from caterpillar to butterfly? 

a. A caterpillar cannot fly 

b. A caterpillar can walk (crawl) 

Solution: Accounted for metamorphosis of caterpillar to butterfly by adding a getter/setter to check isCaterpillar and update its behavior accordingly in the Butterfly class.


## E. Counting animals 

Suppose you have an array of animals, e.g.  
 Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(), new Fish(), new Shark(), new ClownFish(), new Dolphin(new Fish()), new Dog(), new Butterfly(), new Cat() }; 


### 1. Can you share the code to count: (Excluded Frog in my example array)

a. how many of these animals can fly?  - 4 
b. how many of these animals can walk? - 7
c. how many of these animals can sing? - 7
d. how many of these animals can swim? - 5 

Solution: Completed. Refer screenshots of the complete output console 
 