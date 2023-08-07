/** Met a jour les flux en arrire plan */
public void maj_background()
{
	for(int i=0;i<nb_background;i++)
	{
		background[i].update();
	}
}