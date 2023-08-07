/**
 * Parse the input string as a double object.
 * 
 * @param str
 *            The string to turn into a double.
 * @return result The double object.
 * @throws NumberFormatException
 *             returns 0.0 if this exception occurs.
 */
private double readDouble(String str){
	double result = 0.0;
	try {
		result = Double.parseDouble(str);
	} catch (NumberFormatException exc) {
		return 0.0;
	}
	return result;
}

// Synthesized Code, syntax similarity: 0.86
private double readDouble(String str){
    double result = 0.0;
    try {
        result = Double.parseDouble(str);
    } catch (NumberFormatException e) {
        result = 0.0;
    }
    return result;
}