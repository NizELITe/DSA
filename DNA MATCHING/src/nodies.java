public class nodies {

    nodies[] child=new nodies[26]; ;
    boolean isEndofword;
    nodies(){

        isEndofword=false;
        for (int i = 0; i < 26; i++)
            child[i] = null;
    }

}
class trie{
   static  nodies root= new nodies();
    public static void insert(String key){
        nodies curnode = root;
        for(int i=0;i<key.length();i++){
            char cur =key.charAt(i);
            if(curnode.child[cur-'a']==null){
                nodies newnode= new nodies();
                curnode.child[cur-'a']=newnode;
            }
            curnode=curnode.child[cur-'a'];
        }
        curnode.isEndofword=true;

    }

    public  static boolean CHECK(String key){
            nodies curnode=root;
            for(int i=0;i<key.length();i++){
                char cur=key.charAt(i);
                if(curnode.child[cur-'a']==null){
                    return false;
                }
                curnode=curnode.child[cur-'a'];
            }
            return curnode.isEndofword;
    }





}
