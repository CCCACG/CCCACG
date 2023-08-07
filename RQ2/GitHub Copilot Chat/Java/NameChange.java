// Convert the name of function to lower camel case.

// Source Code
/*************************************************************************
 * StockHeader: envia cabeçalhos http para o stream de saída indicado.
 ************************************************************************/
private void StockHeader(DataOutputStream os,
						String type,
						int length) throws Exception{
	os.writeBytes("Stock/1.0 200 Document Follows\r\n");
	os.writeBytes("Content-Type: " + type + "\r\n");
        os.writeBytes("Content-Length: " + length + "\r\n");
        os.writeBytes("\r\n");
}

// Generated Code by Copilot Chat
/*************************************************************************
 * StockHeader: envia cabeçalhos http para o stream de saída indicado.
 ************************************************************************/
private void stockHeader(DataOutputStream os, String type, int length) throws Exception {
    os.writeBytes("HTTP/1.1 200 OK\r\n");
    os.writeBytes("Content-Type: " + type + "\r\n");
    os.writeBytes("Content-Length: " + length + "\r\n");
    os.writeBytes("\r\n");
}