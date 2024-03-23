# Source Code
def make_net(self, netmask):
    """Transform a single IP address into a network specification by
    applying the given netmask.
    
    Returns a new IP instance.
    
    >>> print(IP('127.0.0.1').make_net('255.0.0.0'))
    127.0.0.0/8
    """
    if '/' in str(netmask):
        raise ValueError("invalid netmask (%s)" % netmask)
    return IP('%s/%s' % (self, netmask), make_net=True)


# Synthesized Code, syntax similarity: 0.8
def make_net(self, netmask):
    """Transform a single IP address into a network specification by
    applying the given netmask.
    
    Returns a new IP instance.
    
    >>> print(IP('127.0.0.1').make_net('255.0.0.0'))
    127.0.0.0/8
    """
    if '/' in str(netmask):
        raise ValueError("Cannot convert netmask to prefixlen")
    return IP('%s/%s' % (self, netmask), make_net=True)