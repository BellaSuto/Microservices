<<<<<<< HEAD
package com.example.demo.converters;


public class StringToDouble {

    public boolean isNumeric(String strNumber) {
        if (strNumber == null) return false;
        String number = strNumber.replaceAll(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public Double convertToDouble(String strNumber) {
        if (strNumber == null)return 0D;
        String number = strNumber.replaceAll(",",".");
        if (isNumeric(number)) return Double.parseDouble(number);

        return 0D;
    }
}
=======
package com.example.demo.converters;


public class StringToDouble {

    public boolean isNumeric(String strNumber) {
        if (strNumber == null) return false;
        String number = strNumber.replaceAll(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public Double convertToDouble(String strNumber) {
        if (strNumber == null)return 0D;
        String number = strNumber.replaceAll(",",".");
        if (isNumeric(number)) return Double.parseDouble(number);

        return 0D;
    }
}
>>>>>>> db142fbfb68cd0a7637f1f704eaa863658e9a734
