//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|26-getter|0|26-preInit
/**
 * Returns an initiliazed instance of backCommand component.
 * @return the initialized component instance
 */
//Source Code
public Command getBackCommand(){
    if (backCommand == null) {//GEN-END:|26-getter|0|26-preInit
        // write pre-init user code here
        backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|26-getter|1|26-postInit
    // write post-init user code here
    }//GEN-BEGIN:|26-getter|2|
    return backCommand;
}

// Synthesized Code
public Command getBackCommand() {
    if (backCommand == null) {
        backCommand = new Command("Back", Command.BACK, 1);
    }
    return backCommand;
}