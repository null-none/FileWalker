# FileWalker
Class FileWalker for use file system.

```java
List<String> files = new ArrayList<String>();
FileWalker fw = new FileWalker();
fw.walk(getFilesDir());
fw.searchForFormatFiles(getFilesDir(), files, ".apk");
```

