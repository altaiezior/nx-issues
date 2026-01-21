## Issue 34181

https://github.com/nrwl/nx/issues/34181

### Run

```
nx run-many -t install --batch --outputStyle=static --disableNxCache
```

### Result

```text
[INFO] 🚀 Starting Nx Maven batch execution (22 tasks)
[WARNING] 📦 Maven 3.x detected (3.9.12.) - using ProcessBasedMavenExecutor
[INFO] Detecting Maven command for workspace: /Users/anurag.ag/OSS/nx-issues/issue-34181
[INFO] Found mvnd (Maven Daemon)
[INFO] Maven command detection completed: 'mvnd' in 279ms
[INFO] Executing in /Users/anurag.ag/OSS/nx-issues/issue-34181: mvnd dev.nx.maven:nx-maven-plugin:apply resources:resources@default-resources flatten:flatten@flatten dev.nx.maven:nx-maven-plugin:record -pl org.example:issue-34181
Jan 22, 2026 2:58:18 AM org.jline.utils.Log logr
WARNING: Unable to create a system terminal, creating a dumb terminal (enable debug logging for more information)
[main] WARNING org.jline - Unable to create a system terminal, creating a dumb terminal (enable debug logging for more information)
[INFO] Processing build on daemon bfc6743c
[INFO] Scanning for projects...
[INFO] BuildTimeEventSpy is registered.
[INFO] 
[INFO] Using the SmartBuilder implementation with a thread count of 9
[INFO] 
[INFO] ----------------------< org.example:issue-34181 >-----------------------
[INFO] Building issue-34181 1.0.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- nx:0.0.12:apply (default-cli) @ issue-34181 ---
[INFO] Applying build state to 1 projects...
[INFO] Build state application completed (took 1ms)
[INFO] 
[INFO] --- resources:3.4.0:resources (default-resources) @ issue-34181 ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34181/src/main/resources
[INFO] 
[INFO] --- flatten:1.7.3:flatten (flatten) @ issue-34181 ---
[INFO] Generating flattened POM of project org.example:issue-34181:jar:1.0.0-SNAPSHOT...
[INFO] 
[INFO] --- nx:0.0.12:record (default-cli) @ issue-34181 ---
[INFO] Recording build state for project: issue-34181
[INFO] Captured non-default pomFile: target/.flattened-pom.xml (modified by a plugin like flatten-maven-plugin)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.012 s (Wall Clock)
[INFO] Finished at: 2026-01-22T02:58:18+05:30
[INFO] ------------------------------------------------------------------------
```

At first, you will see `Captured non-default pomFile: target/.flattened-pom.xml`

```text
[INFO] Maven execution completed in 210ms with exit code: 0
[INFO] Executing in /Users/anurag.ag/OSS/nx-issues/issue-34181: mvnd dev.nx.maven:nx-maven-plugin:apply compiler:compile@default-compile dev.nx.maven:nx-maven-plugin:record -pl org.example:issue-34181
Jan 22, 2026 2:58:18 AM org.jline.utils.Log logr
WARNING: Unable to create a system terminal, creating a dumb terminal (enable debug logging for more information)
[main] WARNING org.jline - Unable to create a system terminal, creating a dumb terminal (enable debug logging for more information)
[INFO] Processing build on daemon bfc6743c
[INFO] Scanning for projects...
[INFO] BuildTimeEventSpy is registered.
[INFO] 
[INFO] Using the SmartBuilder implementation with a thread count of 9
[INFO] 
[INFO] ----------------------< org.example:issue-34181 >-----------------------
[INFO] Building issue-34181 1.0.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- nx:0.0.12:apply (default-cli) @ issue-34181 ---
[INFO] Applying build state to 1 projects...
[INFO] Applying modified pomFile: /Users/anurag.ag/OSS/nx-issues/issue-34181/target/.flattened-pom.xml
[INFO] Build state application completed (took 1ms)
[INFO] 
[INFO] --- compiler:3.14.1:compile (default-compile) @ issue-34181 ---
[INFO] No sources to compile
[INFO] 
[INFO] --- nx:0.0.12:record (default-cli) @ issue-34181 ---
[INFO] Recording build state for project: issue-34181
[INFO] Captured non-default pomFile: .flattened-pom.xml (modified by a plugin like flatten-maven-plugin)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.007 s (Wall Clock)
[INFO] Finished at: 2026-01-22T02:58:18+05:30
[INFO] ------------------------------------------------------------------------
```

Next time, even the correct pom file is applied, but also incorrect pom file is being recorded `.flattened-pom.xml`.

```text
[INFO] Maven execution completed in 202ms with exit code: 0
[INFO] Executing in /Users/anurag.ag/OSS/nx-issues/issue-34181: mvnd dev.nx.maven:nx-maven-plugin:apply resources:testResources@default-testResources dev.nx.maven:nx-maven-plugin:record -pl org.example:issue-34181
Jan 22, 2026 2:58:18 AM org.jline.utils.Log logr
WARNING: Unable to create a system terminal, creating a dumb terminal (enable debug logging for more information)
[main] WARNING org.jline - Unable to create a system terminal, creating a dumb terminal (enable debug logging for more information)
[INFO] Processing build on daemon bfc6743c
[INFO] Scanning for projects...
[INFO] BuildTimeEventSpy is registered.
[INFO] 
[INFO] Using the SmartBuilder implementation with a thread count of 9
[INFO] 
[INFO] ----------------------< org.example:issue-34181 >-----------------------
[INFO] Building issue-34181 1.0.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- nx:0.0.12:apply (default-cli) @ issue-34181 ---
[INFO] Applying build state to 1 projects...
[WARNING] Modified pomFile does not exist, skipping: /Users/anurag.ag/OSS/nx-issues/issue-34181/.flattened-pom.xml
[INFO] Build state application completed (took 1ms)
[INFO] 
[INFO] --- resources:3.4.0:testResources (default-testResources) @ issue-34181 ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34181/src/test/resources
[INFO] 
[INFO] --- nx:0.0.12:record (default-cli) @ issue-34181 ---
[INFO] Recording build state for project: issue-34181
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.006 s (Wall Clock)
[INFO] Finished at: 2026-01-22T02:58:18+05:30
[INFO] ------------------------------------------------------------------------
```

Then you will find the warning
`[WARNING] Modified pomFile does not exist, skipping: /Users/anurag.ag/OSS/nx-issues/issue-34181/.flattened-pom.xml`

This warning creates an issue in deployment of a multi-module project, in resolving the correct dependency.
