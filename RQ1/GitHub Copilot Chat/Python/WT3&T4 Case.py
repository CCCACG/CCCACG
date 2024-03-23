# Source Code
def named_query(order_by=None, **conds):
    """
    Create a named query.
    """
    cond_str = "WHERE "
    for cond in conds.iterkeys():
        if len(cond_str) > 6:
            cond_str += ' AND '
        cond_str += '%s %s' % (cond, conds[cond])
    
    if order_by:
        cond_str += ' ORDER BY %s' % order_by
    
    return property(lambda self: cls.gql(cond_str))

# Synthesized Code, syntax similarity:0.20
def named_query(order_by=None, **conds):
    query = "SELECT * FROM table_name"
    if conds:
        query += " WHERE " + " AND ".join(f"{k} = '{v}'" for k, v in conds.items())
    if order_by:
        query += f" ORDER BY {order_by}"
    return query
