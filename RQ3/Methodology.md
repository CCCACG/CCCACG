# Methodology

Utilize the following code fragment as an example:

```Java
/** Met a jour les flux en arrire plan */
public void maj_background()
{
	for(int i=0;i<nb_background;i++)
	{
		background[i].update();
	}
}
```



**Step 1, blind function using NiCad:**

To detect potential clone pairs, Nicad will blind the source code into the following format:

```Java
public void x () {
    for (int x = 1; x < x; x ++) {
        x [x].x ();
    }
}
```



**Step 2, convert the bilind function into regular expression:**

Based on the function after blinding, we have the following tranformation rules:

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
    content = content.replace("\"x\"", "\"[^ .;()]+\"")
    content = content.replace("x --", r"[^ .;()]+--")
    content = content.replace(r"x \(", r"[^ .;()]+\(")
    content = content.replace("x", "[^ .;()]+")

    return content
```



After applying these rules, we can get the following search statement:

```
/public void [^ .;()]+\(\)(\s)*\{(\s)*for \(int [^ .;()]+ = [0-9]+; [^ .;()]+ < [^ .;()]+; [^ .;()]+\+\+\)(\s)*\{(\s)*[\s]+[^ .;()]+\[[^ .;()]+\]\.[^ .;()]+\(\);[\s]+(\s)*\}(\s)*(\s)*\}/ language:java
```



With this statement, we can find potential unfound clone pairs by utlizing GitHub Search.