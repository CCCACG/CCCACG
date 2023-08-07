# Source Code,01734.py
def __init__(self, frm, bitoffset, bitlen, doc=""):
    """
        frm         : The offset from which the field begins. 
        bitoffset   : The offset of the bitfield from the byte specified by frm. 
        bitlen      : The number of bits in the field. 
    """
    self.frm = frm
    self.bitoffset = bitoffset
    self.bitlen = bitlen
    self.__doc__ = doc

# Synthesized Code
def __init__(self, frm, bitoffset, bitlen, doc=""):
    self.frm = frm
    self.bitoffset = bitoffset
    self.bitlen = bitlen
    self.doc = doc