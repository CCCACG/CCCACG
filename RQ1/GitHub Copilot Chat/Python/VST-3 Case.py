# Source Code
def flatten(mytokens):
    """Converts nested arrays into a flat arrays:
    
    >>> flatten([1,[2,3]])
    [1, 2, 3]
    >>> flatten(['sys-apps/linux-headers', ['sys-devel/gettext']])
    ['sys-apps/linux-headers', 'sys-devel/gettext']
    """
    
    newlist=[]
    for x in mytokens:
        if type(x)==types.ListType:
            newlist.extend(flatten(x))
        else:
            newlist.append(x)
    return newlist

# Synthesized Code, syntax similarity: 0.91
def flatten(mytokens):
    result = []
    for item in mytokens:
        if isinstance(item, list):
            result.extend(flatten(item))
        else:
            result.append(item)
    return result
