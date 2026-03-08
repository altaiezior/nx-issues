## Issue 34758

https://github.com/nrwl/nx/issues/34758

### Run

```
nx install
```

### Result

When we run with nx we get the following error.

```text
 NX   Running target install for project org.example:issue-34758 and 47 tasks it depends on:

————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————

 NX   Running 48 tasks with @nx/maven:maven

[INFO] 🚀 Starting Nx Maven batch execution (48 tasks)

> nx run org.example:issue-34758:"before:all"


> nx run org.example:issue-34758:"before:initialize"


> nx run org.example:issue-34758:"before:validate"


> nx run org.example:issue-34758:validate


> nx run org.example:issue-34758:"after:validate"


> nx run org.example:issue-34758:initialize


> nx run org.example:issue-34758:"after:initialize"


> nx run org.example:issue-34758:"before:build"


> nx run org.example:issue-34758:"before:sources"


> nx run org.example:issue-34758:sources


> nx run org.example:issue-34758:"after:sources"


> nx run org.example:issue-34758:"before:resources"


> nx run org.example:issue-34758:resources

[INFO] Loaded 22257 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-metadata.xml
[INFO] Downloading from central: https://repo.maven.apache.org/maven2/dev/nx/maven/maven-metadata.xml
[INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/maven-metadata.xml
[INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-metadata.xml (14 kB at 9223372037 GB/s)
[INFO] Downloaded from central: https://repo.maven.apache.org/maven2/dev/nx/maven/maven-metadata.xml (222 B at 9223372037 GB/s)
[INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/maven-metadata.xml (21 kB at 9223372037 GB/s)
[INFO] 
[INFO] -----------------------------------------------< org.example:issue-34758 >------------------------------------------------
[INFO] Building issue-34758 1.0.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] ---------------------------------------------------------[ jar ]----------------------------------------------------------
[INFO] 
[INFO] --- resources:3.4.0:resources (default-resources) @ issue-34758 ---
[INFO] Loaded 74 auto-discovered prefixes for remote repository apache.snapshots (prefixes-apache.snapshots-c1d4c55f9308e5ac18a4069bed41dca64d85c515.txt)
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34758/src/main/resources
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34758/src/main/resources-filtered

> nx run org.example:issue-34758:"after:resources"

[INFO] Loaded 22257 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-metadata.xml
[INFO] Downloading from central: https://repo.maven.apache.org/maven2/dev/nx/maven/maven-metadata.xml
[INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/maven-metadata.xml
[INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-metadata.xml (14 kB at 9223372037 GB/s)
[INFO] Downloaded from central: https://repo.maven.apache.org/maven2/dev/nx/maven/maven-metadata.xml (222 B at 9223372037 GB/s)
[INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/maven-metadata.xml (21 kB at 9223372037 GB/s)
[INFO] 
[INFO] -----------------------------------------------< org.example:issue-34758 >------------------------------------------------
[INFO] Building issue-34758 1.0.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] ---------------------------------------------------------[ jar ]----------------------------------------------------------
[INFO] 
[INFO] --- resources:3.4.0:resources (default-resources) @ issue-34758 ---
[INFO] Loaded 74 auto-discovered prefixes for remote repository apache.snapshots (prefixes-apache.snapshots-c1d4c55f9308e5ac18a4069bed41dca64d85c515.txt)
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34758/src/main/resources
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34758/src/main/resources-filtered

> nx run org.example:issue-34758:"before:compile"

[WARNING] artifact 'org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT' already attached, replacing previous instance
[INFO] 
[INFO] --- compiler:3.15.0:compile (default-compile) @ issue-34758 ---
[INFO] Nothing to compile - all classes are up to date.

> nx run org.example:issue-34758:compile

[WARNING] artifact 'org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT' already attached, replacing previous instance
[INFO] 
[INFO] --- compiler:3.15.0:compile (default-compile) @ issue-34758 ---
[INFO] Nothing to compile - all classes are up to date.

> nx run org.example:issue-34758:"after:compile"


> nx run org.example:issue-34758:"before:ready"


> nx run org.example:issue-34758:ready


> nx run org.example:issue-34758:"after:ready"


> nx run org.example:issue-34758:"before:test-sources"


> nx run org.example:issue-34758:test-sources


> nx run org.example:issue-34758:"after:test-sources"


> nx run org.example:issue-34758:"before:test-resources"


> nx run org.example:issue-34758:test-resources

[WARNING] artifact 'org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT' already attached, replacing previous instance
[INFO] 
[INFO] --- resources:3.4.0:testResources (default-testResources) @ issue-34758 ---
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34758/src/test/resources
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34758/src/test/resources-filtered

> nx run org.example:issue-34758:"after:test-resources"

[WARNING] artifact 'org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT' already attached, replacing previous instance
[INFO] 
[INFO] --- resources:3.4.0:testResources (default-testResources) @ issue-34758 ---
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34758/src/test/resources
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34758/src/test/resources-filtered

> nx run org.example:issue-34758:"before:test-compile"

[WARNING] artifact 'org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT' already attached, replacing previous instance
[INFO] 
[INFO] --- compiler:3.15.0:testCompile (default-testCompile) @ issue-34758 ---
[INFO] No sources to compile

> nx run org.example:issue-34758:test-compile

[WARNING] artifact 'org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT' already attached, replacing previous instance
[INFO] 
[INFO] --- compiler:3.15.0:testCompile (default-testCompile) @ issue-34758 ---
[INFO] No sources to compile

> nx run org.example:issue-34758:"after:test-compile"


> nx run org.example:issue-34758:"before:test"

[WARNING] artifact 'org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT' already attached, replacing previous instance
[INFO] 
[INFO] --- surefire:3.5.5:test (default-test) @ issue-34758 ---
[INFO] No tests to run.

> nx run org.example:issue-34758:test

[WARNING] artifact 'org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT' already attached, replacing previous instance
[INFO] 
[INFO] --- surefire:3.5.5:test (default-test) @ issue-34758 ---
[INFO] No tests to run.

> nx run org.example:issue-34758:"after:test"


> nx run org.example:issue-34758:"before:unit-test"


> nx run org.example:issue-34758:unit-test


> nx run org.example:issue-34758:"after:unit-test"


> nx run org.example:issue-34758:"before:package"

[WARNING] artifact 'org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT' already attached, replacing previous instance
[INFO] 
[INFO] >>> pmd:3.28.0:check (default) > :pmd @ issue-34758 >>>
[ERROR] Build completed with 1 exception(s):
[ERROR] Exception: null
java.lang.UnsupportedOperationException
    at java.util.AbstractList.set(AbstractList.java:138)
    at org.apache.maven.lifecycle.internal.MojoExecutor.executeForkedExecutions(MojoExecutor.java:473)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute(MojoExecutor.java:305)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:214)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:179)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run(MojoExecutor.java:168)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute(DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:165)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:110)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:76)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:61)
    at org.apache.maven.lifecycle.internal.DefaultLifecycleStarter.execute(DefaultLifecycleStarter.java:123)
    at dev.nx.maven.adapter.maven4.NxMaven.executeWithCachedGraph(NxMaven.kt:307)
    at dev.nx.maven.adapter.maven4.NxMaven.execute(NxMaven.kt:224)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.doExecute(MavenInvoker.java:452)
    at dev.nx.maven.adapter.maven4.CachingResidentMavenInvoker.doExecute(CachingResidentMavenInvoker.kt:34)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.execute(MavenInvoker.java:97)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.execute(MavenInvoker.java:81)
    at org.apache.maven.cling.invoker.LookupInvoker.doInvoke(LookupInvoker.java:165)
    at org.apache.maven.cling.invoker.LookupInvoker.invoke(LookupInvoker.java:134)
    at dev.nx.maven.adapter.maven4.Maven4AdapterInvoker.invoke(Maven4AdapterInvoker.kt:92)
    at dev.nx.maven.runner.ResidentMavenExecutor.execute(ResidentMavenExecutor.kt:76)
    at dev.nx.maven.runner.MavenInvokerRunner.executeSingleTask(MavenInvokerRunner.kt:214)
    at dev.nx.maven.runner.MavenInvokerRunner.runBatch$lambda$7$lambda$6(MavenInvokerRunner.kt:86)
    at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
    at java.util.concurrent.FutureTask.run(FutureTask.java:328)
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
    at java.lang.Thread.run(Thread.java:1474)
[ERROR] UnsupportedOperationException
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the '-e' switch
[ERROR] Re-run Maven using the '-X' switch to enable verbose output
[ERROR] Task org.example:issue-34758:package FAILED with exit code: 1 (73ms)
[ERROR] Maven output for failed task org.example:issue-34758:package:
[WARNING] artifact 'org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT' already attached, replacing previous instance
[INFO] 
[INFO] >>> pmd:3.28.0:check (default) > :pmd @ issue-34758 >>>
[ERROR] Build completed with 1 exception(s):
[ERROR] Exception: null
java.lang.UnsupportedOperationException
    at java.util.AbstractList.set(AbstractList.java:138)
    at org.apache.maven.lifecycle.internal.MojoExecutor.executeForkedExecutions(MojoExecutor.java:473)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute(MojoExecutor.java:305)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:214)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:179)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run(MojoExecutor.java:168)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute(DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:165)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:110)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:76)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:61)
    at org.apache.maven.lifecycle.internal.DefaultLifecycleStarter.execute(DefaultLifecycleStarter.java:123)
    at dev.nx.maven.adapter.maven4.NxMaven.executeWithCachedGraph(NxMaven.kt:307)
    at dev.nx.maven.adapter.maven4.NxMaven.execute(NxMaven.kt:224)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.doExecute(MavenInvoker.java:452)
    at dev.nx.maven.adapter.maven4.CachingResidentMavenInvoker.doExecute(CachingResidentMavenInvoker.kt:34)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.execute(MavenInvoker.java:97)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.execute(MavenInvoker.java:81)
    at org.apache.maven.cling.invoker.LookupInvoker.doInvoke(LookupInvoker.java:165)
    at org.apache.maven.cling.invoker.LookupInvoker.invoke(LookupInvoker.java:134)
    at dev.nx.maven.adapter.maven4.Maven4AdapterInvoker.invoke(Maven4AdapterInvoker.kt:92)
    at dev.nx.maven.runner.ResidentMavenExecutor.execute(ResidentMavenExecutor.kt:76)
    at dev.nx.maven.runner.MavenInvokerRunner.executeSingleTask(MavenInvokerRunner.kt:214)
    at dev.nx.maven.runner.MavenInvokerRunner.runBatch$lambda$7$lambda$6(MavenInvokerRunner.kt:86)
    at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
    at java.util.concurrent.FutureTask.run(FutureTask.java:328)
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
    at java.lang.Thread.run(Thread.java:1474)
[ERROR] UnsupportedOperationException
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the '-e' switch
[ERROR] Re-run Maven using the '-X' switch to enable verbose output

[INFO] 
[INFO] ════════════════════════════════════════════════════════════════════════════════
[INFO] ❌ FAILED TASKS
[INFO] ════════════════════════════════════════════════════════════════════════════════
[INFO] 
[INFO] Task: org.example:issue-34758:package
[INFO] ----------------------------------------
[INFO] [WARNING] artifact 'org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT' already attached, replacing previous instance
[INFO] 
[INFO] >>> pmd:3.28.0:check (default) > :pmd @ issue-34758 >>>
[ERROR] Build completed with 1 exception(s):
[ERROR] Exception: null
java.lang.UnsupportedOperationException
    at java.util.AbstractList.set(AbstractList.java:138)
    at org.apache.maven.lifecycle.internal.MojoExecutor.executeForkedExecutions(MojoExecutor.java:473)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute(MojoExecutor.java:305)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:214)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:179)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run(MojoExecutor.java:168)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute(DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:165)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:110)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:76)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:61)
    at org.apache.maven.lifecycle.internal.DefaultLifecycleStarter.execute(DefaultLifecycleStarter.java:123)
    at dev.nx.maven.adapter.maven4.NxMaven.executeWithCachedGraph(NxMaven.kt:307)
    at dev.nx.maven.adapter.maven4.NxMaven.execute(NxMaven.kt:224)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.doExecute(MavenInvoker.java:452)
    at dev.nx.maven.adapter.maven4.CachingResidentMavenInvoker.doExecute(CachingResidentMavenInvoker.kt:34)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.execute(MavenInvoker.java:97)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.execute(MavenInvoker.java:81)
    at org.apache.maven.cling.invoker.LookupInvoker.doInvoke(LookupInvoker.java:165)
    at org.apache.maven.cling.invoker.LookupInvoker.invoke(LookupInvoker.java:134)
    at dev.nx.maven.adapter.maven4.Maven4AdapterInvoker.invoke(Maven4AdapterInvoker.kt:92)
    at dev.nx.maven.runner.ResidentMavenExecutor.execute(ResidentMavenExecutor.kt:76)
    at dev.nx.maven.runner.MavenInvokerRunner.executeSingleTask(MavenInvokerRunner.kt:214)
    at dev.nx.maven.runner.MavenInvokerRunner.runBatch$lambda$7$lambda$6(MavenInvokerRunner.kt:86)
    at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
    at java.util.concurrent.FutureTask.run(FutureTask.java:328)
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
    at java.lang.Thread.run(Thread.java:1474)
[ERROR] UnsupportedOperationException
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the '-e' switch
[ERROR] Re-run Maven using the '-X' switch to enable verbose output

[INFO] ════════════════════════════════════════════════════════════════════════════════
[INFO] 

> nx run org.example:issue-34758:package

[WARNING] artifact 'org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT' already attached, replacing previous instance
[INFO] 
[INFO] >>> pmd:3.28.0:check (default) > :pmd @ issue-34758 >>>
[ERROR] Build completed with 1 exception(s):
[ERROR] Exception: null
java.lang.UnsupportedOperationException
    at java.util.AbstractList.set(AbstractList.java:138)
    at org.apache.maven.lifecycle.internal.MojoExecutor.executeForkedExecutions(MojoExecutor.java:473)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute(MojoExecutor.java:305)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:214)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:179)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run(MojoExecutor.java:168)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute(DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:165)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:110)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:76)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:61)
    at org.apache.maven.lifecycle.internal.DefaultLifecycleStarter.execute(DefaultLifecycleStarter.java:123)
    at dev.nx.maven.adapter.maven4.NxMaven.executeWithCachedGraph(NxMaven.kt:307)
    at dev.nx.maven.adapter.maven4.NxMaven.execute(NxMaven.kt:224)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.doExecute(MavenInvoker.java:452)
    at dev.nx.maven.adapter.maven4.CachingResidentMavenInvoker.doExecute(CachingResidentMavenInvoker.kt:34)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.execute(MavenInvoker.java:97)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.execute(MavenInvoker.java:81)
    at org.apache.maven.cling.invoker.LookupInvoker.doInvoke(LookupInvoker.java:165)
    at org.apache.maven.cling.invoker.LookupInvoker.invoke(LookupInvoker.java:134)
    at dev.nx.maven.adapter.maven4.Maven4AdapterInvoker.invoke(Maven4AdapterInvoker.kt:92)
    at dev.nx.maven.runner.ResidentMavenExecutor.execute(ResidentMavenExecutor.kt:76)
    at dev.nx.maven.runner.MavenInvokerRunner.executeSingleTask(MavenInvokerRunner.kt:214)
    at dev.nx.maven.runner.MavenInvokerRunner.runBatch$lambda$7$lambda$6(MavenInvokerRunner.kt:86)
    at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
    at java.util.concurrent.FutureTask.run(FutureTask.java:328)
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
    at java.lang.Thread.run(Thread.java:1474)
[ERROR] UnsupportedOperationException
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the '-e' switch
[ERROR] Re-run Maven using the '-X' switch to enable verbose output
[INFO] Nx Maven Summary
[INFO]   Succeeded: 36
[INFO]   Failed:    1
[INFO]   Skipped:   11
[INFO]   Total:     48
[INFO]   Duration:  2.835s
[Maven Batch] Process exited with code 1. Stderr output:
WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::load has been called by org.jline.nativ.JLineNativeLoader in an unnamed module (file:/Users/anurag.ag/.local/share/mise/installs/maven/4.0.0-rc-5/lib/jline-native-3.30.6.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

[Maven Batch] Failed task outputs:
[WARNING] artifact 'org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT' already attached, replacing previous instance
[INFO] 
[INFO] >>> pmd:3.28.0:check (default) > :pmd @ issue-34758 >>>
[ERROR] Build completed with 1 exception(s):
[ERROR] Exception: null
java.lang.UnsupportedOperationException
    at java.util.AbstractList.set(AbstractList.java:138)
    at org.apache.maven.lifecycle.internal.MojoExecutor.executeForkedExecutions(MojoExecutor.java:473)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute(MojoExecutor.java:305)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:214)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:179)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run(MojoExecutor.java:168)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute(DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:165)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:110)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:76)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:61)
    at org.apache.maven.lifecycle.internal.DefaultLifecycleStarter.execute(DefaultLifecycleStarter.java:123)
    at dev.nx.maven.adapter.maven4.NxMaven.executeWithCachedGraph(NxMaven.kt:307)
    at dev.nx.maven.adapter.maven4.NxMaven.execute(NxMaven.kt:224)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.doExecute(MavenInvoker.java:452)
    at dev.nx.maven.adapter.maven4.CachingResidentMavenInvoker.doExecute(CachingResidentMavenInvoker.kt:34)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.execute(MavenInvoker.java:97)
    at org.apache.maven.cling.invoker.mvn.MavenInvoker.execute(MavenInvoker.java:81)
    at org.apache.maven.cling.invoker.LookupInvoker.doInvoke(LookupInvoker.java:165)
    at org.apache.maven.cling.invoker.LookupInvoker.invoke(LookupInvoker.java:134)
    at dev.nx.maven.adapter.maven4.Maven4AdapterInvoker.invoke(Maven4AdapterInvoker.kt:92)
    at dev.nx.maven.runner.ResidentMavenExecutor.execute(ResidentMavenExecutor.kt:76)
    at dev.nx.maven.runner.MavenInvokerRunner.executeSingleTask(MavenInvokerRunner.kt:214)
    at dev.nx.maven.runner.MavenInvokerRunner.runBatch$lambda$7$lambda$6(MavenInvokerRunner.kt:86)
    at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
    at java.util.concurrent.FutureTask.run(FutureTask.java:328)
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
    at java.lang.Thread.run(Thread.java:1474)
[ERROR] UnsupportedOperationException
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the '-e' switch
[ERROR] Re-run Maven using the '-X' switch to enable verbose output


————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————

 NX   Running target install for project org.example:issue-34758 and 47 tasks it depends on failed

Failed tasks:

- org.example:issue-34758:package

Hint: run the command with --verbose for more details.
```

