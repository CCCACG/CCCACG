// Source Code
//!STBI_NO_STDIO
unsigned char *stbi_load_from_memory(stbi_uc const *buffer, int len, int *x, int *y, int *comp, int req_comp){
   stbi s;
   start_mem(&s,buffer,len);
   return stbi_load_main(&s,x,y,comp,req_comp);
}

// Generated Code by Copilot
//!STBI_NO_STDIO
unsigned char *stbi_load_from_memory(stbi_uc const *buffer, int len, int *comp, int req_comp, int *x, int *y)
{
    stbi__context s;
    stbi__start_mem(&s, buffer, len);
    return stbi__load_and_postprocess_8bit(&s, x, y, comp, req_comp);
}
