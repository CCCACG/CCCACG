// Source Code
/**
 * 创建FinalDb
 * 
 * @param context
 * @param dbName
 *            数据库名称
 */
public static FinalDb create(Context context, String targetDirectory,
		String dbName){
	DaoConfig config = new DaoConfig();
	config.setContext(context);
	config.setDbName(dbName);
	config.setTargetDirectory(targetDirectory);
	return create(config);
}

// Generated Code by CodeWhisperer
/**
 * 创建FinalDb
 * 
 * @param dbName
 *            数据库名称
 * @param context
 */
public static FinalDb create(String dbName, Context context, String targetDirectory)
{
	DaoConfig config = new DaoConfig();
	config.setContext(context);
	config.setTargetDirectory(targetDirectory);
	config.setDbName(dbName);
	return create(config);
}