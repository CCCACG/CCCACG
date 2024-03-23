/**
 * Get the names of local groups on a computer.
 * @param serverName Name of the computer.
 * @return An array of local group names.
 */
public static LocalGroup[] getLocalGroups(String serverName) 
{
	if (serverName == null)
		throw new IllegalArgumentException("serverName cannot be null");

	return LocalGroup.getLocalGroups(serverName);
}