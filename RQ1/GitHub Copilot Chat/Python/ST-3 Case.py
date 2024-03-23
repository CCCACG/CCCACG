# Source Code
def isString(s):
    """Convenience method that works with all 2.x versions of Python
    to determine whether or not something is stringlike."""
    try:
        return isinstance(s, unicode) or isinstance(s, basestring)
    except NameError:
        return isinstance(s, str)

# Synthesized Code, syntax similarity: 0.77
def isString(s):
    try:
        return isinstance(s, basestring)
    except NameError:
        return isinstance(s, str)
