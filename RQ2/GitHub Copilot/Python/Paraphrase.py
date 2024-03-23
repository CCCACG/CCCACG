# Source Code
def LoadUserAgents(uafile='files/user_agents.txt'):
    """Get random user agents."""
    # uafile : string, path to text file of user agents, one per line
    uas = []
    with open(uafile, 'rb') as uaf:
        for ua in uaf.readlines():
            if ua:
                uas.append(ua.strip()[1:-1-1])
    random.shuffle(uas)
    return uas


# Generated Code by Copilot
def LoadUserAgents(uafile='files/user_agents.txt'):
    """Retrieve a random user agent from a given text file."""
    
    # uafile: string, denotes the path to a text file containing user agents,
    # with each agent listed on a separate line.
    
    # Return a random user agent from uafile.
    
    uas = []
    with open(uafile, 'rb') as uaf:
        for ua in uaf.readlines():
            if ua:
                uas.append(ua.strip()[1:-1-1])
    random.shuffle(uas)
    return uas