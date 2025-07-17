public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s; // If there's only one row or the string length is less than numRows, no zigzag pattern needed
        }
        
        // Create a StringBuilder array to store each row's characters
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        
        int currentRow = 0;
        boolean goingDown = false;  
        
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);  
            
            
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            
           
            currentRow += goingDown ? 1 : -1;
        }
        
        
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.convert("PAYPALISHIRING", 3);
        System.out.println(result);  
    }
}

