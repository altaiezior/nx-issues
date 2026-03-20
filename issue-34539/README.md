## Issue 34539

https://github.com/nrwl/nx/issues/34539
https://github.com/nrwl/nx/issues/34478
https://github.com/nrwl/nx/issues/34038

### Issues

1. **maven.config is not parsed by maven 3 using nx**
   The property `--color=never` is set in `.mvn/maven.config`, but the output still uses colors. While `mvn clean`
   respects this property when run directly.

2. Nx does not seem to pass it to the batch executor even when running `nx run-many -t clean -- --color=never`.

3. **Internal logs are leaking**
   Internal logs are leaking when using the `clean` command.

   ```text
   > nx run org.example:issue-34539:clean --color=never

    NX_RESULT:{"task":"org.example:lib-2:clean","result":{"success":true,"terminalOutput":"[Thread-0] \u001b[1;34mINFO\u001b[m org.apache.maven.cli.event.ExecutionEventLogger - \n[Thread-0] \u001b[1;34mINFO\u001b[m org.apache.maven.cli.event.ExecutionEventLogger - \u001b[1m-------------------------\u003c \u001b[0;36morg.example:lib-2\u001b[0;1m \u003e--------------------------\u001b[m\n[Thread-0] \u001b[1;34mINFO\u001b[m org.apache.maven.cli.event.ExecutionEventLogger - \u001b[1mBuilding lib-2 1.0.0-SNAPSHOT\u001b[m\n[Thread-0] \u001b[1;34mINFO\u001b[m org.apache.maven.cli.event.ExecutionEventLogger -   from pom.xml\n[Thread-0] \u001b[1;34mINFO\u001b[m org.apache.maven.cli.event.ExecutionEventLogger - \u001b[1m--------------------------------[ jar ]---------------------------------\u001b[m\n[Thread-0] \u001b[1;34mINFO\u001b[m org.apache.maven.cli.event.ExecutionEventLogger - \n[Thread-0] \u001b[1;34mINFO\u001b[m org.apache.maven.cli.event.ExecutionEventLogger - \u001b[1m--- \u001b[0;32mclean:3.5.0:clean\u001b[m \u001b[1m(default-clean)\u001b[m @ \u001b[36mlib-2\u001b[0;1m ---\u001b[m\n","startTime":1774042567382,"endTime":1774042567518}}
    [Thread-1] INFO org.apache.maven.cli.event.ExecutionEventLogger -
    [Thread-1] INFO org.apache.maven.cli.event.ExecutionEventLogger - ----------------------< org.example:issue-34539 >-----------------------
    [Thread-1] INFO org.apache.maven.cli.event.ExecutionEventLogger - Building issue-34539 1.0.0-SNAPSHOT
    [Thread-1] INFO org.apache.maven.cli.event.ExecutionEventLogger -   from pom.xml
    [Thread-1] INFO org.apache.maven.cli.event.ExecutionEventLogger - --------------------------------[ pom ]---------------------------------
    [Thread-1] INFO org.apache.maven.cli.event.ExecutionEventLogger -
    [Thread-1] INFO org.apache.maven.cli.event.ExecutionEventLogger - --- clean:3.5.0:clean (default-clean) @ issue-34539 ---
    [INFO] Deleting /Users/anurag.ag/OSS/nx-issues/issue-34539/target
    [INFO] Nx Maven Summary
    [INFO]   Succeeded: 2
    [INFO]   Failed:    0
    [INFO]   Skipped:   0
    [INFO]   Total:     2
    [INFO]   Duration:  803ms
   ```

### Run

```
mise reset
```
