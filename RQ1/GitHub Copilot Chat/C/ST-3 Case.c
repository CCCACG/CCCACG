// Source Code
/* HAVE_FONTCONFIG */
static const char *type_to_string (GConfValueType type){
        switch (type) {
        case GCONF_VALUE_INT:
                return "int";
        case GCONF_VALUE_STRING:
                return "string";
        case GCONF_VALUE_FLOAT:
                return "float";
        case GCONF_VALUE_BOOL:
                return "bool";
        case GCONF_VALUE_SCHEMA:
                return "schema";
        case GCONF_VALUE_LIST:
                return "list";
        case GCONF_VALUE_PAIR:
                return "pair";
        case GCONF_VALUE_INVALID:
                return "*invalid*";
        default:
                g_assert_not_reached();
                return NULL; /* for warnings */
        }
}


// Synthesized Code, syntax similarity:0.79
static const char *type_to_string (GConfValueType type)
{
    switch (type) {
        case GCONF_VALUE_INVALID:
            return "invalid";
        case GCONF_VALUE_STRING:
            return "string";
        case GCONF_VALUE_INT:
            return "int";
        case GCONF_VALUE_BOOL:
            return "bool";
        case GCONF_VALUE_FLOAT:
            return "float";
        case GCONF_VALUE_SCHEMA:
            return "schema";
        case GCONF_VALUE_PAIR:
            return "pair";
        case GCONF_VALUE_LIST:
            return "list";
        case GCONF_VALUE_SCHEMA_SOURCE:
            return "schema source";
        case GCONF_VALUE_SCHEMA_OVERRIDE:
            return "schema override";
        default:
            return "unknown";
    }
}