# Methodology

Utilize the following code fragment as an example:

```Java
/**
 * Get the names of local groups on a computer.
 * @param serverName Name of the computer.
 * @return An array of local group names.
 */
public static LocalGroup[] getLocalGroups(String serverName) 
{
	if (serverName == null) throw new IllegalArgumentException("serverName cannot be null");

	return LocalGroup.getLocalGroups(serverName);
}
```



**Step 1: blinding the function using NiCad**

To detect potential clone pairs, Nicad will blind the source code into the following format:

```Java
public static x [] x (x x) {
    if (x == null) throw new x ("x");
    return x.x (x);
}
```



**Step 2: converting the blind function into a regular expression**

We have the following tranformation rules to covert the blind function into a regular expression:


```python
def convert_to_reg(content):
    content = content.replace(" [", r"\[")
    content = content.replace("]", r"\]")
    content = content.replace("(", r"\(")
    content = content.replace(")", r"\)")
    content = content.replace("*", r"\*")
    content = content.replace("- 1", r"-[0-9]+")
    content = content.replace("1", r"[0-9]+")
    content = content.replace(" {", r"(\s)*\{(\s)*")
    content = content.replace("}", r"(\s)*\}(\s)*")
    content = content.replace(" ++", r"\+\+")
    content = content.replace(" +", r' \+')

    content = content.replace("|", r"\|")
    content = content.replace(".", r"\.")
    content = content.replace("\"x\"", "\".*\"")
    content = content.replace("x --", r"[^ .;()]+--")
    content = content.replace(r"x \(", r"[^ .;()]+\(")
    content = content.replace("x", "[^ .;()]+")

    return content
```



After applying these rules to the blind function, we can get the following search statement:

```
/public static [^ .;()]+\[\] [^ .;()]+\([^ .;()]+ [^ .;()]+\)(\s)*\{(\s)*if \([^ .;()]+ == null\) throw new [^ .;()]+\(".*"\);[\s]*return [^ .;()]+\.[^ .;()]+\([^ .;()]+\);(\s)*\}(\s)*/ language:Java
```



With this search statement, we can find potentially unfound clone pairs by utilizing GitHub Search.
