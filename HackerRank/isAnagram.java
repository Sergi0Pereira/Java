public class isAnagram{

static boolean isAnagram(String a, String b) {
        int j= b.length()-1;
        int repa=0;
        int repb=0;
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
                for(int x=1;x<=a.length()-1;x++){
                    if( a.charAt(i)==b.charAt(x)){
                        repa++;
                    }
                }
                 for(int z=1;z<=b.length()-1;z++){
                    if( a.charAt(i)==b.charAt(z)){
                        repb++;
                    }
                }
                if(repa!=repb){
                    check=false;
                    return check;
                }
            j--;
            }    
    
        System.out.println(repa);
        System.out.println(repb);
        return check;
        
    }

    public static void main(String[] args) {
        
        System.out.println(isAnagram.isAnagram("ana", "ana"));
    }
}
