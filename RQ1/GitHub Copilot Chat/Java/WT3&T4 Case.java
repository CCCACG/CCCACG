/** Even indirectly */
//Source Code
public boolean isDerivedFrom(ClassInfo cl){
    ClassInfo dad = this.superclass();
    if (dad != null) {
        if (dad.equals(cl)) {
            return true;
        } else {
            if (dad.isDerivedFrom(cl)) {
                return true;
            }
        }
    }
    for (ClassInfo iface: interfaces()) {
        if (iface.equals(cl)) {
            return true;
        } else {
            if (iface.isDerivedFrom(cl)) {
                return true;
            }
        }
    }
    return false;
}

// Synthesized Code, syntax similarity: 0.18
public boolean isDerivedFrom(ClassInfo cl) {
    ClassInfo current = this;
    while (current != null) {
        if (current == cl) {
            return true;
        }
        current = current.getSuperClass();
    }
    return false;
}