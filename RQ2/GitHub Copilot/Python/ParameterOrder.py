# Source Code
def long_Prefix_Suffix_Array(pattern, P, long_prefix_suffix):
    # length of the previous longest prefix suffix
    l=0
    long_prefix_suffix[0]=0
    i=1
    while i < P:
        if pattern[i] == pattern[l]:
            l += 1
            long_prefix_suffix[i] = l
            i += 1
        else:
            if l != 0:
                l=long_prefix_suffix[l-1]
            else:
                long_prefix_suffix[i] = 0
                i += 1

# Generated Code by Copilot
def long_Prefix_Suffix_Array(P, long_prefix_suffix, pattern):
    # length of the previous longest prefix suffix
    length = 0
    long_prefix_suffix[0] = 0 # lps[0] is always 0
    i = 1
    # the loop calculates lps[i] for i = 1 to M-1
    while i < pattern:
        if P[i] == P[length]:
            length += 1
            long_prefix_suffix[i] = length
            i += 1
        else:
            if length != 0:
                length = long_prefix_suffix[length-1]
            else:
                long_prefix_suffix[i] = 0
                i += 1