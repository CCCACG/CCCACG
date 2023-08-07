/**
 * This method initializes portField	
 * 	
 * @return javax.swing.JTextField	
 */
//Source Code 2-4 00458.java
private JTextField getPortField(){
    if(portField == null)
    {
        portField = new JTextField();
        portField.setColumns(4);
        portField.setText("110"); //$NON-NLS-1$
        TextEditPopupManager.getInstance().registerJTextComponent(portField);
    }
    return portField;
}


//Synthesized Code res_00002.java
private JTextField getPortField()
{
	if (portField == null)
	{
		portField = new JTextField();
		portField.setBounds(new Rectangle(146, 68, 86, 20));
		portField.setText("8080");
	}
	return portField;
}