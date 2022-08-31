# Reproducer for missing invocation of EventingService.errorDataFetch

For synchronous graphql operations exceptions thrown does not result in invocations of `EventingService.errorDataFetch`.
Changing to `Uni<T>` gives the expected behaviour.

* Start with `mvn quarkus:dev`
* Open http://localhost:8080/q/graphql-ui/
  * Run 
      ```text
      query a {
         strings
      }
      ```
    A message like 
    ```text
    errorDataFetch 8854049483 Oh no!!!
    ```
    should be printed in terminal.
  * Running 
    ```text
      query a {
         morestrings
      }
      ```
    Prints the expected message.