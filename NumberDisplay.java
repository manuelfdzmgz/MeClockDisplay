
public class NumberDisplay{
    //el valor almacenado
    private int value;
    //el limite al que puede llegar el valor
    private int limit;

    /**
     * Constructor for objects of class numberDisplay
     */
    public NumberDisplay(int newLimit)
    {
        value = 0;
        limit=newLimit;
    }

    /**
     * Fija el valor del atributo valor a uno dado
     */
    public void setValue(int newValue)
    {
        if( (newValue < limit ) && (newValue>=0))
        {
            value = newValue;
        }
    }

    /**
     * Devuelve una cadena de dos caracteres con el valor del atributo value
     */
    public String getDisplayValue()
    {
        String returnedValue = "";
        if (value<10)
        {
            returnedValue ="0" +value;
        }
        else
        {
            returnedValue =""+value;
        }
        return returnedValue;
    }

    /**
     * Devuelve el valor actual del atributo value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Incrementa en 1 el valor de value y lo hace volver a 0 si alcanza el limite
     */
    public void increment()
    {
        if (value<limit)
        {
            value++;
        }
        else
        {
            value = 0;
        }

    }

}