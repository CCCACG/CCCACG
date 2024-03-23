// Convert the name of parameter to upper camel case.

// Source Code
/**
 * 阻塞到下一个毫秒
 */
private long nextMs(long timeStamp){
	long current = System.currentTimeMillis();
	while (current <= timeStamp) {
		current = System.currentTimeMillis();
	}
	return current;
}

// Generated Code by Copilot
/**
 * 阻塞到下一个毫秒
 */
private long nextMs(long TimeStamp)
{
    long timeStamp = this.timeGen();
    while (timeStamp <= TimeStamp)
    {
        timeStamp = this.timeGen();
    }
    return timeStamp;
}