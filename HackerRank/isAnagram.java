    public class isAnagram{
    
    static boolean isAnagram(String a, String b) {
        int j= b.length()-1;
        boolean check=true;
        String out;
        if(a.equalsIgnoreCase(b) && a.length()==b.length()){
            out="Anagrams";
            return check;
        }
        for(int i=0;i<a.length();i++){
            if( a.charAt(i)!=b.charAt(j) || a.length()!=b.length()){
                out="Not Anagrams";
                check=false;
                return check;
                
            }    
            j--;
        }
        return check;
    }
    public static void main(String[] args) {
        
        isAnagram.isAnagram("ana", "ana");
    }
}