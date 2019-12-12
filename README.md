# panache-abstraction-problem
Project to reproduce panache ORM problem regarding abstraction layer

###Describe the bug:
When implementing an abstraction over the PanacheRepositoryBase, that:
 
 1) Works around the bug https://github.com/quarkusio/quarkus/issues/5885  (see explanation on ExampleRepository class)
 2) Override the List<T> listAll() method on the extended abstract repository class

 !Any class annotated with @QuarkusTest will fail on initializing tests!


###To Reproduce:


1) clone this repo: https://github.com/lssoares/panache-abstraction-problem

2) ./mvn clean install 
You will see the empty test failing with:
```
org.junit.jupiter.api.extension.TestInstantiationException: TestInstanceFactory [io.quarkus.test.junit.QuarkusTestExtension] failed to instantiate test class [org.acme.base.ExampleTest]
Caused by: java.lang.ExceptionInInitializerError
Caused by: java.lang.RuntimeException: Failed to start quarkus
Caused by: java.lang.RuntimeException: Failed to initialize Arc
Caused by: java.lang.ClassFormatError: Duplicate method name "listAll" with signature "()Ljava.util.List;" in class file org/acme/base/AbstractBaseLongRepository 
```

3) ./mvn clean -DskipTests=true package && mvn quarkus:dev
Use swagger to execute the following webservice: http://0.0.0.0:8080/example/  and  http://0.0.0.0:8080/example/empty

You'll see that although both endpoints should return an empty collection, due to the @Override method not being picked on the abstract class, a non empty list is returned. 


