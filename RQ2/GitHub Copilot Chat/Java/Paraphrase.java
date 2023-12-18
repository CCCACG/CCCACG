// Source Code
/**
 * Set the positive button text and it's listener
 * @param positiveButtonText
 * @param listener
 * @return
 */
public Builder setPositiveButton(String positiveButtonText,
        DialogInterface.OnClickListener listener){
    this.positiveButtonText = positiveButtonText;
    this.positiveButtonClickListener = listener;
    return this;
}

// Generated Code by Copilot Chat
/**
 * This function is used to set the text of the positive button and its listener.
 * @param positiveButtonText - The text to be displayed on the positive button.
 * @param listener - The listener to be attached to the positive button.
 * @return - The updated object after setting the positive button text and listener.
 */
public Builder setPositiveButton(String positiveButtonText, DialogInterface.OnClickListener listener) {
    this.positiveButtonText = positiveButtonText;
    this.positiveButtonListener = listener;
    return this;
}