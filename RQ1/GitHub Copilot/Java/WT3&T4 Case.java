/**
 * Checks to ensure all procedures are defined in this tuple.
 * @return true if they are all defined, false otherwise
 */
//Source Code 2-4 01587.java
public boolean assertAllProceduresDefined(){
	for(Entry entry : procedures.semanticEntries()){
		Procedure procedure = (Procedure) entry.semanticRecord();
		if(!procedure.hasBody()){
			GCLCompiler.err.semanticError(GCLError.PROCEDURE_NOT_DEFINED, "A procedure definition has been omitted.");
			return false;
		}
	}
	return true;
}

//Synthesized Code res_00007.java
//Syntax Similarity: 0.25
public boolean assertAllProceduresDefined()
{
    boolean defined = true;
    for (int i = 0; i < procedures.length; i++)
    {
        if (procedures[i] == null)
        {
            defined = false;
        }
    }
    return defined;
}