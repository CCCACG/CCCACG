/* create a register file */
//Source Code 01250.c
struct regs_t *
regs_create(void){
  struct regs_t *regs;

  regs = calloc(1, sizeof(struct regs_t));
  if (!regs)
    fatal("out of virtual memory");

  return regs;
}

// Synthesized Code res_00007.c
struct regs_t *
regs_create(void)
{
  struct regs_t *regs;
  regs = calloc(1, sizeof(struct regs_t));
  if (!regs)
    fatal("out of virtual memory");
  return regs;
}