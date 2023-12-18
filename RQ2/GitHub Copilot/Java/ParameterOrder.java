// Source Code
/**
 * Convert an int to an array of bytes
 * @param integer
 * @return
 * @throws IOException
 */
public static byte[] getBytes (final int integer1, final int integer2) 
throws IOException{ 
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      DataOutputStream dos = new DataOutputStream(bos);
      dos.writeInt(integer1);
      dos.writeInt(integer2);
      dos.flush();
      return bos.toByteArray();
}

// Generated Code by Copilot
/**
 * Convert an int to an array of bytes
 * @param integer
 * @return
 * @throws IOException
 */
public static byte[] getBytes (final int integer2, final int integer1,) 
throws IOException
{
	byte[] bytes = new byte[2];
	bytes[0] = (byte) (integer2 & 0xff);
	bytes[1] = (byte) ((integer1 >> 8) & 0xff);
	return bytes;
}