# Source Code
def p_paramdefs(p):
    """paramdefs : '(' paramnames ')'
                 | '(' ')'"""
    if len(p) == 4:
        p[0] = p[2]
    else:
        p[0] = []

# Synthesized Code
def p_paramdefs(p):
    if len(p) == 4:
        p[0] = p[2]
    else:
        p[0] = []