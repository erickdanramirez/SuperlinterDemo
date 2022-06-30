# SuperlinterDemo

Status check 
[![GitHub Super-Linter](https://github.com/erickdanramirez/SuperlinterDemo/workflows/bvt.yml/badge.svg)](https://github.com/erickdanramirez/SuperlinterDemo/actions/workflows/bvt.yml)

##Super-Linter Configuration Demo

Let’s see how to configure this in our GitHub workflows, as an example we will be using a web api developed in Java that will greet us, it is not something complex, but it will help us clarify and explain the configuration process and how to use this. 
The repository is available for you at the following URL: erickdanramirez/SuperlinterDemo (github.com)

You can visualize in the GitHub marketplace how to integrate it in a simple way, it is always good to read the documentation, to understand the considerations of configuration, use and squeeze the most out of the functionalities it offers us.
 
You can access the complete documentation from the description of the action, I also share the Documentation URL if you want to know more about the properties you can use (github/super-linter: Combination of multiple linters to install as a GitHub Action). 
 
Having said this we need to configure the most important thing that are the rules that we are going to make effective within the execution of the action. By default, it detects the programming language that you are using in the code and apply all the standards defined in the linters, but we know that they would not necessarily apply all for our applications, so it is necessary to have a mechanism to customize which ones are going to apply. 
There is a repository with many template files that we can use as a basis to define the rules that will apply to our code (In the following URL you can see and choose the one that best suits you according to the programming language you use super-linter code / TEMPLATES at main · github / super-linter).   For this case our API is developed in java and we will use sun_checks.xml (super-linter/sun_checks.xml at main · github/super-linter). It is important that we store this file in the ".github/linters" folder.
 
It is important to mention if we have solutions with different languages, we can have more than one file in this directory. 
We will proceed to the configuration of the action within a workflow that works as a build verification test (it is not limiting we put it in another type of workflow depending on our development process and the needs of the team); in this example we are not going to complicate ourselves and we will only compile the API and at the end we will add the super-linter action. 
 
It is important to explain the variables that we select and what effect they will have on the execution of the revision (Attached link to documentation so that you have reference of additional functionalities github/super-linter: Combination of multiple linters to install as a GitHub Action): 
•	FILTER_REGEX_INCLUDE:  It allows you to reduce the scope of review of the action to what is in a directory or files with a specific termination.
1.	VALIDATE_ALL_CODEBASE: When you put "false" you will only review new files or files that contain changes. 
•	DEFAULT_BRANCH: Define which is the default branch to review.
•	GITHUB_TOKEN: Allows access to the code of the repo in question.
We lack a configuration step to make the satisfactory execution of our action within the workflow, part of the policies to integrate new changes to the branches that we have protected on GitHub, for this we need to add a branch protection rule in the configuration section of the branches.
We specified the rules that will apply and at the end we activated the rule "Require status checks to pass before merging" and "Require branches to be up to date before merging" we added the status check of Linted: JAVA (there are other linters for Java, it is possible to add them too), we save our changes.
There are other capabilities that allow you to integrate this linter in Visual Studio code (Attached reference github/super-linter: Combination of multiple linters to install as a GitHub Action), however with this we finish the configuration of super-linter, now we will proceed to see how the interaction would be once it runs. 
Day-to-day interaction with the tool

Greetings and enjoy being in the cloud era! 
