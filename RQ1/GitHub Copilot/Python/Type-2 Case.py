#Source Code 0-2 00817.py
def format_exc(limit=None):
    """Like print_exc() but return a string. Backport for Python 2.3."""
    try:
        etype, value, tb = sys.exc_info()
        return ''.join(traceback.format_exception(etype, value, tb, limit))
    finally:
        etype = value = tb = None

# Synthesized Code res_00000.py
def format_exc(limit=None):
    try:
        etype, value, tb = sys.exc_info()
        return "".join(traceback.format_exception(etype, value, tb, limit))
    finally:
        etype = value = tb = None