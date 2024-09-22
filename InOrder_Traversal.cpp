#include <iostream>

struct Node{
    int val;
    Node* left;
    Node* right;

    Node(int val) : val(val), left(nullptr), right(nullptr){}
    Node(int val, Node* left, Node* right): val(val), left(left), right(right){}
};

class InOrder{
  public:
    void inOrderTraversal(Node* root){
        if(!root) return;
        inOrderTraversal(root->left);
        std::cout << root->val << " " ;
        inOrderTraversal(root->right);
    } 
    void morrisTraversal(Node* root){
        Node* curr = root;
        while(curr){
            //If there is no left subtree, print root 
            //and move to right subTree
            if(!curr->left){
                std::cout << curr->val << " ";
                curr = curr->right;
            } else{
                Node* next = curr->left;
                //Find right most Node on the left Sub Tree
                while(next->right && next->right != curr) next = next->right;

                //If right node of right most Node on the 
                //left sub Tree is null, connect right Most Node to root(curr)
                //and move curr to left
                if(!next->right){
                    next->right = curr;
                    curr = curr->left;
                } else {
                    //Reset the pointer to curr created earlier
                    next->right = nullptr;
                    //Print curr Node
                    std::cout << curr->val << " ";
                    //Move curr to right subtree
                    curr = curr->right;
                }
            }
        }
        std::cout << std::endl;
    }
};

int main(){
  Node* root = new Node(1, new Node(2, new Node(3), new Node(4)), new Node(5, new Node(6), new Node(7)));
  InOrder i;
  std::cout<< "InOrder traversal using Morris Traversal" << std::endl;
  i.morrisTraversal(root);
  std::cout<< "InOrder traversal using recursion" << std::endl;
  i.inOrderTraversal(root);
  std::cout<< std::endl;
}