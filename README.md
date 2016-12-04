# reFactor

## Purpose
*reFactor* provides model based refactoring simulations in the Eclipse editor. The tool will extract a model of your Java system, which can then be edited freely. When you type, the tool checks your code for design flaws and adds warning markers in the editor.

##Getting started

###Installation instructions
*reFactor* is an Eclipse plugin. To install it, use the *Install New Software* menu option in Eclipse. Then use the following update site URL to install the plugin: https://raw.githubusercontent.com/ioanaverebi/reFactor/master/reFactor.updatesite/site.xml

![Update site installation](https://github.com/ioanaverebi/reFactor/blob/master/resources/install.png "Update site installation" )


###Usage instructions

1. Prepare a Java that has no compilation errors project.
2. Right click on it in Package Explorer and choose the *Extract reFactor Model* option
3. Give the new project a name
4. A new reFactor project will be generated
5. Edit the new project as you see fit.
6. A marker will appear for each of the elements that are affected by a Design Flaw. These are listed in the Errow View, too.




##Contributing
Released under the MIT license.
