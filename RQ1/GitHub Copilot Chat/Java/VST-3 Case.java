/**
 * Converts a byte array to an Object
 * @param data the array of bytes to be converted
 * @return the resulting object
 * @throws java.io.IOException
 */
public static Object getObject(byte[] data) throws java.io.IOException{
	  ByteArrayInputStream bis = new ByteArrayInputStream(data);
      ObjectInputStream ois = new ObjectInputStream(bis);
      Object o = null;
	try {
		o = ois.readObject();
	} catch (ClassNotFoundException e) {
		System.err.println(e);
		e.printStackTrace();
	}
      return o;
}

// Synthesized Code, syntax similarity:0.9
public static Object getObject(byte[] data) throws java.io.IOException {
    ByteArrayInputStream in = new ByteArrayInputStream(data);
    ObjectInputStream ois = new ObjectInputStream(in);
    Object obj = null;
    try {
        obj = ois.readObject();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    ois.close();
    return obj;
}