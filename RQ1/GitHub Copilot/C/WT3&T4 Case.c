/*
 * Returns the height of a bitmap font
 */
 //Source Code 00085.c
int FGAPIENTRY glutBitmapHeight( void* fontID ){
    SFG_Font* font;
    FREEGLUT_EXIT_IF_NOT_INITIALISED ( "glutBitmapHeight" );
    font = fghFontByID( fontID );
    freeglut_return_val_if_fail( font, 0 );
    return font->Height;
}


//Synthesized Code, syntax similarity:0.4, res_00005.c
int FGAPIENTRY glutBitmapHeight( void* fontID )
{
    SFG_Font* font = ( SFG_Font* )fontID;

    FREEGLUT_EXIT_IF_NOT_INITIALISED ( "glutBitmapHeight" );
    if ( font->type != BITMAP_9_BY_15 && font->type != BITMAP_8_BY_13 )
        fgError( "glutBitmapHeight():  font ID is invalid" );

    return font->Height;
}