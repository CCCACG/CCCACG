/** Discard all buffered characters. On the next scan, YY_INPUT will be called.
 * @param b the buffer state to be flushed, usually @c YY_CURRENT_BUFFER.
 * @param yyscanner The scanner object.
 */
 //Source Code 01566.c
void ael_yy_flush_buffer (YY_BUFFER_STATE  b , yyscan_t yyscanner){
    struct yyguts_t * yyg = (struct yyguts_t*)yyscanner;
	if ( ! b )
		return;

	b->yy_n_chars = 0;

	/* We always need two end-of-buffer characters.  The first causes
	 * a transition to the end-of-buffer state.  The second causes
	 * a jam in that state.
	 */
	b->yy_ch_buf[0] = YY_END_OF_BUFFER_CHAR;
	b->yy_ch_buf[1] = YY_END_OF_BUFFER_CHAR;

	b->yy_buf_pos = &b->yy_ch_buf[0];

	b->yy_at_bol = 1;
	b->yy_buffer_status = YY_BUFFER_NEW;

	if ( b == YY_CURRENT_BUFFER )
		ael_yy_load_buffer_state(yyscanner );
}

//Synthesized Code res_00005.c
//Syntax similarity: 0.91
void ael_yy_flush_buffer (YY_BUFFER_STATE  b , yyscan_t yyscanner)
{
    	ael_yy_buf_data *buf = (ael_yy_buf_data *) b;
    
    	if ( !YY_CURRENT_BUFFER )
        	/* Nothing to do. */
        	return;
    
    	buf->yy_n_chars = 0;
    
    	/* We always need two end-of-buffer characters.  The first causes
     	* a transition to the end-of-buffer state.  The second causes
     	* a jam in that state.
     	*/
    	buf->yy_ch_buf[0] = YY_END_OF_BUFFER_CHAR;
    	buf->yy_ch_buf[1] = YY_END_OF_BUFFER_CHAR;
    
    	buf->yy_buf_pos = &buf->yy_ch_buf[0];
    
    	buf->yy_at_bol = 1;
    	buf->yy_buffer_status = YY_BUFFER_NEW;
    
    	if ( buf == YY_CURRENT_BUFFER )
        	ael_yy_load_buffer_state(yyscanner );
}