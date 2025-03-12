class Test {
    static void Go() { // initialize the tree
                Node root = null; 
// insert the following names into the tree
        root = NameTree.insert(root, "Kami");
        root = NameTree.insert(root, "Hillary");
        root = NameTree.insert(root, "Alexander");
        root = NameTree.insert(root, "Isaac");
        root = NameTree.insert(root, "Quinten");
        root = NameTree.insert(root, "Lillian");
        root = NameTree.insert(root, "Zach");

        System.out.print("Name Tree in order: "); //print the tree in order
        NameTree.inOrder(root);
        System.out.print("\nName tree pre order: "); //print the tree in pre order
        NameTree.preOrder(root);
        System.out.print("\nName Tree post order: "); //print the tree in post order
        NameTree.postOrder(root);
    }//end of Go method
    

}//end of Test class