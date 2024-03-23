# Convert the name of function to upper camel case.

# Source Code
def diff_text1(self, diffs):
    """Compute and return the source text (all equalities and deletions).
    
    Args:
        diffs: Array of diff tuples.
    
    Returns:
        Source text.
    """
    text = []
    for (op, data) in diffs:
        if op != self.DIFF_INSERT:
            text.append(data)
    return "".join(text)

# Generated Code by CodeWhisperer
def DiffText1(self, diffs):
    """Compute and return the source text (all equalities and deletions).
    
    Args:
        diffs: Array of diff tuples.
    
    Returns:
        Source text.
    """
    text = []
    for (op, data) in diffs:
        if op == self.DIFF_INSERT:
            text.append(data)
        elif op == self.DIFF_DELETE:
            pass
        elif op == self.DIFF_EQUAL:
            text.append(data)
    return "".join(text)