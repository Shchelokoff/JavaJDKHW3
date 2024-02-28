public class  Calculator{
    public static <T extends Number> T sum(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        }
    }
    public static <T extends Number> T multiply(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        }
    }
    public static <T extends Number> T divide(T a, T b) {
        if (b.doubleValue() == 0.0) {
            throw new IllegalArgumentException("Делить на ноль нельзя!");
        }
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        } else {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        }
    }
    public static <T extends Number> T subtract(T a, T b) {
        double result;
        if (a instanceof Double && b instanceof Double) {
            result = a.doubleValue() - b.doubleValue();
        } else if (a instanceof Float && b instanceof Float) {
            result = a.floatValue() - b.floatValue();
        } else {
            result = a.doubleValue() - b.doubleValue();
        }

        result = Math.round(result * 10.0) / 10.0; // Округляем результат до одного знака после запятой

        if (a instanceof Double) {
            return (T) Double.valueOf(result);
        } else if (a instanceof Float) {
            return (T) Float.valueOf((float) result);
        } else {
            return (T) Integer.valueOf((int) result);
        }
    }
}