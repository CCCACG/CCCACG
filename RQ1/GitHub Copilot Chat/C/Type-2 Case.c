// Source Code
/*
 * Handle an I/O request.
 */
static void sbull_transfer(struct sbull_dev *dev, unsigned long sector,
		unsigned long nsect, char *buffer, int write){
	unsigned long offset = sector*KERNEL_SECTOR_SIZE;
	unsigned long nbytes = nsect*KERNEL_SECTOR_SIZE;

	if ((offset + nbytes) > dev->size) {
		printk (KERN_NOTICE "Beyond-end write (%ld %ld)\n", offset, nbytes);
		return;
	}
	if (write)
		memcpy(dev->data + offset, buffer, nbytes);
	else
		memcpy(buffer, dev->data + offset, nbytes);
}

// Synthesized Code
static void sbull_transfer(struct sbull_dev *dev, unsigned long sector,
		unsigned long nsect, char *buffer, int write)
{
    unsigned long offset = sector * SECTOR_SIZE;
    unsigned long nbytes = nsect * SECTOR_SIZE;
    if ((offset + nbytes) > dev->size) {
        printk(KERN_NOTICE "sbull: Beyond-end write (%ld %ld)\n", offset, nbytes);
        return;
    }
    if (write)
        memcpy(dev->data + offset, buffer, nbytes);
    else
        memcpy(buffer, dev->data + offset, nbytes);
}