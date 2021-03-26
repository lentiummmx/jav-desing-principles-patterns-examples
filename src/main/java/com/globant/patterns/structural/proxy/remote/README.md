JVM options to run RMI
```
-Djava.security.policy=file$MODULE_DIR$/security.policy
-Djava.rmi.server.codebase=file:$MODULE_DIR$/target/classes
```

Both inside directory that has access to the classes, i.e. `$MODULE_DIR$/target/classes`
```
rmic
```

```
rmiregistry.
```
