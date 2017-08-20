package checker;

import limit.Limit;
import converter.Convert;


public class InputsChecker extends Convert{
    
    public boolean checkData(int st, String stringSumX, String stringSum) {
        if (stringSum.length() < st && stringSum.length() < st) 
            return false;
        if (stringIsInteger(stringSumX) && stringIsInteger(stringSum)) {
            int sumX = toInteger(stringSumX);
            int sum = toInteger(stringSum);
            return (sumX >= st && sumX <= 50 && sum >= st && sum <= 50);
        }
        return false;
    }
    
    boolean stringIsInteger(String num) {
        for (int i = 0; i < num.length(); ++i) {
            if (num.charAt(i) < '0' || num.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
    
    public boolean validInLimit(int num, Limit limit) {
        if (limit.inside && num >= limit.left && num <= limit.right) 
            return true;
        if (!limit.inside && (num < limit.left || num > limit.right)) 
            return true;
        return false;
    }
}
