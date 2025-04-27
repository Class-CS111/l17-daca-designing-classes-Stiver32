[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=19259906)
# **Lab 17: DACArecipient Class - Part 2: toString(), equals(), and helper methods**

### Overview:

You will be adding to your `DACArecipient` class so that it implements a `toString()` and `equals()` method (This is standard practice for building a class in Java).

In addition to these methods, you are being supplied with a `printCard` method from Lab 07: DACA + Static methods that prints the data of a `DACArecipient` object in a card format. This method should use the method `jdnToDate` so that all Julian number dates will be displayed in the format MM/DD/YYYY.

**Part 1:**
- Add the `toString()` method to your UML diagram and write the code.
- The purpose of the toString() method is to return a String containing all the values of the instance variables. Below is an example of what toString() might return:

```
Surname: Mendez, Given Name: Javier, USCIS Number: 56-3-445, Country of Origin: El Salvador, Birthday: 2451564, Valid From Date: 3956753, Expiration Date: 3956840, Sex: M
```

**Part 2:**
- Add the `equals()` method to your UML diagram and write the code.
The purpose of this equals() method is to return a boolean representing whether two DACArecipient objects are equivalent __based on the values of their instance variables__.

**Part 3:**
- In the `main` method, create a couple `DACArecipient` objects and test that your `toString()` and `equals()` methods work.

**Part 4:**
- Add the `printCard` and `jdnToDate` methods to your UML diagram according to the code you are provided.
- Edit the `printCard` method so that it uses `jdnToDate` to convert birthday, validFromDate, and expirationDate to the format MM/DD/YYYY.
- Call the `printCard` method on both your DACArecipient objects in main.

