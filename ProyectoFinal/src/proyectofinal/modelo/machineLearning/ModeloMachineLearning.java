package proyectofinal.modelo.machineLearning;

import java.util.ArrayList;
import proyectofinal.modelo.estadistica.UnidadAnalisis;
import proyectofinal.modelo.estadistica.Variable;
import proyectofinal.modelo.math.VectorUtils;



/**
 *
 * @author L
 * Ojo: Falta agregar el metodo analisis ordinal
 */
public class ModeloMachineLearning {
    private DataFrame dataFrameProcesado;
    private double[][] matrizCaracteristicas;

    
    public ModeloMachineLearning() {
    }

    public ModeloMachineLearning(UnidadAnalisis[] unidadAnalisis) {
        this.dataFrameProcesado = new DataFrame(unidadAnalisis);
        generate();
    }
    
    private void generate() {
        int numUnidades = this.dataFrameProcesado.getNumUnidades();
        ArrayList<Double>[] a = new ArrayList[numUnidades];
        for (int i = 0; i < a.length; i++) {
            a[i] = new ArrayList<>();
        }
                                     
        for (int i = 0; i < this.dataFrameProcesado.getNumVariables(); i++) {
            Variable[] var = this.dataFrameProcesado.getVariableValuesList(i);
            String subType = var[0].getSubtipo();
            
            if (subType.equals("Nominal")) {
                int[][] ad = getEncoder(var);
                
                for (int j = 0; j < a.length; j++) {
                    for (int k = 0; k < ad[j].length; k++) {
                        // YA QUE ESP
                        a[j].add((double) ad[j][k]);
                    }
                }
            } else if (subType.equals("Continua") || subType.equals("Discreta")) {
                for (int j = 0; j < numUnidades; j++) {
                    a[j].add((double) var[j].getValor());
                }
            }
            
            
        }  
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        //VectorUtils.calculateCosineSimilarity(vector1, vector2);
    }   
    
    private void addMatrizCaracteristicas(String nombreVariable, double[] data) {
        //this.dataFrameProcesado.getNumVariables(0, nombreVariable);
    }
    
    private int[][] getEncoder(Variable[] variables) {
        String[] data = new String[variables.length];
        for (int i = 0; i < variables.length; i++) {
            data[i] = (String) variables[i].getValor();
        }
        
        return MlUtils.oneHotEncoder(data);
    }
    
}
