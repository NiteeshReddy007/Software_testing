//package org.example;
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//public class trie_test {
//
//    @Test
//    public void testtrie(){
//        Trie tr= new Trie();
//        tr.insert("apple");
//        assertEquals(1, tr.countWordsEqualTo("apple"));
//        assertEquals(1, tr.countWordsStartingWith("app"));
//    }
//
//    @Test
//    void testCountWords() {
//        Trie tr = new Trie();
//        tr.insert("apple");
//        tr.insert("apricot");
//        tr.insert("banana");
//
//        assertEquals(1, tr.countWordsEqualTo("apple"));
//        assertEquals(2, tr.countWordsStartingWith("ap"));
//        assertEquals(0, tr.countWordsStartingWith("or"));
//    }
//
//    @Test
//    void testErase() {
//        Trie tr = new Trie();
//        tr.insert("apple");
//        tr.erase("apple");
//        assertEquals(0, tr.countWordsEqualTo("apple"));
//    }
//
//    @Test
//    void testEdgeCases() {
//        Trie tr = new Trie();
//        assertEquals(0, tr.countWordsEqualTo("empty"));
//        assertEquals(0, tr.countWordsStartingWith("prefix"));
//
//        tr.insert("prefixword");
//        assertEquals(1, tr.countWordsStartingWith("prefix"));
//    }
//
//    @Test
//    void testInsertMutation() {
//        Trie trie = new Trie();
//        trie.insert("apple");
//        trie.insert("banana");
//        trie.insert("apricot");
//        // Mutation: Change condition to true
//        trie.insert("apple");
//        assertEquals(2, trie.countWordsEqualTo("apple"));
//        assertEquals(3, trie.countWordsStartingWith("app"));
//    }
//
//    @Test
//    void testEraseMutation() {
//        Trie trie = new Trie();
//        trie.insert("apple");
//        trie.erase("apple");
//        // Mutation: Change condition to false
//        trie.erase("apple");
//        assertEquals(0, trie.countWordsEqualTo("apple"));
//    }
//
//    @Test
//    void testCountWordsMutation() {
//        Trie trie = new Trie();
//        trie.insert("apple");
//        // Mutation: Change condition to false
//        assertEquals(0, trie.countWordsEqualTo("apple"));
//        assertEquals(0, trie.countWordsStartingWith("app"));
//    }
//
//    @Test
//    void testReducePrefixMutation() {
//        Trie trie = new Trie();
//        trie.insert("apple");
//        // Mutation: Change condition to false
//        trie.erase("app");
//        assertEquals(1, trie.countWordsStartingWith("app"));
//    }
//
//
//
//
//
//
//
//}
