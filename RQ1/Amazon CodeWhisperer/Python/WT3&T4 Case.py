# Source Code
def getMedian(self, alist):
    """return median of alist"""
    if alist == []:
        return []
    blist = sorted(alist)
    length = len(alist)
    if length % 2 == 1:
        # length of list is odd so return middle element
        return blist[int(((length + 1) / 2) -  1)]
    else:
        # length of list is even so compute midpoint
        v1 = blist[int(length / 2)]
        v2 =blist[(int(length / 2) - 1)]
        return (v1 + v2) / 2.0

# Synthesized Code, syntax similarity: 0.17 
def getMedian(self, alist):
    """return median of alist"""
    length = len(alist)
    alist.sort()
    if length % 2 == 0:
        return (alist[length/2] + alist[length/2-1])/2.0
    else:
        return alist[length/2]