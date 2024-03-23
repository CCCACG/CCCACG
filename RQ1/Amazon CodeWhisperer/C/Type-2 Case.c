// we need this since Windows doesnt have snprintf()
int cs_snprintf(char *buffer, size_t size, const char *fmt, ...){
	int ret;

	va_list ap;
	va_start(ap, fmt);
	ret = cs_vsnprintf(buffer, size, fmt, ap);
	va_end(ap);

	return ret;
}

// Generated by Amazon CodeWhisperer
int cs_snprintf(char *buffer, size_t size, const char *fmt, ...) 
{
    int ret;
    va_list ap;

    va_start(ap, fmt);
    ret = vsnprintf(buffer, size, fmt, ap);
    va_end(ap);

    return ret;
}