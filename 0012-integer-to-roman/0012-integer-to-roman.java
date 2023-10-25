class Solution {
    static HashMap<Integer, String> symbol_to_integer = new HashMap<>();
    
    
    public static void initializeMap() {
        symbol_to_integer.put(1, "I");
        symbol_to_integer.put(4, "IV");
        symbol_to_integer.put(5, "V");
        symbol_to_integer.put(9, "IX");
        symbol_to_integer.put(10, "X");
        symbol_to_integer.put(40, "XL");
        symbol_to_integer.put(50, "L");
        symbol_to_integer.put(90, "XC");
        symbol_to_integer.put(100, "C");
        symbol_to_integer.put(400, "CD");
        symbol_to_integer.put(500, "D");
        symbol_to_integer.put(900, "CM");
        symbol_to_integer.put(1000, "M");
    }
    
    public String intToRoman(int num) {
        initializeMap();
        
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; 

        String roman = "";
        

        for(int i = 0; i < values.length; i++) {
            while (num >= values[i] && num > 0) {
                num -= values[i];
                roman += symbol_to_integer.get(values[i]);
            }
        }
        
        
        return roman;
    }
}