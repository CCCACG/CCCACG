// Source Code
/*  Initialize material property, light source, lighting model,
 *  and depth buffer.
 */
void init(void){
   // Change the light color to white
   GLfloat mat_specular[] = { 1.0, 1.0, 1.0, 1.0 };
   GLfloat mat_shininess[] = { 50.0 };

	// The position of the light
	GLfloat light_position[] = { 1.0, 1.0, 1.0, 0.0 };

   glClearColor (0.0, 0.0, 0.0, 0.0);
   glShadeModel (GL_SMOOTH);
	
   glEnable(GL_COLOR_MATERIAL);

   // Specifies material info for lighting
   // Changed to diffuse lighting
   glMaterialfv(GL_FRONT, GL_DIFFUSE, mat_specular);
   glMaterialfv(GL_FRONT, GL_SHININESS, mat_shininess);
	
   // update the lighting
   glLightfv(GL_LIGHT0, GL_POSITION, light_position);


   // Turn on GL settings
   glEnable(GL_LIGHTING);
   glEnable(GL_LIGHT0);
   glEnable(GL_DEPTH_TEST);
}

// Synthesized Code, syntax similarity: 0.92
void init(void)
{
    // Set material properties
    GLfloat mat_specular[] = { 1.0, 1.0, 1.0, 1.0 };
    GLfloat mat_shininess[] = { 50.0 };
    GLfloat light_position[] = { 1.0, 1.0, 1.0, 0.0 };
    glClearColor(0.0, 0.0, 0.0, 0.0);
    glShadeModel(GL_SMOOTH);

    // Set lighting parameters
    glMaterialfv(GL_FRONT, GL_SPECULAR, mat_specular);
    glMaterialfv(GL_FRONT, GL_SHININESS, mat_shininess);
    glLightfv(GL_LIGHT0, GL_POSITION, light_position);
    glEnable(GL_LIGHTING);
    glEnable(GL_LIGHT0);
    glEnable(GL_DEPTH_TEST);
}