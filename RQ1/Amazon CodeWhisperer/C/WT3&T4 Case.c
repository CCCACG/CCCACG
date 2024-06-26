/**
 * Load a TTF from a buffer.
 * @param file_base Buffer with TTF data. You must not deallocate the memory before calling GRRLIB_FreeTTF.
 * @param file_size Size of the TTF buffer.
 * @return A handle to a given TTF font object.
 * @see GRRLIB_FreeTTF
 */
GRRLIB_ttfFont* GRRLIB_LoadTTF (const u8* file_base, s32 file_size){
	FT_Face Face;
	GRRLIB_ttfFont* myFont = (GRRLIB_ttfFont*)malloc(sizeof(GRRLIB_ttfFont));
	FT_New_Memory_Face(ftLibrary, file_base, file_size, 0, &Face);
	myFont->kerning = FT_HAS_KERNING(Face);
/*
	if (FT_Set_Pixel_Sizes(Face, 0, fontSize)) {
		FT_Set_Pixel_Sizes(Face, 0, 12);
	}
*/
	myFont->face = Face;
	return myFont;
}

// Generated by Amazon CodeWhisperer
GRRLIB_ttfFont* GRRLIB_LoadTTF (const u8* file_base, s32 file_size) 
{
    GRRLIB_ttfFont* font = (GRRLIB_ttfFont*)malloc(sizeof(GRRLIB_ttfFont));
    if (font == NULL) return NULL;

    font->data = file_base;
    font->size = file_size;
    font->loaded = 0;

    return font;
}