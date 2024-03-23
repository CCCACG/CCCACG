/* detroy the plugin data */
//Source Code: 0-2 00239.c
FREE_FUNC(mod_userdir_free){
	plugin_data *p = p_d;

	if (!p) return HANDLER_GO_ON;

	if (p->config_storage) {
		size_t i;

		for (i = 0; i < srv->config_context->used; i++) {
			plugin_config *s = p->config_storage[i];

			array_free(s->include_user);
			array_free(s->exclude_user);
			buffer_free(s->path);
			buffer_free(s->basepath);

			free(s);
		}
		free(p->config_storage);
	}

	buffer_free(p->username);
	buffer_free(p->temp_path);

	free(p);

	return HANDLER_GO_ON;
}

// Synthesized Code, syntax similarity:0.62, res_00000.c
/* detroy the plugin data */
FREE_FUNC(mod_userdir_free)
{
    plugin_data *p = p_d;

    UNUSED(srv);

    if (!p) return HANDLER_GO_ON;

    if (p->config_storage) {
        size_t i, j;
        userdir_config *config;

        for (i = 0; i < srv->config_context->used; i++) {
            config = p->config_storage[i];

            array_free(config->extensions);
            for (j = 0; j < config->used; j++) {
                buffer_free(config->ptr[j].match);
                buffer_free(config->ptr[j].path);
            }
            free(config->ptr);
            free(config);
        }
        free(p->config_storage);
    }

    free(p);

    return HANDLER_GO_ON;
}