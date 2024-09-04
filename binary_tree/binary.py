from binarytree import Node,bst

root = Node(3)
root.left = Node(6)
root.right = Node(8)

new_tree = bst(height= 3 )
def iterate_prefix(arbre):
    print(arbre.value, end = ' ')
    if arbre.left != None:
        iterate_prefix(arbre.left)
    if arbre.right != None:
        iterate_prefix(arbre.right)

    
iterate_prefix(new_tree)

#print(new_tree)



# print (" binary tree:" , root)
# #list of the nodes
# print("listes des noeuds: " ,list(root))

# ## properiete de l'arbre
# print("taille de l'arbre est:" ,root.size)
# print("hauteur de l'arbre :", root.height)
# #print("Properties de l'arbre: \n", root.properties)