# panache-abstraction-problem
Project to reproduce panache ORM problem regarding abstraction layer

### Describe the bug:
When implementing an abstraction over the PanacheRepositoryBase, I get the error when calling findById method:

```org.hibernate.UnknownEntityTypeException: Unable to locate persister: org.acme.base.AbstractBaseLongEntity ```


### To Reproduce:


1) clone this repo: https://github.com/lssoares/panache-abstraction-problem

2) ./mvn clean package && mvn quarkus:dev
Use swagger to execute the following webservice: http://0.0.0.0:8080/example/1


### Other observations:


1) Executing the other webservice http://0.0.0.0:8080/example is OK:


2) If you edit ExampleRepository.java and swap the lines indicated there, both webservices will work.

