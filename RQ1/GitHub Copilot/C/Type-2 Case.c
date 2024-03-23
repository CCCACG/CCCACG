/* Free the list only, not the data. */
//Source Code 0-2 01090.c
void sublist_free(list lst){
	list p;

	while(lst != NULL) {
		p = lst;
		lst = lst->next;
		mem_free(p);
	}
}

//Synthesized Code res_00009.c
void sublist_free(list lst)
{
    list temp;
    while (lst != NULL)
    {
        temp = lst;
        lst = lst->next;
        free(temp);
    }
}