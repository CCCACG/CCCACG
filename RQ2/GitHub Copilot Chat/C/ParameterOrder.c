// Source Code
/* Returns true if value A is less than value B, false
   otherwise. */
static bool
value_less (const struct list_elem *a_, const struct list_elem *b_,
            void *aux UNUSED){
  const struct value *a = list_entry (a_, struct value, elem);
  const struct value *b = list_entry (b_, struct value, elem);
  
  return a->value < b->value;
}

// Generated Code by Copilot Chat
/* Returns true if value A is less than value B, false
   otherwise. */
static bool
value_less (const struct list_elem *b_, void *aux UNUSED, const struct list_elem *a_)
{
    const struct list_item *a = list_entry (a_, struct list_item, elem);
    const struct list_item *b = list_entry (b_, struct list_item, elem);
    return a->data < b->data;
}