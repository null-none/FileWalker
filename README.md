# FileWalker
Class FileWalker for use file system.

```java
FileWalker fw = new FileWalker();
ArrayList<String> result = fw.walk(getFilesDir());
ArrayList<String> result = fw.walk(searchForFormatFiles(getFilesDir()), '.apk'));
```
