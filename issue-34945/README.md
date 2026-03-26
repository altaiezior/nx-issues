# Issue-34945

In this issue, I am using the `maven-shade-plugin` to shade the `grpc-xds` library.

Then I am using this shaded library as a dependency in `orcametrics`, with `maven-dependency-plugin` analyze check enabled.

This check fails and says that `grpc-xds` from `org.example` is declared but not used and `grpc-xds` from `io.grpc` is used but undeclared when built with Nx.

However, when we are building the same with Maven directly, there is no error.

## Error Logs
```
[INFO] Used declared dependencies found:
[INFO]    com.google.protobuf:protobuf-java:jar:4.34.1:compile
[ERROR] Used undeclared dependencies found:
[ERROR]    io.grpc:grpc-xds:jar:1.80.0:compile
[ERROR]       class io.grpc.xds.shaded.com.github.xds.data.orca.v3.OrcaLoadReport
[ERROR] Unused declared dependencies found:
[ERROR]    org.example:grpc-xds:jar:1.0-SNAPSHOT:compile
```

In the following cases, the error doesn't occur:
* If using the default project name and not using a custom project name.
* If the `grpc-xds` is just a POM file but actually not shading any class.
* If we remove the protobuf reference as it is anyways not used by `orcametrics`, this still doesn't occur.
* If we generate proto using `protobuf-maven-plugin` instead of the `buf generate` command, even then the error doesn't occur.

In the current project setup, we are using `buf` to generate the proto and have bound it as a dependency via Nx.

In all of the above cases, when building directly, the error doesn't occur, but only when using custom project names with Nx.

We use `mise reset` to reset the cache and Nx.
We use `mise build` to build the project.
