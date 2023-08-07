# Source Code, 0-2 test_00346
def _dedent(text, tabsize=8, skip_first_line=False):
    """_dedent(text, tabsize=8, skip_first_line=False) -> dedented text
    
        "text" is the text to dedent.
        "tabsize" is the tab width to use for indent width calculations.
        "skip_first_line" is a boolean indicating if the first line should
            be skipped for calculating the indent width and for dedenting.
            This is sometimes useful for docstrings and similar.
    
    textwrap.dedent(s), but don't expand tabs to spaces
    """
    lines = text.splitlines(1)
    _dedentlines(lines, tabsize=tabsize, skip_first_line=skip_first_line)
    return ''.join(lines)

# Synthesized Code
def _dedent(text, tabsize=8, skip_first_line=False):
    lines = text.splitlines(1)
    _dedentlines(lines, tabsize=tabsize, skip_first_line=skip_first_line)
    return ''.join(lines)