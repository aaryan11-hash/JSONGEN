# JSONGEN
# Prerequisites and Installation steps

It is recommended that you download Apache maven on your local system when trying to run the openEHR SDK projects as all the projects are built upon maven systems.
Once downloaded, 

1) Apache maven's new folder will look something like this.Copy the path to the bin folder from here.

![](https://chitthi-storage.s3.ap-south-1.amazonaws.com/1.png)

Now for you to be able to access its CLI functionality, we need to assign it to the environment path of your local machine,follow these steps to achieve the same.

2)If you are on Windows OS, search for “environment variables”,it should recommend something like this :

![](https://chitthi-storage.s3.ap-south-1.amazonaws.com/2.png)

3)Once selected select environment variables on the bottom right of the window.

![](https://chitthi-storage.s3.ap-south-1.amazonaws.com/3.png)

4)Now in the system variables tray, search for a row with the haeding of ‘path’ and then double click it.


![](https://chitthi-storage.s3.ap-south-1.amazonaws.com/4.png)

5)Then click on the new button and then add the path destination of the bin folder that we copied previously from and then save.

![](https://chitthi-storage.s3.ap-south-1.amazonaws.com/5.png)

# Building the Generator project

Once we have completed configuring maven on our local system, now we can start building the generator project on our local machine.
Follow the following steps:

1)Enter inside the relative path directory of the generator project.

2)then run the cmd : **mvn clean package compile install** 
 
The mvn is a cli directive to indicate that maven binaries are to be used for this operation and the clean, package, compile and install are maven lifecycle goals to compile, build and run the project.

Once the build is complete the project structure will look something like this : 

![](https://chitthi-storage.s3.ap-south-1.amazonaws.com/6.png)

You can use any IDE of your choice to open and work with your maven project(Eclipse, Intellij, VSCODE).Once the project is ready, we used its generator classes and object instances to feed it with the covid 19 template opt file and also specified the path in which it had to generate those java POJOS(plain old java objects).In our case, it had to be a spring boot project(maven project) and hence we created one and executed the same.
(Please follow the steps mentioned on the official github repo site of openEHR_SDK to use the entity class generation feature from the generator project, link : ehrbase/openEHR_SDK (github.com).

Once the generator maven project is executed/run, it implements the entity generator function and we receive and automated java file system on our target path of the spring boot project which looks something like this:

![](https://chitthi-storage.s3.ap-south-1.amazonaws.com/7.png)

On doing so, now our covid19 assessment template, which was written in XML format has now been converted in a Java based entity/pojo system.

From this point, now we created our own server using REST implementation to get the JSON data format desired for the purpose.To convert the same spring boot project into  binary executable, run the following command inside the project structure : **mvn install**.

Upon doing so, apache maven will compile your given project into a binary executable and then save it as .jar file in the following path :- (**your_project_base_path/target**)

![](https://chitthi-storage.s3.ap-south-1.amazonaws.com/8.png)

Now whenever you want to run your spring boot app, you can simply carry this .jar file and run the cmd : 
**java -jar fileName.jar** on any device that has a valid JDK installed (version 11 and higher).

![](https://chitthi-storage.s3.ap-south-1.amazonaws.com/9.png)








