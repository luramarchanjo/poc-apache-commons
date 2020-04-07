# Overview

This is a poc using [Apache Commons Configuration](http://commons.apache.org/proper/commons-configuration/)

# Problem

Something in certain scenarios, such as Serverless, you do not have a full-stack framework that 
address the configuration, and you need to use the vanilla `System.getenv('ENV_NAME)` and cast it in
your code:

```
Double double = Double.valueOf(System.getenv("number"));
Integer integer = Integer.valueOf(System.getenv("number"));
```

# Solution

The Commons Configuration software library provides a generic configuration interface which enables 
a Java application to read configuration data from a variety of sources. Commons Configuration 
provides typed access to single, and multi-valued configuration parameters as demonstrated by the 
following code:

```
Double double = config.getDouble("number");
Integer integer = config.getInteger("number");
```

Configuration parameters may be loaded from the following sources:

* Properties files
* XML documents
* Windows INI files
* Property list files (plist)
* JNDI
* JDBC Datasource
* System properties
* Applet parameters
* Servlet parameters

# Be Happy