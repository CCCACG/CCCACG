//matrix summations
//Source Code 2-4 01098.java
protected float[]  sum(float[][] value){
    float[] summation = new float[value.length];
    for (int i = 0; i < summation.length; i++) {
        summation[i]=sum(value[i]);
    }
    return summation;
}

//Synthesized Code res_00003.java
//Syntax Similarity = 0.5714
protected float[]  sum(float[][] value)
{
    float[] result = new float[value.length];
    for (int i = 0; i < value.length; i++) {
        for (int j = 0; j < value[i].length; j++) {
            result[i] += value[i][j];
        }
    }
    return result;
}