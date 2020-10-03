package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Implement a trie with insert, search, and startsWith methods.
 */
public class ImplementTrie_208 {


        TrieNode head;
        /** Initialize your data structure here. */
        public ImplementTrie_208() {
            head = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            if(word == null)
                return;
            TrieNode node = head;
            for(char ch : word.toCharArray()) {
                if(!node.charToNode.containsKey(ch)){
                    node.charToNode.put(ch, new TrieNode());
                }
                node = node.charToNode.get(ch);
            }
            node.isEnd = true;


        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            return helperSearch(word, true);
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            return helperSearch(prefix, false);
        }

        private boolean helperSearch(String wordOrPrefix, Boolean isWord){
            if(wordOrPrefix == null)
                return false;
            TrieNode node = head;
            for(char ch : wordOrPrefix.toCharArray()) {
                if(!node.charToNode.containsKey(ch)){
                    return false;
                }
                node = node.charToNode.get(ch);
            }
            if (isWord)
                return node.isEnd;
            else
                return true;
        }

        class TrieNode{
            Map<Character, TrieNode> charToNode;
            boolean isEnd = false;
            public TrieNode(){
                charToNode = new HashMap();
            }
        }

        public static void main(String[] args) {
            ImplementTrie_208 trie = new ImplementTrie_208();

            trie.insert("apple");
            System.out.println( trie.search("apple"));   // returns true
            System.out.println( trie.search("app"));     // returns false
            System.out.println( trie.startsWith("app")); // returns true
            trie.insert("app");
            System.out.println( trie.search("app"));     // returns true
        }

}
