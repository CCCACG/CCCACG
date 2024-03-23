// Source Code
/* This is a helper function that moves the contents of node 'from' to the position of node 'to'. */
static void rb_transplant(rb_tree tree, rb_node to, rb_node from)
{
    if (to->parent == tree->nil) {
        tree->root = from;
    } else if (to == to->parent->left) {
        to->parent->left = from;
    } else {
        to->parent->right = from;
    }
    from->parent = to->parent;
}

// Generated Code by Copilot Chat
/* Helper routine: transplants node `from' into node `to's position. */
static void rb_transplant(rb_tree tree, rb_node to, rb_node from){
	if (to->parent == tree->nil) {
		tree->root = from;
	} else if (to == to->parent->lchild) {
		to->parent->lchild = from;
	} else {
		to->parent->rchild = from;
	}
	from->parent = to->parent;
}