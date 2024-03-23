//
// Escapes:
// 1) chars ",", "+", """, "\", "<", ">", ";" (RFC 2253) 
// 2) chars "#", "=" (required by RFC 1779)
// 3) a space char at the beginning or end
// 4) according to the requirement to be RFC 1779 compatible:
//    '#' char is escaped in any position
//
// Source Code
private String makeEscaped(String name){

    int length = name.length();
    if (length == 0) {
        return name;
    }
    StringBuffer buf = new StringBuffer(length * 2);

    for (int index = 0; index < length; index++) {

        char ch = name.charAt(index);

        switch (ch) {

        case ' ':
            if (index == 0 || index == (length - 1)) {
                // escape first or last space 
                buf.append('\\');
            }
            buf.append(' ');
            break;

        case '"':
        case '\\':
            hasQE = true;

        case ',':
        case '+':
        case '<':
        case '>':
        case ';':
        case '#': // required by RFC 1779
        case '=': // required by RFC 1779
            buf.append('\\');

        default:
            buf.append(ch);
        }
    }

    return buf.toString();
}

// Synthesized Code, syntax similarity: 0.57
private String makeEscaped(String name) {
    StringBuilder escaped = new StringBuilder();
    for (int i = 0; i < name.length(); i++) {
        char c = name.charAt(i);
        switch (c) {
            case ',':
            case '+':
            case '\"':
            case '\\':
            case '<':
            case '>':
            case ';':
            case ' ':
                escaped.append('\\').append(c);
                break;
            case '#':
            case '=':
                escaped.append('\\').append(c);
                break;
            default:
                escaped.append(c);
                break;
        }
    }
    return escaped.toString();
}