But when running with maven we do not get the same error.

```text
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------------------------------< org.example:issue-34758 >------------------------------------------------
[INFO] Building issue-34758 1.0.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] ---------------------------------------------------------[ jar ]----------------------------------------------------------
[INFO] Loaded 22257 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] 
[INFO] --- clean:3.5.0:clean (default-clean) @ issue-34758 ---
[INFO] Deleting /Users/anurag.ag/OSS/nx-issues/issue-34758/target
[INFO] 
[INFO] --- resources:3.4.0:resources (default-resources) @ issue-34758 ---
[INFO] Loaded 74 auto-discovered prefixes for remote repository apache.snapshots (prefixes-apache.snapshots-c1d4c55f9308e5ac18a4069bed41dca64d85c515.txt)
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34758/src/main/resources
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34758/src/main/resources-filtered
[INFO] 
[INFO] --- compiler:3.15.0:compile (default-compile) @ issue-34758 ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 1 source file with javac [debug release 21] to target/classes
[INFO] 
[INFO] --- resources:3.4.0:testResources (default-testResources) @ issue-34758 ---
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34758/src/test/resources
[INFO] skip non existing resourceDirectory /Users/anurag.ag/OSS/nx-issues/issue-34758/src/test/resources-filtered
[INFO] 
[INFO] --- compiler:3.15.0:testCompile (default-testCompile) @ issue-34758 ---
[INFO] No sources to compile
[INFO] 
[INFO] --- surefire:3.5.5:test (default-test) @ issue-34758 ---
[INFO] No tests to run.
[INFO] 
[INFO] --- jar:3.5.0:jar (default-jar) @ issue-34758 ---
[INFO] Building jar: /Users/anurag.ag/OSS/nx-issues/issue-34758/target/issue-34758-1.0.0-SNAPSHOT.jar
[INFO] 
[INFO] >>> pmd:3.28.0:check (default) > :pmd @ issue-34758 >>>
[INFO] 
[INFO] --- pmd:3.28.0:pmd (pmd) @ issue-34758 ---
[INFO] PMD version: 7.22.0
[INFO] Rendering content with org.apache.maven.skins:maven-fluido-skin:jar:2.0.0-M9 skin
[INFO] Copying org.example:issue-34758:pom:1.0.0-SNAPSHOT to project local repository
[INFO] Copying org.example:issue-34758:jar:1.0.0-SNAPSHOT to project local repository
[INFO] Copying org.example:issue-34758:pom:consumer:1.0.0-SNAPSHOT to project local repository
[INFO] 
[INFO] <<< pmd:3.28.0:check (default) < :pmd @ issue-34758 <<<
[INFO] 
[INFO] 
[INFO] --- pmd:3.28.0:check (default) @ issue-34758 ---
[WARNING] PMD Failure: org.example.Main:5 Rule:UnusedLocalVariable Priority:3 Avoid unused local variables such as 'a'..
[INFO] --------------------------------------------------------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] --------------------------------------------------------------------------------------------------------------------------
[INFO] Total time:  2.366 s
[INFO] Finished at: 2026-03-08T17:17:59+05:30
[INFO] --------------------------------------------------------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-pmd-plugin:3.28.0:check (default) on project issue-34758: PMD 7.22.0 has found 1 violation. For more details see: /Users/anurag.ag/OSS/nx-issues/issue-34758/target/pmd.xml -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the '-e' switch
[ERROR] Re-run Maven using the '-X' switch to enable verbose output
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```
