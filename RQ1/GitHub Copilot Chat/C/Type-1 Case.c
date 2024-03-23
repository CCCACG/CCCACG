// Source Code
/*============================================================*/
/* GRAMMAR RULES */
/*============================================================*/
static void field (LexState *ls, expdesc *v){
  /* field -> ['.' | ':'] NAME */
  FuncState *fs = ls->fs;
  expdesc key;
  luaK_exp2anyreg(fs, v);
  luaX_next(ls);  /* skip the dot or colon */
  checkname(ls, &key);
  luaK_indexed(fs, v, &key);
}

// Synthesized Code
static void field(LexState *ls, expdesc *v) {
    FuncState *fs = ls->fs;
    expdesc key;
    luaK_exp2anyreg(fs, v);
    luaX_next(ls);
    checkname(ls, &key);
    luaK_indexed(fs, v, &key);
}