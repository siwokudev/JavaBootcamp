package simplejavacalculator;

import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class CalculatorModel
{
    public enum BinaryOperands
    {
        normal,
        add,
        minus,
        multiply,
        divide,
        xPowerOfy
    }

    public enum SpecialOperands
    {
        square,
        squareRoot,
        oneDividedBy,
        cos,
        sin,
        tan,
        log,
        rate,
        abs
    }

    private Double number2, number1;

    private BinaryOperands binaryOperand = BinaryOperands.normal;

    private Double calculateBinaryOperation()
    {
        switch ( binaryOperand )
        {
            case normal:
                return number1;
            case add:
                return number1 + number2;
            case minus:
                return number2 - number1;
            case multiply:
                return number2 * number1;
            case divide:
                return number2 / number1;
            case xPowerOfy:
                return pow( number2, number1 );
        }
        // never reach
        throw new Error();
    }

    public Double calculateBi( BinaryOperands operand, Double number )
    {
        if ( binaryOperand == BinaryOperands.normal )
        {
            number1 = 0.0;
            number2 = number;
            binaryOperand = operand;
            return Double.NaN;
        }
        else
        {
            number1 = number;
            number2 = calculateBinaryOperation();
            binaryOperand = operand;
            return number2;
        }
    }

    public Double calculateEqual( Double num )
    {
        return calculateBi( BinaryOperands.normal, num );
    }

    public Double reset()
    {
        number1 = 0.0;
        number2 = 0.0;
        binaryOperand = BinaryOperands.normal;

        return Double.NaN;
    }

    public Double calculateMono( SpecialOperands newMode, Double num )
    {
        if ( newMode == SpecialOperands.square )
        {
            return num * num;
        }
        if ( newMode == SpecialOperands.squareRoot )
        {
            return Math.sqrt( num );
        }
        if ( newMode == SpecialOperands.oneDividedBy )
        {
            return 1 / num;
        }
        if ( newMode == SpecialOperands.cos )
        {
            return Math.cos( num );
        }
        if ( newMode == SpecialOperands.sin )
        {
            return Math.sin( num );
        }
        if ( newMode == SpecialOperands.tan )
        {
            return Math.tan( num );
        }
        if ( newMode == SpecialOperands.log )
        {
            return log10( num );
        }
        if ( newMode == SpecialOperands.rate )
        {
            return num / 100;
        }
        if ( newMode == SpecialOperands.abs )
        {
            return Math.abs( num );
        }

        // never reach
        throw new Error();
    }

}
