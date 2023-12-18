// Source Code
/**
 * Resolve the given class name as primitive class, if appropriate,
 * according to the JVM's naming rules for primitive classes.
 * <p>
 * Also supports the JVM's internal class names for primitive arrays. Does
 * <i>not</i> support the "[]" suffix notation for primitive arrays; this is
 * only supported by {@link #forName}.
 * 
 * @param name the name of the potentially primitive class
 * @return the primitive class, or <code>null</code> if the name does not
 * denote a primitive class or primitive array class
 */
public static Class<?> resolvePrimitiveClassName(String name){
    Class<?> result = null;
    // Most class names will be quite long, considering that they
    // SHOULD sit in a package, so a length check is worthwhile.
    if (name != null && name.length() <= 8) {
        // Could be a primitive - likely.
        result = (Class<?>) primitiveTypeNameMap.get(name);
    }
    return result;
}

// Generated Code by CodeWhisperer
/**
 * This method resolves the given class name as a primitive class, if it follows the naming rules for primitive classes in the JVM.
 * <p>
 * It also supports the JVM's internal class names for primitive arrays. However, it does not support the "[]" suffix notation used for primitive arrays; for that, use the {@link #forName} method.
 * 
 * @param name the name of the class that could potentially be a primitive class
 * @return the primitive class if the name corresponds to a primitive class or primitive array class, null otherwise
 */
public static Class<?> resolvePrimitiveClassName(String name)
{
	if (name == null)
	{
		return null;
	}
	else if (name.length() == 1)
	{
		return resolvePrimitiveClassName(name.charAt(0));
	}
	else if (name.startsWith("["))
	{
		Class<?> primitiveClass = resolvePrimitiveClassName(name.substring(1));
		return primitiveClass != null ? Array.newInstance(primitiveClass, 0).getClass() : null;
	}
	else
	{
		return resolvePrimitiveClassName(name.charAt(0)) != null ? Class.forName(name) : null;
	}
}