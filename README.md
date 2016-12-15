# reFactor

## Purpose
*reFactor* provides model based refactoring simulations in the Eclipse editor. The tool will extract a model of your Java system, which can then be edited freely. When you type, the tool checks your code for design flaws and adds warning markers in the editor.

##Getting started

###Installation instructions
*reFactor* is an Eclipse plugin. To install it, use the *Install New Software* menu option in Eclipse. Then use the following update site URL to install the plugin: https://raw.githubusercontent.com/ioanaverebi/reFactor/master/reFactor.updatesite/site.xml

![Update site installation](https://github.com/ioanaverebi/reFactor/blob/master/resources/install.png "Update site installation" )


###Usage Instructions

1. Prepare a Java that has no compilation errors project.
2. Right click on it in Package Explorer and choose the *Extract reFactor Model* option
3. Give the new project a name
4. A new reFactor project will be generated
5. Edit the new project as you see fit.
6. A marker will appear for each of the elements that are affected by a Design Flaw. These are listed in the Errow View, too.

![Design flaws](https://github.com/ioanaverebi/reFactor/blob/master/resources/design_flaws.png "Design flaw markers" )

###reFactor Language
The language supports classes, methods and fields. It adheres to the off-side rule (meaning it uses spaces as indentation for blocks, as Python or Coffeescript).

####File structure
A file is composed of classes, which in turn consist of methods and fields. For each method you can specify the lines of code, the complexity, the accessed attributes and the called methods. An example file has the following structure:

```
public class Booking
    private customer: Customer
    private accomodation: Accomodation
    private dates

    private computePrice(): String
        8 lines of code
        3 cyclo
        2 accesses to dates
        1 call to Accomodation.getPrice()

    private sendReminder(Customer)
        10 lines of code
        2 cyclo
        1 access to dates
        1 call to Customer.sendEmail()

    private updateDetails(Customer): Customer
        14 lines of code
        3 cyclo
        3 access to Customer.creditCard
        1 access to Customer.name
        1 access to Customer.address
        1 access to Customer.email
```
Internal accesses/calls are not prefixed with the name of the class, while external ones are. The return type of each method is optional, as is the type of a field.

####Auto complete
Use the Eclipse auto complete features when editing a model.
![Auto Complete](https://github.com/ioanaverebi/reFactor/blob/master/resources/auto_complete.png "Auto Complete" )



##Contributing
Released under the MIT license.
