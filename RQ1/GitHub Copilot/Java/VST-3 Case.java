/**
 * Override this to customize the server.<p>
 *
 * (By default, this delegates to serveFile() and allows directory listing.)
 *
 * @param uri	Percent-decoded URI without parameters, for example "/index.cgi"
 * @param method	"GET", "POST" etc.
 * @param parms	Parsed, percent decoded parameters from URI and, in case of POST, data.
 * @param header	Header entries, percent decoded
 * @return HTTP response, see class Response for details
 */
// Source Code, 16-32 00629.java
public Response serve( String uri, String method, Properties header, Properties parms, Properties files ){
	myOut.println( method + " '" + uri + "' " );

	Enumeration e = header.propertyNames();
	while ( e.hasMoreElements())
	{
		String value = (String)e.nextElement();
		myOut.println( "  HDR: '" + value + "' = '" +
				header.getProperty( value ) + "'" );
	}
	e = parms.propertyNames();
	while ( e.hasMoreElements())
	{
		String value = (String)e.nextElement();
		myOut.println( "  PRM: '" + value + "' = '" +
				parms.getProperty( value ) + "'" );
	}
	e = files.propertyNames();
	while ( e.hasMoreElements())
	{
		String value = (String)e.nextElement();
		myOut.println( "  UPLOADED: '" + value + "' = '" +
				files.getProperty( value ) + "'" );
	}

	return serveFile( uri, header, myRootDir, true );
}

//Synthesized Code (res_00007.java)
public Response serve( String uri, String method, Properties header, Properties parms, Properties files )
{
    myOut.println( "URI=" + uri + " Method=" + method + " " + parms );
    Enumeration e = header.propertyNames();
    while (e.hasMoreElements())
    {
	String value = (String)e.nextElement();
	myOut.println( "  HDR: '" + value + "' = '" +
	    header.getProperty( value ) + "'" );
    }
    e = parms.propertyNames();
    while (e.hasMoreElements())
    {
	String value = (String)e.nextElement();
	myOut.println( "  PRM: '" + value + "' = '" +
	    parms.getProperty( value ) + "'" );
    }
    e = files.propertyNames();
    while (e.hasMoreElements())
    {
	String value = (String)e.nextElement();
	myOut.println( "  UPLOADED: '" + value + "' = '" +
	    files.getProperty( value ) + "'" );
    }

    return serveFile( uri, header, myRootDir, true );
}