package arraysAndStrings;

class PdfViewer {
    public static void main(String[] args) {

        int[] testarray = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        String testwordI = "abc";

        System.out.println("Test I: " + designerPdfViewer(testarray, testwordI));

        int[] testarrayII = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        String wordII = "zaba";
        
        System.out.println("Test II: " + designerPdfViewer(testarrayII, wordII));

    }

    static int designerPdfViewer(int[] h, String word) {

        if(word.length() < 1) return 0;

        int maxHeightIndex = getIndex(word.charAt(0));
        int maxHeight = h[maxHeightIndex];

        for(int i = 1; i < word.length(); i++){
            int index = getIndex(word.charAt(i));
            maxHeight = maxHeight > h[index] ? maxHeight : h[index];
        }

        return maxHeight * word.length();
    }

    private static int getIndex(char c) {
        
        int index = c - 97;
        
        return index;
    }

}