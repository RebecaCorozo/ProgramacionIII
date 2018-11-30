package tarea_p;
/*
 * @author Rebeca
 */
public class NewtonRaphson 
{

    /**
     *
     * @param f
     * @param df
     * @param x
     * @param e
     * @param n
     * @return
     */
    public double raiz(IFuncion f,IFuncion df,double x,double e,int n)
    {
        double r = Double.NaN;
        int k=0;
        while(Math.abs(f.eval(x))>e&&k<n)
        {
            x=x-f.eval(x)/df.eval(x);
            k++;
        }
        if(k<n)r=x;
        return r;
    }
}
