/* Local helper.
 * Accepts an alphanumeric character in the range [0-9a-fA-F] 
 * and returns it converted to an integer in the range 0-15. 
 */
static int hexchar2int(int c){
    if(c >= '0' && c <= '9')
        return c - '0';
    else if(c >= 'a' && c <= 'f') 
        return 10 + c - 'a';
    else if(c >= 'A' && c <= 'F') 
        return 10 + c - 'A';
    else /* Illegal input. */
        return -1;
}

// Synthesized Code, syntax similarity: 0.17
// Notice, this case has a very high token similarity.
// However, their line similarity is pretty low.
static int hexchar2int(int c)
{
    if (c >= '0' && c <= '9') {
        return c - '0';
    } else if (c >= 'a' && c <= 'f') {
        return c - 'a' + 10;
    } else if (c >= 'A' && c <= 'F') {
        return c - 'A' + 10;
    } else {
        return -1; // invalid input
    }
}